/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.msforms.MultiPageEvents;

@SuppressWarnings("all")
public class Fire_MultiPageEvents {
  public final static void onAddControl(final IDispatch __joa__disp, final Integer Index, final com.wilutions.mslib.msforms.Control Control) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Control != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onAddControl(Index,Control));
  }
  public final static void onBeforeDragOver(final IDispatch __joa__disp, final Integer Index, final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.Control Control, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.fmDragState State, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Cancel != null);
    assert(Control != null);
    assert(Data != null);
    assert(X != null);
    assert(Y != null);
    assert(State != null);
    assert(Effect != null);
    assert(Shift != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onBeforeDragOver(Index,Cancel,Control,Data,X,Y,State,Effect,Shift));
  }
  public final static void onBeforeDropOrPaste(final IDispatch __joa__disp, final Integer Index, final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.Control Control, final com.wilutions.mslib.msforms.fmAction Action, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Cancel != null);
    assert(Control != null);
    assert(Action != null);
    assert(Data != null);
    assert(X != null);
    assert(Y != null);
    assert(Effect != null);
    assert(Shift != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onBeforeDropOrPaste(Index,Cancel,Control,Action,Data,X,Y,Effect,Shift));
  }
  public final static void onChange(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onChange());
  }
  public final static void onClick(final IDispatch __joa__disp, final Integer Index) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onClick(Index));
  }
  public final static void onDblClick(final IDispatch __joa__disp, final Integer Index, final com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onDblClick(Index,Cancel));
  }
  public final static void onError(final IDispatch __joa__disp, final Integer Index, final Short Number, final com.wilutions.mslib.msforms.ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final com.wilutions.mslib.msforms.ReturnBoolean CancelDisplay) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Number != null);
    assert(Description != null);
    assert(SCode != null);
    assert(Source != null);
    assert(HelpFile != null);
    assert(HelpContext != null);
    assert(CancelDisplay != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onError(Index,Number,Description,SCode,Source,HelpFile,HelpContext,CancelDisplay));
  }
  public final static void onKeyDown(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(KeyCode != null);
    assert(Shift != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onKeyDown(KeyCode,Shift));
  }
  public final static void onKeyPress(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnInteger KeyAscii) throws ComException {
    assert(__joa__disp != null);
    assert(KeyAscii != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onKeyPress(KeyAscii));
  }
  public final static void onKeyUp(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(KeyCode != null);
    assert(Shift != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onKeyUp(KeyCode,Shift));
  }
  public final static void onLayout(final IDispatch __joa__disp, final Integer Index) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onLayout(Index));
  }
  public final static void onMouseDown(final IDispatch __joa__disp, final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onMouseDown(Index,Button,Shift,X,Y));
  }
  public final static void onMouseMove(final IDispatch __joa__disp, final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onMouseMove(Index,Button,Shift,X,Y));
  }
  public final static void onMouseUp(final IDispatch __joa__disp, final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onMouseUp(Index,Button,Shift,X,Y));
  }
  public final static void onRemoveControl(final IDispatch __joa__disp, final Integer Index, final com.wilutions.mslib.msforms.Control Control) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Control != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onRemoveControl(Index,Control));
  }
  public final static void onScroll(final IDispatch __joa__disp, final Integer Index, final com.wilutions.mslib.msforms.fmScrollAction ActionX, final com.wilutions.mslib.msforms.fmScrollAction ActionY, final Float RequestDx, final Float RequestDy, final com.wilutions.mslib.msforms.ReturnSingle ActualDx, final com.wilutions.mslib.msforms.ReturnSingle ActualDy) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(ActionX != null);
    assert(ActionY != null);
    assert(RequestDx != null);
    assert(RequestDy != null);
    assert(ActualDx != null);
    assert(ActualDy != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onScroll(Index,ActionX,ActionY,RequestDx,RequestDy,ActualDx,ActualDy));
  }
  public final static void onZoom(final IDispatch __joa__disp, final Integer Index, final ByRef<Short> Percent) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Percent != null);
    __joa__disp._fireEvent(MultiPageEvents.class, (l)->l.onZoom(Index,Percent));
  }
}
