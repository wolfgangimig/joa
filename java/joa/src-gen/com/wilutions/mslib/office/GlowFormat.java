/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * GlowFormat.
 * 
 */
@CoInterface(guid="{000C03BD-0000-0000-C000-000000000046}")
public interface GlowFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Float getRadius() throws ComException;
  @DeclDISPID(1)  public void setRadius(final Float value) throws ComException;
  @DeclDISPID(2)  public ColorFormat getColor() throws ComException;
  @DeclDISPID(3)  public Float getTransparency() throws ComException;
  @DeclDISPID(3)  public void setTransparency(final Float value) throws ComException;
}
