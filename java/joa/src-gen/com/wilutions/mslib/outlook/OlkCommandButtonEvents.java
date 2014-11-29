/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkCommandButtonEvents.
 * 
 */
@CoInterface(guid="{000672E0-0000-0000-C000-000000000046}")
public interface OlkCommandButtonEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-600)  public void onClick() throws ComException;
  @DeclDISPID(-601)  public void onDoubleClick() throws ComException;
  @DeclDISPID(-605)  public void onMouseDown(OlMouseButton Button, OlShiftState Shift, com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException;
  @DeclDISPID(-606)  public void onMouseMove(OlMouseButton Button, OlShiftState Shift, com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException;
  @DeclDISPID(-607)  public void onMouseUp(OlMouseButton Button, OlShiftState Shift, com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException;
  @DeclDISPID(-2147384830)  public void onEnter() throws ComException;
  @DeclDISPID(-2147384829)  public void onExit(Boolean Cancel) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(Integer KeyCode, OlShiftState Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(Integer KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(Integer KeyCode, OlShiftState Shift) throws ComException;
  @DeclDISPID(-2147384832)  public void onAfterUpdate() throws ComException;
  @DeclDISPID(-2147384831)  public void onBeforeUpdate(Boolean Cancel) throws ComException;
}
