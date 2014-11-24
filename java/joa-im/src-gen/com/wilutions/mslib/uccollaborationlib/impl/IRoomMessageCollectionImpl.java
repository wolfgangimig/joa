/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E15387B5-DABB-96D6-06A3-B49FF2765361}")
public class IRoomMessageCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomMessageCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IRoomMessage getItem(Integer _index) throws ComException {
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
  @DeclDISPID(1610743812)  public Integer IndexOf(com.wilutions.mslib.uccollaborationlib.IRoomMessage _roomMesssage) throws ComException {
    final Object obj = this._dispatchCall(1610743812,"IndexOf", DISPATCH_METHOD,null,(_roomMesssage!=null?_roomMesssage:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IRoomMessageCollectionImpl(String progId) throws ComException {
    super(progId, "{21C41EDE-7ED8-4D97-9B0D-DD785781AF9B}");
  }
  protected IRoomMessageCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomMessageCollectionImpl" + super.toString() + "]";
  }
}
