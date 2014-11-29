/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceAccessInformation.
 * ConferenceAccessInformation Class 
 */
@CoClass(guid="{19258088-AEA6-4A73-B3D0-E4B1D9E11D9E}")
public class ConferenceAccessInformation extends Dispatch implements IConferenceAccessInformation {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String[] getAutoAttendantNumbers() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"AutoAttendantNumbers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String[])obj;
  }
  @DeclDISPID(1610743810)  public String getAdmissionKey() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"AdmissionKey", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public String getInternalUrl() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"InternalUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743812)  public String getExternalUrl() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ExternalUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public ConferenceAccessInformation() throws ComException {
    super("{19258088-AEA6-4A73-B3D0-E4B1D9E11D9E}", "{2F8C3E58-436B-42DB-8924-6C394B37DCA2}");
  }
  protected ConferenceAccessInformation(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceAccessInformation" + super.toString() + "]";
  }
}
