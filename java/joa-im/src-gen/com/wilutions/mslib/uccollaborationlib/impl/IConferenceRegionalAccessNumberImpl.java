/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{52D34C18-352C-975E-0E58-58873F623717}")
public class IConferenceRegionalAccessNumberImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceRegionalAccessNumber {
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
  public IConferenceRegionalAccessNumberImpl(String progId) throws ComException {
    super(progId, "{9244D573-914F-4C1F-93F6-31609A95CBED}");
  }
  protected IConferenceRegionalAccessNumberImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceRegionalAccessNumberImpl" + super.toString() + "]";
  }
}
