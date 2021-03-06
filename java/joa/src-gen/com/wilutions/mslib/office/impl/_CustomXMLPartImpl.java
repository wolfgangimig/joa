/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B426E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CustomXMLPartImpl extends Dispatch implements com.wilutions.mslib.office._CustomXMLPart {
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
  @DeclDISPID(1610809345)  public com.wilutions.mslib.office.CustomXMLNode getDocumentElement() throws ComException {
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
  @DeclDISPID(1610809348)  public com.wilutions.mslib.office.CustomXMLSchemaCollection getSchemaCollection() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"SchemaCollection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.office.CustomXMLSchemaCollection.class);
  }
  @DeclDISPID(1610809348)  public void setSchemaCollection(final com.wilutions.mslib.office.CustomXMLSchemaCollection value) throws ComException {
    this._dispatchCall(1610809348,"SchemaCollection", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(1610809350)  public com.wilutions.mslib.office.CustomXMLPrefixMappings getNamespaceManager() throws ComException {
    final Object obj = this._dispatchCall(1610809350,"NamespaceManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLPrefixMappingsImpl.class);
  }
  @DeclDISPID(1610809351)  public String getXML() throws ComException {
    final Object obj = this._dispatchCall(1610809351,"XML", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809352)  public void AddNode(final com.wilutions.mslib.office.CustomXMLNode Parent, final String Name, final String NamespaceURI, final com.wilutions.mslib.office.CustomXMLNode NextSibling, final com.wilutions.mslib.office.MsoCustomXMLNodeType NodeType, final String NodeValue) throws ComException {
    assert(Name != null);
    assert(NamespaceURI != null);
    assert(NodeType != null);
    assert(NodeValue != null);
    this._dispatchCall(1610809352,"AddNode", DISPATCH_METHOD,null,Dispatch.param(Parent),Name,NamespaceURI,Dispatch.param(NextSibling),NodeType.value,NodeValue);
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
  @DeclDISPID(1610809356)  public com.wilutions.mslib.office.CustomXMLNodes SelectNodes(final String XPath) throws ComException {
    assert(XPath != null);
    final Object obj = this._dispatchCall(1610809356,"SelectNodes", DISPATCH_METHOD,null,XPath);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodesImpl.class);
  }
  @DeclDISPID(1610809357)  public com.wilutions.mslib.office.CustomXMLNode SelectSingleNode(final String XPath) throws ComException {
    assert(XPath != null);
    final Object obj = this._dispatchCall(1610809357,"SelectSingleNode", DISPATCH_METHOD,null,XPath);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodeImpl.class);
  }
  @DeclDISPID(1610809358)  public com.wilutions.mslib.office.CustomXMLValidationErrors getErrors() throws ComException {
    final Object obj = this._dispatchCall(1610809358,"Errors", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLValidationErrorsImpl.class);
  }
  @DeclDISPID(1610809359)  public Boolean getBuiltIn() throws ComException {
    final Object obj = this._dispatchCall(1610809359,"BuiltIn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public _CustomXMLPartImpl(String progId) throws ComException {
    super(progId, "{000CDB05-0000-0000-C000-000000000046}");
  }
  protected _CustomXMLPartImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CustomXMLPartImpl" + super.toString() + "]";
  }
}
