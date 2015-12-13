/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C8800AB1-D642-9E82-1754-53C9CBB1BA8A}")
public class IRoomMessagesEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomMessagesEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IRoomMessageCollection getMessages() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Messages", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IRoomMessageCollectionImpl.class);
  }
  public IRoomMessagesEventDataImpl(String progId) throws ComException {
    super(progId, "{081793DA-7221-45C3-8AFA-3A2E6E464670}");
  }
  protected IRoomMessagesEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomMessagesEventDataImpl" + super.toString() + "]";
  }
}
