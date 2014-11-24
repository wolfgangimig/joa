/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Adjustments.
 * 
 */
@CoInterface(guid="{000C0310-0000-0000-C000-000000000046}")
public interface Adjustments extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Float getItem(Integer Index) throws ComException;
  @DeclDISPID(0)  public void setItem(Integer Index, Float value2) throws ComException;
}
