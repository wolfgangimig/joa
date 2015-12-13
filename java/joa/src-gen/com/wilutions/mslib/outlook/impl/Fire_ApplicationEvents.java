/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.ApplicationEvents;

@SuppressWarnings("all")
public class Fire_ApplicationEvents {
  public final static void onItemSend(final IDispatch __joa__disp, final IDispatch Item, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ApplicationEvents.class, (l)->l.onItemSend(Item,Cancel));
  }
  public final static void onNewMail(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ApplicationEvents.class, (l)->l.onNewMail());
  }
  public final static void onReminder(final IDispatch __joa__disp, final IDispatch Item) throws ComException {
    assert(__joa__disp != null);
    assert(Item != null);
    __joa__disp._fireEvent(ApplicationEvents.class, (l)->l.onReminder(Item));
  }
  public final static void onOptionsPagesAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.PropertyPages Pages) throws ComException {
    assert(__joa__disp != null);
    assert(Pages != null);
    __joa__disp._fireEvent(ApplicationEvents.class, (l)->l.onOptionsPagesAdd(Pages));
  }
  public final static void onStartup(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ApplicationEvents.class, (l)->l.onStartup());
  }
  public final static void onQuit(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ApplicationEvents.class, (l)->l.onQuit());
  }
}
