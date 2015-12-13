/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.msforms.ScrollbarEvents;

@SuppressWarnings("all")
public class Fire_ScrollbarEvents {
  public final static void onBeforeDragOver(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.fmDragState DragState, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    assert(Data != null);
    assert(X != null);
    assert(Y != null);
    assert(DragState != null);
    assert(Effect != null);
    assert(Shift != null);
    __joa__disp._fireEvent(ScrollbarEvents.class, (l)->l.onBeforeDragOver(Cancel,Data,X,Y,DragState,Effect,Shift));
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
    __joa__disp._fireEvent(ScrollbarEvents.class, (l)->l.onBeforeDropOrPaste(Cancel,Action,Data,X,Y,Effect,Shift));
  }
  public final static void onChange(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ScrollbarEvents.class, (l)->l.onChange());
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
    __joa__disp._fireEvent(ScrollbarEvents.class, (l)->l.onError(Number,Description,SCode,Source,HelpFile,HelpContext,CancelDisplay));
  }
  public final static void onKeyDown(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(KeyCode != null);
    assert(Shift != null);
    __joa__disp._fireEvent(ScrollbarEvents.class, (l)->l.onKeyDown(KeyCode,Shift));
  }
  public final static void onKeyPress(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnInteger KeyAscii) throws ComException {
    assert(__joa__disp != null);
    assert(KeyAscii != null);
    __joa__disp._fireEvent(ScrollbarEvents.class, (l)->l.onKeyPress(KeyAscii));
  }
  public final static void onKeyUp(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(__joa__disp != null);
    assert(KeyCode != null);
    assert(Shift != null);
    __joa__disp._fireEvent(ScrollbarEvents.class, (l)->l.onKeyUp(KeyCode,Shift));
  }
  public final static void onScroll(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ScrollbarEvents.class, (l)->l.onScroll());
  }
}
