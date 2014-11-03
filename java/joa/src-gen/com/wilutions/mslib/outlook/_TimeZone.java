/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _TimeZone.
 * 
 */
@CoInterface(guid="{000630FD-0000-0000-C000-000000000046}")
public interface _TimeZone extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(8450)  public String getName() throws ComException;
  @DeclDISPID(64555)  public String getDaylightDesignation() throws ComException;
  @DeclDISPID(64556)  public String getStandardDesignation() throws ComException;
  @DeclDISPID(64545)  public Integer getBias() throws ComException;
  @DeclDISPID(64546)  public Integer getStandardBias() throws ComException;
  @DeclDISPID(64547)  public Integer getDaylightBias() throws ComException;
  @DeclDISPID(64548)  public java.util.Date getStandardDate() throws ComException;
  @DeclDISPID(64549)  public java.util.Date getDaylightDate() throws ComException;
  @DeclDISPID(64562)  public String getID() throws ComException;
}
