/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4264-A463-DB41-5DAE-69E7A5F7FCBC}")
public class CustomXMLValidationErrorsImpl extends Dispatch implements com.wilutions.mslib.office.CustomXMLValidationErrors {
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
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.CustomXMLValidationError getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CustomXMLValidationErrorImpl.class);
  }
  @DeclDISPID(1610809347)  public void Add(com.wilutions.mslib.office.CustomXMLNode Node, String ErrorName, String ErrorText, Boolean ClearedOnUpdate) throws ComException {
    assert(ErrorName != null);
    assert(ErrorText != null);
    assert(ClearedOnUpdate != null);
    this._dispatchCall(1610809347,"Add", DISPATCH_METHOD,null,(Node!=null?Node:Dispatch.NULL),ErrorName,ErrorText,ClearedOnUpdate);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public CustomXMLValidationErrorsImpl(String progId) throws ComException {
    super(progId);
  }
  protected CustomXMLValidationErrorsImpl(long ndisp) {
    super(ndisp);
  }
  public CustomXMLValidationErrorsImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomXMLValidationErrorsImpl" + super.toString() + "]";
  }
}
