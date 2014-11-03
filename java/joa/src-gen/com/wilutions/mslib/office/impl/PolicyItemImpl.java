/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AFA-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PolicyItemImpl extends Dispatch implements com.wilutions.mslib.office.PolicyItem {
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
  @DeclDISPID(0)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(0,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(2,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public String getData() throws ComException {
    final Object obj = this._dispatchCall(3,"Data", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(4,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public PolicyItemImpl(String progId) throws ComException {
    super(progId);
  }
  protected PolicyItemImpl(long ndisp) {
    super(ndisp);
  }
  public PolicyItemImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PolicyItemImpl" + super.toString() + "]";
  }
}
