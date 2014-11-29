/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A910-A463-DB41-5DAE-69E7A5F7FCBC}")
public class OutlookBarGroupsEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.OutlookBarGroupsEvents {
  @DeclDISPID(61441)  public void onGroupAdd(final com.wilutions.mslib.outlook.OutlookBarGroup NewGroup) throws ComException {
    this._dispatchCall(61441,"GroupAdd", DISPATCH_METHOD,null,(NewGroup!=null?NewGroup:Dispatch.NULL));
  }
  @DeclDISPID(61442)  public void onBeforeGroupAdd(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61442,"BeforeGroupAdd", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61443)  public void onBeforeGroupRemove(final com.wilutions.mslib.outlook.OutlookBarGroup Group, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61443,"BeforeGroupRemove", DISPATCH_METHOD,null,(Group!=null?Group:Dispatch.NULL),Cancel);
  }
  public OutlookBarGroupsEventsImpl(String progId) throws ComException {
    super(progId, "{0006307B-0000-0000-C000-000000000046}");
  }
  protected OutlookBarGroupsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OutlookBarGroupsEventsImpl" + super.toString() + "]";
  }
}
