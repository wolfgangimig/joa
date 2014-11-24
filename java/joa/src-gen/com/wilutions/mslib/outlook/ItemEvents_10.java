/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ItemEvents_10.
 * 
 */
@CoInterface(guid="{0006302B-0000-0000-C000-000000000046}")
public interface ItemEvents_10 extends IDispatch {
  @DeclDISPID(61443)  public void onOpen(ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61446)  public void onCustomAction(IDispatch Action, IDispatch Response, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61448)  public void onCustomPropertyChange(String Name) throws ComException;
  @DeclDISPID(62568)  public void onForward(IDispatch Forward, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61444)  public void onClose(ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61449)  public void onPropertyChange(String Name) throws ComException;
  @DeclDISPID(61441)  public void onRead() throws ComException;
  @DeclDISPID(62566)  public void onReply(IDispatch Response, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(62567)  public void onReplyAll(IDispatch Response, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61445)  public void onSend(ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61442)  public void onWrite(ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61450)  public void onBeforeCheckNames(ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61451)  public void onAttachmentAdd(Attachment Attachment) throws ComException;
  @DeclDISPID(61452)  public void onAttachmentRead(Attachment Attachment) throws ComException;
  @DeclDISPID(61453)  public void onBeforeAttachmentSave(Attachment Attachment, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64117)  public void onBeforeDelete(IDispatch Item, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64430)  public void onAttachmentRemove(Attachment Attachment) throws ComException;
  @DeclDISPID(64432)  public void onBeforeAttachmentAdd(Attachment Attachment, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64431)  public void onBeforeAttachmentPreview(Attachment Attachment, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64427)  public void onBeforeAttachmentRead(Attachment Attachment, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64434)  public void onBeforeAttachmentWriteToTempFile(Attachment Attachment, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64429)  public void onUnload() throws ComException;
  @DeclDISPID(64514)  public void onBeforeAutoSave(ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64652)  public void onBeforeRead() throws ComException;
  @DeclDISPID(64653)  public void onAfterWrite() throws ComException;
  @DeclDISPID(64655)  public void onReadComplete(ByRef<Boolean> Cancel) throws ComException;
}
