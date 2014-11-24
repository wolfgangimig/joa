/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F2D49E2A-9768-939E-0B58-6519A5BFB1BA}")
public class IControlRequestReceivedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IControlRequestReceivedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IParticipant getRequester() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Requester", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  public IControlRequestReceivedEventDataImpl(String progId) throws ComException {
    super(progId, "{32430741-330B-48DF-96F6-0CFE00484D40}");
  }
  protected IControlRequestReceivedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IControlRequestReceivedEventDataImpl" + super.toString() + "]";
  }
}
