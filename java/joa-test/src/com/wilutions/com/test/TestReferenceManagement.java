/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.LinkedList;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.joa.joacomtestlib.JoaTestDispatch1;

public class TestReferenceManagement {

	private static Log log = LogFactory.getLog(TestReferenceManagement.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Params.getInstance();
		DispatchImpl.initCOM(null);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		log.info("doneCOM(");
		DispatchImpl.doneCOM();
		log.info(")doneCOM");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		// All references must have been released.
		Utils.checkJoaTestServerObjectStopped();

	}

	/**
	 * A Java Dispatch object should uniquely refer to an interface of a COM
	 * object. Thus, if a second Dispatch object represents the same interface
	 * and points to the same COM object, the objects should be identical (not
	 * only equal).
	 */
	@Test
	public void testReturnSameJavaObjectForSameInterface() {
		log.info("testReturnSameJavaObjectForSameInterface(");

		try {
			// Create COM object,
			// joa1 represents interface JoaTestDispatch1
			JoaTestDispatch1 joa1 = new JoaTestDispatch1();

			// Convert to Dispatch,
			// disp1 represents the IDispatch interface
			Dispatch disp1 = Dispatch.as(joa1, Dispatch.class);

			// joa1 and disp1 are not equal, since they represent different
			// interfaces.
			TestCase.assertTrue("Different Java objects", joa1 != disp1);

			// Convert the disp1 to a JoaTestDispatch1.
			// This should return the joa1 object.
			// (It is hold in the JNI code as a weak reference.)
			JoaTestDispatch1 joa2 = Dispatch.as(disp1, JoaTestDispatch1.class);

			// joa1 and joa2 must be the same objects.
			TestCase.assertTrue("Same Java objects", joa1 == joa2);

			Dispatch disp2 = Dispatch.as(joa2, Dispatch.class);
			TestCase.assertTrue("Same Java objects", disp1 == disp2);

			// The reference count of the COM object should have been
			// incremented
			// for each interface. Releasing joa1 and disp1 should free the COM
			// object
			// immediately. joa2 holds no object.
			joa1.releaseDispatch();
			disp1.releaseDispatch();

		} catch (ComException e) {
			log.error("testReturnSameJavaObjectForSameInterface failed", e);
			fail(e.toString());
		}

		log.info(")testReturnSameJavaObjectForSameInterface");
	}

	/**
	 * A COM object is released after the last Dispatch object is finalized.
	 */
	@Test
	public void testObjectIsReleasedByGarbageCollection() {
		log.info("testObjectIsReleasedByGarbageCollection(");
		try {

			// Create COM object and some Dispatch objects that reference it.
			log.info("create COM object");
			ArrayList<Dispatch> objs = new ArrayList<Dispatch>();
			JoaTestDispatch1 testDisp1 = new JoaTestDispatch1();
			for (int i = 0; i < 10; i++) {
				objs.add(Dispatch.as(testDisp1, JoaTestDispatch1.class));
			}

			// Clear all Java references
			log.info("clear references");
			testDisp1 = null;
			objs = null;

			// Alloc a lot of memory.
			// This forces the GC to collect the Java objects
			// and call their finalizers.
			// The Java objects should have been deleted when
			// an OutOfMemory error occurs.
			try {
				log.info("alloc until OutOfMemoryError");
				LinkedList<byte[]> bufs = new LinkedList<byte[]>();
				for (int i = 0; i < 1000 * 1000 * 1000; i++) {
					byte[] buf = new byte[10000];
					bufs.add(buf);
					if ((i % 1000) == 0) {
						if (!Utils.isJoaTestServerObjectRunning()) {
							log.info("OK, object released, COM server has been stopped");
							break;
						}
					}
				}
			} catch (OutOfMemoryError ex) {
				log.info("OK, OutOfMemoryError");
			}

			// No more COM references should be alive,
			// The COM server must be stopped now.
			Utils.checkJoaTestServerObjectStopped();

		} catch (ComException e) {
			log.error("testObjectIsReleasedByGarbageCollection failed", e);
			fail(e.toString());

		}
		log.info(")testObjectIsReleasedByGarbageCollection");
	}

}
