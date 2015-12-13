/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomXMLPrefixMappings.
 * 
 */
@CoInterface(guid="{000CDB00-0000-0000-C000-000000000046}")
public interface CustomXMLPrefixMappings extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public CustomXMLPrefixMapping getItem(final Object Index) throws ComException;
  @DeclDISPID(1610809347)  public void AddNamespace(final String Prefix, final String NamespaceURI) throws ComException;
  @DeclDISPID(1610809348)  public String LookupNamespace(final String Prefix) throws ComException;
  @DeclDISPID(1610809349)  public String LookupPrefix(final String NamespaceURI) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
