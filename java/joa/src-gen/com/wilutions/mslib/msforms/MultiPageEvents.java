/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * MultiPageEvents.
 * 
 */
@CoInterface(guid="{7B020EC8-AF6C-11CE-9F46-00AA00574A4F}")
public interface MultiPageEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(768)  public void onAddControl(final Integer Index, final Control Control) throws ComException;
  @DeclDISPID(3)  public void onBeforeDragOver(final Integer Index, final ReturnBoolean Cancel, final Control Control, final DataObject Data, final Float X, final Float Y, final fmDragState State, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(4)  public void onBeforeDropOrPaste(final Integer Index, final ReturnBoolean Cancel, final Control Control, final fmAction Action, final DataObject Data, final Float X, final Float Y, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(2)  public void onChange() throws ComException;
  @DeclDISPID(-600)  public void onClick(final Integer Index) throws ComException;
  @DeclDISPID(-601)  public void onDblClick(final Integer Index, final ReturnBoolean Cancel) throws ComException;
  @DeclDISPID(-608)  public void onError(final Integer Index, final Short Number, final ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final ReturnBoolean CancelDisplay) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(final ReturnInteger KeyCode, final Short Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(final ReturnInteger KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(final ReturnInteger KeyCode, final Short Shift) throws ComException;
  @DeclDISPID(770)  public void onLayout(final Integer Index) throws ComException;
  @DeclDISPID(-605)  public void onMouseDown(final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
  @DeclDISPID(-606)  public void onMouseMove(final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
  @DeclDISPID(-607)  public void onMouseUp(final Integer Index, final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
  @DeclDISPID(771)  public void onRemoveControl(final Integer Index, final Control Control) throws ComException;
  @DeclDISPID(772)  public void onScroll(final Integer Index, final fmScrollAction ActionX, final fmScrollAction ActionY, final Float RequestDx, final Float RequestDy, final ReturnSingle ActualDx, final ReturnSingle ActualDy) throws ComException;
  @DeclDISPID(773)  public void onZoom(final Integer Index, final ByRef<Short> Percent) throws ComException;
}
