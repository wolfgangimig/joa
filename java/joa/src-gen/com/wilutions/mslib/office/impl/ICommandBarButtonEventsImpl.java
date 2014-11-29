/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{956F11FB-D36B-CA90-3145-6987AD61E15F}")
public class ICommandBarButtonEventsImpl extends Dispatch implements com.wilutions.mslib.office.ICommandBarButtonEvents {
  @DeclDISPID(1)  public void onClick(com.wilutions.mslib.office.CommandBarButton Ctrl, ByRef<Boolean> CancelDefault) throws ComException {
    assert(CancelDefault != null);
    this._dispatchCall(1,"Click", DISPATCH_METHOD,null,(Ctrl!=null?Ctrl:Dispatch.NULL),CancelDefault);
  }
  public ICommandBarButtonEventsImpl(String progId) throws ComException {
    super(progId, "{55F88890-7708-11D1-ACEB-006008961DA5}");
  }
  protected ICommandBarButtonEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ICommandBarButtonEventsImpl" + super.toString() + "]";
  }
}
