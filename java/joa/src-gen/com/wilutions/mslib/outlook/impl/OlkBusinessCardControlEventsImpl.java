/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091EB85-A463-DB41-5DAE-69E7A5F7FCBC}")
public class OlkBusinessCardControlEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.OlkBusinessCardControlEvents {
  @DeclDISPID(-600)  public void onClick() throws ComException {
    this._dispatchCall(-600,"Click", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-601)  public void onDoubleClick() throws ComException {
    this._dispatchCall(-601,"DoubleClick", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-605)  public void onMouseDown(final com.wilutions.mslib.outlook.OlMouseButton Button, final com.wilutions.mslib.outlook.OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-605,"MouseDown", DISPATCH_METHOD,null,Button.value,Shift.value,X.getValue(),Y.getValue());
  }
  @DeclDISPID(-606)  public void onMouseMove(final com.wilutions.mslib.outlook.OlMouseButton Button, final com.wilutions.mslib.outlook.OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-606,"MouseMove", DISPATCH_METHOD,null,Button.value,Shift.value,X.getValue(),Y.getValue());
  }
  @DeclDISPID(-607)  public void onMouseUp(final com.wilutions.mslib.outlook.OlMouseButton Button, final com.wilutions.mslib.outlook.OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-607,"MouseUp", DISPATCH_METHOD,null,Button.value,Shift.value,X.getValue(),Y.getValue());
  }
  public OlkBusinessCardControlEventsImpl(String progId) throws ComException {
    super(progId, "{000672EE-0000-0000-C000-000000000046}");
  }
  protected OlkBusinessCardControlEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OlkBusinessCardControlEventsImpl" + super.toString() + "]";
  }
}
