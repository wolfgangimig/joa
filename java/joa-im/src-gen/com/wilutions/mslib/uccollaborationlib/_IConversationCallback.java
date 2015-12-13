/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IConversationCallback.
 * _IConversationCallback Interface 
 */
@CoInterface(guid="{57CC2235-96C5-49FA-B92B-350486C6CF52}")
public interface _IConversationCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1061)  public void OnMerge(final IConversation _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1065)  public void OnPark(final IConversation _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1062)  public void OnSetProperty(final IConversation _source, final ConversationProperty _propertyType, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1063)  public void OnAdmitParticipants(final IConversation _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1064)  public void OnDenyParticipants(final IConversation _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1066)  public void OnMuteParticipants(final IConversation _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1067)  public void OnUnmuteParticipants(final IConversation _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1068)  public void OnSendInitialContext(final IConversation _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1069)  public void OnSendContextData(final IConversation _source, final IAsynchronousOperation _asyncOperation) throws ComException;
}
