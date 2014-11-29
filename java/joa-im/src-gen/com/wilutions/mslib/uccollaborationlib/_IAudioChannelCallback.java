/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IAudioChannelCallback.
 * _IAudioChannelCallback Interface 
 */
@CoInterface(guid="{95B9A382-EA50-45E4-965E-BA61E7213DBA}")
public interface _IAudioChannelCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1260)  public void OnSendDtmf(IAudioChannel _source, IAsynchronousOperation _asyncOperation) throws ComException;
}
