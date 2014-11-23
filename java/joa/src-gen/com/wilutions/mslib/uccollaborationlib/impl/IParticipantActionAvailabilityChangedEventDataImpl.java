/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{D1B33332-1290-95F0-2A34-8E129ECF7777}")
public class IParticipantActionAvailabilityChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IParticipantActionAvailabilityChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ParticipantAction getAction() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Action", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ParticipantAction.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsAvailable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IParticipantActionAvailabilityChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{1124AA59-B6F3-4EB1-B79A-E7F53B388B8D}");
  }
  protected IParticipantActionAvailabilityChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IParticipantActionAvailabilityChangedEventDataImpl" + super.toString() + "]";
  }
}
