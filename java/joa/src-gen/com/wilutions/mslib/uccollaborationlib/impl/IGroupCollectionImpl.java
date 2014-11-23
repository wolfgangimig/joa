/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{CC1675FB-300A-9595-3103-C45FCBE6FF66}")
public class IGroupCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IGroupCollection {
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
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IGroup getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IGroupImpl.class);
  }
  @DeclDISPID(1610743811)  public Boolean TryGetGroup(String _groupName, ByRef<com.wilutions.mslib.uccollaborationlib.IGroup> _value) throws ComException {
    assert(_groupName != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743811,"TryGetGroup", DISPATCH_METHOD,null,_groupName,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IGroupCollection GetGroupsByType(com.wilutions.mslib.uccollaborationlib.GroupType _groupType) throws ComException {
    assert(_groupType != null);
    final Object obj = this._dispatchCall(1610743812,"GetGroupsByType", DISPATCH_METHOD,null,_groupType.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IGroupCollectionImpl.class);
  }
  @DeclDISPID(1610743813)  public Integer IndexOf(com.wilutions.mslib.uccollaborationlib.IGroup _group) throws ComException {
    final Object obj = this._dispatchCall(1610743813,"IndexOf", DISPATCH_METHOD,null,(_group!=null?_group:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IGroupCollectionImpl(String progId) throws ComException {
    super(progId, "{0C81EC90-9469-4ED4-ACAD-ADB86E11039C}");
  }
  protected IGroupCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IGroupCollectionImpl" + super.toString() + "]";
  }
}
