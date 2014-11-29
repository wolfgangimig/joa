/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IDistributionGroup.
 * IDistributionGroup Interface 
 */
@CoInterface(guid="{340C54A6-35CF-4971-B540-72D7F040AC24}")
public interface IDistributionGroup extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
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
  @DeclDISPID(1610874880)  public String getEmailAddress() throws ComException;
  @DeclDISPID(1610874881)  public IGroupCollection getNestedGroups() throws ComException;
  @DeclDISPID(1610874882)  public IAsynchronousOperation Expand(Object _groupCallback, Object _state) throws ComException;
  @DeclDISPID(1610874883)  public Boolean getIsExpanded() throws ComException;
  @DeclDISPID(1610874884)  public IAsynchronousOperation GetAllMembers(Object _groupCallback, Object _state) throws ComException;
  @DeclDISPID(1610874885)  public String getDescription() throws ComException;
  @DeclDISPID(1610874886)  public IAsynchronousOperation GetOwner(Object _groupCallback, Object _state) throws ComException;
}
