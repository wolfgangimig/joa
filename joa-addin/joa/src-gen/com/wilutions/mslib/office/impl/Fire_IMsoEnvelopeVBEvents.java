/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.office.IMsoEnvelopeVBEvents;

@SuppressWarnings("all")
public class Fire_IMsoEnvelopeVBEvents {
  public final static void onEnvelopeShow(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(IMsoEnvelopeVBEvents.class, (l)->l.onEnvelopeShow());
  }
  public final static void onEnvelopeHide(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(IMsoEnvelopeVBEvents.class, (l)->l.onEnvelopeHide());
  }
}
