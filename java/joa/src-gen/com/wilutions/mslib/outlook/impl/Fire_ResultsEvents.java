/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.ResultsEvents;

@SuppressWarnings("all")
public class Fire_ResultsEvents {
  public final static void onItemAdd(final IDispatch __joa__disp, final IDispatch Item) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    __joa__disp._fireEvent(ResultsEvents.class, (l)->l.onItemAdd(Item));
  }
  public final static void onItemChange(final IDispatch __joa__disp, final IDispatch Item) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    __joa__disp._fireEvent(ResultsEvents.class, (l)->l.onItemChange(Item));
  }
  public final static void onItemRemove(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ResultsEvents.class, (l)->l.onItemRemove());
  }
}
