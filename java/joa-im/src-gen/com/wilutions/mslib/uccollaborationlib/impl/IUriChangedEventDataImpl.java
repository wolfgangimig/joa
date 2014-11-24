/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{CB4C093C-8CCD-90B1-325E-7B46ED12EACD}")
public class IUriChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IUriChangedEventData {
  @DeclDISPID(1610743808)  public String getNewUri() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"NewUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getOldUri() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"OldUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IUriChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{0BDB9057-28AE-4BF0-AFF0-12A148E51637}");
  }
  protected IUriChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IUriChangedEventDataImpl" + super.toString() + "]";
  }
}
