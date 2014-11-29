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
  @DeclDISPID(768)  public void onAddControl(Integer Index, Control Control) throws ComException;
  @DeclDISPID(3)  public void onBeforeDragOver(Integer Index, ReturnBoolean Cancel, Control Control, DataObject Data, Float X, Float Y, fmDragState State, ReturnEffect Effect, Short Shift) throws ComException;
  @DeclDISPID(4)  public void onBeforeDropOrPaste(Integer Index, ReturnBoolean Cancel, Control Control, fmAction Action, DataObject Data, Float X, Float Y, ReturnEffect Effect, Short Shift) throws ComException;
  @DeclDISPID(2)  public void onChange() throws ComException;
  @DeclDISPID(-600)  public void onClick(Integer Index) throws ComException;
  @DeclDISPID(-601)  public void onDblClick(Integer Index, ReturnBoolean Cancel) throws ComException;
  @DeclDISPID(-608)  public void onError(Integer Index, Short Number, ReturnString Description, Integer SCode, String Source, String HelpFile, Integer HelpContext, ReturnBoolean CancelDisplay) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(ReturnInteger KeyCode, Short Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(ReturnInteger KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(ReturnInteger KeyCode, Short Shift) throws ComException;
  @DeclDISPID(770)  public void onLayout(Integer Index) throws ComException;
  @DeclDISPID(-605)  public void onMouseDown(Integer Index, Short Button, Short Shift, Float X, Float Y) throws ComException;
  @DeclDISPID(-606)  public void onMouseMove(Integer Index, Short Button, Short Shift, Float X, Float Y) throws ComException;
  @DeclDISPID(-607)  public void onMouseUp(Integer Index, Short Button, Short Shift, Float X, Float Y) throws ComException;
  @DeclDISPID(771)  public void onRemoveControl(Integer Index, Control Control) throws ComException;
  @DeclDISPID(772)  public void onScroll(Integer Index, fmScrollAction ActionX, fmScrollAction ActionY, Float RequestDx, Float RequestDy, ReturnSingle ActualDx, ReturnSingle ActualDy) throws ComException;
  @DeclDISPID(773)  public void onZoom(Integer Index, ByRef<Short> Percent) throws ComException;
}
