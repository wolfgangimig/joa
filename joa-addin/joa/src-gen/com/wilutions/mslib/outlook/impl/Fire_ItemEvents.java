/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.ItemEvents;

@SuppressWarnings("all")
public class Fire_ItemEvents {
  public final static void onOpen(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onOpen(Cancel));
  }
  public final static void onCustomAction(final IDispatch __joa__disp, final IDispatch Action, final IDispatch Response, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Action != null);
    assert(Response != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onCustomAction(Action,Response,Cancel));
  }
  public final static void onCustomPropertyChange(final IDispatch __joa__disp, final String Name) throws ComException {
    assert(__joa__disp != null);
    assert(Name != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onCustomPropertyChange(Name));
  }
  public final static void onForward(final IDispatch __joa__disp, final IDispatch Forward, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Forward != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onForward(Forward,Cancel));
  }
  public final static void onClose(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onClose(Cancel));
  }
  public final static void onPropertyChange(final IDispatch __joa__disp, final String Name) throws ComException {
    assert(__joa__disp != null);
    assert(Name != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onPropertyChange(Name));
  }
  public final static void onRead(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onRead());
  }
  public final static void onReply(final IDispatch __joa__disp, final IDispatch Response, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Response != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onReply(Response,Cancel));
  }
  public final static void onReplyAll(final IDispatch __joa__disp, final IDispatch Response, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Response != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onReplyAll(Response,Cancel));
  }
  public final static void onSend(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onSend(Cancel));
  }
  public final static void onWrite(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onWrite(Cancel));
  }
  public final static void onBeforeCheckNames(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onBeforeCheckNames(Cancel));
  }
  public final static void onAttachmentAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.Attachment Attachment) throws ComException {
    assert(__joa__disp != null);
    assert(Attachment != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onAttachmentAdd(Attachment));
  }
  public final static void onAttachmentRead(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.Attachment Attachment) throws ComException {
    assert(__joa__disp != null);
    assert(Attachment != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onAttachmentRead(Attachment));
  }
  public final static void onBeforeAttachmentSave(final IDispatch __joa__disp, final com.wilutions.mslib.outlook.Attachment Attachment, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Attachment != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ItemEvents.class, (l)->l.onBeforeAttachmentSave(Attachment,Cancel));
  }
}
