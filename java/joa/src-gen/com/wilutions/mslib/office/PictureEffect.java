/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * PictureEffect.
 * 
 */
@CoInterface(guid="{000C03D1-0000-0000-C000-000000000046}")
public interface PictureEffect extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public MsoPictureEffectType getType() throws ComException;
  @DeclDISPID(1)  public void setPosition(Integer value) throws ComException;
  @DeclDISPID(1)  public Integer getPosition() throws ComException;
  @DeclDISPID(2)  public void Delete() throws ComException;
  @DeclDISPID(3)  public EffectParameters getEffectParameters() throws ComException;
  @DeclDISPID(4)  public void setVisible(MsoTriState value) throws ComException;
  @DeclDISPID(4)  public MsoTriState getVisible() throws ComException;
}
