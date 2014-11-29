/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceTelephoneAccessInformation.
 * ConferenceTelephoneAccessInformation Class 
 */
@CoClass(guid="{BF527F65-83F6-4FA4-AB1B-17A8585F0D8A}")
public class ConferenceTelephoneAccessInformation extends Dispatch implements IConferenceTelephoneAccessInformation {
  static boolean __typelib__loaded = __TypeLib.load();
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
  @DeclDISPID(1610743810)  public IConferenceRegionalAccessInformationCollection getRegionalAccessInformation() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"RegionalAccessInformation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceRegionalAccessInformationCollectionImpl.class);
  }
  public ConferenceTelephoneAccessInformation() throws ComException {
    super("{BF527F65-83F6-4FA4-AB1B-17A8585F0D8A}", "{66D1FFC0-C234-4F3D-ABAA-98222A69E525}");
  }
  protected ConferenceTelephoneAccessInformation(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceTelephoneAccessInformation" + super.toString() + "]";
  }
}
