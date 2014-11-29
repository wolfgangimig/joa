/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _ILyncClientCallback.
 * _ILyncClientCallback Interface 
 */
@CoInterface(guid="{B26F6403-761E-48D4-84E2-619C17EAEB13}")
public interface _ILyncClientCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public void OnSignIn(final ILyncClient _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(151)  public void OnSignOut(final ILyncClient _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(152)  public void OnInitialize(final ILyncClient _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(153)  public void OnShutdown(final ILyncClient _source, final IAsynchronousOperation _asyncOperation) throws ComException;
}
