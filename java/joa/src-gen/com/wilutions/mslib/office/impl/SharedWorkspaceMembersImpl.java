/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AE9-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SharedWorkspaceMembersImpl extends Dispatch implements com.wilutions.mslib.office.SharedWorkspaceMembers {
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
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.SharedWorkspaceMember getItem(final Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SharedWorkspaceMemberImpl.class);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.SharedWorkspaceMember Add(final String Email, final String DomainName, final String DisplayName, final Object Role) throws ComException {
    assert(Email != null);
    assert(DomainName != null);
    assert(DisplayName != null);
    assert(Role != null);
    final Object obj = this._dispatchCall(2,"Add", DISPATCH_METHOD,null,Email,DomainName,DisplayName,Role);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SharedWorkspaceMemberImpl.class);
  }
  @DeclDISPID(3)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(3,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(4)  public Boolean getItemCountExceeded() throws ComException {
    final Object obj = this._dispatchCall(4,"ItemCountExceeded", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public SharedWorkspaceMembersImpl(String progId) throws ComException {
    super(progId, "{000C0382-0000-0000-C000-000000000046}");
  }
  protected SharedWorkspaceMembersImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharedWorkspaceMembersImpl" + super.toString() + "]";
  }
}
