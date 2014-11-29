/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.AccountSelectorEvents;

@SuppressWarnings("all")
public class Fire_AccountSelectorEvents {
  public final static void onSelectedAccountChange(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.Account SelectedAccount) throws ComException {
    assert(__joa__disp != null);
    assert(SelectedAccount != null);
    __joa__disp._fireEvent(AccountSelectorEvents.class, (l)->l.onSelectedAccountChange(SelectedAccount));
  }
}
