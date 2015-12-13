/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.office.CustomTaskPaneEvents;

@SuppressWarnings("all")
public class Fire_CustomTaskPaneEvents {
  public final static void onVisibleStateChange(final IDispatch __joa__disp, final com.wilutions.mslib.office._CustomTaskPane CustomTaskPaneInst) throws ComException {
    assert(__joa__disp != null);
    assert(CustomTaskPaneInst != null);
    __joa__disp._fireEvent(CustomTaskPaneEvents.class, (l)->l.onVisibleStateChange(CustomTaskPaneInst));
  }
  public final static void onDockPositionStateChange(final IDispatch __joa__disp, final com.wilutions.mslib.office._CustomTaskPane CustomTaskPaneInst) throws ComException {
    assert(__joa__disp != null);
    assert(CustomTaskPaneInst != null);
    __joa__disp._fireEvent(CustomTaskPaneEvents.class, (l)->l.onDockPositionStateChange(CustomTaskPaneInst));
  }
}
