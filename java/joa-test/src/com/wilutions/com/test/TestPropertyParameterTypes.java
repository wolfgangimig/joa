/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.com.test;

import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.joa.joacomtestlib.IJoaTestDispatch1;
import com.wilutions.joa.joacomtestlib.JoaTestDispatch1;
import com.wilutions.joa.joacomtestlib.JoaTestObject;
import com.wilutions.mslib.outlook.NoteItem;
import com.wilutions.mslib.outlook.OlItemType;
import com.wilutions.mslib.outlook._Application;
import com.wilutions.mslib.outlook.impl._ApplicationImpl;

public class TestPropertyParameterTypes {

	JoaTestObject testObj;
	private static Log log = LogFactory.getLog(TestPropertyParameterTypes.class);

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
		try {
			log.info("createInstance of testObj");
			testObj = new JoaTestObject();
		} catch (ComException e) {
			log.error("createInstance failed", e);
			fail(e.toString());
		}
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

	@Test
	public void testPropertyAccessPrimitiveTypes() {
		log.info("testPropertyAccessPrimitiveTypes(");

		try {
			testObj.setBoolean1(true);
			boolean v = testObj.getBoolean1();
			TestCase.assertEquals("Boolean1", true, v);
			testObj.setBoolean1(!v);
			v = testObj.getBoolean1();
			TestCase.assertEquals("Boolean1", false, v);

			testObj.setByte1((byte) -2);
			TestCase.assertEquals("Byte1", Byte.valueOf((byte) -2), testObj.getByte1());

			testObj.setDouble1(1.2e3);
			TestCase.assertEquals("Double1", 1.2e3, testObj.getDouble1());

			testObj.setFloat1(7.9f);
			TestCase.assertEquals("Float1", 7.9f, testObj.getFloat1());

			testObj.setLong1(9955);
			TestCase.assertEquals("Long1", Integer.valueOf(9955), testObj.getLong1());

			testObj.setLonglong1(-55L);
			TestCase.assertEquals("Longlong1", Long.valueOf(-55L), testObj.getLonglong1());

			testObj.setShort1((short) -7);
			TestCase.assertEquals("Short1", Short.valueOf((short) -7), testObj.getShort1());

			testObj.setString1("abcdef");
			TestCase.assertEquals("String1", "abcdef", testObj.getString1());

			testObj.setULong1(Integer.MAX_VALUE);
			TestCase.assertEquals("ULong1", Integer.valueOf(Integer.MAX_VALUE), testObj.getULong1());

			testObj.setULonglong1(Long.MAX_VALUE);
			TestCase.assertEquals("ULonglong1", Long.valueOf(Long.MAX_VALUE), testObj.getULonglong1());

		} catch (ComException e) {
			log.error("testPropertyAccessPrimitiveTypes failed", e);
			fail(e.toString());
		}

		log.info(")testPropertyAccessPrimitiveTypes");
	}

	@Test
	public void testPropertyAccessVariant() {
		log.info("testPropertyAccessVariant(");
		try {
			testObj.setVariant1(Boolean.TRUE);
			boolean v = (Boolean)testObj.getVariant1();
			TestCase.assertEquals("Boolean1", true, v);
			testObj.setVariant1(!v);
			v = (Boolean)testObj.getVariant1();
			TestCase.assertEquals("Boolean1", false, v);
		
			{
				String name = "testPropertyAccessVariant";
				Dispatch rawDisp1 = new JoaTestDispatch1();
				JoaTestDispatch1 disp1 = rawDisp1.as(JoaTestDispatch1.class);
				disp1.setName(name);
				testObj.setVariant1(disp1);
	
				Object read_rawDisp1 = testObj.getVariant1();
				JoaTestDispatch1 read_disp1 = Dispatch.as(read_rawDisp1, JoaTestDispatch1.class);
				TestCase.assertEquals("disp1.name", name, read_disp1.getName());
			}
			

		} catch (ComException e) {
			log.error("testPropertyAccessVariant failed", e);
			fail(e.toString());
		}
		log.info(")testPropertyAccessVariant");
	}

