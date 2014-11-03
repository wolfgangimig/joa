/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Link.
 * 
 */
@CoInterface(guid="{00063089-0000-0000-C000-000000000046}")
public interface Link extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(109)  public Dispatch getParent() throws ComException;
  @DeclDISPID(12289)  public String getName() throws ComException;
  @DeclDISPID(8449)  public OlObjectClass getType() throws ComException;
  @DeclDISPID(8450)  public Dispatch getItem() throws ComException;
}
