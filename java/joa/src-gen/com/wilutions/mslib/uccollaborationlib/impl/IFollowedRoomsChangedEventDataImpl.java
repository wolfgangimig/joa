/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4F937046-4A45-9025-246F-3F3A357694EA}")
public class IFollowedRoomsChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IFollowedRoomsChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IRoom getRoom() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Room", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IRoomImpl.class);
  }
  public IFollowedRoomsChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{8F04E92D-EE26-4B64-B9C1-56DD90816810}");
  }
  protected IFollowedRoomsChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IFollowedRoomsChangedEventDataImpl" + super.toString() + "]";
  }
}
