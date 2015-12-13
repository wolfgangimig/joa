/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.SyncObjectEvents;

@SuppressWarnings("all")
public class Fire_SyncObjectEvents {
  public final static void onSyncStart(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(SyncObjectEvents.class, (l)->l.onSyncStart());
  }
  public final static void onProgress(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OlSyncState State, final String Description, final Integer Value, final Integer Max) throws ComException {
    assert(__joa__disp != null);
    assert(State != null);
    assert(Description != null);
    assert(Value != null);
    assert(Max != null);
    __joa__disp._fireEvent(SyncObjectEvents.class, (l)->l.onProgress(State,Description,Value,Max));
  }
  public final static void onOnError(final IDispatch __joa__disp, final Integer Code, final String Description) throws ComException {
    assert(__joa__disp != null);
    assert(Code != null);
    assert(Description != null);
    __joa__disp._fireEvent(SyncObjectEvents.class, (l)->l.onOnError(Code,Description));
  }
  public final static void onSyncEnd(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(SyncObjectEvents.class, (l)->l.onSyncEnd());
  }
}
