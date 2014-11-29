/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IChannelCallback.
 * _IChannelCallback Interface 
 */
@CoInterface(guid="{08E1E9CF-A7E4-43BE-AE8E-B223CE71E46E}")
public interface _IChannelCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1280)  public void OnStart(final IChannel _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1281)  public void OnStop(final IChannel _source, final IAsynchronousOperation _asyncOperation) throws ComException;
}
