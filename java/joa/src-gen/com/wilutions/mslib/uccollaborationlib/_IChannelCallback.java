/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IChannelCallback.
 * _IChannelCallback Interface 
 */
@CoInterface(guid="{08E1E9CF-A7E4-43BE-AE8E-B223CE71E46E}")
public interface _IChannelCallback extends IDispatch {
  @DeclDISPID(1280)  public void OnStart(IChannel _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1281)  public void OnStop(IChannel _source, IAsynchronousOperation _asyncOperation) throws ComException;
}
