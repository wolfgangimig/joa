/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IGroupCallback.
 * _IGroupCallback Interface 
 */
@CoInterface(guid="{C6605772-3D9D-44A7-B43A-4590E6B43EE3}")
public interface _IGroupCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(551)  public void OnAddContact(IGroup _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(552)  public void OnRemoveContact(IGroup _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(550)  public void OnRename(ICustomGroup _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(553)  public void OnExpand(IDistributionGroup _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(554)  public void OnGetAllMembers(IDistributionGroup _source, IContactCollection _members, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(555)  public void OnGetOwner(IDistributionGroup _source, IContact _owner, IAsynchronousOperation _asyncOperation) throws ComException;
}
