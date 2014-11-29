/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ShadowFormat.
 * 
 */
@CoInterface(guid="{000C031B-0000-0000-C000-000000000046}")
public interface ShadowFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(10)  public void IncrementOffsetX(final Float Increment) throws ComException;
  @DeclDISPID(11)  public void IncrementOffsetY(final Float Increment) throws ComException;
  @DeclDISPID(100)  public ColorFormat getForeColor() throws ComException;
  @DeclDISPID(100)  public void setForeColor(final ColorFormat value) throws ComException;
  @DeclDISPID(101)  public MsoTriState getObscured() throws ComException;
  @DeclDISPID(101)  public void setObscured(final MsoTriState value) throws ComException;
  @DeclDISPID(102)  public Float getOffsetX() throws ComException;
  @DeclDISPID(102)  public void setOffsetX(final Float value) throws ComException;
  @DeclDISPID(103)  public Float getOffsetY() throws ComException;
  @DeclDISPID(103)  public void setOffsetY(final Float value) throws ComException;
  @DeclDISPID(104)  public Float getTransparency() throws ComException;
  @DeclDISPID(104)  public void setTransparency(final Float value) throws ComException;
  @DeclDISPID(105)  public MsoShadowType getType() throws ComException;
  @DeclDISPID(105)  public void setType(final MsoShadowType value) throws ComException;
  @DeclDISPID(106)  public MsoTriState getVisible() throws ComException;
  @DeclDISPID(106)  public void setVisible(final MsoTriState value) throws ComException;
  @DeclDISPID(107)  public MsoShadowStyle getStyle() throws ComException;
  @DeclDISPID(107)  public void setStyle(final MsoShadowStyle value) throws ComException;
  @DeclDISPID(108)  public Float getBlur() throws ComException;
  @DeclDISPID(108)  public void setBlur(final Float value) throws ComException;
  @DeclDISPID(109)  public Float getSize() throws ComException;
  @DeclDISPID(109)  public void setSize(final Float value) throws ComException;
  @DeclDISPID(110)  public MsoTriState getRotateWithShape() throws ComException;
  @DeclDISPID(110)  public void setRotateWithShape(final MsoTriState value) throws ComException;
}
