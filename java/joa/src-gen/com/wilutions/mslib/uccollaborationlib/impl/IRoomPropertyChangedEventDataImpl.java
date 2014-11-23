/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{70A18DC5-290B-98C7-03B2-FA7B0E38EEC8}")
public class IRoomPropertyChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomPropertyChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.RoomProperty getProperty() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Property", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.RoomProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IRoomPropertyChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{B03614AE-8D68-4386-9E1C-939CABCF1232}");
  }
  protected IRoomPropertyChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomPropertyChangedEventDataImpl" + super.toString() + "]";
  }
}
