/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IConverterApplicationPreferences.
 * 
 */
@CoInterface(guid="{000C03D5-0000-0000-C000-000000000046}")
public interface IConverterApplicationPreferences extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void HrGetLcid(ByRef<Integer> plcid) throws ComException;
  @DeclDISPID(2)  public void HrGetHwnd(ByRef<Integer> phwnd) throws ComException;
  @DeclDISPID(3)  public void HrGetApplication(ByRef<String> pbstrApplication) throws ComException;
  @DeclDISPID(4)  public void HrCheckFormat(ByRef<Integer> pFormat) throws ComException;
}
