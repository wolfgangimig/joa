/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _FormRegionStartup.
 * 
 */
@CoInterface(guid="{00063059-0000-0000-C000-000000000046}")
public interface _FormRegionStartup extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(64310)  public Object GetFormRegionStorage(final String FormRegionName, final IDispatch Item, final Integer LCID, final OlFormRegionMode FormRegionMode, final OlFormRegionSize FormRegionSize) throws ComException;
  @DeclDISPID(64317)  public void BeforeFormRegionShow(final FormRegion FormRegion) throws ComException;
  @DeclDISPID(64563)  public Object GetFormRegionManifest(final String FormRegionName, final Integer LCID) throws ComException;
  @DeclDISPID(64564)  public Object GetFormRegionIcon(final String FormRegionName, final Integer LCID, final OlFormRegionIcon Icon) throws ComException;
}
