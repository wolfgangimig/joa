/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OutlookBarPane.
 * 
 */
@CoInterface(guid="{00063070-0000-0000-C000-000000000046}")
public interface _OutlookBarPane extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(8448)  public OutlookBarStorage getContents() throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(8451)  public Boolean getVisible() throws ComException;
  @DeclDISPID(8451)  public void setVisible(Boolean value) throws ComException;
}
