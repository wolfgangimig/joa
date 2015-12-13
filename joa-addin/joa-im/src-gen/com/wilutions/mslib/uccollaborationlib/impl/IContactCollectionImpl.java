/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{97545226-63F7-9E2E-19C3-67F96F8F41FA}")
public class IContactCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContactCollection {
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
  @DeclDISPID(1610743810)  public Boolean TryGetContact(final String _uri, final ByRef<com.wilutions.mslib.uccollaborationlib.IContact> _value) throws ComException {
    assert(_uri != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743810,"TryGetContact", DISPATCH_METHOD,null,_uri,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IContactCollectionImpl(String progId) throws ComException {
    super(progId, "{57C3CB4D-C794-456F-846D-0E1ECA78BD00}");
  }
  protected IContactCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContactCollectionImpl" + super.toString() + "]";
  }
}
