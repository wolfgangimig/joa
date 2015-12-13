/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.NameSpaceEvents;

@SuppressWarnings("all")
public class Fire_NameSpaceEvents {
  public final static void onOptionsPagesAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.PropertyPages Pages, final com.wilutions.mslib.outlook.MAPIFolder Folder) throws ComException {
    assert(__joa__disp != null);
    assert(Pages != null);
    assert(Folder != null);
    __joa__disp._fireEvent(NameSpaceEvents.class, (l)->l.onOptionsPagesAdd(Pages,Folder));
  }
  public final static void onAutoDiscoverComplete(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(NameSpaceEvents.class, (l)->l.onAutoDiscoverComplete());
  }
}
