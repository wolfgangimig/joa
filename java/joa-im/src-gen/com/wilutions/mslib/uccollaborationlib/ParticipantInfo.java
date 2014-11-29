/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ParticipantInfo.
 * ParticipantInfo Class 
 */
@CoClass(guid="{DF54C8F4-06A1-426F-87D9-E2DF86FF5E19}")
public class ParticipantInfo extends Dispatch implements IParticipantInfo {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public Boolean getIsRepresenting() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsRepresenting", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public String getRepresentedUri() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"RepresentedUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public String getDisplayName() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public void setDisplayName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743811,"DisplayName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743813)  public String getRepresentedDisplayName() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"RepresentedDisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743813)  public void setRepresentedDisplayName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743813,"RepresentedDisplayName", DISPATCH_PROPERTYPUT,value);
  }
  public ParticipantInfo() throws ComException {
    super("{DF54C8F4-06A1-426F-87D9-E2DF86FF5E19}", "{B3FF95BD-B743-498C-9973-7F8A2A78576A}");
  }
  protected ParticipantInfo(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ParticipantInfo" + super.toString() + "]";
  }
}
