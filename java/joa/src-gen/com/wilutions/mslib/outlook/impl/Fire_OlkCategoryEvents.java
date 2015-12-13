/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.OlkCategoryEvents;

@SuppressWarnings("all")
public class Fire_OlkCategoryEvents {
  public final static void onClick(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onClick());
  }
  public final static void onDoubleClick(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onDoubleClick());
  }
  public final static void onMouseDown(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OlMouseButton Button, final com.wilutions.mslib.outlook.OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException {
    assert(__joa__disp != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onMouseDown(Button,Shift,X,Y));
  }
  public final static void onMouseMove(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OlMouseButton Button, final com.wilutions.mslib.outlook.OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException {
    assert(__joa__disp != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onMouseMove(Button,Shift,X,Y));
  }
  public final static void onMouseUp(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OlMouseButton Button, final com.wilutions.mslib.outlook.OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException {
    assert(__joa__disp != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onMouseUp(Button,Shift,X,Y));
  }
  public final static void onEnter(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onEnter());
  }
  public final static void onExit(final IDispatch __joa__disp, final Boolean Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onExit(Cancel));
  }
  public final static void onKeyDown(final IDispatch __joa__disp, final Integer KeyCode, final com.wilutions.mslib.outlook.OlShiftState Shift) throws ComException {
    assert(__joa__disp != null);
    assert(KeyCode != null);
    assert(Shift != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onKeyDown(KeyCode,Shift));
  }
  public final static void onKeyPress(final IDispatch __joa__disp, final Integer KeyAscii) throws ComException {
    assert(__joa__disp != null);
    assert(KeyAscii != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onKeyPress(KeyAscii));
  }
  public final static void onKeyUp(final IDispatch __joa__disp, final Integer KeyCode, final com.wilutions.mslib.outlook.OlShiftState Shift) throws ComException {
    assert(__joa__disp != null);
    assert(KeyCode != null);
    assert(Shift != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onKeyUp(KeyCode,Shift));
  }
  public final static void onChange(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(OlkCategoryEvents.class, (l)->l.onChange());
  }
}
