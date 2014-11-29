/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.stdole.FontEvents;

@SuppressWarnings("all")
public class Fire_FontEvents {
  public final static void onFontChanged(final IDispatch __joa__disp, final String PropertyName) throws ComException {
    assert(__joa__disp != null);
    assert(PropertyName != null);
    __joa__disp._fireEvent(FontEvents.class, (l)->l.onFontChanged(PropertyName));
  }
}
