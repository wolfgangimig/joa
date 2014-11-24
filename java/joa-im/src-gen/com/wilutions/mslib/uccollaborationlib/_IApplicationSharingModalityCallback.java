/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IApplicationSharingModalityCallback.
 * _IApplicationSharingModalityCallback Interface 
 */
@CoInterface(guid="{8684D3AD-7061-4056-A894-EBF1270ADB9B}")
public interface _IApplicationSharingModalityCallback extends IDispatch {
  @DeclDISPID(1400)  public void OnStartSharing(IApplicationSharingModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1401)  public void OnRequestControl(IApplicationSharingModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1402)  public void OnReleaseControl(IApplicationSharingModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1403)  public void OnGrantControl(IApplicationSharingModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1404)  public void OnRevokeControl(IApplicationSharingModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1405)  public void OnAcceptControlRequest(IApplicationSharingModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1406)  public void OnDeclineControlRequest(IApplicationSharingModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
}
