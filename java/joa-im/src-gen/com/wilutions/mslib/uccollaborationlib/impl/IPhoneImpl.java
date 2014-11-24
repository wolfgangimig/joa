/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{B604BB76-DAFC-9C92-1A2C-0DD06ACAB0F6}")
public class IPhoneImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPhone {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IContactEndpoint getEndpoint() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Endpoint", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactEndpointImpl.class);
  }
  @DeclDISPID(1610743809)  public Boolean getPublished() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Published", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743809)  public void setPublished(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743809,"Published", DISPATCH_PROPERTYPUT,value);
  }
  public IPhoneImpl(String progId) throws ComException {
    super(progId, "{7693221D-7E9F-47D3-8782-6437CF3D4C0C}");
  }
  protected IPhoneImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPhoneImpl" + super.toString() + "]";
  }
}
