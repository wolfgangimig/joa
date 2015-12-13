/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ItemEvents.
 * 
 */
@CoInterface(guid="{0006303A-0000-0000-C000-000000000046}")
public interface ItemEvents extends IDispatch {
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
}
