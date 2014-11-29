/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OrderField.
 * 
 */
@CoInterface(guid="{0006309B-0000-0000-C000-000000000046}")
public interface _OrderField extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(8450)  public String getViewXMLSchemaName() throws ComException;
  @DeclDISPID(64394)  public Boolean getIsDescending() throws ComException;
  @DeclDISPID(64394)  public void setIsDescending(Boolean value) throws ComException;
}
