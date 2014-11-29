/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Utilities2.
 * Utilities2 Class 
 */
@CoClass(guid="{EAD92B6D-A7DB-4AB8-A494-C5A2771FA987}")
public class Utilities2 extends Dispatch implements IUtilities2 {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public String getExchangeECPUrl() throws ComException {
    final Object obj = this._dispatchCall(268435457,"ExchangeECPUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(268435458)  public IScheduledConferenceManager getScheduledConferenceManager() throws ComException {
    final Object obj = this._dispatchCall(268435458,"ScheduledConferenceManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IScheduledConferenceManagerImpl.class);
  }
  @DeclDISPID(268435459)  public String Normalize(String _displayString) throws ComException {
    assert(_displayString != null);
    final Object obj = this._dispatchCall(268435459,"Normalize", DISPATCH_METHOD,null,_displayString);
    if (obj == null) return null;
    return (String)obj;
  }
  public Utilities2() throws ComException {
    super("{EAD92B6D-A7DB-4AB8-A494-C5A2771FA987}", "{9112CE9B-3704-48C0-86DC-7A7B0F34D7A3}");
  }
  protected Utilities2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Utilities2" + super.toString() + "]";
  }
}
