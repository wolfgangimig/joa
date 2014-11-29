/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CommandBar.
 * 
 */
@CoInterface(guid="{000C0304-0000-0000-C000-000000000046}")
public interface CommandBar extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610809344)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610809345)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610874880)  public Boolean getBuiltIn() throws ComException;
  @DeclDISPID(1610874881)  public String getContext() throws ComException;
  @DeclDISPID(1610874881)  public void setContext(final String value) throws ComException;
  @DeclDISPID(1610874883)  public CommandBarControls getControls() throws ComException;
  @DeclDISPID(1610874884)  public void Delete() throws ComException;
  @DeclDISPID(1610874885)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(1610874885)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(1610874887)  public CommandBarControl FindControl(final Object Type, final Object Id, final Object Tag, final Object Visible, final Object Recursive) throws ComException;
  @DeclDISPID(1610874888)  public Integer getHeight() throws ComException;
  @DeclDISPID(1610874888)  public void setHeight(final Integer value) throws ComException;
  @DeclDISPID(1610874890)  public Integer getIndex() throws ComException;
  @DeclDISPID(1610874892)  public Integer getLeft() throws ComException;
  @DeclDISPID(1610874892)  public void setLeft(final Integer value) throws ComException;
  @DeclDISPID(1610874894)  public String getName() throws ComException;
  @DeclDISPID(1610874894)  public void setName(final String value) throws ComException;
  @DeclDISPID(1610874896)  public String getNameLocal() throws ComException;
  @DeclDISPID(1610874896)  public void setNameLocal(final String value) throws ComException;
  @DeclDISPID(1610874898)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610874899)  public MsoBarPosition getPosition() throws ComException;
  @DeclDISPID(1610874899)  public void setPosition(final MsoBarPosition value) throws ComException;
  @DeclDISPID(1610874901)  public Integer getRowIndex() throws ComException;
  @DeclDISPID(1610874901)  public void setRowIndex(final Integer value) throws ComException;
  @DeclDISPID(1610874903)  public MsoBarProtection getProtection() throws ComException;
  @DeclDISPID(1610874903)  public void setProtection(final MsoBarProtection value) throws ComException;
  @DeclDISPID(1610874905)  public void Reset() throws ComException;
  @DeclDISPID(1610874906)  public void ShowPopup(final Object x, final Object y) throws ComException;
  @DeclDISPID(1610874907)  public Integer getTop() throws ComException;
  @DeclDISPID(1610874907)  public void setTop(final Integer value) throws ComException;
  @DeclDISPID(1610874909)  public MsoBarType getType() throws ComException;
  @DeclDISPID(1610874910)  public Boolean getVisible() throws ComException;
  @DeclDISPID(1610874910)  public void setVisible(final Boolean value) throws ComException;
  @DeclDISPID(1610874912)  public Integer getWidth() throws ComException;
  @DeclDISPID(1610874912)  public void setWidth(final Integer value) throws ComException;
  @DeclDISPID(1610874914)  public Boolean getAdaptiveMenu() throws ComException;
  @DeclDISPID(1610874914)  public void setAdaptiveMenu(final Boolean value) throws ComException;
}
