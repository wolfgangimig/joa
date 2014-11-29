/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4B458479-4821-CA8F-03A3-694DA597FE09}")
public class MdcTextEventsImpl extends Dispatch implements com.wilutions.mslib.msforms.MdcTextEvents {
  @DeclDISPID(3)  public void onBeforeDragOver(final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.fmDragState DragState, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(X != null);
    assert(Y != null);
    assert(DragState != null);
    assert(Shift != null);
    this._dispatchCall(3,"BeforeDragOver", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL),(Data!=null?Data:Dispatch.NULL),X,Y,DragState.value,(Effect!=null?Effect:Dispatch.NULL),Shift);
  }
  @DeclDISPID(4)  public void onBeforeDropOrPaste(final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.fmAction Action, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(Action != null);
    assert(X != null);
    assert(Y != null);
    assert(Shift != null);
    this._dispatchCall(4,"BeforeDropOrPaste", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL),Action.value,(Data!=null?Data:Dispatch.NULL),X,Y,(Effect!=null?Effect:Dispatch.NULL),Shift);
  }
  @DeclDISPID(2)  public void onChange() throws ComException {
    this._dispatchCall(2,"Change", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-601)  public void onDblClick(final com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    this._dispatchCall(-601,"DblClick", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL));
  }
  @DeclDISPID(2002)  public void onDropButtonClick() throws ComException {
    this._dispatchCall(2002,"DropButtonClick", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-608)  public void onError(final Short Number, final com.wilutions.mslib.msforms.ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final com.wilutions.mslib.msforms.ReturnBoolean CancelDisplay) throws ComException {
    assert(Number != null);
    assert(SCode != null);
    assert(Source != null);
    assert(HelpFile != null);
    assert(HelpContext != null);
    this._dispatchCall(-608,"Error", DISPATCH_METHOD,null,Number,(Description!=null?Description:Dispatch.NULL),SCode,Source,HelpFile,HelpContext,(CancelDisplay!=null?CancelDisplay:Dispatch.NULL));
  }
  @DeclDISPID(-602)  public void onKeyDown(final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(Shift != null);
    this._dispatchCall(-602,"KeyDown", DISPATCH_METHOD,null,(KeyCode!=null?KeyCode:Dispatch.NULL),Shift);
  }
  @DeclDISPID(-603)  public void onKeyPress(final com.wilutions.mslib.msforms.ReturnInteger KeyAscii) throws ComException {
    this._dispatchCall(-603,"KeyPress", DISPATCH_METHOD,null,(KeyAscii!=null?KeyAscii:Dispatch.NULL));
  }
  @DeclDISPID(-604)  public void onKeyUp(final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(Shift != null);
    this._dispatchCall(-604,"KeyUp", DISPATCH_METHOD,null,(KeyCode!=null?KeyCode:Dispatch.NULL),Shift);
  }
  @DeclDISPID(-605)  public void onMouseDown(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-605,"MouseDown", DISPATCH_METHOD,null,Button,Shift,X,Y);
  }
  @DeclDISPID(-606)  public void onMouseMove(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-606,"MouseMove", DISPATCH_METHOD,null,Button,Shift,X,Y);
  }
  @DeclDISPID(-607)  public void onMouseUp(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-607,"MouseUp", DISPATCH_METHOD,null,Button,Shift,X,Y);
  }
  public MdcTextEventsImpl(String progId) throws ComException {
    super(progId, "{8BD21D12-EC42-11CE-9E0D-00AA006002F3}");
  }
  protected MdcTextEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MdcTextEventsImpl" + super.toString() + "]";
  }
}
