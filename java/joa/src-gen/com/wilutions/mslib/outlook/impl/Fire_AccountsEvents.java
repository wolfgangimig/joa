/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.AccountsEvents;

@SuppressWarnings("all")
public class Fire_AccountsEvents {
  public final static void onAutoDiscoverComplete(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.Account Account) throws ComException {
    assert(__joa__disp != null);
    assert(Account != null);
    __joa__disp._fireEvent(AccountsEvents.class, (l)->l.onAutoDiscoverComplete(Account));
  }
}
