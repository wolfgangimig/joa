/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1C493D4E-1191-9C58-3E1A-00181C80F71C}")
public class IRecentContactsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRecentContacts {
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public Boolean TryGetContact(String _uri, ByRef<com.wilutions.mslib.uccollaborationlib.IContact> _value) throws ComException {
    assert(_uri != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743810,"TryGetContact", DISPATCH_METHOD,null,_uri,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809344)  public com.wilutions.mslib.uccollaborationlib.GroupType getType() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.GroupType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809345)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809346)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809347)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation AddContact(com.wilutions.mslib.uccollaborationlib.IContact _contact, Object _groupCallback, Object _state) throws ComException {
    assert(_groupCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809347,"AddContact", DISPATCH_METHOD,null,(_contact!=null?_contact:Dispatch.NULL),_groupCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809348)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation RemoveContact(com.wilutions.mslib.uccollaborationlib.IContact pContact, Object _groupCallback, Object _state) throws ComException {
    assert(_groupCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809348,"RemoveContact", DISPATCH_METHOD,null,(pContact!=null?pContact:Dispatch.NULL),_groupCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809349)  public com.wilutions.mslib.uccollaborationlib.IContactManager getContactManager() throws ComException {
    final Object obj = this._dispatchCall(1610809349,"ContactManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactManagerImpl.class);
  }
  @DeclDISPID(1610809350)  public Boolean CanInvoke(com.wilutions.mslib.uccollaborationlib.GroupAction _action, com.wilutions.mslib.uccollaborationlib.IContact _contact) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610809350,"CanInvoke", DISPATCH_METHOD,null,_action.value,(_contact!=null?_contact:Dispatch.NULL));
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874880)  public com.wilutions.mslib.uccollaborationlib.IContact GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610874880,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  public IRecentContactsImpl(String progId) throws ComException {
    super(progId, "{DCDEA425-B5F2-4719-A3B4-69FFB9770BE6}");
  }
  protected IRecentContactsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRecentContactsImpl" + super.toString() + "]";
  }
}
