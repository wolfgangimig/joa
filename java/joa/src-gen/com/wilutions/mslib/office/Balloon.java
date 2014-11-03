/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Balloon.
 * 
 */
@CoInterface(guid="{000C0324-0000-0000-C000-000000000046}")
public interface Balloon extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public Dispatch getCheckboxes() throws ComException;
  @DeclDISPID(1610809346)  public Dispatch getLabels() throws ComException;
  @DeclDISPID(1610809347)  public void setBalloonType(MsoBalloonType value) throws ComException;
  @DeclDISPID(1610809347)  public MsoBalloonType getBalloonType() throws ComException;
  @DeclDISPID(1610809349)  public void setIcon(MsoIconType value) throws ComException;
  @DeclDISPID(1610809349)  public MsoIconType getIcon() throws ComException;
  @DeclDISPID(1610809351)  public void setHeading(String value) throws ComException;
  @DeclDISPID(1610809351)  public String getHeading() throws ComException;
  @DeclDISPID(1610809353)  public void setText(String value) throws ComException;
  @DeclDISPID(1610809353)  public String getText() throws ComException;
  @DeclDISPID(1610809355)  public void setMode(MsoModeType value) throws ComException;
  @DeclDISPID(1610809355)  public MsoModeType getMode() throws ComException;
  @DeclDISPID(1610809357)  public void setAnimation(MsoAnimationType value) throws ComException;
  @DeclDISPID(1610809357)  public MsoAnimationType getAnimation() throws ComException;
  @DeclDISPID(1610809359)  public void setButton(MsoButtonSetType value) throws ComException;
  @DeclDISPID(1610809359)  public MsoButtonSetType getButton() throws ComException;
  @DeclDISPID(1610809361)  public void setCallback(String value) throws ComException;
  @DeclDISPID(1610809361)  public String getCallback() throws ComException;
  @DeclDISPID(1610809363)  public void setPrivate(Integer value) throws ComException;
  @DeclDISPID(1610809363)  public Integer getPrivate() throws ComException;
  @DeclDISPID(1610809365)  public void SetAvoidRectangle(Integer Left, Integer Top, Integer Right, Integer Bottom) throws ComException;
  @DeclDISPID(1610809366)  public String getName() throws ComException;
  @DeclDISPID(1610809367)  public MsoBalloonButtonType Show() throws ComException;
  @DeclDISPID(1610809368)  public void Close() throws ComException;
}
