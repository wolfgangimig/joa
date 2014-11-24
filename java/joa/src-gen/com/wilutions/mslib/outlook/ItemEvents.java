/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ItemEvents.
 * 
 */
@CoInterface(guid="{0006303A-0000-0000-C000-000000000046}")
public interface ItemEvents extends IDispatch {
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
}
