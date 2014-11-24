/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OutlookBarShortcut.
 * 
 */
@CoInterface(guid="{00063075-0000-0000-C000-000000000046}")
public interface OutlookBarShortcut extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(0)  public void setName(String value) throws ComException;
  @DeclDISPID(8448)  public Object getTarget() throws ComException;
  @DeclDISPID(64162)  public void SetIcon(Object Icon) throws ComException;
}
