/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomXMLPrefixMappings.
 * 
 */
@CoInterface(guid="{000CDB00-0000-0000-C000-000000000046}")
public interface CustomXMLPrefixMappings extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public CustomXMLPrefixMapping getItem(Object Index) throws ComException;
  @DeclDISPID(1610809347)  public void AddNamespace(String Prefix, String NamespaceURI) throws ComException;
  @DeclDISPID(1610809348)  public String LookupNamespace(String Prefix) throws ComException;
  @DeclDISPID(1610809349)  public String LookupPrefix(String NamespaceURI) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
