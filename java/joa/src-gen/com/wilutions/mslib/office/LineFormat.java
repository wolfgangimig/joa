/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * LineFormat.
 * 
 */
@CoInterface(guid="{000C0317-0000-0000-C000-000000000046}")
public interface LineFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(100)  public ColorFormat getBackColor() throws ComException;
  @DeclDISPID(100)  public void setBackColor(final ColorFormat value) throws ComException;
  @DeclDISPID(101)  public MsoArrowheadLength getBeginArrowheadLength() throws ComException;
  @DeclDISPID(101)  public void setBeginArrowheadLength(final MsoArrowheadLength value) throws ComException;
  @DeclDISPID(102)  public MsoArrowheadStyle getBeginArrowheadStyle() throws ComException;
  @DeclDISPID(102)  public void setBeginArrowheadStyle(final MsoArrowheadStyle value) throws ComException;
  @DeclDISPID(103)  public MsoArrowheadWidth getBeginArrowheadWidth() throws ComException;
  @DeclDISPID(103)  public void setBeginArrowheadWidth(final MsoArrowheadWidth value) throws ComException;
  @DeclDISPID(104)  public MsoLineDashStyle getDashStyle() throws ComException;
  @DeclDISPID(104)  public void setDashStyle(final MsoLineDashStyle value) throws ComException;
  @DeclDISPID(105)  public MsoArrowheadLength getEndArrowheadLength() throws ComException;
  @DeclDISPID(105)  public void setEndArrowheadLength(final MsoArrowheadLength value) throws ComException;
  @DeclDISPID(106)  public MsoArrowheadStyle getEndArrowheadStyle() throws ComException;
  @DeclDISPID(106)  public void setEndArrowheadStyle(final MsoArrowheadStyle value) throws ComException;
  @DeclDISPID(107)  public MsoArrowheadWidth getEndArrowheadWidth() throws ComException;
  @DeclDISPID(107)  public void setEndArrowheadWidth(final MsoArrowheadWidth value) throws ComException;
  @DeclDISPID(108)  public ColorFormat getForeColor() throws ComException;
  @DeclDISPID(108)  public void setForeColor(final ColorFormat value) throws ComException;
  @DeclDISPID(109)  public MsoPatternType getPattern() throws ComException;
  @DeclDISPID(109)  public void setPattern(final MsoPatternType value) throws ComException;
  @DeclDISPID(110)  public MsoLineStyle getStyle() throws ComException;
  @DeclDISPID(110)  public void setStyle(final MsoLineStyle value) throws ComException;
  @DeclDISPID(111)  public Float getTransparency() throws ComException;
  @DeclDISPID(111)  public void setTransparency(final Float value) throws ComException;
  @DeclDISPID(112)  public MsoTriState getVisible() throws ComException;
  @DeclDISPID(112)  public void setVisible(final MsoTriState value) throws ComException;
  @DeclDISPID(113)  public Float getWeight() throws ComException;
  @DeclDISPID(113)  public void setWeight(final Float value) throws ComException;
  @DeclDISPID(114)  public MsoTriState getInsetPen() throws ComException;
  @DeclDISPID(114)  public void setInsetPen(final MsoTriState value) throws ComException;
}
