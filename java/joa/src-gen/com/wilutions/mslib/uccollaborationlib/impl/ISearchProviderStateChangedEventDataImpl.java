/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{59C80047-398C-9CF8-22BF-E86699FBF2D2}")
public class ISearchProviderStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISearchProviderStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.SearchProviders getProvider() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Provider", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.SearchProviders.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.SearchProviderStatusType getNewStatus() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"NewStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.SearchProviderStatusType.valueOf((Integer)obj);
  }
  public ISearchProviderStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{995F992C-9DEF-47B9-BF11-81813C0C0E28}");
  }
  protected ISearchProviderStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISearchProviderStateChangedEventDataImpl" + super.toString() + "]";
  }
}
