/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{605470D1-6241-9EE3-0243-45818AC8B460}")
public class IRoomMessageImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomMessage {
  @DeclDISPID(1610743808)  public Integer getId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IRoomMessageDictionary getMessageDictionary() throws ComException {
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
  public IRoomMessageImpl(String progId) throws ComException {
    super(progId, "{A0C3E9BA-C622-45A2-9FED-2C662F3F489A}");
  }
  protected IRoomMessageImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomMessageImpl" + super.toString() + "]";
  }
}
