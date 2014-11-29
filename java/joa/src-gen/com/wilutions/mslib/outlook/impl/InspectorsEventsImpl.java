/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A912-A463-DB41-5DAE-69E7A5F7FCBC}")
public class InspectorsEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.InspectorsEvents {
  @DeclDISPID(61441)  public void onNewInspector(final com.wilutions.mslib.outlook._Inspector Inspector) throws ComException {
    this._dispatchCall(61441,"NewInspector", DISPATCH_METHOD,null,(Inspector!=null?Inspector:Dispatch.NULL));
  }
  public InspectorsEventsImpl(String progId) throws ComException {
    super(progId, "{00063079-0000-0000-C000-000000000046}");
  }
  protected InspectorsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[InspectorsEventsImpl" + super.toString() + "]";
  }
}
