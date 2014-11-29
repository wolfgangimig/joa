/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IChannel2.
 * IChannel2 Interface 
 */
@CoInterface(guid="{7B39CB77-4AEB-42D7-B351-CB5472C1C6AD}")
public interface IChannel2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public IAsynchronousOperation Pause(Object _callback, Object _state) throws ComException;
  @DeclDISPID(268435458)  public IAsynchronousOperation Resume(Object _callback, Object _state) throws ComException;
}
