/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.office.ICommandBarComboBoxEvents;

@SuppressWarnings("all")
public class Fire_ICommandBarComboBoxEvents {
  public final static void onChange(final IDispatch __joa__disp, final com.wilutions.mslib.office.CommandBarComboBox Ctrl) throws ComException {
    assert(__joa__disp != null);
    assert(Ctrl != null);
    __joa__disp._fireEvent(ICommandBarComboBoxEvents.class, (l)->l.onChange(Ctrl));
  }
}
