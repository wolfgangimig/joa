/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1A514E10-B694-9B1D-269D-69CAC8B7FB09}")
public class IResiliencyModeChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IResiliencyModeChangedEventData {
  @DeclDISPID(1610743808)  public Boolean getIsInResiliencyMode() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"IsInResiliencyMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IResiliencyModeChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{DAC6D77B-12F7-405C-BB33-002D6D4007F3}");
  }
  protected IResiliencyModeChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IResiliencyModeChangedEventDataImpl" + super.toString() + "]";
  }
}
