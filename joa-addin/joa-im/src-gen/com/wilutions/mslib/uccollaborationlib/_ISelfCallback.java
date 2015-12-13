/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _ISelfCallback.
 * _ISelfCallback Interface 
 */
@CoInterface(guid="{A9AAB6A0-54B9-4419-AAAF-6B26DFAC1585}")
public interface _ISelfCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1751)  public void OnSetPhones(final ISelf _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1752)  public void OnSetPhone(final ISelf _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1753)  public void OnRemovePhone(final ISelf _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1754)  public void OnPublishContactInformation(final ISelf _source, final IAsynchronousOperation _asyncOperation) throws ComException;
}
