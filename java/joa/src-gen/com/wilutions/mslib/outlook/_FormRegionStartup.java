/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _FormRegionStartup.
 * 
 */
@CoInterface(guid="{00063059-0000-0000-C000-000000000046}")
public interface _FormRegionStartup extends IDispatch {
  @DeclDISPID(64310)  public Object GetFormRegionStorage(String FormRegionName, Dispatch Item, Integer LCID, OlFormRegionMode FormRegionMode, OlFormRegionSize FormRegionSize) throws ComException;
  @DeclDISPID(64317)  public void BeforeFormRegionShow(FormRegion FormRegion) throws ComException;
  @DeclDISPID(64563)  public Object GetFormRegionManifest(String FormRegionName, Integer LCID) throws ComException;
  @DeclDISPID(64564)  public Object GetFormRegionIcon(String FormRegionName, Integer LCID, OlFormRegionIcon Icon) throws ComException;
}
