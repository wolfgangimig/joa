/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9CE-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _ViewsEventsImpl extends Dispatch implements com.wilutions.mslib.outlook._ViewsEvents {
  @DeclDISPID(400)  public void onViewAdd(final com.wilutions.mslib.outlook.View View) throws ComException {
    this._dispatchCall(400,"ViewAdd", DISPATCH_METHOD,null,(View!=null?View:Dispatch.NULL));
  }
  @DeclDISPID(64071)  public void onViewRemove(final com.wilutions.mslib.outlook.View View) throws ComException {
    this._dispatchCall(64071,"ViewRemove", DISPATCH_METHOD,null,(View!=null?View:Dispatch.NULL));
  }
  public _ViewsEventsImpl(String progId) throws ComException {
    super(progId, "{000630A5-0000-0000-C000-000000000046}");
  }
  protected _ViewsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ViewsEventsImpl" + super.toString() + "]";
  }
}