	@Test
	public void testPropertyAccessDate() {
		log.info("testPropertyAccessDate(");

		try {
			final String dateStr = "2014-10-05T18:31:54.000";

			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
			Date date1 = fmt.parse(dateStr);

			log.info("setDate1 " + date1);
			testObj.setDate1(date1);
			TestCase.assertEquals("date1", date1, testObj.getDate1());

			// JoaTestObject formats the date value into a string and stores it
			// in property String1.
			String str = testObj.getString1();
			log.info("testObj received date=" + str);
			TestCase.assertEquals("date1", dateStr, str);

		} catch (Exception e) {
			log.error("testPropertyAccessDate failed", e);
			fail(e.toString());
		}

		log.info(")testPropertyAccessDate");
	}

	/**
	 * Test array property.
	 */
	@Test
	public void testIndexedProperties1dim() {
		log.info("testIndexedProperties1dim(");

		try {
			// 1-dim array
			log.info("1-dim array");
			for (int i = 0; i < 10; i++) {
				int value = (i + 1) * 2;

				testObj.setLongArray1dim(i, value);
				int rvalue = testObj.getLongArray1dim(i);
				TestCase.assertEquals("LongArray1dim[" + i + "]", value, rvalue);
			}

		} catch (ComException e) {
			log.error("testIndexedProperties1dim failed", e);
			fail(e.toString());
		}

		log.info(")testIndexedProperties1dim");
	}

	/**
	 * Test array and map properties.
	 */
	@Test
	public void testIndexedPropertiesMap() {
		log.info("testIndexedPropertiesMap(");

		try {
			// Map type, indexed by string
			log.info("map type");
			for (int i = 0; i < 10; i++) {
				Boolean value = (i & 1) != 0;
				String key = "i" + i;

				testObj.setBooleanMap1(key, value);

				Boolean rvalue = testObj.getBooleanMap1(key);
				TestCase.assertEquals("BooleanMap1[" + key + "]", value, rvalue);

			}

		} catch (ComException e) {
			log.error("testIndexedPropertiesMap failed", e);
			fail(e.toString());
		}

		log.info(")testIndexedPropertiesMap");
	}

	/**
	 * Test 3-dim array property.
	 */
	@Test
	public void testIndexedProperties3dim() {
		log.info("testIndexedProperties3dim(");

		try {
			// 3-dim array
			log.info("3-dim array");
			for (int i1 = 1; i1 < 3; i1++) {
				for (int i2 = 2; i2 < 4; i2++) {
					for (int i3 = 3; i3 < 5; i3++) {

						String value = i1 + "-" + i2 + "-" + i3;

						testObj.setStringArray3dim(i1, i2, i3, value);

						String rvalue = testObj.getStringArray3dim(i1, i2, i3);
						TestCase.assertEquals("StringArray3dim[" + value + "]", value, rvalue);
					}
				}
			}

		} catch (ComException e) {
			log.error("testIndexedProperties3dim failed", e);
			fail(e.toString());
		}

		log.info(")testIndexedProperties3dim");
	}

	/**
	 * An IDispatch property can be set to NULL.
	 */
	@Test
	public void testPropertyInterfacePtrNull() {
		log.info("testPropertyInterfacePtrNull(");

		try {
			testObj.setDispatch1(null);

			Dispatch disp = testObj.getDispatch1();
			TestCase.assertTrue("disp must be null", disp == null);
		} catch (ComException e) {
			log.error("testPropertyInterfacePtrNull failed", e);
			fail(e.toString());

		}

		log.info(")testPropertyInterfacePtrNull");
	}

