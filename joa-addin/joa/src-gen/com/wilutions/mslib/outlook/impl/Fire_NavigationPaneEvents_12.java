/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.NavigationPaneEvents_12;

@SuppressWarnings("all")
public class Fire_NavigationPaneEvents_12 {
  public final static void onModuleSwitch(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.NavigationModule CurrentModule) throws ComException {
    assert(__joa__disp != null);
    assert(CurrentModule != null);
    __joa__disp._fireEvent(NavigationPaneEvents_12.class, (l)->l.onModuleSwitch(CurrentModule));
  }
}
