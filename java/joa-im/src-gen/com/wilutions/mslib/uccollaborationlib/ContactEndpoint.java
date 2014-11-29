/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactEndpoint.
 * Represents a collaboration endpoint which may be a SIP endpoint or a TEL endpoint. 
 */
@CoClass(guid="{D2F90870-11A2-4396-806B-D79DDFBE9F50}")
public class ContactEndpoint extends Dispatch implements IContactEndpoint {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ContactEndpointType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ContactEndpointType.valueOf((Integer)obj);
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
  @DeclDISPID(1610743811)  public Boolean CanStart(ModalityTypes _modalityTypes) throws ComException {
    assert(_modalityTypes != null);
    final Object obj = this._dispatchCall(1610743811,"CanStart", DISPATCH_METHOD,null,_modalityTypes.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ContactEndpoint() throws ComException {
    super("{D2F90870-11A2-4396-806B-D79DDFBE9F50}", "{1FF0E6F1-2FE4-4E29-A123-557AF0DB6927}");
  }
  protected ContactEndpoint(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ContactEndpoint" + super.toString() + "]";
  }
}
