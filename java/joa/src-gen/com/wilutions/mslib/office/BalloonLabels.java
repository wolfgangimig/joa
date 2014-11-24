/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * BalloonLabels.
 * 
 */
@CoInterface(guid="{000C032E-0000-0000-C000-000000000046}")
public interface BalloonLabels extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public String getName() throws ComException;
  @DeclDISPID(1610809345)  public IDispatch getParent() throws ComException;
  @DeclDISPID(0)  public IDispatch getItem(Integer Index) throws ComException;
  @DeclDISPID(1610809347)  public Integer getCount() throws ComException;
  @DeclDISPID(1610809347)  public void setCount(Integer value) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
