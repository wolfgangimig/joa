/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{52407EC3-ECBB-9A27-14BF-0AED45DCD769}")
public class IInitialContextEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IInitialContextEventData {
  @DeclDISPID(1610743808)  public String getApplicationId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ApplicationId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getApplicationData() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"ApplicationData", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IInitialContextEventDataImpl(String progId) throws ComException {
    super(progId, "{92D7E7A8-48D8-4166-8911-630AE02B2B93}");
  }
  protected IInitialContextEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IInitialContextEventDataImpl" + super.toString() + "]";
  }
}
