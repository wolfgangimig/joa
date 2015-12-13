/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IChannel2Callback.
 * _IChannel2Callback Interface 
 */
@CoInterface(guid="{70986DCE-4AA8-4DFB-9A45-4BFCF7A206F5}")
public interface _IChannel2Callback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(5160)  public void OnPause(final IChannel2 _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(5161)  public void OnResume(final IChannel2 _source, final IAsynchronousOperation _asyncOperation) throws ComException;
}
