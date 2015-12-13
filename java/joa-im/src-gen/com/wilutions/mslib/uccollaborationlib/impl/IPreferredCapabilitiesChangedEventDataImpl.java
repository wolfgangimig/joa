/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{7218B96C-9D45-928E-0CAF-252C3083F861}")
public class IPreferredCapabilitiesChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPreferredCapabilitiesChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.LyncClientCapabilityTypes getPreferredCapabilities() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"PreferredCapabilities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.LyncClientCapabilityTypes.valueOf((Integer)obj);
  }
  public IPreferredCapabilitiesChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{B28F2007-3926-49CF-9101-4CCB9574049B}");
  }
  protected IPreferredCapabilitiesChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPreferredCapabilitiesChangedEventDataImpl" + super.toString() + "]";
  }
}
