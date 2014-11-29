/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IContactCallback.
 * _IContactCallback Interface 
 */
@CoInterface(guid="{311DDE48-ED7D-46FA-9E0A-2E314B7FEF7C}")
public interface _IContactCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(450)  public void OnChangeSetting(IContact _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(451)  public void OnMoveToGroup(IContact _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(452)  public void OnGetOrganizationInformation(IContact _source, IContactCollection _managers, IContactCollection _peers, IContactCollection _directors, IAsynchronousOperation _asyncOperation) throws ComException;
}
