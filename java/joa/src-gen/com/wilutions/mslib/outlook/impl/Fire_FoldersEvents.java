/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.FoldersEvents;

@SuppressWarnings("all")
public class Fire_FoldersEvents {
  public final static void onFolderAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.MAPIFolder Folder) throws ComException {
    assert(__joa__disp != null);
    assert(Folder != null);
    __joa__disp._fireEvent(FoldersEvents.class, (l)->l.onFolderAdd(Folder));
  }
  public final static void onFolderChange(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.MAPIFolder Folder) throws ComException {
    assert(__joa__disp != null);
    assert(Folder != null);
    __joa__disp._fireEvent(FoldersEvents.class, (l)->l.onFolderChange(Folder));
  }
  public final static void onFolderRemove(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(FoldersEvents.class, (l)->l.onFolderRemove());
  }
}
