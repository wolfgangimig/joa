/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MetaProperties.
 * 
 */
@CoInterface(guid="{000C038E-0000-0000-C000-000000000046}")
public interface MetaProperties extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public MetaProperty getItem(final Object Index) throws ComException;
  @DeclDISPID(1)  public MetaProperty GetItemByInternalName(final String InternalName) throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(3)  public String Validate() throws ComException;
  @DeclDISPID(5)  public IDispatch getParent() throws ComException;
  @DeclDISPID(6)  public String getSchemaXml() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
