/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4C0CF038-97AF-9145-000A-9EFD426A5C3A}")
public class _IUCOfficeIntegrationEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IUCOfficeIntegrationEvents {
  @DeclDISPID(50)  public void onOnShuttingDown() throws ComException {
    this._dispatchCall(50,"OnShuttingDown", DISPATCH_METHOD,null);
  }
  public _IUCOfficeIntegrationEventsImpl(String progId) throws ComException {
    super(progId, "{8C9B6953-33CC-4A04-9DA4-F71AE79DA0C0}");
  }
  protected _IUCOfficeIntegrationEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IUCOfficeIntegrationEventsImpl" + super.toString() + "]";
  }
}
