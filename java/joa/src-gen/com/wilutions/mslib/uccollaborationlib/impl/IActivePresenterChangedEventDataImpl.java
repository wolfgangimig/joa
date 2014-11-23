/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{882490F6-207E-97EB-0FAC-3E60FC99D728}")
public class IActivePresenterChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IActivePresenterChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IParticipant getActivePresenter() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ActivePresenter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  public IActivePresenterChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{48B3099D-841D-4CAA-9202-5787596E2BD2}");
  }
  protected IActivePresenterChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IActivePresenterChangedEventDataImpl" + super.toString() + "]";
  }
}
