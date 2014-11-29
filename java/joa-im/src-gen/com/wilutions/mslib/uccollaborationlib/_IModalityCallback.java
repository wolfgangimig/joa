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
  @DeclDISPID(1230)  public void OnConnect(IModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1231)  public void OnDisconnect(IModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1232)  public void OnHold(IModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1233)  public void OnRetrieve(IModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1234)  public void OnForward(IModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1235)  public void OnSetComposing(IModality _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1236)  public void OnTransfer(IModality _source, ModalityState _targetState, String[] contextProperties, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1237)  public void OnConsultativeTransfer(IModality _source, ModalityState _targetState, String[] _contextProperties, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1238)  public void OnSetProperty(IModality _source, ModalityProperty _propertyType, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1239)  public void OnSendMessage(IModality _source, String _message, INamedPropertyList _formats, IParticipantCollection _participants, IAsynchronousOperation _asyncOperation) throws ComException;
}
