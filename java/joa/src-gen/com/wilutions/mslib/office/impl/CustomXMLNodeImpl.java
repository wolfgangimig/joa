/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B426F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class CustomXMLNodeImpl extends Dispatch implements com.wilutions.mslib.office.CustomXMLNode {
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
  @DeclDISPID(1610809345)  public com.wilutions.mslib.office.CustomXMLNodes getAttributes() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Attributes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodesImpl.class);
  }
  @DeclDISPID(1610809346)  public String getBaseName() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"BaseName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809347)  public com.wilutions.mslib.office.CustomXMLNodes getChildNodes() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"ChildNodes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodesImpl.class);
  }
  @DeclDISPID(1610809348)  public com.wilutions.mslib.office.CustomXMLNode getFirstChild() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"FirstChild", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodeImpl.class);
  }
  @DeclDISPID(1610809349)  public com.wilutions.mslib.office.CustomXMLNode getLastChild() throws ComException {
    final Object obj = this._dispatchCall(1610809349,"LastChild", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodeImpl.class);
  }
  @DeclDISPID(1610809350)  public String getNamespaceURI() throws ComException {
    final Object obj = this._dispatchCall(1610809350,"NamespaceURI", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809351)  public com.wilutions.mslib.office.CustomXMLNode getNextSibling() throws ComException {
    final Object obj = this._dispatchCall(1610809351,"NextSibling", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodeImpl.class);
  }
  @DeclDISPID(1610809352)  public com.wilutions.mslib.office.MsoCustomXMLNodeType getNodeType() throws ComException {
    final Object obj = this._dispatchCall(1610809352,"NodeType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoCustomXMLNodeType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809353)  public String getNodeValue() throws ComException {
    final Object obj = this._dispatchCall(1610809353,"NodeValue", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809353)  public void setNodeValue(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809353,"NodeValue", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809355)  public IDispatch getOwnerDocument() throws ComException {
    final Object obj = this._dispatchCall(1610809355,"OwnerDocument", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809356)  public com.wilutions.mslib.office.CustomXMLPart getOwnerPart() throws ComException {
    final Object obj = this._dispatchCall(1610809356,"OwnerPart", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.office.CustomXMLPart.class);
  }
  @DeclDISPID(1610809357)  public com.wilutions.mslib.office.CustomXMLNode getPreviousSibling() throws ComException {
    final Object obj = this._dispatchCall(1610809357,"PreviousSibling", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodeImpl.class);
  }
  @DeclDISPID(1610809358)  public com.wilutions.mslib.office.CustomXMLNode getParentNode() throws ComException {
    final Object obj = this._dispatchCall(1610809358,"ParentNode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodeImpl.class);
  }
  @DeclDISPID(1610809359)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(1610809359,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809359)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809359,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809361)  public String getXPath() throws ComException {
    final Object obj = this._dispatchCall(1610809361,"XPath", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809362)  public String getXML() throws ComException {
    final Object obj = this._dispatchCall(1610809362,"XML", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809363)  public void AppendChildNode(String Name, String NamespaceURI, com.wilutions.mslib.office.MsoCustomXMLNodeType NodeType, String NodeValue) throws ComException {
    assert(Name != null);
    assert(NamespaceURI != null);
    assert(NodeType != null);
    assert(NodeValue != null);
    this._dispatchCall(1610809363,"AppendChildNode", DISPATCH_METHOD,null,Name,NamespaceURI,NodeType.value,NodeValue);
  }
  @DeclDISPID(1610809364)  public void AppendChildSubtree(String XML) throws ComException {
    assert(XML != null);
    this._dispatchCall(1610809364,"AppendChildSubtree", DISPATCH_METHOD,null,XML);
  }
  @DeclDISPID(1610809365)  public void Delete() throws ComException {
    this._dispatchCall(1610809365,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809366)  public Boolean HasChildNodes() throws ComException {
    final Object obj = this._dispatchCall(1610809366,"HasChildNodes", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809367)  public void InsertNodeBefore(String Name, String NamespaceURI, com.wilutions.mslib.office.MsoCustomXMLNodeType NodeType, String NodeValue, com.wilutions.mslib.office.CustomXMLNode NextSibling) throws ComException {
    assert(Name != null);
    assert(NamespaceURI != null);
    assert(NodeType != null);
    assert(NodeValue != null);
    this._dispatchCall(1610809367,"InsertNodeBefore", DISPATCH_METHOD,null,Name,NamespaceURI,NodeType.value,NodeValue,(NextSibling!=null?NextSibling:Dispatch.NULL));
  }
  @DeclDISPID(1610809368)  public void InsertSubtreeBefore(String XML, com.wilutions.mslib.office.CustomXMLNode NextSibling) throws ComException {
    assert(XML != null);
    this._dispatchCall(1610809368,"InsertSubtreeBefore", DISPATCH_METHOD,null,XML,(NextSibling!=null?NextSibling:Dispatch.NULL));
  }
  @DeclDISPID(1610809369)  public void RemoveChild(com.wilutions.mslib.office.CustomXMLNode Child) throws ComException {
    this._dispatchCall(1610809369,"RemoveChild", DISPATCH_METHOD,null,(Child!=null?Child:Dispatch.NULL));
  }
  @DeclDISPID(1610809370)  public void ReplaceChildNode(com.wilutions.mslib.office.CustomXMLNode OldNode, String Name, String NamespaceURI, com.wilutions.mslib.office.MsoCustomXMLNodeType NodeType, String NodeValue) throws ComException {
    assert(Name != null);
    assert(NamespaceURI != null);
    assert(NodeType != null);
    assert(NodeValue != null);
    this._dispatchCall(1610809370,"ReplaceChildNode", DISPATCH_METHOD,null,(OldNode!=null?OldNode:Dispatch.NULL),Name,NamespaceURI,NodeType.value,NodeValue);
  }
  @DeclDISPID(1610809371)  public void ReplaceChildSubtree(String XML, com.wilutions.mslib.office.CustomXMLNode OldNode) throws ComException {
    assert(XML != null);
    this._dispatchCall(1610809371,"ReplaceChildSubtree", DISPATCH_METHOD,null,XML,(OldNode!=null?OldNode:Dispatch.NULL));
  }
  @DeclDISPID(1610809372)  public com.wilutions.mslib.office.CustomXMLNodes SelectNodes(String XPath) throws ComException {
    assert(XPath != null);
    final Object obj = this._dispatchCall(1610809372,"SelectNodes", DISPATCH_METHOD,null,XPath);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodesImpl.class);
  }
  @DeclDISPID(1610809373)  public com.wilutions.mslib.office.CustomXMLNode SelectSingleNode(String XPath) throws ComException {
    assert(XPath != null);
    final Object obj = this._dispatchCall(1610809373,"SelectSingleNode", DISPATCH_METHOD,null,XPath);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLNodeImpl.class);
  }
  public CustomXMLNodeImpl(String progId) throws ComException {
    super(progId, "{000CDB04-0000-0000-C000-000000000046}");
  }
  protected CustomXMLNodeImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomXMLNodeImpl" + super.toString() + "]";
  }
}
