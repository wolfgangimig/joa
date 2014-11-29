/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * RulerLevel2.
 * 
 */
@CoInterface(guid="{000C03C3-0000-0000-C000-000000000046}")
public interface RulerLevel2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public Float getFirstMargin() throws ComException;
  @DeclDISPID(2)  public void setFirstMargin(final Float value) throws ComException;
  @DeclDISPID(3)  public Float getLeftMargin() throws ComException;
  @DeclDISPID(3)  public void setLeftMargin(final Float value) throws ComException;
}
