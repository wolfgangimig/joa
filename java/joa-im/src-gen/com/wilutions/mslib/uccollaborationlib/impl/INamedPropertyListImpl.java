/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{DA1D0D69-4CFC-9BEF-1506-DACF9CE1784C}")
public class INamedPropertyListImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.INamedPropertyList {
  @DeclDISPID(1610743808)  public void Add(final String _propertyID, final Object _propertyValue) throws ComException {
    assert(_propertyID != null);
    assert(_propertyValue != null);
    this._dispatchCall(1610743808,"Add", DISPATCH_METHOD,null,_propertyID,_propertyValue);
  }
  @DeclDISPID(1610743809)  public void Clear() throws ComException {
    this._dispatchCall(1610743809,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743810)  public void RemoveAt(final Integer _index) throws ComException {
    assert(_index != null);
    this._dispatchCall(1610743810,"RemoveAt", DISPATCH_METHOD,null,_index);
  }
  @DeclDISPID(1610743811)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743812)  public String GetIDAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743812,"GetIDAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743813)  public Object GetValueAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743814)  public Boolean TryGetValue(final String _propertyID, final ByRef<Object> _propertyValue) throws ComException {
    assert(_propertyID != null);
    assert(_propertyValue != null);
    final Object obj = this._dispatchCall(1610743814,"TryGetValue", DISPATCH_METHOD,null,_propertyID,_propertyValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public INamedPropertyListImpl(String progId) throws ComException {
    super(progId, "{1A8A9402-E89F-40AE-88A8-B328391684B6}");
  }
  protected INamedPropertyListImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[INamedPropertyListImpl" + super.toString() + "]";
  }
}
