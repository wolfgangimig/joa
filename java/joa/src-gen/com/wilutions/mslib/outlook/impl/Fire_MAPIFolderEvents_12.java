/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.MAPIFolderEvents_12;

@SuppressWarnings("all")
public class Fire_MAPIFolderEvents_12 {
  public final static void onBeforeFolderMove(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.MAPIFolder MoveTo, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(MoveTo != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(MAPIFolderEvents_12.class, (l)->l.onBeforeFolderMove(MoveTo,Cancel));
  }
  public final static void onBeforeItemMove(final IDispatch __joa__disp, final IDispatch Item, final com.wilutions.mslib.outlook.MAPIFolder MoveTo, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    assert(MoveTo != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(MAPIFolderEvents_12.class, (l)->l.onBeforeItemMove(Item,MoveTo,Cancel));
  }
}
