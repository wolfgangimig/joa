/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IRibbonExtensibility.
 * 
 */
@CoInterface(guid="{000C0396-0000-0000-C000-000000000046}")
public interface IRibbonExtensibility extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public String GetCustomUI(String RibbonID) throws ComException;
}
