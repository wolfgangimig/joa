/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{7C08C62B-7776-9B80-2C68-A747C199E418}")
public class IRoomUserChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomUserChangedEventData {
  @DeclDISPID(1610743808)  public Boolean getCanSendMessage() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"CanSendMessage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IRoomUserChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{BC9F5F40-D315-40C1-B1C6-CEA0646E18E2}");
  }
  protected IRoomUserChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomUserChangedEventDataImpl" + super.toString() + "]";
  }
}
