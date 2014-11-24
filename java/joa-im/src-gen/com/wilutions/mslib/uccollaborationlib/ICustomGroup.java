/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ICustomGroup.
 * ICustomGroup Interface 
 */
@CoInterface(guid="{D804BA85-DB0F-49EE-B723-DCDF0425BD9F}")
public interface ICustomGroup extends IDispatch {
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException;
  @DeclDISPID(1610743810)  public Boolean TryGetContact(String _uri, ByRef<IContact> _value) throws ComException;
  @DeclDISPID(1610809344)  public GroupType getType() throws ComException;
  @DeclDISPID(1610809345)  public String getName() throws ComException;
  @DeclDISPID(1610809346)  public String getId() throws ComException;
  @DeclDISPID(1610809347)  public IAsynchronousOperation AddContact(IContact _contact, Object _groupCallback, Object _state) throws ComException;
  @DeclDISPID(1610809348)  public IAsynchronousOperation RemoveContact(IContact pContact, Object _groupCallback, Object _state) throws ComException;
  @DeclDISPID(1610809349)  public IContactManager getContactManager() throws ComException;
  @DeclDISPID(1610809350)  public Boolean CanInvoke(GroupAction _action, IContact _contact) throws ComException;
  @DeclDISPID(1610874880)  public IAsynchronousOperation Rename(String _newName, Object _groupCallback, Object _state) throws ComException;
}
