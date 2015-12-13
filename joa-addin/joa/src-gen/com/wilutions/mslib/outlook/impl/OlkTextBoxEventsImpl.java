/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091EB8D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class OlkTextBoxEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.OlkTextBoxEvents {
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
  @DeclDISPID(-2147384830)  public void onEnter() throws ComException {
    this._dispatchCall(-2147384830,"Enter", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-2147384829)  public void onExit(final Boolean Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(-2147384829,"Exit", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(-602)  public void onKeyDown(final Integer KeyCode, final com.wilutions.mslib.outlook.OlShiftState Shift) throws ComException {
    assert(KeyCode != null);
    assert(Shift != null);
    this._dispatchCall(-602,"KeyDown", DISPATCH_METHOD,null,KeyCode,Shift.value);
  }
  @DeclDISPID(-603)  public void onKeyPress(final Integer KeyAscii) throws ComException {
    assert(KeyAscii != null);
    this._dispatchCall(-603,"KeyPress", DISPATCH_METHOD,null,KeyAscii);
  }
  @DeclDISPID(-604)  public void onKeyUp(final Integer KeyCode, final com.wilutions.mslib.outlook.OlShiftState Shift) throws ComException {
    assert(KeyCode != null);
    assert(Shift != null);
    this._dispatchCall(-604,"KeyUp", DISPATCH_METHOD,null,KeyCode,Shift.value);
  }
  @DeclDISPID(2)  public void onChange() throws ComException {
    this._dispatchCall(2,"Change", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-2147384832)  public void onAfterUpdate() throws ComException {
    this._dispatchCall(-2147384832,"AfterUpdate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-2147384831)  public void onBeforeUpdate(final Boolean Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(-2147384831,"BeforeUpdate", DISPATCH_METHOD,null,Cancel);
  }
  public OlkTextBoxEventsImpl(String progId) throws ComException {
    super(progId, "{000672E6-0000-0000-C000-000000000046}");
  }
  protected OlkTextBoxEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OlkTextBoxEventsImpl" + super.toString() + "]";
  }
}
