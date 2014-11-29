/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.InspectorEvents;

@SuppressWarnings("all")
public class Fire_InspectorEvents {
  public final static void onActivate(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(InspectorEvents.class, (l)->l.onActivate());
  }
  public final static void onDeactivate(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(InspectorEvents.class, (l)->l.onDeactivate());
  }
  public final static void onClose(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(InspectorEvents.class, (l)->l.onClose());
  }
}