	/**
	 * Get/set property of type IDispatch.
	 */
	@Test
	public void testPropertyDispatchPtr() {
		log.info("testPropertyDispatchPtr(");

		try {
			final String name = "1234567";

			Dispatch rawDisp1 = new JoaTestDispatch1();
			JoaTestDispatch1 disp1 = rawDisp1.as(JoaTestDispatch1.class);
			disp1.setName(name);
			testObj.setDispatch1(disp1);

			Dispatch read_rawDisp1 = testObj.getDispatch1();
			JoaTestDispatch1 read_disp1 = read_rawDisp1.as(JoaTestDispatch1.class);
			TestCase.assertEquals("disp1.name", name, read_disp1.getName());

			read_disp1.releaseComObject();

			testObj.setDispatch1(null);
			disp1.releaseComObject();

		} catch (ComException e) {
			log.error("testPropertyDispatchPtr failed", e);
			fail(e.toString());
		}

		log.info(")testPropertyDispatchPtr");
	}

	/**
	 * Get/set property of user defined interface.
	 */
	@Test
	public void testPropertyUserdefInterface() {
		log.info("testPropertyUserdefInterface(");

		try {
			final String name = "1234567";

			JoaTestDispatch1 rawDisp1 = new JoaTestDispatch1();
			IJoaTestDispatch1 disp1 = rawDisp1.as(JoaTestDispatch1.class);
			disp1.setName(name);
			testObj.setPropJoaTestDispatch1(disp1);

			IJoaTestDispatch1 read_disp1 = testObj.getPropJoaTestDispatch1();
			TestCase.assertEquals("disp1.name", name, read_disp1.getName());

			testObj.setPropJoaTestDispatch1(null);
			Dispatch.releaseComObject(disp1);

			// read_disp1 muss nicht extra freigegeben werden,
			// es ist ja dasselbe wie disp1 - oder?

		} catch (ComException e) {
			log.error("testPropertyUserdefInterface failed", e);
			fail(e.toString());
		}

		log.info(")testPropertyUserdefInterface");
	}

	/**
	 * Call function with no return value. If the parameters of
	 * LongBstrReturnVoid are not equal, the function returns an error code and
	 * an exception should be thrown.
	 */
	@Test
	public void testInvokeVoidFunctionWithException() {
		log.info("testInvokeVoidFuntestInvokeVoidFunctionWithExceptionction(");
		try {

			log.info("call without exception");
			testObj.LongBstrReturnVoid(123, "123");

			try {
				testObj.LongBstrReturnVoid(555, "444");
				TestCase.fail("exception expected");
			} catch (ComException e) {
				log.info("OK, received expected exception=" + e);
			}
		} catch (ComException e) {
			log.error("testInvokeVoidFunctionWithException failed", e);
			fail(e.toString());

		}
		log.info(")testInvokeVoidFunctionWithException");
	}

	/**
	 * Invoke function with return value.
	 * 
	 */
	@Test
	public void testInvokeFunctionWithReturnValue() {
		log.info("testInvokeFunctionWithReturnValue(");
		try {

			double ret = testObj.FloatReturnDouble(999f);
			TestCase.assertEquals("Return value", 999.0, ret);
		} catch (ComException e) {
			log.error("testInvokeFunctionWithReturnValue failed", e);
			fail(e.toString());

		}

		log.info(")testInvokeFunctionWithReturnValue");
	}

