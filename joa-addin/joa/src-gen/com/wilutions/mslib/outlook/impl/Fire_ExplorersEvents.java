/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.ExplorersEvents;

@SuppressWarnings("all")
public class Fire_ExplorersEvents {
  public final static void onNewExplorer(final IDispatch __joa__disp, final com.wilutions.mslib.outlook._Explorer Explorer) throws ComException {
    assert(__joa__disp != null);
    assert(Explorer != null);
    __joa__disp._fireEvent(ExplorersEvents.class, (l)->l.onNewExplorer(Explorer));
  }
}
