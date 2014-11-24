/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{B04B5753-34DC-9F69-3EE1-5387270562AA}")
public class IParticipantPropertyChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IParticipantPropertyChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ParticipantProperty getProperty() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Property", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ParticipantProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IParticipantPropertyChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{70DCCE38-90BF-4428-A34F-3A6082F29E50}");
  }
  protected IParticipantPropertyChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IParticipantPropertyChangedEventDataImpl" + super.toString() + "]";
  }
}
