/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Balloon.
 * 
 */
@CoInterface(guid="{000C0324-0000-0000-C000-000000000046}")
public interface Balloon extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public IDispatch getCheckboxes() throws ComException;
  @DeclDISPID(1610809346)  public IDispatch getLabels() throws ComException;
  @DeclDISPID(1610809347)  public void setBalloonType(final MsoBalloonType value) throws ComException;
  @DeclDISPID(1610809347)  public MsoBalloonType getBalloonType() throws ComException;
  @DeclDISPID(1610809349)  public void setIcon(final MsoIconType value) throws ComException;
  @DeclDISPID(1610809349)  public MsoIconType getIcon() throws ComException;
  @DeclDISPID(1610809351)  public void setHeading(final String value) throws ComException;
  @DeclDISPID(1610809351)  public String getHeading() throws ComException;
  @DeclDISPID(1610809353)  public void setText(final String value) throws ComException;
  @DeclDISPID(1610809353)  public String getText() throws ComException;
  @DeclDISPID(1610809355)  public void setMode(final MsoModeType value) throws ComException;
  @DeclDISPID(1610809355)  public MsoModeType getMode() throws ComException;
  @DeclDISPID(1610809357)  public void setAnimation(final MsoAnimationType value) throws ComException;
  @DeclDISPID(1610809357)  public MsoAnimationType getAnimation() throws ComException;
  @DeclDISPID(1610809359)  public void setButton(final MsoButtonSetType value) throws ComException;
  @DeclDISPID(1610809359)  public MsoButtonSetType getButton() throws ComException;
  @DeclDISPID(1610809361)  public void setCallback(final String value) throws ComException;
  @DeclDISPID(1610809361)  public String getCallback() throws ComException;
  @DeclDISPID(1610809363)  public void setPrivate(final Integer value) throws ComException;
  @DeclDISPID(1610809363)  public Integer getPrivate() throws ComException;
  @DeclDISPID(1610809365)  public void SetAvoidRectangle(final Integer Left, final Integer Top, final Integer Right, final Integer Bottom) throws ComException;
  @DeclDISPID(1610809366)  public String getName() throws ComException;
  @DeclDISPID(1610809367)  public MsoBalloonButtonType Show() throws ComException;
  @DeclDISPID(1610809368)  public void Close() throws ComException;
}
