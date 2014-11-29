/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomXMLPart.
 * 
 */
@CoClass(guid="{000CDB08-0000-0000-C000-000000000046}")
public class CustomXMLPart extends Dispatch implements _CustomXMLPart {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809345)  public CustomXMLNode getDocumentElement() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"DocumentElement", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodeImpl.class);
  }
  @DeclDISPID(1610809346)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809347)  public String getNamespaceURI() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"NamespaceURI", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809348)  public CustomXMLSchemaCollection getSchemaCollection() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"SchemaCollection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(CustomXMLSchemaCollection.class);
  }
  @DeclDISPID(1610809348)  public void setSchemaCollection(final CustomXMLSchemaCollection value) throws ComException {
    this._dispatchCall(1610809348,"SchemaCollection", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610809350)  public CustomXMLPrefixMappings getNamespaceManager() throws ComException {
    final Object obj = this._dispatchCall(1610809350,"NamespaceManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLPrefixMappingsImpl.class);
  }
  @DeclDISPID(1610809351)  public String getXML() throws ComException {
    final Object obj = this._dispatchCall(1610809351,"XML", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809352)  public void AddNode(final CustomXMLNode Parent, final String Name, final String NamespaceURI, final CustomXMLNode NextSibling, final MsoCustomXMLNodeType NodeType, final String NodeValue) throws ComException {
    assert(Name != null);
    assert(NamespaceURI != null);
    assert(NodeType != null);
    assert(NodeValue != null);
    this._dispatchCall(1610809352,"AddNode", DISPATCH_METHOD,null,(Parent!=null?Parent:Dispatch.NULL),Name,NamespaceURI,(NextSibling!=null?NextSibling:Dispatch.NULL),NodeType.value,NodeValue);
  }
  @DeclDISPID(1610809353)  public void Delete() throws ComException {
    this._dispatchCall(1610809353,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809354)  public Boolean Load(final String FilePath) throws ComException {
    assert(FilePath != null);
    final Object obj = this._dispatchCall(1610809354,"Load", DISPATCH_METHOD,null,FilePath);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809355)  public Boolean LoadXML(final String XML) throws ComException {
    assert(XML != null);
    final Object obj = this._dispatchCall(1610809355,"LoadXML", DISPATCH_METHOD,null,XML);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809356)  public CustomXMLNodes SelectNodes(final String XPath) throws ComException {
    assert(XPath != null);
    final Object obj = this._dispatchCall(1610809356,"SelectNodes", DISPATCH_METHOD,null,XPath);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodesImpl.class);
  }
  @DeclDISPID(1610809357)  public CustomXMLNode SelectSingleNode(final String XPath) throws ComException {
    assert(XPath != null);
    final Object obj = this._dispatchCall(1610809357,"SelectSingleNode", DISPATCH_METHOD,null,XPath);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodeImpl.class);
  }
  @DeclDISPID(1610809358)  public CustomXMLValidationErrors getErrors() throws ComException {
    final Object obj = this._dispatchCall(1610809358,"Errors", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLValidationErrorsImpl.class);
  }
  @DeclDISPID(1610809359)  public Boolean getBuiltIn() throws ComException {
    final Object obj = this._dispatchCall(1610809359,"BuiltIn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public CustomXMLPart() throws ComException {
    super("{000CDB08-0000-0000-C000-000000000046}", "{000CDB05-0000-0000-C000-000000000046}");
  }
  protected CustomXMLPart(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomXMLPart" + super.toString() + "]";
  }
}
