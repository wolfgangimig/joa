/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomXMLNode.
 * 
 */
@CoInterface(guid="{000CDB04-0000-0000-C000-000000000046}")
public interface CustomXMLNode extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public CustomXMLNodes getAttributes() throws ComException;
  @DeclDISPID(1610809346)  public String getBaseName() throws ComException;
  @DeclDISPID(1610809347)  public CustomXMLNodes getChildNodes() throws ComException;
  @DeclDISPID(1610809348)  public CustomXMLNode getFirstChild() throws ComException;
  @DeclDISPID(1610809349)  public CustomXMLNode getLastChild() throws ComException;
  @DeclDISPID(1610809350)  public String getNamespaceURI() throws ComException;
  @DeclDISPID(1610809351)  public CustomXMLNode getNextSibling() throws ComException;
  @DeclDISPID(1610809352)  public MsoCustomXMLNodeType getNodeType() throws ComException;
  @DeclDISPID(1610809353)  public String getNodeValue() throws ComException;
  @DeclDISPID(1610809353)  public void setNodeValue(String value) throws ComException;
  @DeclDISPID(1610809355)  public IDispatch getOwnerDocument() throws ComException;
  @DeclDISPID(1610809356)  public CustomXMLPart getOwnerPart() throws ComException;
  @DeclDISPID(1610809357)  public CustomXMLNode getPreviousSibling() throws ComException;
  @DeclDISPID(1610809358)  public CustomXMLNode getParentNode() throws ComException;
  @DeclDISPID(1610809359)  public String getText() throws ComException;
  @DeclDISPID(1610809359)  public void setText(String value) throws ComException;
  @DeclDISPID(1610809361)  public String getXPath() throws ComException;
  @DeclDISPID(1610809362)  public String getXML() throws ComException;
  @DeclDISPID(1610809363)  public void AppendChildNode(String Name, String NamespaceURI, MsoCustomXMLNodeType NodeType, String NodeValue) throws ComException;
  @DeclDISPID(1610809364)  public void AppendChildSubtree(String XML) throws ComException;
  @DeclDISPID(1610809365)  public void Delete() throws ComException;
  @DeclDISPID(1610809366)  public Boolean HasChildNodes() throws ComException;
  @DeclDISPID(1610809367)  public void InsertNodeBefore(String Name, String NamespaceURI, MsoCustomXMLNodeType NodeType, String NodeValue, CustomXMLNode NextSibling) throws ComException;
  @DeclDISPID(1610809368)  public void InsertSubtreeBefore(String XML, CustomXMLNode NextSibling) throws ComException;
  @DeclDISPID(1610809369)  public void RemoveChild(CustomXMLNode Child) throws ComException;
  @DeclDISPID(1610809370)  public void ReplaceChildNode(CustomXMLNode OldNode, String Name, String NamespaceURI, MsoCustomXMLNodeType NodeType, String NodeValue) throws ComException;
  @DeclDISPID(1610809371)  public void ReplaceChildSubtree(String XML, CustomXMLNode OldNode) throws ComException;
  @DeclDISPID(1610809372)  public CustomXMLNodes SelectNodes(String XPath) throws ComException;
  @DeclDISPID(1610809373)  public CustomXMLNode SelectSingleNode(String XPath) throws ComException;
}
