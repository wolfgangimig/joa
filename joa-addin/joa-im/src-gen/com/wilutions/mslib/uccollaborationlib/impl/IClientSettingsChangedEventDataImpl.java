/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E541D381-AA06-928A-10C3-0C3CAF36539F}")
public class IClientSettingsChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IClientSettingsChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ClientSettingsType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ClientSettingsType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IClientSettingsChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{25D64AEA-0E65-49CB-8D6D-65DB0AC1AF65}");
  }
  protected IClientSettingsChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IClientSettingsChangedEventDataImpl" + super.toString() + "]";
  }
}
