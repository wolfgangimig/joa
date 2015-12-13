/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * _CommandBars.
 * 
 */
@CoInterface(guid="{000C0302-0000-0000-C000-000000000046}")
public interface _CommandBars extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public CommandBarControl getActionControl() throws ComException;
  @DeclDISPID(1610809345)  public CommandBar getActiveMenuBar() throws ComException;
  @DeclDISPID(1610809346)  public CommandBar Add(final Object Name, final Object Position, final Object MenuBar, final Object Temporary) throws ComException;
  @DeclDISPID(1610809347)  public Integer getCount() throws ComException;
  @DeclDISPID(1610809348)  public Boolean getDisplayTooltips() throws ComException;
  @DeclDISPID(1610809348)  public void setDisplayTooltips(final Boolean value) throws ComException;
  @DeclDISPID(1610809350)  public Boolean getDisplayKeysInTooltips() throws ComException;
  @DeclDISPID(1610809350)  public void setDisplayKeysInTooltips(final Boolean value) throws ComException;
  @DeclDISPID(1610809352)  public CommandBarControl FindControl(final Object Type, final Object Id, final Object Tag, final Object Visible) throws ComException;
  @DeclDISPID(0)  public CommandBar getItem(final Object Index) throws ComException;
  @DeclDISPID(1610809354)  public Boolean getLargeButtons() throws ComException;
  @DeclDISPID(1610809354)  public void setLargeButtons(final Boolean value) throws ComException;
  @DeclDISPID(1610809356)  public MsoMenuAnimation getMenuAnimationStyle() throws ComException;
  @DeclDISPID(1610809356)  public void setMenuAnimationStyle(final MsoMenuAnimation value) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610809359)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809360)  public void ReleaseFocus() throws ComException;
  @DeclDISPID(1610809363)  public Boolean getAdaptiveMenus() throws ComException;
  @DeclDISPID(1610809363)  public void setAdaptiveMenus(final Boolean value) throws ComException;
  @DeclDISPID(1610809365)  public CommandBarControls FindControls(final Object Type, final Object Id, final Object Tag, final Object Visible) throws ComException;
  @DeclDISPID(1610809367)  public Boolean getDisplayFonts() throws ComException;
  @DeclDISPID(1610809367)  public void setDisplayFonts(final Boolean value) throws ComException;
  @DeclDISPID(1610809369)  public Boolean getDisableCustomize() throws ComException;
  @DeclDISPID(1610809369)  public void setDisableCustomize(final Boolean value) throws ComException;
  @DeclDISPID(1610809371)  public Boolean getDisableAskAQuestionDropdown() throws ComException;
  @DeclDISPID(1610809371)  public void setDisableAskAQuestionDropdown(final Boolean value) throws ComException;
  @DeclDISPID(1610809373)  public void ExecuteMso(final String idMso) throws ComException;
  @DeclDISPID(1610809374)  public Boolean GetEnabledMso(final String idMso) throws ComException;
  @DeclDISPID(1610809375)  public Boolean GetVisibleMso(final String idMso) throws ComException;
  @DeclDISPID(1610809376)  public Boolean GetPressedMso(final String idMso) throws ComException;
  @DeclDISPID(1610809377)  public String GetLabelMso(final String idMso) throws ComException;
  @DeclDISPID(1610809378)  public String GetScreentipMso(final String idMso) throws ComException;
  @DeclDISPID(1610809379)  public String GetSupertipMso(final String idMso) throws ComException;
  @DeclDISPID(1610809380)  public com.wilutions.mslib.stdole.IPictureDisp GetImageMso(final String idMso, final Integer Width, final Integer Height) throws ComException;
  @DeclDISPID(1610809381)  public void CommitRenderingTransaction(final Integer hwnd) throws ComException;
}
