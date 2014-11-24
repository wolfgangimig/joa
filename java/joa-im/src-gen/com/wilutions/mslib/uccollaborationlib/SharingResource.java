/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SharingResource.
 * SharingResource Class 
 */
@CoClass(guid="{EBD24819-D80A-44DE-9C7B-606C512A1D71}")
public class SharingResource extends Dispatch implements ISharingResource {
  @DeclDISPID(1610743808)  public SharingResourceType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return SharingResourceType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Integer getId() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public SharingResource() throws ComException {
    super("{EBD24819-D80A-44DE-9C7B-606C512A1D71}", "{3690D374-3779-4EFC-B8E8-20642C01529A}");
  }
  protected SharingResource(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharingResource" + super.toString() + "]";
  }
}
