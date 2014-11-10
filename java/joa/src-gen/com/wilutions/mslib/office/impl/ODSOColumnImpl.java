/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8C5A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ODSOColumnImpl extends Dispatch implements com.wilutions.mslib.office.ODSOColumn {
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
  @DeclDISPID(1)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(1,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(2,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(3,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(4)  public String getValue() throws ComException {
    final Object obj = this._dispatchCall(4,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public ODSOColumnImpl(String progId) throws ComException {
    super(progId);
  }
  protected ODSOColumnImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ODSOColumnImpl" + super.toString() + "]";
  }
}
