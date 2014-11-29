/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IBlogPictureExtensibility.
 * 
 */
@CoInterface(guid="{000C03C5-0000-0000-C000-000000000046}")
public interface IBlogPictureExtensibility extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void BlogPictureProviderProperties(ByRef<String> BlogPictureProvider, ByRef<String> FriendlyName) throws ComException;
  @DeclDISPID(2)  public void CreatePictureAccount(String Account, String BlogProvider, Integer ParentWindow, IDispatch Document) throws ComException;
  @DeclDISPID(3)  public void PublishPicture(String Account, Integer ParentWindow, IDispatch Document, Object Image, ByRef<String> PictureURI, Integer ImageType) throws ComException;
}
