/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A913-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ExplorersEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.ExplorersEvents {
  @DeclDISPID(61441)  public void onNewExplorer(final com.wilutions.mslib.outlook._Explorer Explorer) throws ComException {
    this._dispatchCall(61441,"NewExplorer", DISPATCH_METHOD,null,Dispatch.param(Explorer));
  }
  public ExplorersEventsImpl(String progId) throws ComException {
    super(progId, "{00063078-0000-0000-C000-000000000046}");
  }
  protected ExplorersEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ExplorersEventsImpl" + super.toString() + "]";
  }
}
