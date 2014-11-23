/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{B4C52464-C1A8-911F-3199-8B590403C123}")
public class IRoomParticipantsEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomParticipantsEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IRoomUser[] getParticipants() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Participants", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IRoomUser[])obj;
  }
  public IRoomParticipantsEventDataImpl(String progId) throws ComException {
    super(progId, "{7452BD0F-65CB-4A5E-AC37-E2BEA1F43DD9}");
  }
  protected IRoomParticipantsEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomParticipantsEventDataImpl" + super.toString() + "]";
  }
}
