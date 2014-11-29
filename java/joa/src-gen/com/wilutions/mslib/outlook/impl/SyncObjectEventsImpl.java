/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9EE-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SyncObjectEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.SyncObjectEvents {
  @DeclDISPID(61441)  public void onSyncStart() throws ComException {
    this._dispatchCall(61441,"SyncStart", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61442)  public void onProgress(final com.wilutions.mslib.outlook.OlSyncState State, final String Description, final Integer Value, final Integer Max) throws ComException {
    assert(State != null);
    assert(Description != null);
    assert(Value != null);
    assert(Max != null);
    this._dispatchCall(61442,"Progress", DISPATCH_METHOD,null,State.value,Description,Value,Max);
  }
  @DeclDISPID(61443)  public void onOnError(final Integer Code, final String Description) throws ComException {
    assert(Code != null);
    assert(Description != null);
    this._dispatchCall(61443,"OnError", DISPATCH_METHOD,null,Code,Description);
  }
  @DeclDISPID(61444)  public void onSyncEnd() throws ComException {
    this._dispatchCall(61444,"SyncEnd", DISPATCH_METHOD,null);
  }
  public SyncObjectEventsImpl(String progId) throws ComException {
    super(progId, "{00063085-0000-0000-C000-000000000046}");
  }
  protected SyncObjectEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SyncObjectEventsImpl" + super.toString() + "]";
  }
}
