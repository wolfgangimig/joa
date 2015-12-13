/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joactrllib.impl;
import com.wilutions.com.*;
import com.wilutions.joactrllib._IJoaBridgeDialogEvents;

@SuppressWarnings("all")
public class Fire__IJoaBridgeDialogEvents {
  public final static void onShow(final IDispatch __joa__disp, final Long HWND) throws ComException {
    assert(__joa__disp != null);
    assert(HWND != null);
    __joa__disp._fireEvent(_IJoaBridgeDialogEvents.class, (l)->l.onShow(HWND));
  }
  public final static void onClosed(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(_IJoaBridgeDialogEvents.class, (l)->l.onClosed());
  }
  public final static void onSystemMenuClose(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(_IJoaBridgeDialogEvents.class, (l)->l.onSystemMenuClose());
  }
}
