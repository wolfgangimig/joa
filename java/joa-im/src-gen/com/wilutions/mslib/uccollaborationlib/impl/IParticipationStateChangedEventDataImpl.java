/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4F7E3B56-D6DF-95E2-3801-8A98D01D2458}")
public class IParticipationStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IParticipationStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ParticipationState getOldState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"OldState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ParticipationState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ParticipationState getNewState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"NewState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ParticipationState.valueOf((Integer)obj);
  }
  public IParticipationStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{8FE9A23D-72BC-4EA3-A5AF-E37F75EAD8A2}");
  }
  protected IParticipationStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IParticipationStateChangedEventDataImpl" + super.toString() + "]";
  }
}
