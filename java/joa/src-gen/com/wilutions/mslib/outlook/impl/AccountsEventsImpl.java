/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A86E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AccountsEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.AccountsEvents {
  @DeclDISPID(64620)  public void onAutoDiscoverComplete(final com.wilutions.mslib.outlook.Account Account) throws ComException {
    this._dispatchCall(64620,"AutoDiscoverComplete", DISPATCH_METHOD,null,(Account!=null?Account:Dispatch.NULL));
  }
  public AccountsEventsImpl(String progId) throws ComException {
    super(progId, "{00063105-0000-0000-C000-000000000046}");
  }
  protected AccountsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AccountsEventsImpl" + super.toString() + "]";
  }
}
