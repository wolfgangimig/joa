/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Exception.
 * 
 */
@CoInterface(guid="{0006304D-0000-0000-C000-000000000046}")
public interface Exception extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(8193)  public AppointmentItem getAppointmentItem() throws ComException;
  @DeclDISPID(8194)  public Boolean getDeleted() throws ComException;
  @DeclDISPID(8192)  public java.util.Date getOriginalDate() throws ComException;
}
