/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{67F1CB66-5363-90B4-1986-3F5A34BBE0BA}")
public class IRoomImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoom {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IRoomUser[] getParticipants() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Participants", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IRoomUser[])obj;
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.RoomJoinState getJoinedState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"JoinedState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.RoomJoinState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public Integer getUnreadRoomMessageCount() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"UnreadRoomMessageCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743811)  public Boolean getIsOutgoingMessageFilterEnabled() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IsOutgoingMessageFilterEnabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IRoomPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IRoomPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IRoomMessageDictionary CreateRoomMessageDictionary() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"CreateRoomMessageDictionary", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IRoomMessageDictionaryImpl.class);
  }
  @DeclDISPID(1610743814)  public void EnableOutgoingMessageFilter(Boolean _noWarning) throws ComException {
    assert(_noWarning != null);
    this._dispatchCall(1610743814,"EnableOutgoingMessageFilter", DISPATCH_METHOD,null,_noWarning);
  }
  @DeclDISPID(1610743815)  public void DisableOutgoingMessageFilter() throws ComException {
    this._dispatchCall(1610743815,"DisableOutgoingMessageFilter", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SendMessage(com.wilutions.mslib.uccollaborationlib.IRoomMessageDictionary _messageInfo, Object _roomCallback, Object _state) throws ComException {
    assert(_roomCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"SendMessage", DISPATCH_METHOD,null,(_messageInfo!=null?_messageInfo:Dispatch.NULL),_roomCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743817)  public void SendFilteredMessage(com.wilutions.mslib.uccollaborationlib.IRoomMessage _message, com.wilutions.mslib.uccollaborationlib.RoomMessageFilteringAction _action) throws ComException {
    assert(_action != null);
    this._dispatchCall(1610743817,"SendFilteredMessage", DISPATCH_METHOD,null,(_message!=null?_message:Dispatch.NULL),_action.value);
  }
  @DeclDISPID(1610743818)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation RetrieveAdditionalMessages(Integer _lastMessageID, Integer _count, Object _roomCallback, Object _state) throws ComException {
    assert(_lastMessageID != null);
    assert(_count != null);
    assert(_roomCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743818,"RetrieveAdditionalMessages", DISPATCH_METHOD,null,_lastMessageID,_count,_roomCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743819)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Join(Object _roomCallback, Object _state) throws ComException {
    assert(_roomCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743819,"Join", DISPATCH_METHOD,null,_roomCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743820)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Leave(Object _roomCallback, Object _state) throws ComException {
    assert(_roomCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743820,"Leave", DISPATCH_METHOD,null,_roomCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public IRoomImpl(String progId) throws ComException {
    super(progId, "{A766520D-F700-4BF5-8428-56BD914C1C40}");
  }
  protected IRoomImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomImpl" + super.toString() + "]";
  }
}
