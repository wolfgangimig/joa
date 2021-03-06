/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{54DD56F8-0585-CA8F-1CAA-694DA596EC7A}")
public class TabsImpl extends Dispatch implements com.wilutions.mslib.msforms.Tabs {
  @DeclDISPID(60)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(60,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.msforms.Tab _GetItemByIndex(final Integer lIndex) throws ComException {
    assert(lIndex != null);
    final Object obj = this._dispatchCall(1610743810,"_GetItemByIndex", DISPATCH_METHOD,null,lIndex);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.TabImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.msforms.Tab _GetItemByName(final String bstr) throws ComException {
    assert(bstr != null);
    final Object obj = this._dispatchCall(1610743811,"_GetItemByName", DISPATCH_METHOD,null,bstr);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.TabImpl.class);
  }
  @DeclDISPID(0)  public IDispatch Item(final Object varg) throws ComException {
    assert(varg != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,varg);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743813)  public Object Enum() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Enum", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(66)  public com.wilutions.mslib.msforms.Tab Add(final Object bstrName, final Object bstrCaption, final Object lIndex) throws ComException {
    assert(bstrName != null);
    assert(bstrCaption != null);
    assert(lIndex != null);
    final Object obj = this._dispatchCall(66,"Add", DISPATCH_METHOD,null,Variant.param(bstrName),Variant.param(bstrCaption),Variant.param(lIndex));
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.TabImpl.class);
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.msforms.Tab _Add(final String bstrName, final String bstrCaption) throws ComException {
    assert(bstrName != null);
    assert(bstrCaption != null);
    final Object obj = this._dispatchCall(1610743815,"_Add", DISPATCH_METHOD,null,bstrName,bstrCaption);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.TabImpl.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.msforms.Tab _Insert(final String bstrName, final String bstrCaption, final Integer lIndex) throws ComException {
    assert(bstrName != null);
    assert(bstrCaption != null);
    assert(lIndex != null);
    final Object obj = this._dispatchCall(1610743816,"_Insert", DISPATCH_METHOD,null,bstrName,bstrCaption,lIndex);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.TabImpl.class);
  }
  @DeclDISPID(67)  public void Remove(final Object varg) throws ComException {
    assert(varg != null);
    this._dispatchCall(67,"Remove", DISPATCH_METHOD,null,varg);
  }
  @DeclDISPID(62)  public void Clear() throws ComException {
    this._dispatchCall(62,"Clear", DISPATCH_METHOD,null);
  }
  public TabsImpl(String progId) throws ComException {
    super(progId, "{944ACF93-A1E6-11CE-8104-00AA00611080}");
  }
  protected TabsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TabsImpl" + super.toString() + "]";
  }
}
