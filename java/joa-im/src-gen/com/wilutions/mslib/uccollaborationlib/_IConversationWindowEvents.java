/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IConversationWindowEvents.
 * _IConversationWindowEvents Interface 
 */
@CoInterface(guid="{9E0F8FCA-D9C9-47CD-87F4-5554217DFFCC}")
public interface _IConversationWindowEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(4000)  public void onOnNeedsSizeChange(IConversationWindow _eventSource, IConversationWindowNeedsSizeChangeEventData _eventData) throws ComException;
  @DeclDISPID(4001)  public void onOnNeedsAttention(IConversationWindow _eventSource, IConversationWindowNeedsAttentionEventData _eventData) throws ComException;
}
