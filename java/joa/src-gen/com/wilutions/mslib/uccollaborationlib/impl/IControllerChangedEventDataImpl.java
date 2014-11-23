/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8E1A5E8B-A0DB-9C4A-2054-9CC7AC6C6BA5}")
public class IControllerChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IControllerChangedEventData {
  @DeclDISPID(1610743808)  public String getControllerName() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ControllerName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IControllerChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{4E8DC7E0-04B8-470B-BDFA-F520099B975F}");
  }
  protected IControllerChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IControllerChangedEventDataImpl" + super.toString() + "]";
  }
}
