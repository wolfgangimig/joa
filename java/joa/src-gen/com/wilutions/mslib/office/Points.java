/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Points.
 * 
 */
@CoInterface(guid="{000C170D-0000-0000-C000-000000000046}")
public interface Points extends IDispatch {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException;
  @DeclDISPID(118)  public Integer getCount() throws ComException;
  @DeclDISPID(170)  public ChartPoint Item(Integer Index) throws ComException;
  @DeclDISPID(-4)  public Object _NewEnum() throws ComException;
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public ChartPoint get_Default(Integer Index) throws ComException;
}
