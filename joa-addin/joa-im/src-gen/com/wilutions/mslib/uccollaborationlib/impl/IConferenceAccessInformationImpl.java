/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{EF1BA733-E708-999A-148A-05DEEEC02058}")
public class IConferenceAccessInformationImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceAccessInformation {
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
  public IConferenceAccessInformationImpl(String progId) throws ComException {
    super(progId, "{2F8C3E58-436B-42DB-8924-6C394B37DCA2}");
  }
  protected IConferenceAccessInformationImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceAccessInformationImpl" + super.toString() + "]";
  }
}
