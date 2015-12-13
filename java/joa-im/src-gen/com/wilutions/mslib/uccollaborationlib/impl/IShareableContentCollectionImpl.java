/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{6518CDB9-33E5-9848-0BE3-FFB33F1B8AEB}")
public class IShareableContentCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IShareableContentCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IShareableContent getItem(final Integer index) throws ComException {
    assert(index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IShareableContentImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IShareableContentCollectionImpl(String progId) throws ComException {
    super(progId, "{A58F54D2-9786-4309-964D-96549AEC7611}");
  }
  protected IShareableContentCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IShareableContentCollectionImpl" + super.toString() + "]";
  }
}
