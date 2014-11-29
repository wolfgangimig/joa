/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{AAE86879-E6AD-9642-148C-B9CD63328965}")
public class ISharingResourceListImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISharingResourceList {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.ISharingResource getItem(final Integer index) throws ComException {
    assert(index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.ISharingResourceImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public void Add(final com.wilutions.mslib.uccollaborationlib.ISharingResource _resource) throws ComException {
    this._dispatchCall(1610743811,"Add", DISPATCH_METHOD,null,(_resource!=null?_resource:Dispatch.NULL));
  }
  @DeclDISPID(1610743812)  public void Remove(final com.wilutions.mslib.uccollaborationlib.ISharingResource _resource) throws ComException {
    this._dispatchCall(1610743812,"Remove", DISPATCH_METHOD,null,(_resource!=null?_resource:Dispatch.NULL));
  }
  @DeclDISPID(1610743813)  public Boolean getIsShareable() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"IsShareable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ISharingResourceListImpl(String progId) throws ComException {
    super(progId, "{6A7FF112-42CE-4D03-8922-D02AC6C5759F}");
  }
  protected ISharingResourceListImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISharingResourceListImpl" + super.toString() + "]";
  }
}
