/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{82078C47-D1AA-9C89-37BC-E8AFBDC1F7C5}")
public class IModalityPropertyChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IModalityPropertyChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ModalityProperty getProperty() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Property", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IModalityPropertyChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{4290152C-75C9-47C8-AA12-814818360B3F}");
  }
  protected IModalityPropertyChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IModalityPropertyChangedEventDataImpl" + super.toString() + "]";
  }
}
