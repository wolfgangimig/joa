/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.NavigationGroupsEvents_12;

@SuppressWarnings("all")
public class Fire_NavigationGroupsEvents_12 {
  public final static void onSelectedChange(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.NavigationFolder NavigationFolder) throws ComException {
    assert(__joa__disp != null);
    assert(NavigationFolder != null);
    __joa__disp._fireEvent(NavigationGroupsEvents_12.class, (l)->l.onSelectedChange(NavigationFolder));
  }
  public final static void onNavigationFolderAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.NavigationFolder NavigationFolder) throws ComException {
    assert(__joa__disp != null);
    assert(NavigationFolder != null);
    __joa__disp._fireEvent(NavigationGroupsEvents_12.class, (l)->l.onNavigationFolderAdd(NavigationFolder));
  }
  public final static void onNavigationFolderRemove(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(NavigationGroupsEvents_12.class, (l)->l.onNavigationFolderRemove());
  }
}
