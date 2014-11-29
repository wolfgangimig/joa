/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SharingResourceList.
 * SharingResourceList Class 
 */
@CoClass(guid="{F77D5A8D-8D57-40F0-AB49-85BAA3699238}")
public class SharingResourceList extends Dispatch implements ISharingResourceList {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public ISharingResource getItem(Integer index) throws ComException {
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
  @DeclDISPID(1610743811)  public void Add(ISharingResource _resource) throws ComException {
    this._dispatchCall(1610743811,"Add", DISPATCH_METHOD,null,(_resource!=null?_resource:Dispatch.NULL));
  }
  @DeclDISPID(1610743812)  public void Remove(ISharingResource _resource) throws ComException {
    this._dispatchCall(1610743812,"Remove", DISPATCH_METHOD,null,(_resource!=null?_resource:Dispatch.NULL));
  }
  @DeclDISPID(1610743813)  public Boolean getIsShareable() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"IsShareable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public SharingResourceList() throws ComException {
    super("{F77D5A8D-8D57-40F0-AB49-85BAA3699238}", "{6A7FF112-42CE-4D03-8922-D02AC6C5759F}");
  }
  protected SharingResourceList(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharingResourceList" + super.toString() + "]";
  }
}
