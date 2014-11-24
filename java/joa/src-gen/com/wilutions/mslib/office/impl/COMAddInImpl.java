/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A51-A463-DB41-5DAE-69E7A5F7FCBC}")
public class COMAddInImpl extends Dispatch implements com.wilutions.mslib.office.COMAddIn {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(0,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setDescription(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Description", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public String getProgId() throws ComException {
    final Object obj = this._dispatchCall(3,"ProgId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public String getGuid() throws ComException {
    final Object obj = this._dispatchCall(4,"Guid", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(6)  public Boolean getConnect() throws ComException {
    final Object obj = this._dispatchCall(6,"Connect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(6)  public void setConnect(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"Connect", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(7)  public IDispatch getObject() throws ComException {
    final Object obj = this._dispatchCall(7,"Object", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(7)  public void setObject(IDispatch value) throws ComException {
    this._dispatchCall(7,"Object", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(8)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(8,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public COMAddInImpl(String progId) throws ComException {
    super(progId, "{000C033A-0000-0000-C000-000000000046}");
  }
  protected COMAddInImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[COMAddInImpl" + super.toString() + "]";
  }
}
