/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomMessageCollection.
 * RoomMessageCollection class defines a collection of room messages. 
 */
@CoClass(guid="{3068D48B-3C56-4B15-ACA8-97A9C8B43C13}")
public class RoomMessageCollection extends Dispatch implements IRoomMessageCollection {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IRoomMessage getItem(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IRoomMessageImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public void Clear() throws ComException {
    this._dispatchCall(1610743811,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743812)  public Integer IndexOf(final IRoomMessage _roomMesssage) throws ComException {
    final Object obj = this._dispatchCall(1610743812,"IndexOf", DISPATCH_METHOD,null,(_roomMesssage!=null?_roomMesssage:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public RoomMessageCollection() throws ComException {
    super("{3068D48B-3C56-4B15-ACA8-97A9C8B43C13}", "{21C41EDE-7ED8-4D97-9B0D-DD785781AF9B}");
  }
  protected RoomMessageCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RoomMessageCollection" + super.toString() + "]";
  }
}
