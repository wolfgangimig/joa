/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * WebComponentWindowExternal.
 * 
 */
@CoInterface(guid="{000CD101-0000-0000-C000-000000000046}")
public interface WebComponentWindowExternal extends IDispatch {
  @DeclDISPID(1)  public Integer getInterfaceVersion() throws ComException;
  @DeclDISPID(2)  public String getApplicationName() throws ComException;
  @DeclDISPID(3)  public Integer getApplicationVersion() throws ComException;
  @DeclDISPID(4)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(5)  public void CloseWindow() throws ComException;
  @DeclDISPID(6)  public WebComponent getWebComponent() throws ComException;
}
