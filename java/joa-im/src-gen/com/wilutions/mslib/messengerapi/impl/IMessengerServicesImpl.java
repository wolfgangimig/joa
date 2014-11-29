/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{EEC7CD10-0CC9-9421-28D0-76A6E2E6FC81}")
public class IMessengerServicesImpl extends Dispatch implements com.wilutions.mslib.messengerapi.IMessengerServices {
  @DeclDISPID(2176)  public IDispatch getPrimaryService() throws ComException {
    final Object obj = this._dispatchCall(2176,"PrimaryService", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(2177)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2177,"Count", DISPATCH_PROPERTYGET,null);
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
  public IMessengerServicesImpl(String progId) throws ComException {
    super(progId, "{2E50547B-A8AA-4F60-B57E-1F414711007B}");
  }
  protected IMessengerServicesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMessengerServicesImpl" + super.toString() + "]";
  }
}
