package com.wilutions.joa.joacomtestlib;
import com.wilutions.com.*;

/**
 * IJoaTestObject.
 * 
 */
@CoInterface(guid="{44DD370D-A53F-4790-99C6-120EAC699067}")
public interface IJoaTestObject extends IDispatch {
  @DeclDISPID(1)  public String getString1() throws ComException;
  @DeclDISPID(1)  public void setString1(String value) throws ComException;
  @DeclDISPID(2)  public Byte getByte1() throws ComException;
  @DeclDISPID(2)  public void setByte1(Byte value) throws ComException;
  @DeclDISPID(5)  public java.util.Date getDate1() throws ComException;
  @DeclDISPID(5)  public void setDate1(java.util.Date value) throws ComException;
  @DeclDISPID(6)  public Double getDouble1() throws ComException;
  @DeclDISPID(6)  public void setDouble1(Double value) throws ComException;
  @DeclDISPID(7)  public Float getFloat1() throws ComException;
  @DeclDISPID(7)  public void setFloat1(Float value) throws ComException;
  @DeclDISPID(8)  public Dispatch getDispatch1() throws ComException;
  @DeclDISPID(8)  public void setDispatch1(Dispatch value) throws ComException;
  @DeclDISPID(12)  public Integer getLong1() throws ComException;
  @DeclDISPID(12)  public void setLong1(Integer value) throws ComException;
  @DeclDISPID(13)  public Long getLonglong1() throws ComException;
  @DeclDISPID(13)  public void setLonglong1(Long value) throws ComException;
  @DeclDISPID(27)  public Short getShort1() throws ComException;
  @DeclDISPID(27)  public void setShort1(Short value) throws ComException;
  @DeclDISPID(28)  public Integer getULong1() throws ComException;
  @DeclDISPID(28)  public void setULong1(Integer value) throws ComException;
  @DeclDISPID(29)  public Long getULonglong1() throws ComException;
  @DeclDISPID(29)  public void setULonglong1(Long value) throws ComException;
  @DeclDISPID(30)  public Short getUShort1() throws ComException;
  @DeclDISPID(30)  public void setUShort1(Short value) throws ComException;
  @DeclDISPID(31)  public Object getVariant1() throws ComException;
  @DeclDISPID(31)  public void setVariant1(Object value) throws ComException;
  @DeclDISPID(32)  public Boolean getBoolean1() throws ComException;
  @DeclDISPID(32)  public void setBoolean1(Boolean value) throws ComException;
  @DeclDISPID(36)  public Integer getLongArray1dim(Integer index) throws ComException;
  @DeclDISPID(36)  public void setLongArray1dim(Integer index, Integer value2) throws ComException;
  @DeclDISPID(37)  public String getStringArray3dim(Integer index1, Integer index2, Integer index3) throws ComException;
  @DeclDISPID(37)  public void setStringArray3dim(Integer index1, Integer index2, Integer index3, String value4) throws ComException;
  @DeclDISPID(38)  public Boolean getBooleanMap1(String key) throws ComException;
  @DeclDISPID(38)  public void setBooleanMap1(String key, Boolean value2) throws ComException;
  @DeclDISPID(39)  public void LongBstrReturnVoid(Integer Long1, String bstr2) throws ComException;
  @DeclDISPID(40)  public Double FloatReturnDouble(Float Float1) throws ComException;
  @DeclDISPID(41)  public String ShortByRefReturnBstr(ByRef<Short> shortbyref1) throws ComException;
  @DeclDISPID(42)  public Dispatch DispatchByRefRetunDispatch(ByRef<Dispatch> dispbyref1) throws ComException;
  @DeclDISPID(45)  public Integer getReadonlyProperty1() throws ComException;
  @DeclDISPID(46)  public void MethodFails1(String bstr1, Integer hresultCode) throws ComException;
  @DeclDISPID(47)  public String getNullString1() throws ComException;
  @DeclDISPID(47)  public void setNullString1(String value) throws ComException;
  @DeclDISPID(48)  public void MethodByRef_Byte(ByRef<Byte> Byte1) throws ComException;
  @DeclDISPID(49)  public void MethodByRef_Char(ByRef<Byte> char1) throws ComException;
  @DeclDISPID(50)  public void MethodByRef_Long(ByRef<Integer> Long1) throws ComException;
  @DeclDISPID(51)  public void MethodByRef_Longlong(ByRef<Long> Longlong1) throws ComException;
  @DeclDISPID(52)  public void MethodByRef_Double(ByRef<Double> Double1) throws ComException;
  @DeclDISPID(53)  public void MethodByRef_Float(ByRef<Float> Float1) throws ComException;
  @DeclDISPID(54)  public void MethodByRef_Dispatch(ByRef<Dispatch> disp1) throws ComException;
  @DeclDISPID(55)  public void MethodByRef_Short(ByRef<Short> Short1) throws ComException;
  @DeclDISPID(56)  public void MethodByRef_String(ByRef<String> String1) throws ComException;
  @DeclDISPID(57)  public void MethodByRef_Ushort(ByRef<Short> Short1) throws ComException;
  @DeclDISPID(58)  public void MethodByRef_Ulong(ByRef<Integer> Long1) throws ComException;
  @DeclDISPID(59)  public void MethodByName_Ulonglong(ByRef<Long> Longlong1) throws ComException;
  @DeclDISPID(60)  public void MethodByRef_Bool(ByRef<Boolean> bool1) throws ComException;
  @DeclDISPID(61)  public IJoaTestDispatch1 getPropJoaTestDispatch1() throws ComException;
  @DeclDISPID(61)  public void setPropJoaTestDispatch1(IJoaTestDispatch1 value) throws ComException;
  @DeclDISPID(62)  public Dispatch getJavaObjectImpl() throws ComException;
  @DeclDISPID(62)  public void setJavaObjectImpl(Dispatch value) throws ComException;
  @DeclDISPID(63)  public Object getJavaObjectImpl2() throws ComException;
  @DeclDISPID(63)  public void setJavaObjectImpl2(Object value) throws ComException;
}
