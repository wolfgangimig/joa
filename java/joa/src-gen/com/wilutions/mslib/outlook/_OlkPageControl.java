/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OlkPageControl.
 * 
 */
@CoInterface(guid="{000672F8-0000-0000-C000-000000000046}")
public interface _OlkPageControl extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(64465)  public OlPageType getPage() throws ComException;
  @DeclDISPID(64465)  public void setPage(final OlPageType value) throws ComException;
}
