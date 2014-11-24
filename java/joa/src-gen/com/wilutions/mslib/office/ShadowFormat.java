/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ShadowFormat.
 * 
 */
@CoInterface(guid="{000C031B-0000-0000-C000-000000000046}")
public interface ShadowFormat extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(10)  public void IncrementOffsetX(Float Increment) throws ComException;
  @DeclDISPID(11)  public void IncrementOffsetY(Float Increment) throws ComException;
  @DeclDISPID(100)  public ColorFormat getForeColor() throws ComException;
  @DeclDISPID(100)  public void setForeColor(ColorFormat value) throws ComException;
  @DeclDISPID(101)  public MsoTriState getObscured() throws ComException;
  @DeclDISPID(101)  public void setObscured(MsoTriState value) throws ComException;
  @DeclDISPID(102)  public Float getOffsetX() throws ComException;
  @DeclDISPID(102)  public void setOffsetX(Float value) throws ComException;
  @DeclDISPID(103)  public Float getOffsetY() throws ComException;
  @DeclDISPID(103)  public void setOffsetY(Float value) throws ComException;
  @DeclDISPID(104)  public Float getTransparency() throws ComException;
  @DeclDISPID(104)  public void setTransparency(Float value) throws ComException;
  @DeclDISPID(105)  public MsoShadowType getType() throws ComException;
  @DeclDISPID(105)  public void setType(MsoShadowType value) throws ComException;
  @DeclDISPID(106)  public MsoTriState getVisible() throws ComException;
  @DeclDISPID(106)  public void setVisible(MsoTriState value) throws ComException;
  @DeclDISPID(107)  public MsoShadowStyle getStyle() throws ComException;
  @DeclDISPID(107)  public void setStyle(MsoShadowStyle value) throws ComException;
  @DeclDISPID(108)  public Float getBlur() throws ComException;
  @DeclDISPID(108)  public void setBlur(Float value) throws ComException;
  @DeclDISPID(109)  public Float getSize() throws ComException;
  @DeclDISPID(109)  public void setSize(Float value) throws ComException;
  @DeclDISPID(110)  public MsoTriState getRotateWithShape() throws ComException;
  @DeclDISPID(110)  public void setRotateWithShape(MsoTriState value) throws ComException;
}
