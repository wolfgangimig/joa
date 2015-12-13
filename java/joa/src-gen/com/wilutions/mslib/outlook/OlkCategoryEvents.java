/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkCategoryEvents.
 * 
 */
@CoInterface(guid="{000672F5-0000-0000-C000-000000000046}")
public interface OlkCategoryEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-600)  public void onClick() throws ComException;
  @DeclDISPID(-601)  public void onDoubleClick() throws ComException;
  @DeclDISPID(-605)  public void onMouseDown(final OlMouseButton Button, final OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException;
  @DeclDISPID(-606)  public void onMouseMove(final OlMouseButton Button, final OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException;
  @DeclDISPID(-607)  public void onMouseUp(final OlMouseButton Button, final OlShiftState Shift, final com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, final com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException;
  @DeclDISPID(-2147384830)  public void onEnter() throws ComException;
  @DeclDISPID(-2147384829)  public void onExit(final Boolean Cancel) throws ComException;
  @DeclDISPID(-602)  public void onKeyDown(final Integer KeyCode, final OlShiftState Shift) throws ComException;
  @DeclDISPID(-603)  public void onKeyPress(final Integer KeyAscii) throws ComException;
  @DeclDISPID(-604)  public void onKeyUp(final Integer KeyCode, final OlShiftState Shift) throws ComException;
  @DeclDISPID(2)  public void onChange() throws ComException;
}
