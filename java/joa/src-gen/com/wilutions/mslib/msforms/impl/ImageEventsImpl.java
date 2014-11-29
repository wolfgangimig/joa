/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8CCE0BCE-CD45-CB5A-043C-69E7AE923A03}")
public class ImageEventsImpl extends Dispatch implements com.wilutions.mslib.msforms.ImageEvents {
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
  @DeclDISPID(-600)  public void onClick() throws ComException {
    this._dispatchCall(-600,"Click", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-601)  public void onDblClick(final com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    this._dispatchCall(-601,"DblClick", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL));
  }
  @DeclDISPID(-608)  public void onError(final Short Number, final com.wilutions.mslib.msforms.ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final com.wilutions.mslib.msforms.ReturnBoolean CancelDisplay) throws ComException {
    assert(Number != null);
    assert(SCode != null);
    assert(Source != null);
    assert(HelpFile != null);
    assert(HelpContext != null);
    this._dispatchCall(-608,"Error", DISPATCH_METHOD,null,Number,(Description!=null?Description:Dispatch.NULL),SCode,Source,HelpFile,HelpContext,(CancelDisplay!=null?CancelDisplay:Dispatch.NULL));
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
  public ImageEventsImpl(String progId) throws ComException {
    super(progId, "{4C5992A5-6926-101B-9992-00000B65C6F9}");
  }
  protected ImageEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ImageEventsImpl" + super.toString() + "]";
  }
}
