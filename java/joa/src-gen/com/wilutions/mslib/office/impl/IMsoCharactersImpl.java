/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E5A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoCharactersImpl extends Dispatch implements com.wilutions.mslib.office.IMsoCharacters {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(139)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(139,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(139)  public void setCaption(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(139,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(118)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(118,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(117)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(117,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(146)  public com.wilutions.mslib.office.ChartFont getFont() throws ComException {
    final Object obj = this._dispatchCall(146,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ChartFontImpl.class);
  }
  @DeclDISPID(252)  public Object Insert(String bstr) throws ComException {
    assert(bstr != null);
    final Object obj = this._dispatchCall(252,"Insert", DISPATCH_METHOD,null,bstr);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(138)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(138,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(138)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(138,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1522)  public String getPhoneticCharacters() throws ComException {
    final Object obj = this._dispatchCall(1522,"PhoneticCharacters", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1522)  public void setPhoneticCharacters(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1522,"PhoneticCharacters", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IMsoCharactersImpl(String progId) throws ComException {
    super(progId, "{000C1731-0000-0000-C000-000000000046}");
  }
  protected IMsoCharactersImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoCharactersImpl" + super.toString() + "]";
  }
}
