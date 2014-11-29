/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.office._CustomXMLPartsEvents;

@SuppressWarnings("all")
public class Fire__CustomXMLPartsEvents {
  public final static void onPartAfterAdd(final IDispatch __joa__disp, final com.wilutions.mslib.office.CustomXMLPart NewPart) throws ComException {
    assert(__joa__disp != null);
    assert(NewPart != null);
    __joa__disp._fireEvent(_CustomXMLPartsEvents.class, (l)->l.onPartAfterAdd(NewPart));
  }
  public final static void onPartBeforeDelete(final IDispatch __joa__disp, final com.wilutions.mslib.office.CustomXMLPart OldPart) throws ComException {
    assert(__joa__disp != null);
    assert(OldPart != null);
    __joa__disp._fireEvent(_CustomXMLPartsEvents.class, (l)->l.onPartBeforeDelete(OldPart));
  }
  public final static void onPartAfterLoad(final IDispatch __joa__disp, final com.wilutions.mslib.office.CustomXMLPart Part) throws ComException {
    assert(__joa__disp != null);
    assert(Part != null);
    __joa__disp._fireEvent(_CustomXMLPartsEvents.class, (l)->l.onPartAfterLoad(Part));
  }
}
