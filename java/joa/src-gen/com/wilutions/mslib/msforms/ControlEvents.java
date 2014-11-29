/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ControlEvents.
 * 
 */
@CoInterface(guid="{9A4BBF53-4E46-101B-8BBD-00AA003E3B29}")
public interface ControlEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-2147384830)  public void onEnter() throws ComException;
  @DeclDISPID(-2147384829)  public void onExit(final ReturnBoolean Cancel) throws ComException;
  @DeclDISPID(-2147384831)  public void onBeforeUpdate(final ReturnBoolean Cancel) throws ComException;
  @DeclDISPID(-2147384832)  public void onAfterUpdate() throws ComException;
}
