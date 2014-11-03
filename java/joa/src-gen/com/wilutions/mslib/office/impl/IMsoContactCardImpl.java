/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A9B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoContactCardImpl extends Dispatch implements com.wilutions.mslib.office.IMsoContactCard {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public String getAddress() throws ComException {
    final Object obj = this._dispatchCall(1,"Address", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.MsoContactCardAddressType getAddressType() throws ComException {
    final Object obj = this._dispatchCall(2,"AddressType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoContactCardAddressType.valueOf((Integer)obj);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.MsoContactCardType getCardType() throws ComException {
    final Object obj = this._dispatchCall(3,"CardType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoContactCardType.valueOf((Integer)obj);
  }
  @DeclDISPID(4)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(4,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public IMsoContactCardImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoContactCardImpl(long ndisp) {
    super(ndisp);
  }
  public IMsoContactCardImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoContactCardImpl" + super.toString() + "]";
  }
}
