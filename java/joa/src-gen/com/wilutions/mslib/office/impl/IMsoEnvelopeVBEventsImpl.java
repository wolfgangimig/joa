/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091EBC6-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoEnvelopeVBEventsImpl extends Dispatch implements com.wilutions.mslib.office.IMsoEnvelopeVBEvents {
  @DeclDISPID(1)  public void onEnvelopeShow() throws ComException {
    this._dispatchCall(1,"EnvelopeShow", DISPATCH_METHOD,null);
  }
  @DeclDISPID(2)  public void onEnvelopeHide() throws ComException {
    this._dispatchCall(2,"EnvelopeHide", DISPATCH_METHOD,null);
  }
  public IMsoEnvelopeVBEventsImpl(String progId) throws ComException {
    super(progId, "{000672AD-0000-0000-C000-000000000046}");
  }
  protected IMsoEnvelopeVBEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoEnvelopeVBEventsImpl" + super.toString() + "]";
  }
}
