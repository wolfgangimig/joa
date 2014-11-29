/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IConverterUICallback.
 * 
 */
@CoInterface(guid="{000C03D6-0000-0000-C000-000000000046}")
public interface IConverterUICallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void HrReportProgress(Integer uPercentComplete) throws ComException;
  @DeclDISPID(2)  public void HrMessageBox(String bstrText, String bstrCaption, Integer uType, ByRef<Integer> pidResult) throws ComException;
  @DeclDISPID(3)  public void HrInputBox(String bstrText, String bstrCaption, ByRef<String> pbstrInput, Integer fPassword) throws ComException;
}
