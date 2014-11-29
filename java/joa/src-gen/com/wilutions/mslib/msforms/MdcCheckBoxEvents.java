/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * MdcCheckBoxEvents.
 * 
 */
@CoInterface(guid="{8BD21D42-EC42-11CE-9E0D-00AA006002F3}")
public interface MdcCheckBoxEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(3)  public void onBeforeDragOver(ReturnBoolean Cancel, DataObject Data, Float X, Float Y, fmDragState DragState, ReturnEffect Effect, Short Shift) throws ComException;
  @DeclDISPID(4)  public void onBeforeDropOrPaste(ReturnBoolean Cancel, fmAction Action, DataObject Data, Float X, Float Y, ReturnEffect Effect, Short Shift) throws ComException;
  @DeclDISPID(2)  public void onChange() throws ComException;
  @DeclDISPID(-610)  public void onClick() throws ComException;
  @DeclDISPID(-601)  public void onDblClick(ReturnBoolean Cancel) throws ComException;
  @DeclDISPID(-608)  public void onError(Short Number, ReturnString Description, Integer SCode, String Source, String HelpFile, Integer HelpContext, ReturnBoolean CancelDisplay) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(ReturnInteger KeyCode, Short Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(ReturnInteger KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(ReturnInteger KeyCode, Short Shift) throws ComException;
  @DeclDISPID(-605)  public void onMouseDown(Short Button, Short Shift, Float X, Float Y) throws ComException;
  @DeclDISPID(-606)  public void onMouseMove(Short Button, Short Shift, Float X, Float Y) throws ComException;
  @DeclDISPID(-607)  public void onMouseUp(Short Button, Short Shift, Float X, Float Y) throws ComException;
}
