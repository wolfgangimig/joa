/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.ApplicationEvents_11;

@SuppressWarnings("all")
public class Fire_ApplicationEvents_11 {
  public final static void onItemSend(final IDispatch __joa__disp, final IDispatch Item, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onItemSend(Item,Cancel));
  }
  public final static void onNewMail(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onNewMail());
  }
  public final static void onReminder(final IDispatch __joa__disp, final IDispatch Item) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onReminder(Item));
  }
  public final static void onOptionsPagesAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.PropertyPages Pages) throws ComException {
    assert(__joa__disp != null);
    assert(Pages != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onOptionsPagesAdd(Pages));
  }
  public final static void onStartup(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onStartup());
  }
  public final static void onQuit(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onQuit());
  }
  public final static void onAdvancedSearchComplete(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.Search SearchObject) throws ComException {
    assert(__joa__disp != null);
    assert(SearchObject != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onAdvancedSearchComplete(SearchObject));
  }
  public final static void onAdvancedSearchStopped(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.Search SearchObject) throws ComException {
    assert(__joa__disp != null);
    assert(SearchObject != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onAdvancedSearchStopped(SearchObject));
  }
  public final static void onMAPILogonComplete(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onMAPILogonComplete());
  }
  public final static void onNewMailEx(final IDispatch __joa__disp, final String EntryIDCollection) throws ComException {
    assert(__joa__disp != null);
    assert(EntryIDCollection != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onNewMailEx(EntryIDCollection));
  }
  public final static void onItemLoad(final IDispatch __joa__disp, final IDispatch Item) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onItemLoad(Item));
  }
  public final static void onBeforeFolderSharingDialog(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.MAPIFolder FolderToShare, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(FolderToShare != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ApplicationEvents_11.class, (l)->l.onBeforeFolderSharingDialog(FolderToShare,Cancel));
  }
}
