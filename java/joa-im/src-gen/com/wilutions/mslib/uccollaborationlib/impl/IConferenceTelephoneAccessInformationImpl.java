/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A64666AB-6657-947C-3604-F1C58F9E19DF}")
public class IConferenceTelephoneAccessInformationImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceTelephoneAccessInformation {
  @DeclDISPID(1610743808)  public String getExternalWebLink() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ExternalWebLink", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getInternalWebLink() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"InternalWebLink", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IConferenceRegionalAccessInformationCollection getRegionalAccessInformation() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"RegionalAccessInformation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceRegionalAccessInformationCollectionImpl.class);
  }
  public IConferenceTelephoneAccessInformationImpl(String progId) throws ComException {
    super(progId, "{66D1FFC0-C234-4F3D-ABAA-98222A69E525}");
  }
  protected IConferenceTelephoneAccessInformationImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceTelephoneAccessInformationImpl" + super.toString() + "]";
  }
}
