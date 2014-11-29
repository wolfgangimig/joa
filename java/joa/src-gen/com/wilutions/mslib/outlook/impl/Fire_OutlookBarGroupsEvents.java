/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.OutlookBarGroupsEvents;

@SuppressWarnings("all")
public class Fire_OutlookBarGroupsEvents {
  public final static void onGroupAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OutlookBarGroup NewGroup) throws ComException {
    assert(__joa__disp != null);
    assert(NewGroup != null);
    __joa__disp._fireEvent(OutlookBarGroupsEvents.class, (l)->l.onGroupAdd(NewGroup));
  }
  public final static void onBeforeGroupAdd(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(OutlookBarGroupsEvents.class, (l)->l.onBeforeGroupAdd(Cancel));
  }
  public final static void onBeforeGroupRemove(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.OutlookBarGroup Group, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Group != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(OutlookBarGroupsEvents.class, (l)->l.onBeforeGroupRemove(Group,Cancel));
  }
}
