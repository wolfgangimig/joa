/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.StoresEvents_12;

@SuppressWarnings("all")
public class Fire_StoresEvents_12 {
  public final static void onBeforeStoreRemove(final IDispatch __joa__disp, final com.wilutions.mslib.outlook._Store Store, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Store != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(StoresEvents_12.class, (l)->l.onBeforeStoreRemove(Store,Cancel));
  }
  public final static void onStoreAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook._Store Store) throws ComException {
    assert(__joa__disp != null);
    assert(Store != null);
    __joa__disp._fireEvent(StoresEvents_12.class, (l)->l.onStoreAdd(Store));
  }
}
