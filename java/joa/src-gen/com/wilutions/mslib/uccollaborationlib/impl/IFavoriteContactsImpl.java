/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F559A32F-6255-9670-213B-D0D0A9D5AD43}")
public class IFavoriteContactsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IFavoriteContacts {
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
  public IFavoriteContactsImpl(String progId) throws ComException {
    super(progId, "{35CE3A44-C636-4D31-BC95-B9370C2251B9}");
  }
  protected IFavoriteContactsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IFavoriteContactsImpl" + super.toString() + "]";
  }
}
