/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IUtilitiesCallback.
 * _IUtilitiesCallback Interface 
 */
@CoInterface(guid="{C4D95336-5949-4D13-AAC8-82039E5CBCFC}")
public interface _IUtilitiesCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1900)  public void OnAddToExternalContacts(final IUtilities _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1901)  public void OnFindPreviousConversations(final IUtilities _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1902)  public void OnComposeEmail(final IUtilities _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1903)  public void OnScheduleMeeting(final IUtilities _source, final IAsynchronousOperation _asyncOperation) throws ComException;
}
