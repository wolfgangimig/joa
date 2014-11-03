/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.HRESULT;
import com.wilutions.joa.joacomtestlib.IJoaTestDispatch1;
import com.wilutions.joa.joacomtestlib.IJoaTestObject;

public class MyJoaTestObjectImpl extends DispatchImpl implements IJoaTestObject {

	String string1;
	byte byte1;
	// char char1;
	// CY currency1;
	Date date1;
	double double1;
	float float1;
	Dispatch dispatch1;
	// IFontDisp fontDisp1;
	// IPictureDisp pictureDisp1;
	// IUnknown unknown1;
	int long1;
	long longlong1;
	// OLE_COLOR olecolor1;
	// OLE_XPOS_HIMETRIC oleXPosHiMetric1;
	// OLE_HANDLE oleHandle1;
	// OLE_OPTEXCLUSIVE oleOptExclusive1;
	// OLE_TRISTATE oleTristate1;
	// SCODE scode1;
	short short1;
	// ULONG ulong1;
	// ULONGLONG ulonglong1;
	// USHORT ushort1;
	// CComVariant variant1;
	boolean boolean1;
	// String stringPutref1;
	// long longPutref1;
	// Dispatch dispatchPutref1;
	int[] longArray1dim = new int[100];
	String[][][] stringArray3dim = new String[3][4][5];
	Map<String, Boolean> booleanMap1 = new HashMap<String, Boolean>();
	IJoaTestDispatch1 joaTestDispatch1;

	@Override
	public String getString1() throws ComException {

		return string1;
	}

	@Override
	public void setString1(String value) throws ComException {

		string1 = value;
	}

	@Override
	public Byte getByte1() throws ComException {

		return byte1;
	}

	@Override
	public void setByte1(Byte value) throws ComException {

		byte1 = value;
	}

	@Override
	public Double getDouble1() throws ComException {

		return double1;
	}

	@Override
	public void setDouble1(Double value) throws ComException {

		double1 = value;
	}

	@Override
	public Float getFloat1() throws ComException {

		return float1;
	}

	@Override
	public void setFloat1(Float value) throws ComException {

		float1 = value;
	}

	@Override
	public Dispatch getDispatch1() throws ComException {

		return dispatch1;
	}

	@Override
	public void setDispatch1(Dispatch value) throws ComException {

		dispatch1 = value;
	}

	@Override
	public Integer getLong1() throws ComException {

		return long1;
	}

	@Override
	public void setLong1(Integer value) throws ComException {

		long1 = value;
	}

	@Override
	public Long getLonglong1() throws ComException {

		return longlong1;
	}

	@Override
	public void setLonglong1(Long value) throws ComException {

		longlong1 = value;
	}

	@Override
	public Short getShort1() throws ComException {

		return short1;
	}

	@Override
	public void setShort1(Short value) throws ComException {

		short1 = value;
	}

	@Override
	public Integer getULong1() throws ComException {

		return null;
	}

	@Override
	public void setULong1(Integer value) throws ComException {

	}

	@Override
	public Long getULonglong1() throws ComException {

		return null;
	}

	@Override
	public void setULonglong1(Long value) throws ComException {

	}

	@Override
	public Short getUShort1() throws ComException {

		return null;
	}

	@Override
	public void setUShort1(Short value) throws ComException {

	}

	@Override
	public Object getVariant1() throws ComException {

		return null;
	}

	@Override
	public void setVariant1(Object value) throws ComException {

	}

	@Override
	public Boolean getBoolean1() throws ComException {

		return boolean1;
	}

	@Override
	public void setBoolean1(Boolean value) throws ComException {

		boolean1 = value;
	}

	@Override
	public Integer getLongArray1dim(Integer index) throws ComException {

		return longArray1dim[index];
	}

	@Override
	public void setLongArray1dim(Integer index, Integer value2) throws ComException {

		longArray1dim[index] = value2;
	}

