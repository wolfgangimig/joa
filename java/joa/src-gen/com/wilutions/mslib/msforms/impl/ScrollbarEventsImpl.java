/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BB9597A9-0B0F-CA8F-02E8-694DA5A0B6B5}")
public class ScrollbarEventsImpl extends Dispatch implements com.wilutions.mslib.msforms.ScrollbarEvents {
  @DeclDISPID(3)  public void onBeforeDragOver(final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.fmDragState DragState, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(X != null);
    assert(Y != null);
    assert(DragState != null);
    assert(Shift != null);
    this._dispatchCall(3,"BeforeDragOver", DISPATCH_METHOD,null,Dispatch.param(Cancel),Dispatch.param(Data),X,Y,DragState.value,Dispatch.param(Effect),Shift);
  }
  @DeclDISPID(4)  public void onBeforeDropOrPaste(final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.fmAction Action, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(Action != null);
    assert(X != null);
    assert(Y != null);
    assert(Shift != null);
    this._dispatchCall(4,"BeforeDropOrPaste", DISPATCH_METHOD,null,Dispatch.param(Cancel),Action.value,Dispatch.param(Data),X,Y,Dispatch.param(Effect),Shift);
  }
  @DeclDISPID(2)  public void onChange() throws ComException {
    this._dispatchCall(2,"Change", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-608)  public void onError(final Short Number, final com.wilutions.mslib.msforms.ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final com.wilutions.mslib.msforms.ReturnBoolean CancelDisplay) throws ComException {
    assert(Number != null);
    assert(SCode != null);
    assert(Source != null);
    assert(HelpFile != null);
    assert(HelpContext != null);
    this._dispatchCall(-608,"Error", DISPATCH_METHOD,null,Number,Dispatch.param(Description),SCode,Source,HelpFile,HelpContext,Dispatch.param(CancelDisplay));
  }
  @DeclDISPID(-602)  public void onKeyDown(final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(Shift != null);
    this._dispatchCall(-602,"KeyDown", DISPATCH_METHOD,null,Dispatch.param(KeyCode),Shift);
  }
  @DeclDISPID(-603)  public void onKeyPress(final com.wilutions.mslib.msforms.ReturnInteger KeyAscii) throws ComException {
    this._dispatchCall(-603,"KeyPress", DISPATCH_METHOD,null,Dispatch.param(KeyAscii));
  }
  @DeclDISPID(-604)  public void onKeyUp(final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(Shift != null);
    this._dispatchCall(-604,"KeyUp", DISPATCH_METHOD,null,Dispatch.param(KeyCode),Shift);
  }
  @DeclDISPID(7)  public void onScroll() throws ComException {
    this._dispatchCall(7,"Scroll", DISPATCH_METHOD,null);
  }
  public ScrollbarEventsImpl(String progId) throws ComException {
    super(progId, "{7B020EC2-AF6C-11CE-9F46-00AA00574A4F}");
  }
  protected ScrollbarEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ScrollbarEventsImpl" + super.toString() + "]";
  }
}
