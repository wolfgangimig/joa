/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1DA6AE05-414A-98B3-2E1A-8A9E4E2572D0}")
public class IAccessEntryCollectionChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IAccessEntryCollectionChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IAccessEntry getAccessEntry() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"AccessEntry", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAccessEntryImpl.class);
  }
  public IAccessEntryCollectionChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{DD31376E-E529-43F2-B3B4-E379EBD28E2A}");
  }
  protected IAccessEntryCollectionChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IAccessEntryCollectionChangedEventDataImpl" + super.toString() + "]";
  }
}
