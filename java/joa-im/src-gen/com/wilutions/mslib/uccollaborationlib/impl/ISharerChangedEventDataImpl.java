/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{104C2816-F23D-932D-39D5-D3D579E851F0}")
public class ISharerChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISharerChangedEventData {
  @DeclDISPID(1610743808)  public String getSharerName() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"SharerName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public ISharerChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{D0DBB17D-565E-486C-A47B-BA32DC1FAD0A}");
  }
  protected ISharerChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISharerChangedEventDataImpl" + super.toString() + "]";
  }
}
