/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceRegionalAccessNumber.
 * ConferenceRegionalAccessNumber Class 
 */
@CoClass(guid="{B82A9C56-654D-4A24-B308-ABA49F65183A}")
public class ConferenceRegionalAccessNumber extends Dispatch implements IConferenceRegionalAccessNumber {
  @DeclDISPID(1610743808)  public String getAccessNumber() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"AccessNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public Integer getLanguageId() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"LanguageId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public ConferenceRegionalAccessNumber() throws ComException {
    super("{B82A9C56-654D-4A24-B308-ABA49F65183A}", "{9244D573-914F-4C1F-93F6-31609A95CBED}");
  }
  protected ConferenceRegionalAccessNumber(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceRegionalAccessNumber" + super.toString() + "]";
  }
}