	@Override
	public String getStringArray3dim(Integer index1, Integer index2, Integer index3) throws ComException {

		return stringArray3dim[index1][index2][index3];
	}

	@Override
	public void setStringArray3dim(Integer index1, Integer index2, Integer index3, String value4) throws ComException {

		stringArray3dim[index1][index2][index3] = value4;
	}

	@Override
	public Boolean getBooleanMap1(String key) throws ComException {

		return booleanMap1.get(key);
	}

	@Override
	public void setBooleanMap1(String key, Boolean value2) throws ComException {

		booleanMap1.put(key, value2);
	}

	@Override
	public void LongBstrReturnVoid(Integer Long1, String bstr2) throws ComException {

		if (!Long1.toString().equals(bstr2)) {
			throw new ComException("LongBstrReturnVoid failed", HRESULT.E_INVALIDARG);
		}
	}

	@Override
	public Double FloatReturnDouble(Float Float1) throws ComException {

		return Double.valueOf(Float1);
	}

	@Override
	public String ShortByRefReturnBstr(ByRef<Short> shortbyref1) throws ComException {

		shortbyref1.value = 123;
		return "ShortByRefReturnBstr";
	}

	@Override
	public Dispatch DispatchByRefRetunDispatch(ByRef<Dispatch> dispbyref1) throws ComException {

		return null;
	}

	@Override
	public Integer getReadonlyProperty1() throws ComException {

		return null;
	}

	@Override
	public void MethodFails1(String bstr1, Integer hresultCode) throws ComException {

	}

	@Override
	public String getNullString1() throws ComException {

		return null;
	}

	@Override
	public void setNullString1(String value) throws ComException {

	}

	@Override
	public void MethodByRef_Byte(ByRef<Byte> Byte1) throws ComException {

	}

	@Override
	public void MethodByRef_Char(ByRef<Byte> Char1) throws ComException {

	}

	@Override
	public void MethodByRef_Long(ByRef<Integer> Long1) throws ComException {

	}

	@Override
	public void MethodByRef_Longlong(ByRef<Long> Longlong1) throws ComException {

	}

	@Override
	public void MethodByRef_Double(ByRef<Double> Double1) throws ComException {

	}

	@Override
	public void MethodByRef_Float(ByRef<Float> Float1) throws ComException {

	}

	@Override
	public void MethodByRef_Dispatch(ByRef<Dispatch> disp1) throws ComException {

	}

	@Override
	public void MethodByRef_Short(ByRef<Short> Short1) throws ComException {

	}

	@Override
	public void MethodByRef_String(ByRef<String> String1) throws ComException {

	}

	@Override
	public void MethodByRef_Ushort(ByRef<Short> Short1) throws ComException {

	}

	@Override
	public void MethodByRef_Ulong(ByRef<Integer> Long1) throws ComException {

	}

	@Override
	public void MethodByName_Ulonglong(ByRef<Long> Longlong1) throws ComException {

	}

	@Override
	public void MethodByRef_Bool(ByRef<Boolean> bool1) throws ComException {

	}

	@Override
	public IJoaTestDispatch1 getPropJoaTestDispatch1() throws ComException {
		return joaTestDispatch1;
	}

	@Override
	public void setPropJoaTestDispatch1(IJoaTestDispatch1 value) throws ComException {
		joaTestDispatch1 = value;
	}

	@Override
	public Dispatch getJavaObjectImpl() throws ComException {
		return null;
	}

	@Override
	public void setJavaObjectImpl(Dispatch value) throws ComException {
	}

	@Override
	public Object getJavaObjectImpl2() throws ComException {
		return null;
	}

	@Override
	public void setJavaObjectImpl2(Object value) throws ComException {
	}

	@Override
	public Date getDate1() throws ComException {
		return date1;
	}

	@Override
	public void setDate1(Date value) throws ComException {
		this.date1 = value;
	}

}
