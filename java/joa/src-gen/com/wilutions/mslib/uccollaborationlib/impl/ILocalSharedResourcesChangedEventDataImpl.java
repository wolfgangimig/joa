/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{72B94281-3A02-9C42-1F10-6827F3EE4A2C}")
public class ILocalSharedResourcesChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ILocalSharedResourcesChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ISharingResourceList getResourceList() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ResourceList", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.ISharingResourceListImpl.class);
  }
  public ILocalSharedResourcesChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{B22EDBEA-9E61-4703-82BE-01C05619B6D6}");
  }
  protected ILocalSharedResourcesChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ILocalSharedResourcesChangedEventDataImpl" + super.toString() + "]";
  }
}
