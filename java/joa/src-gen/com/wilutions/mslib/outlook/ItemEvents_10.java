/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ItemEvents_10.
 * 
 */
@CoInterface(guid="{0006302B-0000-0000-C000-000000000046}")
public interface ItemEvents_10 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61443)  public void onOpen(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61446)  public void onCustomAction(final IDispatch Action, final IDispatch Response, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61448)  public void onCustomPropertyChange(final String Name) throws ComException;
  @DeclDISPID(62568)  public void onForward(final IDispatch Forward, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61444)  public void onClose(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61449)  public void onPropertyChange(final String Name) throws ComException;
  @DeclDISPID(61441)  public void onRead() throws ComException;
  @DeclDISPID(62566)  public void onReply(final IDispatch Response, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(62567)  public void onReplyAll(final IDispatch Response, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61445)  public void onSend(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61442)  public void onWrite(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61450)  public void onBeforeCheckNames(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61451)  public void onAttachmentAdd(final Attachment Attachment) throws ComException;
  @DeclDISPID(61452)  public void onAttachmentRead(final Attachment Attachment) throws ComException;
  @DeclDISPID(61453)  public void onBeforeAttachmentSave(final Attachment Attachment, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64117)  public void onBeforeDelete(final IDispatch Item, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64430)  public void onAttachmentRemove(final Attachment Attachment) throws ComException;
  @DeclDISPID(64432)  public void onBeforeAttachmentAdd(final Attachment Attachment, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64431)  public void onBeforeAttachmentPreview(final Attachment Attachment, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64427)  public void onBeforeAttachmentRead(final Attachment Attachment, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64434)  public void onBeforeAttachmentWriteToTempFile(final Attachment Attachment, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64429)  public void onUnload() throws ComException;
  @DeclDISPID(64514)  public void onBeforeAutoSave(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64652)  public void onBeforeRead() throws ComException;
  @DeclDISPID(64653)  public void onAfterWrite() throws ComException;
  @DeclDISPID(64655)  public void onReadComplete(final ByRef<Boolean> Cancel) throws ComException;
}
