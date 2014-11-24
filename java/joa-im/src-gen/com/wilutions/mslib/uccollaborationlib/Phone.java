/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Phone.
 * Phone Class 
 */
@CoClass(guid="{260E70C7-05BD-4C59-9EA3-5EBB9EFE5D93}")
public class Phone extends Dispatch implements IPhone {
  @DeclDISPID(1610743808)  public IContactEndpoint getEndpoint() throws ComException {
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
  public Phone() throws ComException {
    super("{260E70C7-05BD-4C59-9EA3-5EBB9EFE5D93}", "{7693221D-7E9F-47D3-8782-6437CF3D4C0C}");
  }
  protected Phone(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Phone" + super.toString() + "]";
  }
}
