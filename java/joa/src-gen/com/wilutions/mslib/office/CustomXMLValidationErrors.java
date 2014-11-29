/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomXMLValidationErrors.
 * 
 */
@CoInterface(guid="{000CDB0F-0000-0000-C000-000000000046}")
public interface CustomXMLValidationErrors extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public CustomXMLValidationError getItem(final Integer Index) throws ComException;
  @DeclDISPID(1610809347)  public void Add(final CustomXMLNode Node, final String ErrorName, final String ErrorText, final Boolean ClearedOnUpdate) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
