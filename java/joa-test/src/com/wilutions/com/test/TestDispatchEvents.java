/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com.test;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wilutions.com.DispatchImpl;
import com.wilutions.joa.joacomtestlib.JoaCpt2;

public class TestDispatchEvents {

	private static Log log = LogFactory.getLog(TestDispatchEvents.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Params.getInstance();
		DispatchImpl.initCOM(null);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		DispatchImpl.doneCOM();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		// All references to the object must have been released with
		// releaseComObject()
		Utils.checkJoaTestServerObjectStopped();
	}

	@Test
	public void testEventSink() {
		log.info("testEventSink(");
		try {
			final String grrr = "Why that?";
			JoaCpt2 connPointHost = new JoaCpt2();
			My_IJoaCpt2Events eventSink = new My_IJoaCpt2Events();
			
			connPointHost.withEvents(eventSink);
			
			connPointHost.TriggerGrrr(grrr);
			TestCase.assertEquals("received text", grrr, eventSink.receivedGrrr);
			
			connPointHost.releaseEvents(eventSink);
			connPointHost.releaseComObject();
			

		} catch (Throwable e) {
			log.error("testEventSink failed", e);
			TestCase.fail(e.toString());
		}
		log.info(")testEventSink");
	}
}
