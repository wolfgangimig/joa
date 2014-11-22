/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A7A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class CalloutFormatImpl extends Dispatch implements com.wilutions.mslib.office.CalloutFormat {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(10)  public void AutomaticLength() throws ComException {
    this._dispatchCall(10,"AutomaticLength", DISPATCH_METHOD,null);
  }
  @DeclDISPID(11)  public void CustomDrop(Float Drop) throws ComException {
    assert(Drop != null);
    this._dispatchCall(11,"CustomDrop", DISPATCH_METHOD,null,Drop);
  }
  @DeclDISPID(12)  public void CustomLength(Float Length) throws ComException {
    assert(Length != null);
    this._dispatchCall(12,"CustomLength", DISPATCH_METHOD,null,Length);
  }
  @DeclDISPID(13)  public void PresetDrop(com.wilutions.mslib.office.MsoCalloutDropType DropType) throws ComException {
    assert(DropType != null);
    this._dispatchCall(13,"PresetDrop", DISPATCH_METHOD,null,DropType.value);
  }
  @DeclDISPID(100)  public com.wilutions.mslib.office.MsoTriState getAccent() throws ComException {
    final Object obj = this._dispatchCall(100,"Accent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(100)  public void setAccent(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(100,"Accent", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.MsoCalloutAngleType getAngle() throws ComException {
    final Object obj = this._dispatchCall(101,"Angle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoCalloutAngleType.valueOf((Integer)obj);
  }
  @DeclDISPID(101)  public void setAngle(com.wilutions.mslib.office.MsoCalloutAngleType value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"Angle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(102)  public com.wilutions.mslib.office.MsoTriState getAutoAttach() throws ComException {
    final Object obj = this._dispatchCall(102,"AutoAttach", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(102)  public void setAutoAttach(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"AutoAttach", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(103)  public com.wilutions.mslib.office.MsoTriState getAutoLength() throws ComException {
    final Object obj = this._dispatchCall(103,"AutoLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.MsoTriState getBorder() throws ComException {
    final Object obj = this._dispatchCall(104,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(104)  public void setBorder(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"Border", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(105)  public Float getDrop() throws ComException {
    final Object obj = this._dispatchCall(105,"Drop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.MsoCalloutDropType getDropType() throws ComException {
    final Object obj = this._dispatchCall(106,"DropType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoCalloutDropType.valueOf((Integer)obj);
  }
  @DeclDISPID(107)  public Float getGap() throws ComException {
    final Object obj = this._dispatchCall(107,"Gap", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(107)  public void setGap(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(107,"Gap", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(108)  public Float getLength() throws ComException {
    final Object obj = this._dispatchCall(108,"Length", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(109)  public com.wilutions.mslib.office.MsoCalloutType getType() throws ComException {
    final Object obj = this._dispatchCall(109,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoCalloutType.valueOf((Integer)obj);
  }
  @DeclDISPID(109)  public void setType(com.wilutions.mslib.office.MsoCalloutType value) throws ComException {
    assert(value != null);
    this._dispatchCall(109,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  public CalloutFormatImpl(String progId) throws ComException {
    super(progId, "{000C0311-0000-0000-C000-000000000046}");
  }
  protected CalloutFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CalloutFormatImpl" + super.toString() + "]";
  }
}
