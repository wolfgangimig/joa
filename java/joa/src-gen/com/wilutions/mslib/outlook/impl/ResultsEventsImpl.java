/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A966-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ResultsEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.ResultsEvents {
  @DeclDISPID(61441)  public void onItemAdd(IDispatch Item) throws ComException {
    this._dispatchCall(61441,"ItemAdd", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL));
  }
  @DeclDISPID(61442)  public void onItemChange(IDispatch Item) throws ComException {
    this._dispatchCall(61442,"ItemChange", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL));
  }
  @DeclDISPID(61443)  public void onItemRemove() throws ComException {
    this._dispatchCall(61443,"ItemRemove", DISPATCH_METHOD,null);
  }
  public ResultsEventsImpl(String progId) throws ComException {
    super(progId, "{0006300D-0000-0000-C000-000000000046}");
  }
  protected ResultsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ResultsEventsImpl" + super.toString() + "]";
  }
}
