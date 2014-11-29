/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ICTPFactory.
 * 
 */
@CoInterface(guid="{000C033D-0000-0000-C000-000000000046}")
public interface ICTPFactory extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public _CustomTaskPane CreateCTP(String CTPAxID, String CTPTitle, Object CTPParentWindow) throws ComException;
}
