/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IGroup.
 * IGroup Interface 
 */
@CoInterface(guid="{F97973D7-9436-4A3E-A802-F6EA172A0425}")
public interface IGroup extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException;
  @DeclDISPID(1610743810)  public Boolean TryGetContact(final String _uri, final ByRef<IContact> _value) throws ComException;
  @DeclDISPID(1610809344)  public GroupType getType() throws ComException;
  @DeclDISPID(1610809345)  public String getName() throws ComException;
  @DeclDISPID(1610809346)  public String getId() throws ComException;
  @DeclDISPID(1610809347)  public IAsynchronousOperation AddContact(final IContact _contact, final Object _groupCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809348)  public IAsynchronousOperation RemoveContact(final IContact pContact, final Object _groupCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809349)  public IContactManager getContactManager() throws ComException;
  @DeclDISPID(1610809350)  public Boolean CanInvoke(final GroupAction _action, final IContact _contact) throws ComException;
}
