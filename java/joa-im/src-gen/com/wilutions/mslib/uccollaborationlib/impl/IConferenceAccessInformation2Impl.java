/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{9EED2927-40DB-92BA-1851-F7CC6FDF6529}")
public class IConferenceAccessInformation2Impl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceAccessInformation2 {
  @DeclDISPID(268435457)  public Boolean getIsScheduled() throws ComException {
    final Object obj = this._dispatchCall(268435457,"IsScheduled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(268435458)  public String getOrganizerDisplayName() throws ComException {
    final Object obj = this._dispatchCall(268435458,"OrganizerDisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(268435459)  public String getOrganizerUri() throws ComException {
    final Object obj = this._dispatchCall(268435459,"OrganizerUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(268435460)  public Boolean getIsCustomized() throws ComException {
    final Object obj = this._dispatchCall(268435460,"IsCustomized", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IConferenceAccessInformation2Impl(String progId) throws ComException {
    super(progId, "{5E7AB04C-E4B8-49FB-85FF-9E2BCA2899D3}");
  }
  protected IConferenceAccessInformation2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceAccessInformation2Impl" + super.toString() + "]";
  }
}
