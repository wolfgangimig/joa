/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{FC1589A3-211B-9C87-1A07-93FD774D6489}")
public class IShareableContentPropertyChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IShareableContentPropertyChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ShareableContentProperty getProperty() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Property", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ShareableContentProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IShareableContentPropertyChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{3C8210C8-8578-47C6-87A9-FA1AD2BA9873}");
  }
  protected IShareableContentPropertyChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IShareableContentPropertyChangedEventDataImpl" + super.toString() + "]";
  }
}
