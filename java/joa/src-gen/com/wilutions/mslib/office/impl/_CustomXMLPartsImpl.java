/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4262-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CustomXMLPartsImpl extends Dispatch implements com.wilutions.mslib.office._CustomXMLParts {
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
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.CustomXMLPart getItem(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.CustomXMLPart.class);
  }
  @DeclDISPID(1610809347)  public com.wilutions.mslib.office.CustomXMLPart Add(String XML, Object SchemaCollection) throws ComException {
    assert(XML != null);
    assert(SchemaCollection != null);
    final Object obj = this._dispatchCall(1610809347,"Add", DISPATCH_METHOD,null,XML,SchemaCollection);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.CustomXMLPart.class);
  }
  @DeclDISPID(1610809348)  public com.wilutions.mslib.office.CustomXMLPart SelectByID(String Id) throws ComException {
    assert(Id != null);
    final Object obj = this._dispatchCall(1610809348,"SelectByID", DISPATCH_METHOD,null,Id);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.CustomXMLPart.class);
  }
  @DeclDISPID(1610809349)  public com.wilutions.mslib.office.CustomXMLParts SelectByNamespace(String NamespaceURI) throws ComException {
    assert(NamespaceURI != null);
    final Object obj = this._dispatchCall(1610809349,"SelectByNamespace", DISPATCH_METHOD,null,NamespaceURI);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.CustomXMLParts.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public _CustomXMLPartsImpl(String progId) throws ComException {
    super(progId, "{000CDB09-0000-0000-C000-000000000046}");
  }
  protected _CustomXMLPartsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CustomXMLPartsImpl" + super.toString() + "]";
  }
}
