/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _PropertyAccessor.
 * 
 */
@CoInterface(guid="{0006302D-0000-0000-C000-000000000046}")
public interface _PropertyAccessor extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64251)  public Object GetProperty(String SchemaName) throws ComException;
  @DeclDISPID(64252)  public void SetProperty(String SchemaName, Object Value) throws ComException;
  @DeclDISPID(64254)  public Object GetProperties(Object SchemaNames) throws ComException;
  @DeclDISPID(64255)  public Object SetProperties(Object SchemaNames, Object Values) throws ComException;
  @DeclDISPID(64256)  public java.util.Date UTCToLocalTime(java.util.Date Value) throws ComException;
  @DeclDISPID(64257)  public java.util.Date LocalTimeToUTC(java.util.Date Value) throws ComException;
  @DeclDISPID(64258)  public Object StringToBinary(String Value) throws ComException;
  @DeclDISPID(64259)  public String BinaryToString(Object Value) throws ComException;
  @DeclDISPID(64401)  public void DeleteProperty(String SchemaName) throws ComException;
  @DeclDISPID(64402)  public Object DeleteProperties(Object SchemaNames) throws ComException;
}
