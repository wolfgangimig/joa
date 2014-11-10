/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B426B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class CustomXMLPrefixMappingsImpl extends Dispatch implements com.wilutions.mslib.office.CustomXMLPrefixMappings {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.CustomXMLPrefixMapping getItem(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CustomXMLPrefixMappingImpl.class);
  }
  @DeclDISPID(1610809347)  public void AddNamespace(String Prefix, String NamespaceURI) throws ComException {
    assert(Prefix != null);
    assert(NamespaceURI != null);
    this._dispatchCall(1610809347,"AddNamespace", DISPATCH_METHOD,null,Prefix,NamespaceURI);
  }
  @DeclDISPID(1610809348)  public String LookupNamespace(String Prefix) throws ComException {
    assert(Prefix != null);
    final Object obj = this._dispatchCall(1610809348,"LookupNamespace", DISPATCH_METHOD,null,Prefix);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809349)  public String LookupPrefix(String NamespaceURI) throws ComException {
    assert(NamespaceURI != null);
    final Object obj = this._dispatchCall(1610809349,"LookupPrefix", DISPATCH_METHOD,null,NamespaceURI);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public CustomXMLPrefixMappingsImpl(String progId) throws ComException {
    super(progId);
  }
  protected CustomXMLPrefixMappingsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomXMLPrefixMappingsImpl" + super.toString() + "]";
  }
}
