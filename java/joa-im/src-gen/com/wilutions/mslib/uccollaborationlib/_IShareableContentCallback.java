/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IShareableContentCallback.
 * _IAutomationCallback Interface 
 */
@CoInterface(guid="{3187885C-A8AF-4D4B-8E80-F4B9D447A7B2}")
public interface _IShareableContentCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(5110)  public void OnDownloadFile(final IShareableContent _source, final String _localPath, final IAsynchronousOperation _asyncOperation) throws ComException;
}
