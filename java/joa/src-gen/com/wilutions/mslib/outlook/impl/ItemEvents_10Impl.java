/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A940-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ItemEvents_10Impl extends Dispatch implements com.wilutions.mslib.outlook.ItemEvents_10 {
  @DeclDISPID(61443)  public void onOpen(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61443,"Open", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61446)  public void onCustomAction(IDispatch Action, IDispatch Response, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61446,"CustomAction", DISPATCH_METHOD,null,(Action!=null?Action:Dispatch.NULL),(Response!=null?Response:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(61448)  public void onCustomPropertyChange(String Name) throws ComException {
    assert(Name != null);
    this._dispatchCall(61448,"CustomPropertyChange", DISPATCH_METHOD,null,Name);
  }
  @DeclDISPID(62568)  public void onForward(IDispatch Forward, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(62568,"Forward", DISPATCH_METHOD,null,(Forward!=null?Forward:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(61444)  public void onClose(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61444,"Close", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61449)  public void onPropertyChange(String Name) throws ComException {
    assert(Name != null);
    this._dispatchCall(61449,"PropertyChange", DISPATCH_METHOD,null,Name);
  }
  @DeclDISPID(61441)  public void onRead() throws ComException {
    this._dispatchCall(61441,"Read", DISPATCH_METHOD,null);
  }
  @DeclDISPID(62566)  public void onReply(IDispatch Response, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(62566,"Reply", DISPATCH_METHOD,null,(Response!=null?Response:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(62567)  public void onReplyAll(IDispatch Response, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(62567,"ReplyAll", DISPATCH_METHOD,null,(Response!=null?Response:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(61445)  public void onSend(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61445,"Send", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61442)  public void onWrite(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61442,"Write", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61450)  public void onBeforeCheckNames(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61450,"BeforeCheckNames", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61451)  public void onAttachmentAdd(com.wilutions.mslib.outlook.Attachment Attachment) throws ComException {
    this._dispatchCall(61451,"AttachmentAdd", DISPATCH_METHOD,null,(Attachment!=null?Attachment:Dispatch.NULL));
  }
  @DeclDISPID(61452)  public void onAttachmentRead(com.wilutions.mslib.outlook.Attachment Attachment) throws ComException {
    this._dispatchCall(61452,"AttachmentRead", DISPATCH_METHOD,null,(Attachment!=null?Attachment:Dispatch.NULL));
  }
  @DeclDISPID(61453)  public void onBeforeAttachmentSave(com.wilutions.mslib.outlook.Attachment Attachment, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61453,"BeforeAttachmentSave", DISPATCH_METHOD,null,(Attachment!=null?Attachment:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(64117)  public void onBeforeDelete(IDispatch Item, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64117,"BeforeDelete", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(64430)  public void onAttachmentRemove(com.wilutions.mslib.outlook.Attachment Attachment) throws ComException {
    this._dispatchCall(64430,"AttachmentRemove", DISPATCH_METHOD,null,(Attachment!=null?Attachment:Dispatch.NULL));
  }
  @DeclDISPID(64432)  public void onBeforeAttachmentAdd(com.wilutions.mslib.outlook.Attachment Attachment, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64432,"BeforeAttachmentAdd", DISPATCH_METHOD,null,(Attachment!=null?Attachment:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(64431)  public void onBeforeAttachmentPreview(com.wilutions.mslib.outlook.Attachment Attachment, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64431,"BeforeAttachmentPreview", DISPATCH_METHOD,null,(Attachment!=null?Attachment:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(64427)  public void onBeforeAttachmentRead(com.wilutions.mslib.outlook.Attachment Attachment, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64427,"BeforeAttachmentRead", DISPATCH_METHOD,null,(Attachment!=null?Attachment:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(64434)  public void onBeforeAttachmentWriteToTempFile(com.wilutions.mslib.outlook.Attachment Attachment, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64434,"BeforeAttachmentWriteToTempFile", DISPATCH_METHOD,null,(Attachment!=null?Attachment:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(64429)  public void onUnload() throws ComException {
    this._dispatchCall(64429,"Unload", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64514)  public void onBeforeAutoSave(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64514,"BeforeAutoSave", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64652)  public void onBeforeRead() throws ComException {
    this._dispatchCall(64652,"BeforeRead", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64653)  public void onAfterWrite() throws ComException {
    this._dispatchCall(64653,"AfterWrite", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64655)  public void onReadComplete(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64655,"ReadComplete", DISPATCH_METHOD,null,Cancel);
  }
  public ItemEvents_10Impl(String progId) throws ComException {
    super(progId, "{0006302B-0000-0000-C000-000000000046}");
  }
  protected ItemEvents_10Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ItemEvents_10Impl" + super.toString() + "]";
  }
}
