/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A22EAB82-DC24-9639-2340-34BF1A76A7F9}")
public class IContactPositionChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContactPositionChangedEventData {
  @DeclDISPID(1610743808)  public Integer getStartPosition() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"StartPosition", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public Integer getEndPosition() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"EndPosition", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IContactPositionChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{62B932E9-7847-4D78-BEEE-5D58BF815B03}");
  }
  protected IContactPositionChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContactPositionChangedEventDataImpl" + super.toString() + "]";
  }
}
