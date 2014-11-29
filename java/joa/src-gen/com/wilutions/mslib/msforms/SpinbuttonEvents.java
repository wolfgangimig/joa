/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * SpinbuttonEvents.
 * 
 */
@CoInterface(guid="{79176FB2-B7F2-11CE-97EF-00AA006D2776}")
public interface SpinbuttonEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(3)  public void onBeforeDragOver(final ReturnBoolean Cancel, final DataObject Data, final Float X, final Float Y, final fmDragState DragState, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(4)  public void onBeforeDropOrPaste(final ReturnBoolean Cancel, final fmAction Action, final DataObject Data, final Float X, final Float Y, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(2)  public void onChange() throws ComException;
  @DeclDISPID(-608)  public void onError(final Short Number, final ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final ReturnBoolean CancelDisplay) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(final ReturnInteger KeyCode, final Short Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(final ReturnInteger KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(final ReturnInteger KeyCode, final Short Shift) throws ComException;
  @DeclDISPID(5)  public void onSpinUp() throws ComException;
  @DeclDISPID(6)  public void onSpinDown() throws ComException;
}
