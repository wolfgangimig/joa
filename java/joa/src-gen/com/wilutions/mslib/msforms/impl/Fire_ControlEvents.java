/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.msforms.ControlEvents;

@SuppressWarnings("all")
public class Fire_ControlEvents {
  public final static void onEnter(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ControlEvents.class, (l)->l.onEnter());
  }
  public final static void onExit(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ControlEvents.class, (l)->l.onExit(Cancel));
  }
  public final static void onBeforeUpdate(final IDispatch __joa__disp, final com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ControlEvents.class, (l)->l.onBeforeUpdate(Cancel));
  }
  public final static void onAfterUpdate(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ControlEvents.class, (l)->l.onAfterUpdate());
  }
}
