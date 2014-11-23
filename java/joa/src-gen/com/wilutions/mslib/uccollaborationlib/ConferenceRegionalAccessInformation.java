/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceRegionalAccessInformation.
 * ConferenceRegionalAccessInformation Class 
 */
@CoClass(guid="{36815016-484E-41F5-9E54-B952F4B44400}")
public class ConferenceRegionalAccessInformation extends Dispatch implements IConferenceRegionalAccessInformation {
  @DeclDISPID(1610743808)  public String getRegionName() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"RegionName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getDefaultAccessNumber() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"DefaultAccessNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public Integer getDefaultLanguageId() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"DefaultLanguageId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743811)  public IConferenceRegionalAccessNumberCollection getAccessNumbers() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"AccessNumbers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConferenceRegionalAccessNumberCollectionImpl.class);
  }
  public ConferenceRegionalAccessInformation() throws ComException {
    super("{36815016-484E-41F5-9E54-B952F4B44400}", "{420A24E2-5C31-4262-9BD5-058682300ED6}");
  }
  protected ConferenceRegionalAccessInformation(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceRegionalAccessInformation" + super.toString() + "]";
  }
}
