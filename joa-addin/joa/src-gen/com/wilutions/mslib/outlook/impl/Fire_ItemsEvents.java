/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.ItemsEvents;

@SuppressWarnings("all")
public class Fire_ItemsEvents {
  public final static void onItemAdd(final IDispatch __joa__disp, final IDispatch Item) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    __joa__disp._fireEvent(ItemsEvents.class, (l)->l.onItemAdd(Item));
  }
  public final static void onItemChange(final IDispatch __joa__disp, final IDispatch Item) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    __joa__disp._fireEvent(ItemsEvents.class, (l)->l.onItemChange(Item));
  }
  public final static void onItemRemove(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ItemsEvents.class, (l)->l.onItemRemove());
  }
}
