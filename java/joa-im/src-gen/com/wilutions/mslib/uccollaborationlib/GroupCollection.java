/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * GroupCollection.
 * Represents a group collection. 
 */
@CoClass(guid="{DA937C78-8D00-41EC-874F-156D50EE97EC}")
public class GroupCollection extends Dispatch implements IGroupCollection {
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
  @DeclDISPID(0)  public IGroup getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IGroupImpl.class);
  }
  @DeclDISPID(1610743811)  public Boolean TryGetGroup(String _groupName, ByRef<IGroup> _value) throws ComException {
    assert(_groupName != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743811,"TryGetGroup", DISPATCH_METHOD,null,_groupName,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public IGroupCollection GetGroupsByType(GroupType _groupType) throws ComException {
    assert(_groupType != null);
    final Object obj = this._dispatchCall(1610743812,"GetGroupsByType", DISPATCH_METHOD,null,_groupType.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IGroupCollectionImpl.class);
  }
  @DeclDISPID(1610743813)  public Integer IndexOf(IGroup _group) throws ComException {
    final Object obj = this._dispatchCall(1610743813,"IndexOf", DISPATCH_METHOD,null,(_group!=null?_group:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public GroupCollection() throws ComException {
    super("{DA937C78-8D00-41EC-874F-156D50EE97EC}", "{0C81EC90-9469-4ED4-ACAD-ADB86E11039C}");
  }
  protected GroupCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[GroupCollection" + super.toString() + "]";
  }
}
