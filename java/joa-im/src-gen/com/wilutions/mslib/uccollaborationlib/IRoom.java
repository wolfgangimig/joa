/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IRoom.
 * IRoom Interface 
 */
@CoInterface(guid="{A766520D-F700-4BF5-8428-56BD914C1C40}")
public interface IRoom extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IRoomUser[] getParticipants() throws ComException;
  @DeclDISPID(1610743809)  public RoomJoinState getJoinedState() throws ComException;
  @DeclDISPID(1610743810)  public Integer getUnreadRoomMessageCount() throws ComException;
  @DeclDISPID(1610743811)  public Boolean getIsOutgoingMessageFilterEnabled() throws ComException;
  @DeclDISPID(1610743812)  public IRoomPropertyDictionary getProperties() throws ComException;
  @DeclDISPID(1610743813)  public IRoomMessageDictionary CreateRoomMessageDictionary() throws ComException;
  @DeclDISPID(1610743814)  public void EnableOutgoingMessageFilter(Boolean _noWarning) throws ComException;
  @DeclDISPID(1610743815)  public void DisableOutgoingMessageFilter() throws ComException;
  @DeclDISPID(1610743816)  public IAsynchronousOperation SendMessage(IRoomMessageDictionary _messageInfo, Object _roomCallback, Object _state) throws ComException;
  @DeclDISPID(1610743817)  public void SendFilteredMessage(IRoomMessage _message, RoomMessageFilteringAction _action) throws ComException;
  @DeclDISPID(1610743818)  public IAsynchronousOperation RetrieveAdditionalMessages(Integer _lastMessageID, Integer _count, Object _roomCallback, Object _state) throws ComException;
  @DeclDISPID(1610743819)  public IAsynchronousOperation Join(Object _roomCallback, Object _state) throws ComException;
  @DeclDISPID(1610743820)  public IAsynchronousOperation Leave(Object _roomCallback, Object _state) throws ComException;
}
