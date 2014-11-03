/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * EncryptionProvider.
 * 
 */
@CoInterface(guid="{000CD809-0000-0000-C000-000000000046}")
public interface EncryptionProvider extends IDispatch {
  @DeclDISPID(1610743808)  public Object GetProviderDetail(EncryptionProviderDetail encprovdet) throws ComException;
  @DeclDISPID(1610743809)  public Integer NewSession(Object ParentWindow) throws ComException;
  @DeclDISPID(1610743810)  public Integer Authenticate(Object ParentWindow, Object EncryptionData, ByRef<Integer> PermissionsMask) throws ComException;
  @DeclDISPID(1610743811)  public Integer CloneSession(Integer SessionHandle) throws ComException;
  @DeclDISPID(1610743812)  public void EndSession(Integer SessionHandle) throws ComException;
  @DeclDISPID(1610743813)  public Integer Save(Integer SessionHandle, Object EncryptionData) throws ComException;
  @DeclDISPID(1610743814)  public void EncryptStream(Integer SessionHandle, String StreamName, Object UnencryptedStream, Object EncryptedStream) throws ComException;
  @DeclDISPID(1610743815)  public void DecryptStream(Integer SessionHandle, String StreamName, Object EncryptedStream, Object UnencryptedStream) throws ComException;
  @DeclDISPID(1610743816)  public void ShowSettings(Integer SessionHandle, Object ParentWindow, Boolean ReadOnly, ByRef<Boolean> Remove) throws ComException;
}
