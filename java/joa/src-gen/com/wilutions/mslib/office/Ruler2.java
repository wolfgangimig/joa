/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Ruler2.
 * 
 */
@CoInterface(guid="{000C03C1-0000-0000-C000-000000000046}")
public interface Ruler2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public RulerLevels2 getLevels() throws ComException;
  @DeclDISPID(3)  public TabStops2 getTabStops() throws ComException;
}
