/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ChartGroups.
 * 
 */
@CoInterface(guid="{000C172B-0000-0000-C000-000000000046}")
public interface ChartGroups extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(118)  public Integer getCount() throws ComException;
  @DeclDISPID(170)  public IMsoChartGroup Item(final Object Index) throws ComException;
  @DeclDISPID(-4)  public Object _NewEnum() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
