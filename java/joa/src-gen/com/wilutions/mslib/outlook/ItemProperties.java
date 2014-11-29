/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ItemProperties.
 * 
 */
@CoInterface(guid="{000630A8-0000-0000-C000-000000000046}")
public interface ItemProperties extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public ItemProperty Item(Object Index) throws ComException;
  @DeclDISPID(102)  public ItemProperty Add(String Name, OlUserPropertyType Type, Object AddToFolderFields, Object DisplayFormat) throws ComException;
  @DeclDISPID(82)  public void Remove(Integer Index) throws ComException;
}
