/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A86F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AccountSelectorEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.AccountSelectorEvents {
  @DeclDISPID(64627)  public void onSelectedAccountChange(final com.wilutions.mslib.outlook.Account SelectedAccount) throws ComException {
    this._dispatchCall(64627,"SelectedAccountChange", DISPATCH_METHOD,null,(SelectedAccount!=null?SelectedAccount:Dispatch.NULL));
  }
  public AccountSelectorEventsImpl(String progId) throws ComException {
    super(progId, "{00063104-0000-0000-C000-000000000046}");
  }
  protected AccountSelectorEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AccountSelectorEventsImpl" + super.toString() + "]";
  }
}
