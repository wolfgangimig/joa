/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C5EF0C62-0BC2-95D1-2954-739F852C6B6C}")
public class IRoomCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IRoom getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IRoomImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public Integer IndexOf(com.wilutions.mslib.uccollaborationlib.IRoom _room) throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IndexOf", DISPATCH_METHOD,null,(_room!=null?_room:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IRoomCollectionImpl(String progId) throws ComException {
    super(progId, "{05789509-AFA1-4E90-B4FA-1A7820DB9796}");
  }
  protected IRoomCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomCollectionImpl" + super.toString() + "]";
  }
}
