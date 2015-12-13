/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * _CustomXMLPart.
 * 
 */
@CoInterface(guid="{000CDB05-0000-0000-C000-000000000046}")
public interface _CustomXMLPart extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public CustomXMLNode getDocumentElement() throws ComException;
  @DeclDISPID(1610809346)  public String getId() throws ComException;
  @DeclDISPID(1610809347)  public String getNamespaceURI() throws ComException;
  @DeclDISPID(1610809348)  public CustomXMLSchemaCollection getSchemaCollection() throws ComException;
  @DeclDISPID(1610809348)  public void setSchemaCollection(final CustomXMLSchemaCollection value) throws ComException;
  @DeclDISPID(1610809350)  public CustomXMLPrefixMappings getNamespaceManager() throws ComException;
  @DeclDISPID(1610809351)  public String getXML() throws ComException;
  @DeclDISPID(1610809352)  public void AddNode(final CustomXMLNode Parent, final String Name, final String NamespaceURI, final CustomXMLNode NextSibling, final MsoCustomXMLNodeType NodeType, final String NodeValue) throws ComException;
  @DeclDISPID(1610809353)  public void Delete() throws ComException;
  @DeclDISPID(1610809354)  public Boolean Load(final String FilePath) throws ComException;
  @DeclDISPID(1610809355)  public Boolean LoadXML(final String XML) throws ComException;
  @DeclDISPID(1610809356)  public CustomXMLNodes SelectNodes(final String XPath) throws ComException;
  @DeclDISPID(1610809357)  public CustomXMLNode SelectSingleNode(final String XPath) throws ComException;
  @DeclDISPID(1610809358)  public CustomXMLValidationErrors getErrors() throws ComException;
  @DeclDISPID(1610809359)  public Boolean getBuiltIn() throws ComException;
}
