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
  @DeclDISPID(1061)  public void OnMerge(IConversation _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1065)  public void OnPark(IConversation _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1062)  public void OnSetProperty(IConversation _source, ConversationProperty _propertyType, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1063)  public void OnAdmitParticipants(IConversation _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1064)  public void OnDenyParticipants(IConversation _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1066)  public void OnMuteParticipants(IConversation _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1067)  public void OnUnmuteParticipants(IConversation _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1068)  public void OnSendInitialContext(IConversation _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1069)  public void OnSendContextData(IConversation _source, IAsynchronousOperation _asyncOperation) throws ComException;
}
