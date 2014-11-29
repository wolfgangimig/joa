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
  @DeclDISPID(64251)  public Object GetProperty(final String SchemaName) throws ComException;
  @DeclDISPID(64252)  public void SetProperty(final String SchemaName, final Object Value) throws ComException;
  @DeclDISPID(64254)  public Object GetProperties(final Object SchemaNames) throws ComException;
  @DeclDISPID(64255)  public Object SetProperties(final Object SchemaNames, final Object Values) throws ComException;
  @DeclDISPID(64256)  public java.util.Date UTCToLocalTime(final java.util.Date Value) throws ComException;
  @DeclDISPID(64257)  public java.util.Date LocalTimeToUTC(final java.util.Date Value) throws ComException;
  @DeclDISPID(64258)  public Object StringToBinary(final String Value) throws ComException;
  @DeclDISPID(64259)  public String BinaryToString(final Object Value) throws ComException;
  @DeclDISPID(64401)  public void DeleteProperty(final String SchemaName) throws ComException;
  @DeclDISPID(64402)  public Object DeleteProperties(final Object SchemaNames) throws ComException;
}
