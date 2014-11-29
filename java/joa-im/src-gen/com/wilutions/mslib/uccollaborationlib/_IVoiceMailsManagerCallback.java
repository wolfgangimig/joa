/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IVoiceMailsManagerCallback.
 * _IVoiceMailsManagerCallback Interface 
 */
@CoInterface(guid="{D9D04B55-D820-4D5B-A690-658A49368478}")
public interface _IVoiceMailsManagerCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(4110)  public void OnGetUnreadVoiceMails(IVoiceMailsManager _source, IVoiceMailCollection _items, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4111)  public void OnGetAllVoiceMails(IVoiceMailsManager _source, IVoiceMailCollection _items, IAsynchronousOperation _asyncOperation) throws ComException;
}
