/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.ExplorerEvents;

@SuppressWarnings("all")
public class Fire_ExplorerEvents {
  public final static void onActivate(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents.class, (l)->l.onActivate());
  }
  public final static void onFolderSwitch(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents.class, (l)->l.onFolderSwitch());
  }
  public final static void onBeforeFolderSwitch(final IDispatch __joa__disp, final IDispatch NewFolder, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(NewFolder != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents.class, (l)->l.onBeforeFolderSwitch(NewFolder,Cancel));
  }
  public final static void onViewSwitch(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents.class, (l)->l.onViewSwitch());
  }
  public final static void onBeforeViewSwitch(final IDispatch __joa__disp, final Object NewView, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(NewView != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents.class, (l)->l.onBeforeViewSwitch(NewView,Cancel));
  }
  public final static void onDeactivate(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents.class, (l)->l.onDeactivate());
  }
  public final static void onSelectionChange(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents.class, (l)->l.onSelectionChange());
  }
  public final static void onClose(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents.class, (l)->l.onClose());
  }
}
