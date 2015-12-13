/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.FormRegionEvents;

@SuppressWarnings("all")
public class Fire_FormRegionEvents {
  public final static void onExpanded(final IDispatch __joa__disp, final Boolean Expand) throws ComException {
    assert(__joa__disp != null);
    assert(Expand != null);
    __joa__disp._fireEvent(FormRegionEvents.class, (l)->l.onExpanded(Expand));
  }
  public final static void onClose(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(FormRegionEvents.class, (l)->l.onClose());
  }
}
