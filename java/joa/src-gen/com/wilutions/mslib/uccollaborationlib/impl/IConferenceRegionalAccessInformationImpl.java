/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{829DBD89-F852-9923-067B-6C6127C7F22C}")
public class IConferenceRegionalAccessInformationImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceRegionalAccessInformation {
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
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IConferenceRegionalAccessNumberCollection getAccessNumbers() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"AccessNumbers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConferenceRegionalAccessNumberCollectionImpl.class);
  }
  public IConferenceRegionalAccessInformationImpl(String progId) throws ComException {
    super(progId, "{420A24E2-5C31-4262-9BD5-058682300ED6}");
  }
  protected IConferenceRegionalAccessInformationImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceRegionalAccessInformationImpl" + super.toString() + "]";
  }
}
