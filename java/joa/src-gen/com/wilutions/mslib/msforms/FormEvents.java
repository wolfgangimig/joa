/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * FormEvents.
 * 
 */
@CoInterface(guid="{5B9D8FC8-4A71-101B-97A6-00000B65C08B}")
public interface FormEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(768)  public void onAddControl(final Control Control) throws ComException;
  @DeclDISPID(3)  public void onBeforeDragOver(final ReturnBoolean Cancel, final Control Control, final DataObject Data, final Float X, final Float Y, final fmDragState State, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(4)  public void onBeforeDropOrPaste(final ReturnBoolean Cancel, final Control Control, final fmAction Action, final DataObject Data, final Float X, final Float Y, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(-600)  public void onClick() throws ComException;
  @DeclDISPID(-601)  public void onDblClick(final ReturnBoolean Cancel) throws ComException;
  @DeclDISPID(-608)  public void onError(final Short Number, final ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final ReturnBoolean CancelDisplay) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(final ReturnInteger KeyCode, final Short Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(final ReturnInteger KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(final ReturnInteger KeyCode, final Short Shift) throws ComException;
  @DeclDISPID(770)  public void onLayout() throws ComException;
  @DeclDISPID(-605)  public void onMouseDown(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
  @DeclDISPID(-606)  public void onMouseMove(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
  @DeclDISPID(-607)  public void onMouseUp(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
  @DeclDISPID(771)  public void onRemoveControl(final Control Control) throws ComException;
  @DeclDISPID(772)  public void onScroll(final fmScrollAction ActionX, final fmScrollAction ActionY, final Float RequestDx, final Float RequestDy, final ReturnSingle ActualDx, final ReturnSingle ActualDy) throws ComException;
  @DeclDISPID(773)  public void onZoom(final ByRef<Short> Percent) throws ComException;
}
