/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{ED6F4926-FF99-CB5A-204B-694DA5B322A8}")
public class DocumentPropertiesImpl extends Dispatch implements com.wilutions.mslib.office.DocumentProperties {
  @DeclDISPID(1)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.DocumentProperty getItem(final Object Index, final Integer lcid) throws ComException {
    assert(Index != null);
    assert(lcid != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index,lcid);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.DocumentProperty)obj;
  }
  @DeclDISPID(4)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(4,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.DocumentProperty Add(final String Name, final Boolean LinkToContent, final Object Type, final Object Value, final Object LinkSource, final Integer lcid) throws ComException {
    assert(Name != null);
    assert(LinkToContent != null);
    assert(Type != null);
    assert(Value != null);
    assert(LinkSource != null);
    assert(lcid != null);
    final Object obj = this._dispatchCall(5,"Add", DISPATCH_METHOD,null,Name,LinkToContent,Variant.param(Type),Variant.param(Value),Variant.param(LinkSource),lcid);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.DocumentProperty)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743813)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743814)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public DocumentPropertiesImpl(String progId) throws ComException {
    super(progId, "{2DF8D04D-5BFA-101B-BDE5-00AA0044DE52}");
  }
  protected DocumentPropertiesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DocumentPropertiesImpl" + super.toString() + "]";
  }
}
