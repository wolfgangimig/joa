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

import com.wilutions.com.ComException;
import com.wilutions.com.DispatchImpl;
import com.wilutions.joa.joacomtestlib.JoaTestDispatch1;
import com.wilutions.joa.joacomtestlib.JoaTestObjectJavaImpl;

public class TestDispatchImpl {

	JoaTestObjectJavaImpl testObj;
	private static Log log = LogFactory.getLog(TestDispatchImpl.class);

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
		log.info("create instance CLSID_JoaTestObjectJavaImpl");
		testObj = new JoaTestObjectJavaImpl();
	}

	@After
	public void tearDown() throws Exception {
		if (testObj != null) {
			testObj.releaseComObject();

			// All references to the object must have been released with
			// releaseComObject()
			Utils.checkJoaTestServerObjectStopped();
		}
	}

	/**
	 * Pass an DispatchImpl object to the testObj (to the COM object in the C++ 
	 * COM server) and invoke its methods from this test.
	 * 
	 */
	@Test
	public void testInvokeProperties() {
		log.info("testInvokeProperties(");
		try {
			final String propertyValue = "mystringvalue";
			MyJoaTestObjectImpl myObj = new MyJoaTestObjectImpl();
			
			// Pass references to the DispatchImpl to the testObj. 
			testObj.setJavaObjectImpl2(myObj);

			// Try to access via non-idispatch. It fails but
			// I do not know why. COM should internally fallback
			// to idispatch since the proxy/stub-dll is not registered.
//			testObj.setLongArray1dim(1, 111);
//			TestCase.assertEquals("Array value", Integer.valueOf(111), testObj.getLongArray1dim(1));
			
			// Invoke the setString1 function of the testObj which 
			// in turn invokes the setString1 function of myObj.
			testObj.setString1(propertyValue);
			
			// testObj.setString1 has changed the property of myObj.
			TestCase.assertEquals("myObj.String1", propertyValue, myObj.getString1());
			
			// Invoke the getString1 function of the testObj which 
			// in turn invokes the getString1 function of myObj.
			// It should return the property value from myObj.
			TestCase.assertEquals("testObj.String1", propertyValue, testObj.getString1());
			
			
			// Check other data types.
			
			testObj.setBoolean1(true);
			TestCase.assertEquals("Boolean1", Boolean.TRUE, testObj.getBoolean1());
			testObj.setByte1((byte)66);
			TestCase.assertEquals("Byte1", Byte.valueOf((byte)66), testObj.getByte1());
			testObj.setDouble1(15.16);
			TestCase.assertEquals("Double1", Double.valueOf(15.16), testObj.getDouble1());
			testObj.setFloat1(11.12f);
			TestCase.assertEquals("Float1", 11.12f, testObj.getFloat1());
			testObj.setLong1(-15);
			TestCase.assertEquals("Long1", Integer.valueOf(-15), testObj.getLong1());
			testObj.setLonglong1(-15L);
			TestCase.assertEquals("Long1", Long.valueOf(-15L), testObj.getLonglong1());
			
			JoaTestDispatch1 disp = new JoaTestDispatch1();
			testObj.setDispatch1(disp);
			testObj.setDispatch1(null);
			disp.releaseComObject();
			
			
		} catch (ComException e) {
			log.error("testInvokeProperties failed", e);
			TestCase.fail(e.toString());
		}
		log.info(")testInvokeProperties");
	}

}
