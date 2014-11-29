/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BB9597A9-0B0F-CA8F-02E8-694DA5A0B6B5}")
public class ScrollbarEventsImpl extends Dispatch implements com.wilutions.mslib.msforms.ScrollbarEvents {
  @DeclDISPID(3)  public void onBeforeDragOver(com.wilutions.mslib.msforms.ReturnBoolean Cancel, com.wilutions.mslib.msforms.DataObject Data, Float X, Float Y, com.wilutions.mslib.msforms.fmDragState DragState, com.wilutions.mslib.msforms.ReturnEffect Effect, Short Shift) throws ComException {
    assert(X != null);
    assert(Y != null);
    assert(DragState != null);
    assert(Shift != null);
    this._dispatchCall(3,"BeforeDragOver", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL),(Data!=null?Data:Dispatch.NULL),X,Y,DragState.value,(Effect!=null?Effect:Dispatch.NULL),Shift);
  }
  @DeclDISPID(4)  public void onBeforeDropOrPaste(com.wilutions.mslib.msforms.ReturnBoolean Cancel, com.wilutions.mslib.msforms.fmAction Action, com.wilutions.mslib.msforms.DataObject Data, Float X, Float Y, com.wilutions.mslib.msforms.ReturnEffect Effect, Short Shift) throws ComException {
    assert(Action != null);
    assert(X != null);
    assert(Y != null);
    assert(Shift != null);
    this._dispatchCall(4,"BeforeDropOrPaste", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL),Action.value,(Data!=null?Data:Dispatch.NULL),X,Y,(Effect!=null?Effect:Dispatch.NULL),Shift);
  }
  @DeclDISPID(2)  public void onChange() throws ComException {
    this._dispatchCall(2,"Change", DISPATCH_METHOD,null);
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
