/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * _CustomXMLParts.
 * 
 */
@CoInterface(guid="{000CDB09-0000-0000-C000-000000000046}")
public interface _CustomXMLParts extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public CustomXMLPart getItem(final Object Index) throws ComException;
  @DeclDISPID(1610809347)  public CustomXMLPart Add(final String XML, final Object SchemaCollection) throws ComException;
  @DeclDISPID(1610809348)  public CustomXMLPart SelectByID(final String Id) throws ComException;
  @DeclDISPID(1610809349)  public CustomXMLParts SelectByNamespace(final String NamespaceURI) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
