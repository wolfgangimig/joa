/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C6D9F919-F1F1-9652-3275-3C1201631DCD}")
public class IParticipantCollectionChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IParticipantCollectionChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IParticipant getParticipant() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Participant", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(1610743809)  public Integer getStatusCode() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"StatusCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IParticipantCollectionChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{064E6072-5592-4D13-AFDB-55F5A494E137}");
  }
  protected IParticipantCollectionChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IParticipantCollectionChangedEventDataImpl" + super.toString() + "]";
  }
}
