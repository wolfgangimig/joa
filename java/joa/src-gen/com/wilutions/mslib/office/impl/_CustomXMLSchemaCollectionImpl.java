/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4269-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CustomXMLSchemaCollectionImpl extends Dispatch implements com.wilutions.mslib.office._CustomXMLSchemaCollection {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.CustomXMLSchema getItem(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CustomXMLSchemaImpl.class);
  }
  @DeclDISPID(1610809347)  public String getNamespaceURI(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(1610809347,"NamespaceURI", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809348)  public com.wilutions.mslib.office.CustomXMLSchema Add(String NamespaceURI, String Alias, String FileName, Boolean InstallForAllUsers) throws ComException {
    assert(NamespaceURI != null);
    assert(Alias != null);
    assert(FileName != null);
    assert(InstallForAllUsers != null);
    final Object obj = this._dispatchCall(1610809348,"Add", DISPATCH_METHOD,null,NamespaceURI,Alias,FileName,InstallForAllUsers);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CustomXMLSchemaImpl.class);
  }
  @DeclDISPID(1610809349)  public void AddCollection(com.wilutions.mslib.office.CustomXMLSchemaCollection SchemaCollection) throws ComException {
    this._dispatchCall(1610809349,"AddCollection", DISPATCH_METHOD,null,(SchemaCollection!=null?SchemaCollection:Dispatch.NULL));
  }
  @DeclDISPID(1610809350)  public Boolean Validate() throws ComException {
    final Object obj = this._dispatchCall(1610809350,"Validate", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public _CustomXMLSchemaCollectionImpl(String progId) throws ComException {
    super(progId, "{000CDB02-0000-0000-C000-000000000046}");
  }
  protected _CustomXMLSchemaCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CustomXMLSchemaCollectionImpl" + super.toString() + "]";
  }
}