	/**
	 * Invoke function with in/out parameter.
	 */
	@Test
	public void testInvokeFunctionWithByRefParam() {

		log.info("testInvokeFunctionWithByRefParam(");
		try {
			ByRef<Short> shortbyref1 = new ByRef<Short>((short) 4747);
			String ret = testObj.ShortByRefReturnBstr(shortbyref1);

			log.info("returned short=" + shortbyref1.value);
			log.info("returned string=" + ret);

			// Related values are hard coded in JoaTestObject
			TestCase.assertEquals("Ref param", Short.valueOf((short) 123), shortbyref1.value);
			TestCase.assertEquals("Return", "ShortByRefReturnBstr", ret);

			ByRef<Short> Short1 = new ByRef<Short>((short) 1);
			testObj.MethodByRef_Short(Short1);
			TestCase.assertEquals("MethodByRef_Short", Short.valueOf((short) 2), Short1.value);

			ByRef<Boolean> Bool1 = new ByRef<Boolean>(Boolean.FALSE);
			testObj.MethodByRef_Bool(Bool1);
			TestCase.assertEquals("MethodByRef_Byte", Boolean.TRUE, Bool1.value);

			ByRef<Byte> Byte1 = new ByRef<Byte>((byte) 1);
			testObj.MethodByRef_Byte(Byte1);
			TestCase.assertEquals("MethodByRef_Byte", Byte.valueOf((byte) 2), Byte1.value);

			ByRef<Integer> Long1 = new ByRef<Integer>(1);
			testObj.MethodByRef_Long(Long1);
			TestCase.assertEquals("MethodByRef_Long", Integer.valueOf(2), Long1.value);

			ByRef<Long> Longlong1 = new ByRef<Long>(1L);
			testObj.MethodByRef_Longlong(Longlong1);
			TestCase.assertEquals("MethodByRef_Longlong", Long.valueOf(2), Longlong1.value);

			ByRef<Double> Double1 = new ByRef<Double>(1.0);
			testObj.MethodByRef_Double(Double1);
			TestCase.assertEquals("MethodByRef_Double", Double.valueOf(2.0), Double1.value);

			ByRef<Float> Float1 = new ByRef<Float>(1.0f);
			testObj.MethodByRef_Float(Float1);
			TestCase.assertEquals("MethodByRef_Float", Float.valueOf(2.0f), Float1.value);

			ByRef<String> String1 = new ByRef<String>("string1");
			testObj.MethodByRef_String(String1);
			TestCase.assertEquals("MethodByRef_String", "string1+1", String1.value);

			// Java does not distinguish between signed and unsigned types.
			// Thus, this types are currently not supported as by-ref types.

			// ByRef < Byte > Char1 = new ByRef < Byte >((byte)1);
			// testObj.MethodByRef_Char(Char1);
			// TestCase.assertEquals("MethodByRef_Char", Byte.valueOf((byte)2),
			// Char1.value);
			//
			// ByRef < Short > UShort1 = new ByRef < Short > ((short)1);
			// testObj.MethodByRef_Ushort(UShort1);
			// TestCase.assertEquals("MethodByRef_Ushort",
			// Short.valueOf((short)2), UShort1.value);
			//
			// ByRef < Integer > ULong1 = new ByRef < Integer >(1);
			// testObj.MethodByRef_Ulong(ULong1);
			// TestCase.assertEquals("MethodByRef_Ulong", Integer.valueOf(2),
			// ULong1.value);
			//
			// ByRef < Long > ULonglong1 = new ByRef < Long >(1L);
			// testObj.MethodByName_Ulonglong(ULonglong1);
			// TestCase.assertEquals("MethodByName_Ulonglong", Long.valueOf(2L),
			// ULonglong1.value);

		} catch (ComException e) {
			log.error("testInvokeFunctionWithByRefParam failed", e);
			fail(e.toString());

		}

		log.info(")testInvokeFunctionWithByRefParam");
	}

	/**
	 * Invoke function with in/out parameter of type Dispatch.
	 */
	@Test
	public void testInvokeFunctionWithByRefParamDispatch() {

		log.info("testInvokeFunctionWithByRefParamDispatch(");
		try {

			ByRef<Dispatch> disp1 = new ByRef<Dispatch>(Dispatch.class);
			JoaTestDispatch1 testDisp1 = new JoaTestDispatch1();
			testDisp1.setName("disp1");
			disp1.value = testDisp1;
			testObj.MethodByRef_Dispatch(disp1);

			TestCase.assertTrue("Byref value must have changed", disp1.value != testDisp1);
			JoaTestDispatch1 readDisp = disp1.value.as(JoaTestDispatch1.class);
			TestCase.assertEquals("MethodByRef_Dispatch", "disp1+1", readDisp.getName());

			testDisp1.releaseComObject();
			disp1.value.releaseComObject();

			// After testObj will have been released in tearDown(),
			// no more COM references are alive and the COM server stops.

		} catch (ComException e) {
			log.error("testInvokeFunctionWithByRefParamDispatch failed", e);
			fail(e.toString());

		}

		log.info(")testInvokeFunctionWithByRefParamDispatch");
	}

}
