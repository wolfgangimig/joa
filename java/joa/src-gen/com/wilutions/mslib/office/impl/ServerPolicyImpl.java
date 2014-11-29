/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AFB-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ServerPolicyImpl extends Dispatch implements com.wilutions.mslib.office.ServerPolicy {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.PolicyItem getItem(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PolicyItemImpl.class);
  }
  @DeclDISPID(1)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(2,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(3,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public String getStatement() throws ComException {
    final Object obj = this._dispatchCall(4,"Statement", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(5)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(5,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(6)  public Boolean getBlockPreview() throws ComException {
    final Object obj = this._dispatchCall(6,"BlockPreview", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(7)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(7,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public ServerPolicyImpl(String progId) throws ComException {
    super(progId, "{000C0390-0000-0000-C000-000000000046}");
  }
  protected ServerPolicyImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ServerPolicyImpl" + super.toString() + "]";
  }
}
