/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.office.ICommandBarButtonEvents;

@SuppressWarnings("all")
public class Fire_ICommandBarButtonEvents {
  public final static void onClick(final IDispatch __joa__disp, final com.wilutions.mslib.office.CommandBarButton Ctrl, final ByRef<Boolean> CancelDefault) throws ComException {
    assert(__joa__disp != null);
    assert(Ctrl != null);
    assert(CancelDefault != null);
    __joa__disp._fireEvent(ICommandBarButtonEvents.class, (l)->l.onClick(Ctrl,CancelDefault));
  }
}
