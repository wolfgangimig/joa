/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{ED6F4925-FF99-CB5A-204B-694DA5B322A8}")
public class DocumentPropertyImpl extends Dispatch implements com.wilutions.mslib.office.DocumentProperty {
  @DeclDISPID(1)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(2)  public void Delete() throws ComException {
    this._dispatchCall(2,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(3)  public String getName(final Integer lcid) throws ComException {
    assert(lcid != null);
    final Object obj = this._dispatchCall(3,"Name", DISPATCH_PROPERTYGET,null,lcid);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public void setName(final Integer lcid, final String pbstrRetVal) throws ComException {
    assert(pbstrRetVal != null);
    assert(lcid != null);
    this._dispatchCall(3,"Name", DISPATCH_PROPERTYPUT,pbstrRetVal,lcid);
  }
  @DeclDISPID(0)  public Object getValue(final Integer lcid) throws ComException {
    assert(lcid != null);
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null,lcid);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setValue(final Integer lcid, final Object pvargRetVal) throws ComException {
    assert(pvargRetVal != null);
    assert(lcid != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,pvargRetVal,lcid);
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.MsoDocProperties getType(final Integer lcid) throws ComException {
    assert(lcid != null);
    final Object obj = this._dispatchCall(5,"Type", DISPATCH_PROPERTYGET,null,lcid);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoDocProperties.valueOf((Integer)obj);
  }
  @DeclDISPID(5)  public void setType(final Integer lcid, final com.wilutions.mslib.office.MsoDocProperties ptypeRetVal) throws ComException {
    assert(ptypeRetVal != null);
    assert(lcid != null);
    this._dispatchCall(5,"Type", DISPATCH_PROPERTYPUT,ptypeRetVal.value,lcid);
  }
  @DeclDISPID(6)  public Boolean getLinkToContent() throws ComException {
    final Object obj = this._dispatchCall(6,"LinkToContent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(6)  public void setLinkToContent(final Boolean pfLinkRetVal) throws ComException {
    assert(pfLinkRetVal != null);
    this._dispatchCall(6,"LinkToContent", DISPATCH_PROPERTYPUT,pfLinkRetVal);
  }
  @DeclDISPID(7)  public String getLinkSource() throws ComException {
    final Object obj = this._dispatchCall(7,"LinkSource", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(7)  public void setLinkSource(final String pbstrSourceRetVal) throws ComException {
    assert(pbstrSourceRetVal != null);
    this._dispatchCall(7,"LinkSource", DISPATCH_PROPERTYPUT,pbstrSourceRetVal);
  }
  @DeclDISPID(1610743820)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743821)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public DocumentPropertyImpl(String progId) throws ComException {
    super(progId, "{2DF8D04E-5BFA-101B-BDE5-00AA0044DE52}");
  }
  protected DocumentPropertyImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DocumentPropertyImpl" + super.toString() + "]";
  }
}
