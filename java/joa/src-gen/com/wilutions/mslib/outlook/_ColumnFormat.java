/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _ColumnFormat.
 * 
 */
@CoInterface(guid="{0006309E-0000-0000-C000-000000000046}")
public interface _ColumnFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64030)  public String getLabel() throws ComException;
  @DeclDISPID(64030)  public void setLabel(final String value) throws ComException;
  @DeclDISPID(64396)  public Integer getFieldFormat() throws ComException;
  @DeclDISPID(64396)  public void setFieldFormat(final Integer value) throws ComException;
  @DeclDISPID(8471)  public Integer getWidth() throws ComException;
  @DeclDISPID(8471)  public void setWidth(final Integer value) throws ComException;
  @DeclDISPID(64034)  public OlAlign getAlign() throws ComException;
  @DeclDISPID(64034)  public void setAlign(final OlAlign value) throws ComException;
  @DeclDISPID(64398)  public OlUserPropertyType getFieldType() throws ComException;
}
