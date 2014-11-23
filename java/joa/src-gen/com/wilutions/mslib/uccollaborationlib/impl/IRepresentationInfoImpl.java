/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E00A31F2-B192-92DB-251B-C1A04F5F6554}")
public class IRepresentationInfoImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRepresentationInfo {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.RepresentationType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.RepresentationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IRepresentationInfoImpl(String progId) throws ComException {
    super(progId, "{209DA899-15F1-499A-B8B5-A847EAA899AE}");
  }
  protected IRepresentationInfoImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRepresentationInfoImpl" + super.toString() + "]";
  }
}
