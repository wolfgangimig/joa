/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AEA-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SharedWorkspaceMemberImpl extends Dispatch implements com.wilutions.mslib.office.SharedWorkspaceMember {
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
  @DeclDISPID(0)  public String getDomainName() throws ComException {
    final Object obj = this._dispatchCall(0,"DomainName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public String getEmail() throws ComException {
    final Object obj = this._dispatchCall(2,"Email", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public void Delete() throws ComException {
    this._dispatchCall(3,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(5)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(5,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public SharedWorkspaceMemberImpl(String progId) throws ComException {
    super(progId, "{000C0381-0000-0000-C000-000000000046}");
  }
  protected SharedWorkspaceMemberImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharedWorkspaceMemberImpl" + super.toString() + "]";
  }
}
