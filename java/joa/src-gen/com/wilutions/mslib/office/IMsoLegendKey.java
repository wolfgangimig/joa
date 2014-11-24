/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoLegendKey.
 * 
 */
@CoInterface(guid="{000C171E-0000-0000-C000-000000000046}")
public interface IMsoLegendKey extends IDispatch {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(112)  public Object ClearFormats() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(129)  public IMsoInterior getInterior() throws ComException;
  @DeclDISPID(1663)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(132)  public Boolean getInvertIfNegative() throws ComException;
  @DeclDISPID(132)  public void setInvertIfNegative(Boolean RHS) throws ComException;
  @DeclDISPID(73)  public Integer getMarkerBackgroundColor() throws ComException;
  @DeclDISPID(73)  public void setMarkerBackgroundColor(Integer RHS) throws ComException;
  @DeclDISPID(74)  public XlColorIndex getMarkerBackgroundColorIndex() throws ComException;
  @DeclDISPID(74)  public void setMarkerBackgroundColorIndex(XlColorIndex RHS) throws ComException;
  @DeclDISPID(75)  public Integer getMarkerForegroundColor() throws ComException;
  @DeclDISPID(75)  public void setMarkerForegroundColor(Integer RHS) throws ComException;
  @DeclDISPID(76)  public XlColorIndex getMarkerForegroundColorIndex() throws ComException;
  @DeclDISPID(76)  public void setMarkerForegroundColorIndex(XlColorIndex RHS) throws ComException;
  @DeclDISPID(231)  public Integer getMarkerSize() throws ComException;
  @DeclDISPID(231)  public void setMarkerSize(Integer RHS) throws ComException;
  @DeclDISPID(72)  public XlMarkerStyle getMarkerStyle() throws ComException;
  @DeclDISPID(72)  public void setMarkerStyle(XlMarkerStyle RHS) throws ComException;
  @DeclDISPID(161)  public Integer getPictureType() throws ComException;
  @DeclDISPID(161)  public void setPictureType(Integer RHS) throws ComException;
  @DeclDISPID(162)  public Double getPictureUnit() throws ComException;
  @DeclDISPID(162)  public void setPictureUnit(Double RHS) throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(163)  public Boolean getSmooth() throws ComException;
  @DeclDISPID(163)  public void setSmooth(Boolean RHS) throws ComException;
  @DeclDISPID(127)  public Double getLeft() throws ComException;
  @DeclDISPID(126)  public Double getTop() throws ComException;
  @DeclDISPID(122)  public Double getWidth() throws ComException;
  @DeclDISPID(123)  public Double getHeight() throws ComException;
  @DeclDISPID(103)  public Boolean getShadow() throws ComException;
  @DeclDISPID(103)  public void setShadow(Boolean RHS) throws ComException;
  @DeclDISPID(1610743841)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(2649)  public Double getPictureUnit2() throws ComException;
  @DeclDISPID(2649)  public void setPictureUnit2(Double RHS) throws ComException;
}
