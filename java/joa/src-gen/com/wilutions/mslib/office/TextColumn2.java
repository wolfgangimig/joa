/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * TextColumn2.
 * 
 */
@CoInterface(guid="{000C03B2-0000-0000-C000-000000000046}")
public interface TextColumn2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Integer getNumber() throws ComException;
  @DeclDISPID(1)  public void setNumber(Integer value) throws ComException;
  @DeclDISPID(2)  public Float getSpacing() throws ComException;
  @DeclDISPID(2)  public void setSpacing(Float value) throws ComException;
  @DeclDISPID(3)  public MsoTextDirection getTextDirection() throws ComException;
  @DeclDISPID(3)  public void setTextDirection(MsoTextDirection value) throws ComException;
}
