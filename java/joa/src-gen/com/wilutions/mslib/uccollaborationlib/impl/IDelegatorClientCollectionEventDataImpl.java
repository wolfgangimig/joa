/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{B4DC32ED-153C-9094-2A73-2E8CA917EAD0}")
public class IDelegatorClientCollectionEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IDelegatorClientCollectionEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IDelegatorClient getDelegatorClient() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"DelegatorClient", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IDelegatorClientImpl.class);
  }
  public IDelegatorClientCollectionEventDataImpl(String progId) throws ComException {
    super(progId, "{744BAB86-B15F-4BD5-B7DD-476B0CE0162A}");
  }
  protected IDelegatorClientCollectionEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IDelegatorClientCollectionEventDataImpl" + super.toString() + "]";
  }
}
