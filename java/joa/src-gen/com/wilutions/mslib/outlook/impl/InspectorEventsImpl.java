/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A916-A463-DB41-5DAE-69E7A5F7FCBC}")
public class InspectorEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.InspectorEvents {
  @DeclDISPID(61441)  public void onActivate() throws ComException {
    this._dispatchCall(61441,"Activate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61446)  public void onDeactivate() throws ComException {
    this._dispatchCall(61446,"Deactivate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61448)  public void onClose() throws ComException {
    this._dispatchCall(61448,"Close", DISPATCH_METHOD,null);
  }
  public InspectorEventsImpl(String progId) throws ComException {
    super(progId, "{0006307D-0000-0000-C000-000000000046}");
  }
  protected InspectorEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[InspectorEventsImpl" + super.toString() + "]";
  }
}
