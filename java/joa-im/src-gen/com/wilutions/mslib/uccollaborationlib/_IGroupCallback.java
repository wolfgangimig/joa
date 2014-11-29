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
  @DeclDISPID(551)  public void OnAddContact(final IGroup _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(552)  public void OnRemoveContact(final IGroup _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(550)  public void OnRename(final ICustomGroup _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(553)  public void OnExpand(final IDistributionGroup _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(554)  public void OnGetAllMembers(final IDistributionGroup _source, final IContactCollection _members, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(555)  public void OnGetOwner(final IDistributionGroup _source, final IContact _owner, final IAsynchronousOperation _asyncOperation) throws ComException;
}
