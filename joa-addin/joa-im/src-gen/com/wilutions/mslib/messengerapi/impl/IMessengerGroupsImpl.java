/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{21388943-1CE7-9F8A-389B-75DBB4542D21}")
public class IMessengerGroupsImpl extends Dispatch implements com.wilutions.mslib.messengerapi.IMessengerGroups {
  @DeclDISPID(1665)  public void Remove(final IDispatch pGroup) throws ComException {
    this._dispatchCall(1665,"Remove", DISPATCH_METHOD,null,(pGroup!=null?pGroup:Dispatch.NULL));
  }
  @DeclDISPID(1666)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1666,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IDispatch Item(final Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IMessengerGroupsImpl(String progId) throws ComException {
    super(progId, "{E1AF1028-B884-44CB-A535-1C3C11A3D1DB}");
  }
  protected IMessengerGroupsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMessengerGroupsImpl" + super.toString() + "]";
  }
}
