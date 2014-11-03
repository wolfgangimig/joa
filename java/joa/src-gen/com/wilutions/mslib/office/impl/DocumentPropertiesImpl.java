/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{ED6F4926-FF99-CB5A-204B-694DA5B322A8}")
public class DocumentPropertiesImpl extends Dispatch implements com.wilutions.mslib.office.DocumentProperties {
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.DocumentProperty getItem(Object Index, Integer lcid) throws ComException {
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
  @DeclDISPID(5)  public com.wilutions.mslib.office.DocumentProperty Add(String Name, Boolean LinkToContent, Object Type, Object Value, Object LinkSource, Integer lcid) throws ComException {
    assert(Name != null);
    assert(LinkToContent != null);
    assert(Type != null);
    assert(Value != null);
    assert(LinkSource != null);
    assert(lcid != null);
    final Object obj = this._dispatchCall(5,"Add", DISPATCH_METHOD,null,Name,LinkToContent,Type,Value,LinkSource,lcid);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.DocumentProperty)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743813)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743814)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public DocumentPropertiesImpl(String progId) throws ComException {
    super(progId);
  }
  protected DocumentPropertiesImpl(long ndisp) {
    super(ndisp);
  }
  public DocumentPropertiesImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DocumentPropertiesImpl" + super.toString() + "]";
  }
}
