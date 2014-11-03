/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * SpinbuttonEvents.
 * 
 */
@CoInterface(guid="{79176FB2-B7F2-11CE-97EF-00AA006D2776}")
public interface SpinbuttonEvents extends IDispatch {
  @DeclDISPID(3)  public void onBeforeDragOver(ReturnBoolean Cancel, DataObject Data, Float X, Float Y, fmDragState DragState, ReturnEffect Effect, Short Shift) throws ComException;
  @DeclDISPID(4)  public void onBeforeDropOrPaste(ReturnBoolean Cancel, fmAction Action, DataObject Data, Float X, Float Y, ReturnEffect Effect, Short Shift) throws ComException;
  @DeclDISPID(2)  public void onChange() throws ComException;
  @DeclDISPID(-608)  public void onError(Short Number, ReturnString Description, Integer SCode, String Source, String HelpFile, Integer HelpContext, ReturnBoolean CancelDisplay) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(ReturnInteger KeyCode, Short Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(ReturnInteger KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(ReturnInteger KeyCode, Short Shift) throws ComException;
  @DeclDISPID(5)  public void onSpinUp() throws ComException;
  @DeclDISPID(6)  public void onSpinDown() throws ComException;
}
