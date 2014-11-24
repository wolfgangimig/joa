/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _SyncObject.
 * 
 */
@CoInterface(guid="{00063083-0000-0000-C000-000000000046}")
public interface _SyncObject extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(8448)  public String getName() throws ComException;
  @DeclDISPID(8449)  public void Start() throws ComException;
  @DeclDISPID(8450)  public void Stop() throws ComException;
}
