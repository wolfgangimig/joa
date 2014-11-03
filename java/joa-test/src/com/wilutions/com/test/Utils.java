/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Utils {
	
	private static Log log = LogFactory.getLog(Utils.class);
	private static final long timeoutTestRunning = 10000;
	
	public static void checkJoaTestServerObjectStopped() {
		log.info("checkJoaTestServerObjectStopped(");
		long t1 = System.currentTimeMillis();
		while (isJoaTestServerObjectRunning()) {
			long t2 = System.currentTimeMillis();
			if (t2 - t1 > timeoutTestRunning) {
				TestCase.fail("Timeout while waiting for JoaTestObject stopped");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		}
		log.info(")checkJoaTestServerObjectStopped");
	}

	public static boolean isJoaTestServerObjectRunning() {
        log.info("isJoaTestObjectRunning(");
		final String progName = "JoaComTest.exe";
		boolean ret = false;
		String line;
		try {
		    Process proc = Runtime.getRuntime().exec("wmic.exe");
		    BufferedReader input = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		    OutputStreamWriter oStream = new OutputStreamWriter(proc.getOutputStream());
		    oStream .write("process where name='" + progName +"'");
		    oStream .flush();
		    oStream .close();
		    StringBuilder sbuf = new StringBuilder();
		    boolean firstLine = true;
		    while ((line = input.readLine()) != null) {
		    	if (firstLine) {
		    		firstLine = false;
		    		continue;
		    	}
		    	sbuf.append(line).append(" ");
		    }
		    input.close();
		    ret = sbuf.indexOf(progName) >= 0;
		} catch (IOException ioe) {
		    ioe.printStackTrace();
		}
		finally {
			File tempFile = new File("TempWmicBatchFile.bat");
			tempFile.delete();
		}
        log.info(")isJoaTestObjectRunning=" + ret);
		return ret;
	}
}
