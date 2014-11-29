/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{518557F0-9367-9381-1B72-139CAAC32B59}")
public class IUtilities2Impl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IUtilities2 {
  @DeclDISPID(268435457)  public String getExchangeECPUrl() throws ComException {
    final Object obj = this._dispatchCall(268435457,"ExchangeECPUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(268435458)  public com.wilutions.mslib.uccollaborationlib.IScheduledConferenceManager getScheduledConferenceManager() throws ComException {
    final Object obj = this._dispatchCall(268435458,"ScheduledConferenceManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IScheduledConferenceManagerImpl.class);
  }
  @DeclDISPID(268435459)  public String Normalize(final String _displayString) throws ComException {
    assert(_displayString != null);
    final Object obj = this._dispatchCall(268435459,"Normalize", DISPATCH_METHOD,null,_displayString);
    if (obj == null) return null;
    return (String)obj;
  }
  public IUtilities2Impl(String progId) throws ComException {
    super(progId, "{9112CE9B-3704-48C0-86DC-7A7B0F34D7A3}");
  }
  protected IUtilities2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IUtilities2Impl" + super.toString() + "]";
  }
}
