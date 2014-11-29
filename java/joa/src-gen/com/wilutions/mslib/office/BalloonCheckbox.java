/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * BalloonCheckbox.
 * 
 */
@CoInterface(guid="{000C0328-0000-0000-C000-000000000046}")
public interface BalloonCheckbox extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getItem() throws ComException;
  @DeclDISPID(1610809345)  public String getName() throws ComException;
  @DeclDISPID(1610809346)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809347)  public void setChecked(Boolean value) throws ComException;
  @DeclDISPID(1610809347)  public Boolean getChecked() throws ComException;
  @DeclDISPID(1610809349)  public void setText(String value) throws ComException;
  @DeclDISPID(1610809349)  public String getText() throws ComException;
}
