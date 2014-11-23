/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{DF677F9A-8B87-9568-3C8D-3C9D552C95DD}")
public class IContactEndpointImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContactEndpoint {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ContactEndpointType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ContactEndpointType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public String getDisplayName() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public Boolean CanStart(com.wilutions.mslib.uccollaborationlib.ModalityTypes _modalityTypes) throws ComException {
    assert(_modalityTypes != null);
    final Object obj = this._dispatchCall(1610743811,"CanStart", DISPATCH_METHOD,null,_modalityTypes.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IContactEndpointImpl(String progId) throws ComException {
    super(progId, "{1FF0E6F1-2FE4-4E29-A123-557AF0DB6927}");
  }
  protected IContactEndpointImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContactEndpointImpl" + super.toString() + "]";
  }
}
