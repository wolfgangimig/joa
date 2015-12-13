/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomMessage.
 * RoomMessage class defines a room message in room. 
 */
@CoClass(guid="{44E7AD71-D7D5-45B7-9FAA-6C346C6DA105}")
public class RoomMessage extends Dispatch implements IRoomMessage {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public IRoomMessageDictionary getMessageDictionary() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"MessageDictionary", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IRoomMessageDictionaryImpl.class);
  }
  @DeclDISPID(1610743810)  public java.util.Date getSentTime() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"SentTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(1610743811)  public String getSenderUri() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"SenderUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743812)  public String getRoomUri() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"RoomUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public RoomMessage() throws ComException {
    super("{44E7AD71-D7D5-45B7-9FAA-6C346C6DA105}", "{A0C3E9BA-C622-45A2-9FED-2C662F3F489A}");
  }
  protected RoomMessage(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RoomMessage" + super.toString() + "]";
  }
}
