/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.msforms.ImageEvents;

@SuppressWarnings("all")
public class Fire_ImageEvents {
  public final static void onBeforeDragOver(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.fmDragState DragState, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    assert(Data != null);
    assert(X != null);
    assert(Y != null);
    assert(DragState != null);
    assert(Effect != null);
    assert(Shift != null);
    __joa__disp._fireEvent(ImageEvents.class, (l)->l.onBeforeDragOver(Cancel,Data,X,Y,DragState,Effect,Shift));
  }
  public final static void onBeforeDropOrPaste(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.fmAction Action, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    assert(Action != null);
    assert(Data != null);
    assert(X != null);
    assert(Y != null);
    assert(Effect != null);
    assert(Shift != null);
    __joa__disp._fireEvent(ImageEvents.class, (l)->l.onBeforeDropOrPaste(Cancel,Action,Data,X,Y,Effect,Shift));
  }
  public final static void onClick(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ImageEvents.class, (l)->l.onClick());
  }
  public final static void onDblClick(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ImageEvents.class, (l)->l.onDblClick(Cancel));
  }
  public final static void onError(final IDispatch __joa__disp, final Short Number, final com.wilutions.mslib.msforms.ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final com.wilutions.mslib.msforms.ReturnBoolean CancelDisplay) throws ComException {
    assert(__joa__disp != null);
    assert(Number != null);
    assert(Description != null);
    assert(SCode != null);
    assert(Source != null);
    assert(HelpFile != null);
    assert(HelpContext != null);
    assert(CancelDisplay != null);
    __joa__disp._fireEvent(ImageEvents.class, (l)->l.onError(Number,Description,SCode,Source,HelpFile,HelpContext,CancelDisplay));
  }
  public final static void onMouseDown(final IDispatch __joa__disp, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(__joa__disp != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(ImageEvents.class, (l)->l.onMouseDown(Button,Shift,X,Y));
  }
  public final static void onMouseMove(final IDispatch __joa__disp, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(__joa__disp != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(ImageEvents.class, (l)->l.onMouseMove(Button,Shift,X,Y));
  }
  public final static void onMouseUp(final IDispatch __joa__disp, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(__joa__disp != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(ImageEvents.class, (l)->l.onMouseUp(Button,Shift,X,Y));
  }
}
