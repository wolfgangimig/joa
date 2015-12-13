/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.msforms.TabStripEvents;

@SuppressWarnings("all")
public class Fire_TabStripEvents {
  public final static void onBeforeDragOver(final IDispatch __joa__disp, final Integer Index, final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.fmDragState DragState, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Cancel != null);
    assert(Data != null);
    assert(X != null);
    assert(Y != null);
    assert(DragState != null);
    assert(Effect != null);
    assert(Shift != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onBeforeDragOver(Index,Cancel,Data,X,Y,DragState,Effect,Shift));
  }
  public final static void onBeforeDropOrPaste(final IDispatch __joa__disp, final Integer Index, final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.fmAction Action, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Cancel != null);
    assert(Action != null);
    assert(Data != null);
    assert(X != null);
    assert(Y != null);
    assert(Effect != null);
    assert(Shift != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onBeforeDropOrPaste(Index,Cancel,Action,Data,X,Y,Effect,Shift));
  }
  public final static void onChange(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onChange());
  }
  public final static void onClick(final IDispatch __joa__disp, final Integer Index) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onClick(Index));
  }
  public final static void onDblClick(final IDispatch __joa__disp, final Integer Index, final com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onDblClick(Index,Cancel));
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
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onError(Number,Description,SCode,Source,HelpFile,HelpContext,CancelDisplay));
  }
  public final static void onKeyDown(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(KeyCode != null);
    assert(Shift != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onKeyDown(KeyCode,Shift));
  }
  public final static void onKeyPress(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnInteger KeyAscii) throws ComException {
    assert(__joa__disp != null);
    assert(KeyAscii != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onKeyPress(KeyAscii));
  }
  public final static void onKeyUp(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(KeyCode != null);
    assert(Shift != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onKeyUp(KeyCode,Shift));
  }
  public final static void onMouseDown(final IDispatch __joa__disp, final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onMouseDown(Index,Button,Shift,X,Y));
  }
  public final static void onMouseMove(final IDispatch __joa__disp, final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onMouseMove(Index,Button,Shift,X,Y));
  }
  public final static void onMouseUp(final IDispatch __joa__disp, final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(__joa__disp != null);
    assert(Index != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(TabStripEvents.class, (l)->l.onMouseUp(Index,Button,Shift,X,Y));
  }
}
