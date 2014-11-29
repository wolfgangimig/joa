/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{16277DA2-5EB5-93C4-2FDF-642200735102}")
public class IMessengerConversationWndImpl extends Dispatch implements com.wilutions.mslib.messengerapi.IMessengerConversationWnd {
  @DeclDISPID(2053)  public void Close() throws ComException {
    this._dispatchCall(2053,"Close", DISPATCH_METHOD,null);
  }
  @DeclDISPID(2048)  public Integer getHWND() throws ComException {
    final Object obj = this._dispatchCall(2048,"HWND", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2049)  public Integer getleft() throws ComException {
    final Object obj = this._dispatchCall(2049,"left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2049)  public void setleft(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(2049,"left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2050)  public Integer gettop() throws ComException {
    final Object obj = this._dispatchCall(2050,"top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2050)  public void settop(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(2050,"top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2051)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(2051,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2051)  public void setWidth(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(2051,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2052)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(2052,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2052)  public void setHeight(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(2052,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2055)  public Boolean getIsClosed() throws ComException {
    final Object obj = this._dispatchCall(2055,"IsClosed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2054)  public void Show() throws ComException {
    this._dispatchCall(2054,"Show", DISPATCH_METHOD,null);
  }
  @DeclDISPID(2056)  public Object getProperty(final com.wilutions.mslib.messengerapi.MWINDOWPROPERTY ePropType) throws ComException {
    assert(ePropType != null);
    final Object obj = this._dispatchCall(2056,"Property", DISPATCH_PROPERTYGET,null,ePropType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2056)  public void setProperty(final com.wilutions.mslib.messengerapi.MWINDOWPROPERTY ePropType, final Object value2) throws ComException {
    assert(value2 != null);
    assert(ePropType != null);
    this._dispatchCall(2056,"Property", DISPATCH_PROPERTYPUT,value2,ePropType.value);
  }
  @DeclDISPID(2057)  public IDispatch getContacts() throws ComException {
    final Object obj = this._dispatchCall(2057,"Contacts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(2058)  public String getHistory() throws ComException {
    final Object obj = this._dispatchCall(2058,"History", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2059)  public void AddContact(final Object vContact) throws ComException {
    assert(vContact != null);
    this._dispatchCall(2059,"AddContact", DISPATCH_METHOD,null,vContact);
  }
  public IMessengerConversationWndImpl(String progId) throws ComException {
    super(progId, "{D6B0E4C9-FAD6-4885-B271-0DC5A584ADF8}");
  }
  protected IMessengerConversationWndImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMessengerConversationWndImpl" + super.toString() + "]";
  }
}
