/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{27D00366-1F7A-9FE4-0B21-06A67CC91C46}")
public class IMessengerContactsImpl extends Dispatch implements com.wilutions.mslib.messengerapi.IMessengerContacts {
  @DeclDISPID(1792)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1792,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IDispatch Item(final Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1793)  public void Remove(final IDispatch pMContact) throws ComException {
    this._dispatchCall(1793,"Remove", DISPATCH_METHOD,null,(pMContact!=null?pMContact:Dispatch.NULL));
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IMessengerContactsImpl(String progId) throws ComException {
    super(progId, "{E7479A0D-BB19-44A5-968F-6F41D93EE0BC}");
  }
  protected IMessengerContactsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMessengerContactsImpl" + super.toString() + "]";
  }
}
