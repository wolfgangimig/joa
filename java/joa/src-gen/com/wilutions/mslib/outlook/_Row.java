/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Row.
 * 
 */
@CoInterface(guid="{000630D3-0000-0000-C000-000000000046}")
public interface _Row extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64259)  public String BinaryToString(Object Index) throws ComException;
  @DeclDISPID(64462)  public Object GetValues() throws ComException;
  @DeclDISPID(81)  public Object Item(Object Index) throws ComException;
  @DeclDISPID(64257)  public java.util.Date LocalTimeToUTC(Object Index) throws ComException;
  @DeclDISPID(64256)  public java.util.Date UTCToLocalTime(Object Index) throws ComException;
}
