/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AD7-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SoftEdgeFormatImpl extends Dispatch implements com.wilutions.mslib.office.SoftEdgeFormat {
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
  @DeclDISPID(1)  public com.wilutions.mslib.office.MsoSoftEdgeType getType() throws ComException {
    final Object obj = this._dispatchCall(1,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoSoftEdgeType.valueOf((Integer)obj);
  }
  @DeclDISPID(1)  public void setType(com.wilutions.mslib.office.MsoSoftEdgeType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(2)  public Float getRadius() throws ComException {
    final Object obj = this._dispatchCall(2,"Radius", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(2)  public void setRadius(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Radius", DISPATCH_PROPERTYPUT,value);
  }
  public SoftEdgeFormatImpl(String progId) throws ComException {
    super(progId);
  }
  protected SoftEdgeFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SoftEdgeFormatImpl" + super.toString() + "]";
  }
}
