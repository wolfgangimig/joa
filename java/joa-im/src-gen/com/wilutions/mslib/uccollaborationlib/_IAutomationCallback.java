/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IAutomationCallback.
 * _IAutomationCallback Interface 
 */
@CoInterface(guid="{806D3227-4CB8-47C4-9864-7D4DF4F44069}")
public interface _IAutomationCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(4100)  public void OnStartConversation(final IAutomation _source, final IConversationWindow _uiWindow, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4101)  public void OnJoinConference(final IAutomation _source, final IConversationWindow _uiWindow, final IAsynchronousOperation _asyncOperation) throws ComException;
}
