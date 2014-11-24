/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IRibbonControl.
 * 
 */
@CoInterface(guid="{000C0395-0000-0000-C000-000000000046}")
public interface IRibbonControl extends IDispatch {
  @DeclDISPID(1)  public String getId() throws ComException;
  @DeclDISPID(2)  public IDispatch getContext() throws ComException;
  @DeclDISPID(3)  public String getTag() throws ComException;
}
