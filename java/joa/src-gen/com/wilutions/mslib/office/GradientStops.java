/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * GradientStops.
 * 
 */
@CoInterface(guid="{000C03C0-0000-0000-C000-000000000046}")
public interface GradientStops extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public GradientStop getItem(Integer Index) throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(10)  public void Delete(Integer Index) throws ComException;
  @DeclDISPID(11)  public void Insert(MsoRGBType RGB, Float Position, Float Transparency, Integer Index) throws ComException;
  @DeclDISPID(12)  public void Insert2(MsoRGBType RGB, Float Position, Float Transparency, Integer Index, Float Brightness) throws ComException;
}
