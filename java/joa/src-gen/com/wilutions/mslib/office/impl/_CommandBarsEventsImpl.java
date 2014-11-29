/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A39-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CommandBarsEventsImpl extends Dispatch implements com.wilutions.mslib.office._CommandBarsEvents {
  @DeclDISPID(1)  public void onOnUpdate() throws ComException {
    this._dispatchCall(1,"OnUpdate", DISPATCH_METHOD,null);
  }
  public _CommandBarsEventsImpl(String progId) throws ComException {
    super(progId, "{000C0352-0000-0000-C000-000000000046}");
  }
  protected _CommandBarsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CommandBarsEventsImpl" + super.toString() + "]";
  }
}
