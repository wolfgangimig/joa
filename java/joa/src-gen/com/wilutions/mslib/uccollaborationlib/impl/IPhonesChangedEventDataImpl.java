/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{0094D8FF-53D5-98AA-2D4E-11B559798700}")
public class IPhonesChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPhonesChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IPhone[] getPhones() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Phones", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IPhone[])obj;
  }
  public IPhonesChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{C0034194-F7B6-43EB-B0E0-7852FC8E7BFA}");
  }
  protected IPhonesChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPhonesChangedEventDataImpl" + super.toString() + "]";
  }
}
