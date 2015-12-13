/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook._ViewsEvents;

@SuppressWarnings("all")
public class Fire__ViewsEvents {
  public final static void onViewAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.View View) throws ComException {
    assert(__joa__disp != null);
    assert(View != null);
    __joa__disp._fireEvent(_ViewsEvents.class, (l)->l.onViewAdd(View));
  }
  public final static void onViewRemove(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.View View) throws ComException {
    assert(__joa__disp != null);
    assert(View != null);
    __joa__disp._fireEvent(_ViewsEvents.class, (l)->l.onViewRemove(View));
  }
}
