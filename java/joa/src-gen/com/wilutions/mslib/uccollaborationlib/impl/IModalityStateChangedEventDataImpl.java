/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{871A4332-C0A3-9F68-3124-98ED31FCAE36}")
public class IModalityStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IModalityStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ModalityState getOldState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"OldState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ModalityState getNewState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"NewState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public Integer getStatusCode() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"StatusCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IModalityStateChangePropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IModalityStateChangePropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743812)  public Integer getExtendedStatusCode() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ExtendedStatusCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IModalityStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{478DDA59-64C0-4429-AC8A-F10A940B52CC}");
  }
  protected IModalityStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IModalityStateChangedEventDataImpl" + super.toString() + "]";
  }
}
