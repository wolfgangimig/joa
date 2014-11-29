/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ChartColorFormat.
 * 
 */
@CoInterface(guid="{000C171D-0000-0000-C000-000000000046}")
public interface ChartColorFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1646)  public Integer getSchemeColor() throws ComException;
  @DeclDISPID(1646)  public void setSchemeColor(Integer RHS) throws ComException;
  @DeclDISPID(1055)  public Integer getRGB() throws ComException;
  @DeclDISPID(1055)  public void setRGB(Integer RHS) throws ComException;
  @DeclDISPID(0)  public Integer get_Default() throws ComException;
  @DeclDISPID(108)  public Integer getType() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
