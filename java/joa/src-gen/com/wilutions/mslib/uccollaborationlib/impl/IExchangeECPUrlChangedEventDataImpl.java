/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{B88F3A9C-C328-9C3F-0446-3D90E08E541D}")
public class IExchangeECPUrlChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IExchangeECPUrlChangedEventData {
  @DeclDISPID(1610743808)  public String getNewUrl() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"NewUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IExchangeECPUrlChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{7818A3F7-674B-477E-99E8-54774579A8E7}");
  }
  protected IExchangeECPUrlChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IExchangeECPUrlChangedEventDataImpl" + super.toString() + "]";
  }
}
