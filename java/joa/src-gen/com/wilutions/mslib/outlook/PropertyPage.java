/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * PropertyPage.
 * 
 */
@CoInterface(guid="{0006307E-0000-0000-C000-000000000046}")
public interface PropertyPage extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(8448)  public void GetPageInfo(final ByRef<String> HelpFile, final ByRef<Integer> HelpContext) throws ComException;
  @DeclDISPID(8449)  public Boolean getDirty() throws ComException;
  @DeclDISPID(8450)  public void Apply() throws ComException;
}
