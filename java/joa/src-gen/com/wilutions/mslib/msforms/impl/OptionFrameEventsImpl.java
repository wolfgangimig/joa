/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{0FA80DCB-5125-CA8F-0660-694DA59772FB}")
public class OptionFrameEventsImpl extends Dispatch implements com.wilutions.mslib.msforms.OptionFrameEvents {
  @DeclDISPID(768)  public void onAddControl(com.wilutions.mslib.msforms.Control Control) throws ComException {
    this._dispatchCall(768,"AddControl", DISPATCH_METHOD,null,(Control!=null?Control:Dispatch.NULL));
  }
  @DeclDISPID(3)  public void onBeforeDragOver(com.wilutions.mslib.msforms.ReturnBoolean Cancel, com.wilutions.mslib.msforms.Control Control, com.wilutions.mslib.msforms.DataObject Data, Float X, Float Y, com.wilutions.mslib.msforms.fmDragState State, com.wilutions.mslib.msforms.ReturnEffect Effect, Short Shift) throws ComException {
    assert(X != null);
    assert(Y != null);
    assert(State != null);
    assert(Shift != null);
    this._dispatchCall(3,"BeforeDragOver", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL),(Control!=null?Control:Dispatch.NULL),(Data!=null?Data:Dispatch.NULL),X,Y,State.value,(Effect!=null?Effect:Dispatch.NULL),Shift);
  }
  @DeclDISPID(4)  public void onBeforeDropOrPaste(com.wilutions.mslib.msforms.ReturnBoolean Cancel, com.wilutions.mslib.msforms.Control Control, com.wilutions.mslib.msforms.fmAction Action, com.wilutions.mslib.msforms.DataObject Data, Float X, Float Y, com.wilutions.mslib.msforms.ReturnEffect Effect, Short Shift) throws ComException {
    assert(Action != null);
    assert(X != null);
    assert(Y != null);
    assert(Shift != null);
    this._dispatchCall(4,"BeforeDropOrPaste", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL),(Control!=null?Control:Dispatch.NULL),Action.value,(Data!=null?Data:Dispatch.NULL),X,Y,(Effect!=null?Effect:Dispatch.NULL),Shift);
  }
  @DeclDISPID(-600)  public void onClick() throws ComException {
    this._dispatchCall(-600,"Click", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-601)  public void onDblClick(com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    this._dispatchCall(-601,"DblClick", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL));
  }
  @DeclDISPID(-608)  public void onError(Short Number, com.wilutions.mslib.msforms.ReturnString Description, Integer SCode, String Source, String HelpFile, Integer HelpContext, com.wilutions.mslib.msforms.ReturnBoolean CancelDisplay) throws ComException {
    assert(Number != null);
    assert(SCode != null);
    assert(Source != null);
    assert(HelpFile != null);
    assert(HelpContext != null);
    this._dispatchCall(-608,"Error", DISPATCH_METHOD,null,Number,(Description!=null?Description:Dispatch.NULL),SCode,Source,HelpFile,HelpContext,(CancelDisplay!=null?CancelDisplay:Dispatch.NULL));
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
  @DeclDISPID(770)  public void onLayout() throws ComException {
    this._dispatchCall(770,"Layout", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-605)  public void onMouseDown(Short Button, Short Shift, Float X, Float Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-605,"MouseDown", DISPATCH_METHOD,null,Button,Shift,X,Y);
  }
  @DeclDISPID(-606)  public void onMouseMove(Short Button, Short Shift, Float X, Float Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-606,"MouseMove", DISPATCH_METHOD,null,Button,Shift,X,Y);
  }
  @DeclDISPID(-607)  public void onMouseUp(Short Button, Short Shift, Float X, Float Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-607,"MouseUp", DISPATCH_METHOD,null,Button,Shift,X,Y);
  }
  @DeclDISPID(771)  public void onRemoveControl(com.wilutions.mslib.msforms.Control Control) throws ComException {
    this._dispatchCall(771,"RemoveControl", DISPATCH_METHOD,null,(Control!=null?Control:Dispatch.NULL));
  }
  @DeclDISPID(772)  public void onScroll(com.wilutions.mslib.msforms.fmScrollAction ActionX, com.wilutions.mslib.msforms.fmScrollAction ActionY, Float RequestDx, Float RequestDy, com.wilutions.mslib.msforms.ReturnSingle ActualDx, com.wilutions.mslib.msforms.ReturnSingle ActualDy) throws ComException {
    assert(ActionX != null);
    assert(ActionY != null);
    assert(RequestDx != null);
    assert(RequestDy != null);
    this._dispatchCall(772,"Scroll", DISPATCH_METHOD,null,ActionX.value,ActionY.value,RequestDx,RequestDy,(ActualDx!=null?ActualDx:Dispatch.NULL),(ActualDy!=null?ActualDy:Dispatch.NULL));
  }
  @DeclDISPID(773)  public void onZoom(ByRef<Short> Percent) throws ComException {
    assert(Percent != null);
    this._dispatchCall(773,"Zoom", DISPATCH_METHOD,null,Percent);
  }
  public OptionFrameEventsImpl(String progId) throws ComException {
    super(progId, "{CF3F94A0-F546-11CE-9BCE-00AA00608E01}");
  }
  protected OptionFrameEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OptionFrameEventsImpl" + super.toString() + "]";
  }
}
