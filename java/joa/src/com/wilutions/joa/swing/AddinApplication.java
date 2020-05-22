/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa.swing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.wilutions.com.BackgTask;
import com.wilutions.com.ComException;
import com.wilutions.com.ComModule;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;
import com.wilutions.com.reg.RegUtil;
import com.wilutions.joa.RegisterAddin;

/**
 * The application class. This class serves as a COM EXE server.
 * 
 */
public class AddinApplication {
	
	private static Logger log = Logger.getLogger(AddinApplication.class.getName());
	@SuppressWarnings("unused")
	private final static String AUTOSTART_FOLDER = "%APPDATA%\\Microsoft\\Windows\\Start Menu\\Programs\\Startup";
	
	public static void main(String[] args) {
		
		Class<AddinApplication> mainClass = AddinApplication.class;
		
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "main(mainClass=" + mainClass + ", args=" + Arrays.toString(args));

		try {
			if (invokeParseCommandLine(mainClass, args)) {
				if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "Platform.exit();");
				System.exit(0);
			} else {
				try {
					// Start class factories for COM objects defined by the
					// module.
					// The module class is found via reflection. Its name has to
					// be
					// com.wilutions.com.module.Module
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "DispatchImpl.initCOM...");
					DispatchImpl.initCOM(ComModule.getInstance());
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "DispatchImpl.initCOM OK");

					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "launch...");
					startSwing();
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "launch OK");

				} finally {
					
					// Kill thread pool
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "BackgTask.done()");
					BackgTask.done();

					// JoaDll.dumpComReferenceMap("before exit");

					// Shutdown COM library: release class factories,
					// top thread pools, etc.
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "DispatchImpl.doneCOM()");
					DispatchImpl.doneCOM();

					// Close log file
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "JoaDll.nativeDoneLogger()");
					JoaDll.nativeDoneLogger();
				}

			}

		} catch (Throwable e) {
			e.printStackTrace();
			log.log(Level.SEVERE, "main failed", e);
		}
		finally {
		}

		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")main");
	}

	private static void startSwing() throws InvocationTargetException, InterruptedException {
		
		javax.swing.SwingUtilities.invokeAndWait(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

	private static boolean invokeParseCommandLine(Class<? extends AddinApplication> addinMain, String[] args) throws ComException, InstantiationException, IllegalAccessException, IOException {
		return addinMain.newInstance().parseCommandLine(args);
	}

	public boolean parseCommandLine(String[] args) throws ComException, IOException {
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "parseCommandLine(" + Arrays.toString(args));
		Command command = Command.Run;
		boolean userNotMachine = false;
		String logFile = "";
		String logLevel = "";
		boolean logAppend = false;
		String licenseKey = "";

		int argIdx = 0;
		while (argIdx < args.length) {

			String arg_i = args[argIdx];
			String arg_i1 = (argIdx + 1 < args.length) ? args[argIdx + 1] : "";
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "arg_i=" + arg_i + ", arg_i1=" + arg_i1);

			if (arg_i == null) {
				
			} else if (arg_i.equals("/Version")) {
				command = Command.Version;
				
			} else if (arg_i.equals("/RegisterServer")) {
				command = Command.RegisterServer;
				userNotMachine = arg_i1.equals("user");
				if (userNotMachine)	argIdx++;
				
			} else if (arg_i.equals("/UnregisterServer")) {
				command = Command.UnregisterServer;
				userNotMachine = arg_i1.equals("user");
				if (userNotMachine)	argIdx++;
				
			} else if (arg_i.equals("/License")) {
				licenseKey = arg_i1;
				argIdx++;
				
			} else if (arg_i.equals("/log")) {
				logFile = arg_i1;
			} else if (arg_i.equals("/llevel")) {
				logLevel = arg_i1;
			} else if (arg_i.equals("/lappend")) {
				logAppend = true;
			}

			argIdx++;
		}

		if (logFile != null && logFile.length() != 0) {
			if (logLevel != null && logLevel.length() == 0) {
				logLevel = "INFO";
			}
			
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "DispatchImpl.initLogger(" + logFile + ", " + logLevel + ", " + logAppend);
			DispatchImpl.initLogger(logFile, logLevel, logAppend);
		}
		else {
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "DispatchImpl.initLogger from registry");
			DispatchImpl.initLogger(logFile, logLevel, logAppend);
		}

		switch (command) {
		case Version:
			break;
		case RegisterServer: {
			Class<?> addinMain = this.getClass();
			String path = RegUtil.getExecPath(addinMain);
			register(userNotMachine, licenseKey, path);
		}
			break;
		case UnregisterServer: {
			Class<?> addinMain = this.getClass();
			String path = RegUtil.getExecPath(addinMain);
			unregister(userNotMachine, path);
		}
			break;
		case Run:
			for (Class<?> addinClass : ComModule.getInstance().getAddins()) {
				activateDisabledAddin(addinClass);
			}
		default:
		}

		boolean ret = command != Command.Run;
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")parseCommandLine=" + ret);
		return ret;
	}

	protected void unregister(boolean userNotMachine, String exePath) {
		String regfor = userNotMachine ? "user" : "machine";
		System.out.println("Unregister for " + regfor);
		if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "Unregister for " + regfor);
		ComModule.getInstance().unregister(userNotMachine);
	}

	protected void register(boolean userNotMachine, String licenseKey, String execPath) {
		String regfor = userNotMachine ? "user" : "machine";
		System.out.println("Register for " + regfor + " at path=" + execPath);
		if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "Register for " + regfor + " at path=" + execPath);
		ComModule.getInstance().register(userNotMachine, execPath);
	}

	protected String registerAutostart(boolean userNotMachine, boolean registerNotUnregister, String path) {
		String key = (userNotMachine ? "HKCU" : "HKLM") + "\\Software\\Microsoft\\Windows\\CurrentVersion\\Run";
		
		if (registerNotUnregister) {
			RegUtil.setRegistryValue(key, "ITOL", path);
		}
		else {
			RegUtil.deleteRegistryValue(key, "ITOL");
		}
		
		return path;
	}

	public void activateDisabledAddin(Class<?> addinClass) throws ComException {
		RegisterAddin.ensureAddinIsActive(addinClass);
	}

	/**
	 * Make valid path.
	 * 
	 * @param path
	 *            File system path that might contain environment variables.
	 * @return File system path with replaced variables.
	 */
	public static String makeValidPath(String path) {

		int p = path.indexOf('%');
		while (p >= 0) {

			int e = path.indexOf('%', p + 1);
			String variableName = path.substring(p + 1, e);
			String variableValue = System.getenv(variableName);
			if (variableValue == null) variableValue = "";
			path = path.replace(path.substring(p, e + 1), variableValue);

			p = path.indexOf('%');
		}

		return path;
	}

	private enum Command {
		Version, Run, RegisterServer, UnregisterServer
	};

}
