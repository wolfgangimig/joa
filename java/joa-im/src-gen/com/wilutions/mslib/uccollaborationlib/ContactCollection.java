/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactCollection.
 * Represents a contact collection. 
 */
@CoClass(guid="{9BB71FC6-1BBA-407A-A086-87D8E525BFEF}")
public class ContactCollection extends Dispatch implements IContactCollection {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public Boolean TryGetContact(String _uri, ByRef<IContact> _value) throws ComException {
    assert(_uri != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743810,"TryGetContact", DISPATCH_METHOD,null,_uri,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ContactCollection() throws ComException {
    super("{9BB71FC6-1BBA-407A-A086-87D8E525BFEF}", "{57C3CB4D-C794-456F-846D-0E1ECA78BD00}");
  }
  protected ContactCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ContactCollection" + super.toString() + "]";
  }
}
