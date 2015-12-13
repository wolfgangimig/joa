/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.OlkLabelEvents;

@SuppressWarnings("all")
public class Fire_OlkLabelEvents {
  public final static void onClick(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(OlkLabelEvents.class, (l)->l.onClick());
  }
  public final static void onDoubleClick(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(OlkLabelEvents.class, (l)->l.onDoubleClick());
  }
  public final static void onMouseDown(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OlMouseButton Button, final com.wilutions.mslib.outlook.OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException {
    assert(__joa__disp != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(OlkLabelEvents.class, (l)->l.onMouseDown(Button,Shift,X,Y));
  }
  public final static void onMouseMove(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OlMouseButton Button, final com.wilutions.mslib.outlook.OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException {
    assert(__joa__disp != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(OlkLabelEvents.class, (l)->l.onMouseMove(Button,Shift,X,Y));
  }
  public final static void onMouseUp(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OlMouseButton Button, final com.wilutions.mslib.outlook.OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException {
    assert(__joa__disp != null);
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    __joa__disp._fireEvent(OlkLabelEvents.class, (l)->l.onMouseUp(Button,Shift,X,Y));
  }
}
