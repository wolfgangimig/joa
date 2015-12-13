/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.InspectorsEvents;

@SuppressWarnings("all")
public class Fire_InspectorsEvents {
  public final static void onNewInspector(final IDispatch __joa__disp, final com.wilutions.mslib.outlook._Inspector Inspector) throws ComException {
    assert(__joa__disp != null);
    assert(Inspector != null);
    __joa__disp._fireEvent(InspectorsEvents.class, (l)->l.onNewInspector(Inspector));
  }
}
