/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceAccessInformation2.
 * ConferenceAccessInformation2 Class 
 */
@CoClass(guid="{ED094732-DDCA-4A31-8095-E9774E3DBC0D}")
public class ConferenceAccessInformation2 extends Dispatch implements IConferenceAccessInformation2 {
  static boolean __typelib__loaded = __TypeLib.load();
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
  public ConferenceAccessInformation2() throws ComException {
    super("{ED094732-DDCA-4A31-8095-E9774E3DBC0D}", "{5E7AB04C-E4B8-49FB-85FF-9E2BCA2899D3}");
  }
  protected ConferenceAccessInformation2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceAccessInformation2" + super.toString() + "]";
  }
}
