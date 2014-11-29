/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A3A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CommandBarButtonEventsImpl extends Dispatch implements com.wilutions.mslib.office._CommandBarButtonEvents {
  @DeclDISPID(1)  public void onClick(com.wilutions.mslib.office.CommandBarButton Ctrl, ByRef<Boolean> CancelDefault) throws ComException {
    assert(CancelDefault != null);
    this._dispatchCall(1,"Click", DISPATCH_METHOD,null,(Ctrl!=null?Ctrl:Dispatch.NULL),CancelDefault);
  }
  public _CommandBarButtonEventsImpl(String progId) throws ComException {
    super(progId, "{000C0351-0000-0000-C000-000000000046}");
  }
  protected _CommandBarButtonEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CommandBarButtonEventsImpl" + super.toString() + "]";
  }
}
