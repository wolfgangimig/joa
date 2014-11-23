/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * CustomGroup.
 * Represents a user-created contact group. 
 */
@CoClass(guid="{A2E0476A-945F-4C93-98FA-87AED29E9467}")
public class CustomGroup extends Dispatch implements ICustomGroup {
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
  @DeclDISPID(1610743810)  public Boolean TryGetContact(String _uri, ByRef<IContact> _value) throws ComException {
    assert(_uri != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743810,"TryGetContact", DISPATCH_METHOD,null,_uri,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809344)  public GroupType getType() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return GroupType.valueOf((Integer)obj);
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
  @DeclDISPID(1610809347)  public IAsynchronousOperation AddContact(IContact _contact, Object _groupCallback, Object _state) throws ComException {
    assert(_groupCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809347,"AddContact", DISPATCH_METHOD,null,(_contact!=null?_contact:Dispatch.NULL),_groupCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809348)  public IAsynchronousOperation RemoveContact(IContact pContact, Object _groupCallback, Object _state) throws ComException {
    assert(_groupCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809348,"RemoveContact", DISPATCH_METHOD,null,(pContact!=null?pContact:Dispatch.NULL),_groupCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809349)  public IContactManager getContactManager() throws ComException {
    final Object obj = this._dispatchCall(1610809349,"ContactManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactManagerImpl.class);
  }
  @DeclDISPID(1610809350)  public Boolean CanInvoke(GroupAction _action, IContact _contact) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610809350,"CanInvoke", DISPATCH_METHOD,null,_action.value,(_contact!=null?_contact:Dispatch.NULL));
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874880)  public IAsynchronousOperation Rename(String _newName, Object _groupCallback, Object _state) throws ComException {
    assert(_newName != null);
    assert(_groupCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610874880,"Rename", DISPATCH_METHOD,null,_newName,_groupCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public CustomGroup() throws ComException {
    super("{A2E0476A-945F-4C93-98FA-87AED29E9467}", "{D804BA85-DB0F-49EE-B723-DCDF0425BD9F}");
  }
  protected CustomGroup(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomGroup" + super.toString() + "]";
  }
}
