/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * EncryptionProvider.
 * 
 */
@CoInterface(guid="{000CD809-0000-0000-C000-000000000046}")
public interface EncryptionProvider extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Object GetProviderDetail(final EncryptionProviderDetail encprovdet) throws ComException;
  @DeclDISPID(1610743809)  public Integer NewSession(final Object ParentWindow) throws ComException;
  @DeclDISPID(1610743810)  public Integer Authenticate(final Object ParentWindow, final Object EncryptionData, final ByRef<Integer> PermissionsMask) throws ComException;
  @DeclDISPID(1610743811)  public Integer CloneSession(final Integer SessionHandle) throws ComException;
  @DeclDISPID(1610743812)  public void EndSession(final Integer SessionHandle) throws ComException;
  @DeclDISPID(1610743813)  public Integer Save(final Integer SessionHandle, final Object EncryptionData) throws ComException;
  @DeclDISPID(1610743814)  public void EncryptStream(final Integer SessionHandle, final String StreamName, final Object UnencryptedStream, final Object EncryptedStream) throws ComException;
  @DeclDISPID(1610743815)  public void DecryptStream(final Integer SessionHandle, final String StreamName, final Object EncryptedStream, final Object UnencryptedStream) throws ComException;
  @DeclDISPID(1610743816)  public void ShowSettings(final Integer SessionHandle, final Object ParentWindow, final Boolean ReadOnly, final ByRef<Boolean> Remove) throws ComException;
}
