/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * MdcOptionButtonEvents.
 * 
 */
@CoInterface(guid="{8BD21D52-EC42-11CE-9E0D-00AA006002F3}")
public interface MdcOptionButtonEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(3)  public void onBeforeDragOver(final ReturnBoolean Cancel, final DataObject Data, final Float X, final Float Y, final fmDragState DragState, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(4)  public void onBeforeDropOrPaste(final ReturnBoolean Cancel, final fmAction Action, final DataObject Data, final Float X, final Float Y, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(2)  public void onChange() throws ComException;
  @DeclDISPID(-610)  public void onClick() throws ComException;
  @DeclDISPID(-601)  public void onDblClick(final ReturnBoolean Cancel) throws ComException;
  @DeclDISPID(-608)  public void onError(final Short Number, final ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final ReturnBoolean CancelDisplay) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(final ReturnInteger KeyCode, final Short Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(final ReturnInteger KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(final ReturnInteger KeyCode, final Short Shift) throws ComException;
  @DeclDISPID(-605)  public void onMouseDown(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
  @DeclDISPID(-606)  public void onMouseMove(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
  @DeclDISPID(-607)  public void onMouseUp(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
}
