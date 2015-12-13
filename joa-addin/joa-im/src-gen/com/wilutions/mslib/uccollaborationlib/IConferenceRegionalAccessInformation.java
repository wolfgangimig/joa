/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceRegionalAccessInformation.
 * IConferenceRegionalAccessInformation Interface 
 */
@CoInterface(guid="{420A24E2-5C31-4262-9BD5-058682300ED6}")
public interface IConferenceRegionalAccessInformation extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getRegionName() throws ComException;
  @DeclDISPID(1610743809)  public String getDefaultAccessNumber() throws ComException;
  @DeclDISPID(1610743810)  public Integer getDefaultLanguageId() throws ComException;
  @DeclDISPID(1610743811)  public IConferenceRegionalAccessNumberCollection getAccessNumbers() throws ComException;
}
