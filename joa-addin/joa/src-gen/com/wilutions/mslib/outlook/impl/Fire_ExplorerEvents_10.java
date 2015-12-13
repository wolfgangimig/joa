/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.ExplorerEvents_10;

@SuppressWarnings("all")
public class Fire_ExplorerEvents_10 {
  public final static void onActivate(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onActivate());
  }
  public final static void onFolderSwitch(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onFolderSwitch());
  }
  public final static void onBeforeFolderSwitch(final IDispatch __joa__disp, final IDispatch NewFolder, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(NewFolder != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onBeforeFolderSwitch(NewFolder,Cancel));
  }
  public final static void onViewSwitch(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onViewSwitch());
  }
  public final static void onBeforeViewSwitch(final IDispatch __joa__disp, final Object NewView, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(NewView != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onBeforeViewSwitch(NewView,Cancel));
  }
  public final static void onDeactivate(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onDeactivate());
  }
  public final static void onSelectionChange(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onSelectionChange());
  }
  public final static void onClose(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onClose());
  }
  public final static void onBeforeMaximize(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onBeforeMaximize(Cancel));
  }
  public final static void onBeforeMinimize(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onBeforeMinimize(Cancel));
  }
  public final static void onBeforeMove(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onBeforeMove(Cancel));
  }
  public final static void onBeforeSize(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onBeforeSize(Cancel));
  }
  public final static void onBeforeItemCopy(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onBeforeItemCopy(Cancel));
  }
  public final static void onBeforeItemCut(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onBeforeItemCut(Cancel));
  }
  public final static void onBeforeItemPaste(final IDispatch __joa__disp, final Object ClipboardContent, final com.wilutions.mslib.outlook.MAPIFolder Target, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(ClipboardContent != null);
    assert(Target != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onBeforeItemPaste(ClipboardContent,Target,Cancel));
  }
  public final static void onAttachmentSelectionChange(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onAttachmentSelectionChange());
  }
  public final static void onInlineResponse(final IDispatch __joa__disp, final IDispatch Item) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onInlineResponse(Item));
  }
  public final static void onInlineResponseClose(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ExplorerEvents_10.class, (l)->l.onInlineResponseClose());
  }
}
