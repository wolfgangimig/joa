/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{D5F16357-5947-9A9A-3F16-0BD55D607F24}")
public class IRoomMessageEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomMessageEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IRoomMessage getMessage() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Message", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IRoomMessageImpl.class);
  }
  public IRoomMessageEventDataImpl(String progId) throws ComException {
    super(progId, "{1566FA3C-FD24-41DB-A2B8-6232F89783DE}");
  }
  protected IRoomMessageEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomMessageEventDataImpl" + super.toString() + "]";
  }
}
