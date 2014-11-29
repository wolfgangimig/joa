/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.OutlookBarShortcutsEvents;

@SuppressWarnings("all")
public class Fire_OutlookBarShortcutsEvents {
  public final static void onShortcutAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OutlookBarShortcut NewShortcut) throws ComException {
    assert(__joa__disp != null);
    assert(NewShortcut != null);
    __joa__disp._fireEvent(OutlookBarShortcutsEvents.class, (l)->l.onShortcutAdd(NewShortcut));
  }
  public final static void onBeforeShortcutAdd(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(OutlookBarShortcutsEvents.class, (l)->l.onBeforeShortcutAdd(Cancel));
  }
  public final static void onBeforeShortcutRemove(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OutlookBarShortcut Shortcut, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Shortcut != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(OutlookBarShortcutsEvents.class, (l)->l.onBeforeShortcutRemove(Shortcut,Cancel));
  }
}
