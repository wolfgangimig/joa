/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BB9597A3-0B0F-CA8F-02E8-694DA5A0B6B5}")
public class MultiPageEventsImpl extends Dispatch implements com.wilutions.mslib.msforms.MultiPageEvents {
  @DeclDISPID(768)  public void onAddControl(Integer Index, com.wilutions.mslib.msforms.Control Control) throws ComException {
    assert(Index != null);
    this._dispatchCall(768,"AddControl", DISPATCH_METHOD,null,Index,(Control!=null?Control:Dispatch.NULL));
  }
  @DeclDISPID(3)  public void onBeforeDragOver(Integer Index, com.wilutions.mslib.msforms.ReturnBoolean Cancel, com.wilutions.mslib.msforms.Control Control, com.wilutions.mslib.msforms.DataObject Data, Float X, Float Y, com.wilutions.mslib.msforms.fmDragState State, com.wilutions.mslib.msforms.ReturnEffect Effect, Short Shift) throws ComException {
    assert(Index != null);
    assert(X != null);
    assert(Y != null);
    assert(State != null);
    assert(Shift != null);
    this._dispatchCall(3,"BeforeDragOver", DISPATCH_METHOD,null,Index,(Cancel!=null?Cancel:Dispatch.NULL),(Control!=null?Control:Dispatch.NULL),(Data!=null?Data:Dispatch.NULL),X,Y,State.value,(Effect!=null?Effect:Dispatch.NULL),Shift);
  }
  @DeclDISPID(4)  public void onBeforeDropOrPaste(Integer Index, com.wilutions.mslib.msforms.ReturnBoolean Cancel, com.wilutions.mslib.msforms.Control Control, com.wilutions.mslib.msforms.fmAction Action, com.wilutions.mslib.msforms.DataObject Data, Float X, Float Y, com.wilutions.mslib.msforms.ReturnEffect Effect, Short Shift) throws ComException {
    assert(Index != null);
    assert(Action != null);
    assert(X != null);
    assert(Y != null);
    assert(Shift != null);
    this._dispatchCall(4,"BeforeDropOrPaste", DISPATCH_METHOD,null,Index,(Cancel!=null?Cancel:Dispatch.NULL),(Control!=null?Control:Dispatch.NULL),Action.value,(Data!=null?Data:Dispatch.NULL),X,Y,(Effect!=null?Effect:Dispatch.NULL),Shift);
  }
  @DeclDISPID(2)  public void onChange() throws ComException {
    this._dispatchCall(2,"Change", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-600)  public void onClick(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(-600,"Click", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(-601)  public void onDblClick(Integer Index, com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    assert(Index != null);
    this._dispatchCall(-601,"DblClick", DISPATCH_METHOD,null,Index,(Cancel!=null?Cancel:Dispatch.NULL));
  }
  @DeclDISPID(-608)  public void onError(Integer Index, Short Number, com.wilutions.mslib.msforms.ReturnString Description, Integer SCode, String Source, String HelpFile, Integer HelpContext, com.wilutions.mslib.msforms.ReturnBoolean CancelDisplay) throws ComException {
    assert(Index != null);
    assert(Number != null);
    assert(SCode != null);
    assert(Source != null);
    assert(HelpFile != null);
    assert(HelpContext != null);
    this._dispatchCall(-608,"Error", DISPATCH_METHOD,null,Index,Number,(Description!=null?Description:Dispatch.NULL),SCode,Source,HelpFile,HelpContext,(CancelDisplay!=null?CancelDisplay:Dispatch.NULL));
  }
  @DeclDISPID(-602)  public void onKeyDown(com.wilutions.mslib.msforms.ReturnInteger KeyCode, Short Shift) throws ComException {
    assert(Shift != null);
    this._dispatchCall(-602,"KeyDown", DISPATCH_METHOD,null,(KeyCode!=null?KeyCode:Dispatch.NULL),Shift);
  }
  @DeclDISPID(-603)  public void onKeyPress(com.wilutions.mslib.msforms.ReturnInteger KeyAscii) throws ComException {
    this._dispatchCall(-603,"KeyPress", DISPATCH_METHOD,null,(KeyAscii!=null?KeyAscii:Dispatch.NULL));
  }
  @DeclDISPID(-604)  public void onKeyUp(com.wilutions.mslib.msforms.ReturnInteger KeyCode, Short Shift) throws ComException {
    assert(Shift != null);
    this._dispatchCall(-604,"KeyUp", DISPATCH_METHOD,null,(KeyCode!=null?KeyCode:Dispatch.NULL),Shift);
  }
  @DeclDISPID(770)  public void onLayout(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(770,"Layout", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(-605)  public void onMouseDown(Integer Index, Short Button, Short Shift, Float X, Float Y) throws ComException {
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-605,"MouseDown", DISPATCH_METHOD,null,Index,Button,Shift,X,Y);
  }
  @DeclDISPID(-606)  public void onMouseMove(Integer Index, Short Button, Short Shift, Float X, Float Y) throws ComException {
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-606,"MouseMove", DISPATCH_METHOD,null,Index,Button,Shift,X,Y);
  }
  @DeclDISPID(-607)  public void onMouseUp(Integer Index, Short Button, Short Shift, Float X, Float Y) throws ComException {
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-607,"MouseUp", DISPATCH_METHOD,null,Index,Button,Shift,X,Y);
  }
  @DeclDISPID(771)  public void onRemoveControl(Integer Index, com.wilutions.mslib.msforms.Control Control) throws ComException {
    assert(Index != null);
    this._dispatchCall(771,"RemoveControl", DISPATCH_METHOD,null,Index,(Control!=null?Control:Dispatch.NULL));
  }
  @DeclDISPID(772)  public void onScroll(Integer Index, com.wilutions.mslib.msforms.fmScrollAction ActionX, com.wilutions.mslib.msforms.fmScrollAction ActionY, Float RequestDx, Float RequestDy, com.wilutions.mslib.msforms.ReturnSingle ActualDx, com.wilutions.mslib.msforms.ReturnSingle ActualDy) throws ComException {
    assert(Index != null);
    assert(ActionX != null);
    assert(ActionY != null);
    assert(RequestDx != null);
    assert(RequestDy != null);
    this._dispatchCall(772,"Scroll", DISPATCH_METHOD,null,Index,ActionX.value,ActionY.value,RequestDx,RequestDy,(ActualDx!=null?ActualDx:Dispatch.NULL),(ActualDy!=null?ActualDy:Dispatch.NULL));
  }
  @DeclDISPID(773)  public void onZoom(Integer Index, ByRef<Short> Percent) throws ComException {
    assert(Index != null);
    assert(Percent != null);
    this._dispatchCall(773,"Zoom", DISPATCH_METHOD,null,Index,Percent);
  }
  public MultiPageEventsImpl(String progId) throws ComException {
    super(progId, "{7B020EC8-AF6C-11CE-9F46-00AA00574A4F}");
  }
  protected MultiPageEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MultiPageEventsImpl" + super.toString() + "]";
  }
}
