/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{21388953-1CE7-9F8A-389B-75DBB4542D21}")
public class IMessengerGroupImpl extends Dispatch implements com.wilutions.mslib.messengerapi.IMessengerGroup {
  @DeclDISPID(1667)  public IDispatch getContacts() throws ComException {
    final Object obj = this._dispatchCall(1667,"Contacts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1668)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1668,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1668)  public void setName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1668,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1669)  public void AddContact(final Object vContact) throws ComException {
    assert(vContact != null);
    this._dispatchCall(1669,"AddContact", DISPATCH_METHOD,null,vContact);
  }
  @DeclDISPID(1670)  public void RemoveContact(final Object vContact) throws ComException {
    assert(vContact != null);
    this._dispatchCall(1670,"RemoveContact", DISPATCH_METHOD,null,vContact);
  }
  @DeclDISPID(1671)  public IDispatch getService() throws ComException {
    final Object obj = this._dispatchCall(1671,"Service", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public IMessengerGroupImpl(String progId) throws ComException {
    super(progId, "{E1AF1038-B884-44CB-A535-1C3C11A3D1DB}");
  }
  protected IMessengerGroupImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMessengerGroupImpl" + super.toString() + "]";
  }
}
