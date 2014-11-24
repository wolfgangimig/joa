/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _TimeZones.
 * 
 */
@CoInterface(guid="{000630FC-0000-0000-C000-000000000046}")
public interface _TimeZones extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _TimeZone Item(Object Index) throws ComException;
  @DeclDISPID(64550)  public java.util.Date ConvertTime(java.util.Date SourceDateTime, _TimeZone SourceTimeZone, _TimeZone DestinationTimeZone) throws ComException;
  @DeclDISPID(64554)  public _TimeZone getCurrentTimeZone() throws ComException;
}
