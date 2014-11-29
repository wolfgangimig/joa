/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomCollection.
 * RoomCollection class defines a collection of rooms. 
 */
@CoClass(guid="{3DF72257-EA41-45A7-BD01-DCF2104B250C}")
public class RoomCollection extends Dispatch implements IRoomCollection {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IRoom getItem(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IRoomImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public Integer IndexOf(final IRoom _room) throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IndexOf", DISPATCH_METHOD,null,(_room!=null?_room:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public RoomCollection() throws ComException {
    super("{3DF72257-EA41-45A7-BD01-DCF2104B250C}", "{05789509-AFA1-4E90-B4FA-1A7820DB9796}");
  }
  protected RoomCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RoomCollection" + super.toString() + "]";
  }
}
