/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Trendlines.
 * 
 */
@CoInterface(guid="{000C1722-0000-0000-C000-000000000046}")
public interface Trendlines extends IDispatch {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(181)  public IMsoTrendline Add(XlTrendlineType Type, Object Order, Object Period, Object Forward, Object Backward, Object Intercept, Object DisplayEquation, Object DisplayRSquared, Object Name) throws ComException;
  @DeclDISPID(118)  public Integer getCount() throws ComException;
  @DeclDISPID(170)  public IMsoTrendline Item(Object Index) throws ComException;
  @DeclDISPID(-4)  public Object _NewEnum() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public IMsoTrendline get_Default(Object Index) throws ComException;
}
