/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * _CustomXMLPart.
 * 
 */
@CoInterface(guid="{000CDB05-0000-0000-C000-000000000046}")
public interface _CustomXMLPart extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public CustomXMLNode getDocumentElement() throws ComException;
  @DeclDISPID(1610809346)  public String getId() throws ComException;
  @DeclDISPID(1610809347)  public String getNamespaceURI() throws ComException;
  @DeclDISPID(1610809348)  public CustomXMLSchemaCollection getSchemaCollection() throws ComException;
  @DeclDISPID(1610809348)  public void setSchemaCollection(CustomXMLSchemaCollection value) throws ComException;
  @DeclDISPID(1610809350)  public CustomXMLPrefixMappings getNamespaceManager() throws ComException;
  @DeclDISPID(1610809351)  public String getXML() throws ComException;
  @DeclDISPID(1610809352)  public void AddNode(CustomXMLNode Parent, String Name, String NamespaceURI, CustomXMLNode NextSibling, MsoCustomXMLNodeType NodeType, String NodeValue) throws ComException;
  @DeclDISPID(1610809353)  public void Delete() throws ComException;
  @DeclDISPID(1610809354)  public Boolean Load(String FilePath) throws ComException;
  @DeclDISPID(1610809355)  public Boolean LoadXML(String XML) throws ComException;
  @DeclDISPID(1610809356)  public CustomXMLNodes SelectNodes(String XPath) throws ComException;
  @DeclDISPID(1610809357)  public CustomXMLNode SelectSingleNode(String XPath) throws ComException;
  @DeclDISPID(1610809358)  public CustomXMLValidationErrors getErrors() throws ComException;
  @DeclDISPID(1610809359)  public Boolean getBuiltIn() throws ComException;
}
