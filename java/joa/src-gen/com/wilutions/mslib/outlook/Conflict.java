/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Conflict.
 * 
 */
@CoInterface(guid="{000630C3-0000-0000-C000-000000000046}")
public interface Conflict extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(64184)  public Dispatch getItem() throws ComException;
  @DeclDISPID(64185)  public String getName() throws ComException;
  @DeclDISPID(64188)  public OlObjectClass getType() throws ComException;
}
