/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole;
import com.wilutions.com.*;

/**
 * FontEvents.
 * Event interface for the Font object 
 */
@CoInterface(guid="{4EF6100A-AF88-11D0-9846-00C04FC29993}")
public interface FontEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(9)  public void onFontChanged(final String PropertyName) throws ComException;
}
