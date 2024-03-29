/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A951-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ItemEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.ItemEvents {
  @DeclDISPID(61443)  public void onOpen(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61443,"Open", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61446)  public void onCustomAction(final IDispatch Action, final IDispatch Response, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61446,"CustomAction", DISPATCH_METHOD,null,Dispatch.param(Action),Dispatch.param(Response),Cancel);
  }
  @DeclDISPID(61448)  public void onCustomPropertyChange(final String Name) throws ComException {
    assert(Name != null);
    this._dispatchCall(61448,"CustomPropertyChange", DISPATCH_METHOD,null,Name);
  }
  @DeclDISPID(62568)  public void onForward(final IDispatch Forward, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(62568,"Forward", DISPATCH_METHOD,null,Dispatch.param(Forward),Cancel);
  }
  @DeclDISPID(61444)  public void onClose(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61444,"Close", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61449)  public void onPropertyChange(final String Name) throws ComException {
    assert(Name != null);
    this._dispatchCall(61449,"PropertyChange", DISPATCH_METHOD,null,Name);
  }
  @DeclDISPID(61441)  public void onRead() throws ComException {
    this._dispatchCall(61441,"Read", DISPATCH_METHOD,null);
  }
  @DeclDISPID(62566)  public void onReply(final IDispatch Response, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(62566,"Reply", DISPATCH_METHOD,null,Dispatch.param(Response),Cancel);
  }
  @DeclDISPID(62567)  public void onReplyAll(final IDispatch Response, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(62567,"ReplyAll", DISPATCH_METHOD,null,Dispatch.param(Response),Cancel);
  }
  @DeclDISPID(61445)  public void onSend(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61445,"Send", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61442)  public void onWrite(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61442,"Write", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61450)  public void onBeforeCheckNames(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61450,"BeforeCheckNames", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61451)  public void onAttachmentAdd(final com.wilutions.mslib.outlook.Attachment Attachment) throws ComException {
    this._dispatchCall(61451,"AttachmentAdd", DISPATCH_METHOD,null,Dispatch.param(Attachment));
  }
  @DeclDISPID(61452)  public void onAttachmentRead(final com.wilutions.mslib.outlook.Attachment Attachment) throws ComException {
    this._dispatchCall(61452,"AttachmentRead", DISPATCH_METHOD,null,Dispatch.param(Attachment));
  }
  @DeclDISPID(61453)  public void onBeforeAttachmentSave(final com.wilutions.mslib.outlook.Attachment Attachment, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61453,"BeforeAttachmentSave", DISPATCH_METHOD,null,Dispatch.param(Attachment),Cancel);
  }
  public ItemEventsImpl(String progId) throws ComException {
    super(progId, "{0006303A-0000-0000-C000-000000000046}");
  }
  protected ItemEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ItemEventsImpl" + super.toString() + "]";
  }
}
