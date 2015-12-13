/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F6074A1F-931A-95BD-2546-498389F6AE60}")
public class ISharingResourceImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISharingResource {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.SharingResourceType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.SharingResourceType.valueOf((Integer)obj);
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
  public ISharingResourceImpl(String progId) throws ComException {
    super(progId, "{3690D374-3779-4EFC-B8E8-20642C01529A}");
  }
  protected ISharingResourceImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISharingResourceImpl" + super.toString() + "]";
  }
}
