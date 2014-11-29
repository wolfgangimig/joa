/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joactrllib;
import com.wilutions.com.*;

/**
 * _IJoaBridgeDialogEvents.
 * 
 */
@CoInterface(guid="{21510D80-0112-4214-B91A-2D332BC41874}")
public interface _IJoaBridgeDialogEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void onShow(Long HWND) throws ComException;
  @DeclDISPID(2)  public void onClosed() throws ComException;
  @DeclDISPID(3)  public void onSystemMenuClose() throws ComException;
}
