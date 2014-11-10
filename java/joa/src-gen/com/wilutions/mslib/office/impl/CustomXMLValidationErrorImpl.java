/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4265-A463-DB41-5DAE-69E7A5F7FCBC}")
public class CustomXMLValidationErrorImpl extends Dispatch implements com.wilutions.mslib.office.CustomXMLValidationError {
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
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809345)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809346)  public com.wilutions.mslib.office.CustomXMLNode getNode() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Node", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CustomXMLNodeImpl.class);
  }
  @DeclDISPID(1610809347)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809348)  public com.wilutions.mslib.office.MsoCustomXMLValidationErrorType getType() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoCustomXMLValidationErrorType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809349)  public void Delete() throws ComException {
    this._dispatchCall(1610809349,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809350)  public Integer getErrorCode() throws ComException {
    final Object obj = this._dispatchCall(1610809350,"ErrorCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public CustomXMLValidationErrorImpl(String progId) throws ComException {
    super(progId);
  }
  protected CustomXMLValidationErrorImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomXMLValidationErrorImpl" + super.toString() + "]";
  }
}
