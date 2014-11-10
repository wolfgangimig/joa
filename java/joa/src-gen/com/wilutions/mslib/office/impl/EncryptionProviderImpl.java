/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4162-A463-DB41-5DAE-69E7A5F7FCBC}")
public class EncryptionProviderImpl extends Dispatch implements com.wilutions.mslib.office.EncryptionProvider {
  @DeclDISPID(1610743808)  public Object GetProviderDetail(com.wilutions.mslib.office.EncryptionProviderDetail encprovdet) throws ComException {
    assert(encprovdet != null);
    final Object obj = this._dispatchCall(1610743808,"GetProviderDetail", DISPATCH_METHOD,null,encprovdet.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743809)  public Integer NewSession(Object ParentWindow) throws ComException {
    assert(ParentWindow != null);
    final Object obj = this._dispatchCall(1610743809,"NewSession", DISPATCH_METHOD,null,ParentWindow);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public Integer Authenticate(Object ParentWindow, Object EncryptionData, ByRef<Integer> PermissionsMask) throws ComException {
    assert(ParentWindow != null);
    assert(EncryptionData != null);
    assert(PermissionsMask != null);
    final Object obj = this._dispatchCall(1610743810,"Authenticate", DISPATCH_METHOD,null,ParentWindow,EncryptionData,PermissionsMask);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743811)  public Integer CloneSession(Integer SessionHandle) throws ComException {
    assert(SessionHandle != null);
    final Object obj = this._dispatchCall(1610743811,"CloneSession", DISPATCH_METHOD,null,SessionHandle);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743812)  public void EndSession(Integer SessionHandle) throws ComException {
    assert(SessionHandle != null);
    this._dispatchCall(1610743812,"EndSession", DISPATCH_METHOD,null,SessionHandle);
  }
  @DeclDISPID(1610743813)  public Integer Save(Integer SessionHandle, Object EncryptionData) throws ComException {
    assert(SessionHandle != null);
    assert(EncryptionData != null);
    final Object obj = this._dispatchCall(1610743813,"Save", DISPATCH_METHOD,null,SessionHandle,EncryptionData);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743814)  public void EncryptStream(Integer SessionHandle, String StreamName, Object UnencryptedStream, Object EncryptedStream) throws ComException {
    assert(SessionHandle != null);
    assert(StreamName != null);
    assert(UnencryptedStream != null);
    assert(EncryptedStream != null);
    this._dispatchCall(1610743814,"EncryptStream", DISPATCH_METHOD,null,SessionHandle,StreamName,UnencryptedStream,EncryptedStream);
  }
  @DeclDISPID(1610743815)  public void DecryptStream(Integer SessionHandle, String StreamName, Object EncryptedStream, Object UnencryptedStream) throws ComException {
    assert(SessionHandle != null);
    assert(StreamName != null);
    assert(EncryptedStream != null);
    assert(UnencryptedStream != null);
    this._dispatchCall(1610743815,"DecryptStream", DISPATCH_METHOD,null,SessionHandle,StreamName,EncryptedStream,UnencryptedStream);
  }
  @DeclDISPID(1610743816)  public void ShowSettings(Integer SessionHandle, Object ParentWindow, Boolean ReadOnly, ByRef<Boolean> Remove) throws ComException {
    assert(SessionHandle != null);
    assert(ParentWindow != null);
    assert(ReadOnly != null);
    assert(Remove != null);
    this._dispatchCall(1610743816,"ShowSettings", DISPATCH_METHOD,null,SessionHandle,ParentWindow,ReadOnly,Remove);
  }
  public EncryptionProviderImpl(String progId) throws ComException {
    super(progId);
  }
  protected EncryptionProviderImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[EncryptionProviderImpl" + super.toString() + "]";
  }
}
