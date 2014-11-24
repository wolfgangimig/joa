/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * _CustomXMLSchemaCollection.
 * 
 */
@CoInterface(guid="{000CDB02-0000-0000-C000-000000000046}")
public interface _CustomXMLSchemaCollection extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public CustomXMLSchema getItem(Object Index) throws ComException;
  @DeclDISPID(1610809347)  public String getNamespaceURI(Integer Index) throws ComException;
  @DeclDISPID(1610809348)  public CustomXMLSchema Add(String NamespaceURI, String Alias, String FileName, Boolean InstallForAllUsers) throws ComException;
  @DeclDISPID(1610809349)  public void AddCollection(CustomXMLSchemaCollection SchemaCollection) throws ComException;
  @DeclDISPID(1610809350)  public Boolean Validate() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
