/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ScrollbarEvents.
 * 
 */
@CoInterface(guid="{7B020EC2-AF6C-11CE-9F46-00AA00574A4F}")
public interface ScrollbarEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(3)  public void onBeforeDragOver(final ReturnBoolean Cancel, final DataObject Data, final Float X, final Float Y, final fmDragState DragState, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(4)  public void onBeforeDropOrPaste(final ReturnBoolean Cancel, final fmAction Action, final DataObject Data, final Float X, final Float Y, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(2)  public void onChange() throws ComException;
  @DeclDISPID(-608)  public void onError(final Short Number, final ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final ReturnBoolean CancelDisplay) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(final ReturnInteger KeyCode, final Short Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(final ReturnInteger KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(final ReturnInteger KeyCode, final Short Shift) throws ComException;
  @DeclDISPID(7)  public void onScroll() throws ComException;
}
