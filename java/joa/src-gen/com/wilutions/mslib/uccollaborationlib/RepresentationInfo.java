/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RepresentationInfo.
 * RepresentationInfo Class 
 */
@CoClass(guid="{1EABD900-9351-4306-936B-47DFB3170BC4}")
public class RepresentationInfo extends Dispatch implements IRepresentationInfo {
  @DeclDISPID(1610743808)  public RepresentationType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return RepresentationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public RepresentationInfo() throws ComException {
    super("{1EABD900-9351-4306-936B-47DFB3170BC4}", "{209DA899-15F1-499A-B8B5-A847EAA899AE}");
  }
  protected RepresentationInfo(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RepresentationInfo" + super.toString() + "]";
  }
}
