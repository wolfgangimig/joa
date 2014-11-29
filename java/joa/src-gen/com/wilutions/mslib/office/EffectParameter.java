/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * EffectParameter.
 * 
 */
@CoInterface(guid="{000C03CF-0000-0000-C000-000000000046}")
public interface EffectParameter extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(1)  public Object getValue() throws ComException;
  @DeclDISPID(1)  public void setValue(Object value) throws ComException;
}
