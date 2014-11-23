/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8D85994B-6A07-9884-022A-139C8697C475}")
public class IRoomJoinStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomJoinStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.RoomJoinState getJoinState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"JoinState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.RoomJoinState.valueOf((Integer)obj);
  }
  public IRoomJoinStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{4D120020-CE64-43C5-9F84-7A7B2360388F}");
  }
  protected IRoomJoinStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomJoinStateChangedEventDataImpl" + super.toString() + "]";
  }
}
