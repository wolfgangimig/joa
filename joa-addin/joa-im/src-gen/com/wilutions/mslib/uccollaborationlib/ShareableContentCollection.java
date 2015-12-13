/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ShareableContentCollection.
 * ShareableContentCollection Class 
 */
@CoClass(guid="{90F87439-ACD6-4802-A740-59051166E57D}")
public class ShareableContentCollection extends Dispatch implements IShareableContentCollection {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IShareableContent getItem(final Integer index) throws ComException {
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
  public ShareableContentCollection() throws ComException {
    super("{90F87439-ACD6-4802-A740-59051166E57D}", "{A58F54D2-9786-4309-964D-96549AEC7611}");
  }
  protected ShareableContentCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ShareableContentCollection" + super.toString() + "]";
  }
}
