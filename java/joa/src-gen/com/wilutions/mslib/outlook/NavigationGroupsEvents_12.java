/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * NavigationGroupsEvents_12.
 * 
 */
@CoInterface(guid="{000630F4-0000-0000-C000-000000000046}")
public interface NavigationGroupsEvents_12 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(64458)  public void onSelectedChange(NavigationFolder NavigationFolder) throws ComException;
  @DeclDISPID(64459)  public void onNavigationFolderAdd(NavigationFolder NavigationFolder) throws ComException;
  @DeclDISPID(64460)  public void onNavigationFolderRemove() throws ComException;
}
