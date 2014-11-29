/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IFoundFiles.
 * 
 */
@CoInterface(guid="{000C0338-0000-0000-C000-000000000046}")
public interface IFoundFiles extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(0)  public String getItem(Integer Index) throws ComException;
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
