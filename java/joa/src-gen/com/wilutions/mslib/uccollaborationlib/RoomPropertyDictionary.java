/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomPropertyDictionary.
 * RoomPropertyDirectory class. 
 */
@CoClass(guid="{B4F20BEB-831C-4BB8-9065-3964E4330E79}")
public class RoomPropertyDictionary extends Dispatch implements IRoomPropertyDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(RoomProperty _propertyType) throws ComException {
    assert(_propertyType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_propertyType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public RoomProperty[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (RoomProperty[])obj;
  }
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(RoomProperty _propertyType, ByRef<Object> _itemValue) throws ComException {
    assert(_propertyType != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_propertyType.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public RoomProperty GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return RoomProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(RoomProperty _propertyType) throws ComException {
    assert(_propertyType != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_propertyType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public RoomPropertyDictionary() throws ComException {
    super("{B4F20BEB-831C-4BB8-9065-3964E4330E79}", "{7BF20B14-58D1-494B-B301-9B16BACC9610}");
  }
  protected RoomPropertyDictionary(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RoomPropertyDictionary" + super.toString() + "]";
  }
}
