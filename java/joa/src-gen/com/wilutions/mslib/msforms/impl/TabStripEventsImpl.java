/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BB9597AC-0B0F-CA8F-02E8-694DA5A0B6B5}")
public class TabStripEventsImpl extends Dispatch implements com.wilutions.mslib.msforms.TabStripEvents {
  @DeclDISPID(3)  public void onBeforeDragOver(final Integer Index, final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.fmDragState DragState, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(Index != null);
    assert(X != null);
    assert(Y != null);
    assert(DragState != null);
    assert(Shift != null);
    this._dispatchCall(3,"BeforeDragOver", DISPATCH_METHOD,null,Index,Dispatch.param(Cancel),Dispatch.param(Data),X,Y,DragState.value,Dispatch.param(Effect),Shift);
  }
  @DeclDISPID(4)  public void onBeforeDropOrPaste(final Integer Index, final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.fmAction Action, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(Index != null);
    assert(Action != null);
    assert(X != null);
    assert(Y != null);
    assert(Shift != null);
    this._dispatchCall(4,"BeforeDropOrPaste", DISPATCH_METHOD,null,Index,Dispatch.param(Cancel),Action.value,Dispatch.param(Data),X,Y,Dispatch.param(Effect),Shift);
  }
  @DeclDISPID(2)  public void onChange() throws ComException {
    this._dispatchCall(2,"Change", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-600)  public void onClick(final Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(-600,"Click", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(-601)  public void onDblClick(final Integer Index, final com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    assert(Index != null);
    this._dispatchCall(-601,"DblClick", DISPATCH_METHOD,null,Index,Dispatch.param(Cancel));
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
  @DeclDISPID(-605)  public void onMouseDown(final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-605,"MouseDown", DISPATCH_METHOD,null,Index,Button,Shift,X,Y);
  }
  @DeclDISPID(-606)  public void onMouseMove(final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-606,"MouseMove", DISPATCH_METHOD,null,Index,Button,Shift,X,Y);
  }
  @DeclDISPID(-607)  public void onMouseUp(final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-607,"MouseUp", DISPATCH_METHOD,null,Index,Button,Shift,X,Y);
  }
  public TabStripEventsImpl(String progId) throws ComException {
    super(progId, "{7B020EC7-AF6C-11CE-9F46-00AA00574A4F}");
  }
  protected TabStripEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TabStripEventsImpl" + super.toString() + "]";
  }
}
