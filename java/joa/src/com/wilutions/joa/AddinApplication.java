/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import com.wilutions.com.BackgTask;
import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.ComModule;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;
import com.wilutions.com.reg.RegUtil;

/**
 * The JavaFX application class. This class serves as a COM EXE server and as
 * the application class for the JavaFX toolkit.
 * 
 */
public class AddinApplication extends javafx.application.Application {

	public static void main(String[] args) {
		main(AddinApplication.class, AddinApplication.class, args);
	}

	public static void main(Class<? extends AddinApplication> mainClass, Class<? extends Application> fxappClass,
			String[] args) {

		try {
			System.out.println("Java Add-in for Microsoft Outlook Version=" + JoaDll.getVersion());

			if (parseCommandLine(mainClass, args)) {
				Platform.exit();
			} else {
				try {
					// Start class factories for COM objects defined by the
					// module.
					// The module class is found via reflection. Its name has to
					// be
					// com.wilutions.com.module.Module
					DispatchImpl.initCOM(ComModule.getInstance());

					Application.launch(fxappClass, args);

				} finally {
					// Kill thread pool
					BackgTask.done();

					// JoaDll.dumpComReferenceMap("before exit");

					// Shutdown COM library: release class factories,
					// top thread pools, etc.
					DispatchImpl.doneCOM();

					// Close log file
					JoaDll.nativeDoneLogger();
				}

			}

		} catch (Throwable e) {
			e.printStackTrace();
			Platform.exit();
		}

	}

	public static boolean parseCommandLine(Class<? extends AddinApplication> addinMain, String[] args)
			throws ComException, IOException {

		Command command = Command.Run;
		boolean userNotMachine = false;
		String logFile = "";
		String logLevel = "";
		boolean logAppend = false;

		int argIdx = 0;
		while (argIdx < args.length) {

			String arg_i = args[argIdx];
			String arg_i1 = (argIdx + 1 < args.length) ? args[argIdx + 1] : "";

			if (arg_i == null) {
			} else if (arg_i.equals("/Version")) {
				command = Command.Version;
			} else if (arg_i.equals("/RegisterServer")) {
				command = Command.RegisterServer;
				userNotMachine = arg_i1.equals("user");
				if (userNotMachine)
					argIdx++;
			} else if (arg_i.equals("/UnregisterServer")) {
				command = Command.UnregisterServer;
				userNotMachine = arg_i1.equals("user");
				if (userNotMachine)
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
			DispatchImpl.initLogger(logFile, logLevel, logAppend);
		}

		switch (command) {
		case Version:
			break;
		case RegisterServer: {
			String path = RegUtil.getExecPath(addinMain);
			String regfor = userNotMachine ? "user" : "machine";
			System.out.println("Register Addin for " + regfor + " at path=" + path);
			ComModule.getInstance().register(userNotMachine, path);
		}
			break;
		case UnregisterServer: {
			String regfor = userNotMachine ? "user" : "machine";
			System.out.println("Unregister Addin for " + regfor);
			ComModule.getInstance().unregister(userNotMachine);
		}
			break;
		case Run:
			for (Class<?> addinClass : ComModule.getInstance().getAddins()) {
				activateDisabledAddin(addinClass);
			}
		default:
		}

		return command != Command.Run;
	}

	public static void activateDisabledAddin(Class<?> addinClass) throws ComException {
		OfficeApplication application = addinClass.getDeclaredAnnotation(DeclAddin.class).application();
		if (application != null && application == OfficeApplication.Outlook) {
			String progId = addinClass.getDeclaredAnnotation(CoClass.class).progId();
			JoaDll.activateDisabledAddin(progId);
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		javafx.application.Application.setUserAgentStylesheet(null);
		
		// A primary stage is only needed in order to keep the
		// javafx alive when the last TaskPane or FormRegion
		// is closed.
		// The addin class is responsible for closing this stage.
		// The OutlookAddin class calls therefore Platform.exit() in its close()
		// method.
		primaryStage.initStyle(StageStyle.UTILITY);
		primaryStage.setX(10000);
		primaryStage.setY(10000);
		primaryStage.setWidth(1);
		primaryStage.setHeight(1);
		primaryStage.show();
	}

	private enum Command {
		Version, Run, RegisterServer, UnregisterServer
	};

}
