/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IModalityCallback.
 * _IModalityCallback Interface 
 */
@CoInterface(guid="{3F60CFF7-BE3F-4404-8395-C02D0CDD318E}")
public interface _IModalityCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1230)  public void OnConnect(final IModality _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1231)  public void OnDisconnect(final IModality _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1232)  public void OnHold(final IModality _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1233)  public void OnRetrieve(final IModality _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1234)  public void OnForward(final IModality _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1235)  public void OnSetComposing(final IModality _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1236)  public void OnTransfer(final IModality _source, final ModalityState _targetState, final String[] contextProperties, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1237)  public void OnConsultativeTransfer(final IModality _source, final ModalityState _targetState, final String[] _contextProperties, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1238)  public void OnSetProperty(final IModality _source, final ModalityProperty _propertyType, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1239)  public void OnSendMessage(final IModality _source, final String _message, final INamedPropertyList _formats, final IParticipantCollection _participants, final IAsynchronousOperation _asyncOperation) throws ComException;
}
