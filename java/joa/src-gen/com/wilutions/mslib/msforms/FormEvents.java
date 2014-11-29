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
  @DeclDISPID(768)  public void onAddControl(Control Control) throws ComException;
  @DeclDISPID(3)  public void onBeforeDragOver(ReturnBoolean Cancel, Control Control, DataObject Data, Float X, Float Y, fmDragState State, ReturnEffect Effect, Short Shift) throws ComException;
  @DeclDISPID(4)  public void onBeforeDropOrPaste(ReturnBoolean Cancel, Control Control, fmAction Action, DataObject Data, Float X, Float Y, ReturnEffect Effect, Short Shift) throws ComException;
  @DeclDISPID(-600)  public void onClick() throws ComException;
  @DeclDISPID(-601)  public void onDblClick(ReturnBoolean Cancel) throws ComException;
  @DeclDISPID(-608)  public void onError(Short Number, ReturnString Description, Integer SCode, String Source, String HelpFile, Integer HelpContext, ReturnBoolean CancelDisplay) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(ReturnInteger KeyCode, Short Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(ReturnInteger KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(ReturnInteger KeyCode, Short Shift) throws ComException;
  @DeclDISPID(770)  public void onLayout() throws ComException;
  @DeclDISPID(-605)  public void onMouseDown(Short Button, Short Shift, Float X, Float Y) throws ComException;
  @DeclDISPID(-606)  public void onMouseMove(Short Button, Short Shift, Float X, Float Y) throws ComException;
  @DeclDISPID(-607)  public void onMouseUp(Short Button, Short Shift, Float X, Float Y) throws ComException;
  @DeclDISPID(771)  public void onRemoveControl(Control Control) throws ComException;
  @DeclDISPID(772)  public void onScroll(fmScrollAction ActionX, fmScrollAction ActionY, Float RequestDx, Float RequestDy, ReturnSingle ActualDx, ReturnSingle ActualDy) throws ComException;
  @DeclDISPID(773)  public void onZoom(ByRef<Short> Percent) throws ComException;
}
