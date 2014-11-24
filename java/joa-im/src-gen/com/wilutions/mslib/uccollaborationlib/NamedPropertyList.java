/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * NamedPropertyList.
 * Class representing list of name/value pair properties, can be accessed via index or name 
 */
@CoClass(guid="{66B28B84-9D92-47FF-9152-E89EAFBAF3C2}")
public class NamedPropertyList extends Dispatch implements INamedPropertyList {
  @DeclDISPID(1610743808)  public void Add(String _propertyID, Object _propertyValue) throws ComException {
    assert(_propertyID != null);
    assert(_propertyValue != null);
    this._dispatchCall(1610743808,"Add", DISPATCH_METHOD,null,_propertyID,_propertyValue);
  }
  @DeclDISPID(1610743809)  public void Clear() throws ComException {
    this._dispatchCall(1610743809,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743810)  public void RemoveAt(Integer _index) throws ComException {
    assert(_index != null);
    this._dispatchCall(1610743810,"RemoveAt", DISPATCH_METHOD,null,_index);
  }
  @DeclDISPID(1610743811)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743812)  public String GetIDAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743812,"GetIDAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743813)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743814)  public Boolean TryGetValue(String _propertyID, ByRef<Object> _propertyValue) throws ComException {
    assert(_propertyID != null);
    assert(_propertyValue != null);
    final Object obj = this._dispatchCall(1610743814,"TryGetValue", DISPATCH_METHOD,null,_propertyID,_propertyValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public NamedPropertyList() throws ComException {
    super("{66B28B84-9D92-47FF-9152-E89EAFBAF3C2}", "{1A8A9402-E89F-40AE-88A8-B328391684B6}");
  }
  protected NamedPropertyList(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NamedPropertyList" + super.toString() + "]";
  }
}
