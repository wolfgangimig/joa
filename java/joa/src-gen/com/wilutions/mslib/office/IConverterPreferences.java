/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IConverterPreferences.
 * 
 */
@CoInterface(guid="{000C03D4-0000-0000-C000-000000000046}")
public interface IConverterPreferences extends IDispatch {
  @DeclDISPID(1)  public void HrGetMacroEnabled(ByRef<Integer> pfMacroEnabled) throws ComException;
  @DeclDISPID(2)  public void HrCheckFormat(ByRef<Integer> pFormat) throws ComException;
  @DeclDISPID(3)  public void HrGetLossySave(ByRef<Integer> pfLossySave) throws ComException;
}
