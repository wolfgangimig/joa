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
  @DeclDISPID(1)  public void BlogPictureProviderProperties(final ByRef<String> BlogPictureProvider, final ByRef<String> FriendlyName) throws ComException;
  @DeclDISPID(2)  public void CreatePictureAccount(final String Account, final String BlogProvider, final Integer ParentWindow, final IDispatch Document) throws ComException;
  @DeclDISPID(3)  public void PublishPicture(final String Account, final Integer ParentWindow, final IDispatch Document, final Object Image, final ByRef<String> PictureURI, final Integer ImageType) throws ComException;
}
