/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.InspectorEvents_10;

@SuppressWarnings("all")
public class Fire_InspectorEvents_10 {
  public final static void onActivate(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(InspectorEvents_10.class, (l)->l.onActivate());
  }
  public final static void onDeactivate(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(InspectorEvents_10.class, (l)->l.onDeactivate());
  }
  public final static void onClose(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(InspectorEvents_10.class, (l)->l.onClose());
  }
  public final static void onBeforeMaximize(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(InspectorEvents_10.class, (l)->l.onBeforeMaximize(Cancel));
  }
  public final static void onBeforeMinimize(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(InspectorEvents_10.class, (l)->l.onBeforeMinimize(Cancel));
  }
  public final static void onBeforeMove(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(InspectorEvents_10.class, (l)->l.onBeforeMove(Cancel));
  }
  public final static void onBeforeSize(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(InspectorEvents_10.class, (l)->l.onBeforeSize(Cancel));
  }
  public final static void onPageChange(final IDispatch __joa__disp, final String ActivePageName) throws ComException {
    assert(__joa__disp != null);
    assert(ActivePageName != null);
    __joa__disp._fireEvent(InspectorEvents_10.class, (l)->l.onPageChange(ActivePageName));
  }
  public final static void onAttachmentSelectionChange(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(InspectorEvents_10.class, (l)->l.onAttachmentSelectionChange());
  }
}
