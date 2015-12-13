/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.OutlookBarPaneEvents;

@SuppressWarnings("all")
public class Fire_OutlookBarPaneEvents {
  public final static void onBeforeNavigate(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OutlookBarShortcut Shortcut, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Shortcut != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(OutlookBarPaneEvents.class, (l)->l.onBeforeNavigate(Shortcut,Cancel));
  }
}
