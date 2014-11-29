/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * GradientStop.
 * 
 */
@CoInterface(guid="{000C03BF-0000-0000-C000-000000000046}")
public interface GradientStop extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public ColorFormat getColor() throws ComException;
  @DeclDISPID(2)  public Float getPosition() throws ComException;
  @DeclDISPID(2)  public void setPosition(Float value) throws ComException;
  @DeclDISPID(3)  public Float getTransparency() throws ComException;
  @DeclDISPID(3)  public void setTransparency(Float value) throws ComException;
}
