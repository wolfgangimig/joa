/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ChartPoint.
 * 
 */
@CoInterface(guid="{000C170C-0000-0000-C000-000000000046}")
public interface ChartPoint extends IDispatch {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(112)  public Object ClearFormats() throws ComException;
  @DeclDISPID(551)  public Object Copy() throws ComException;
  @DeclDISPID(158)  public IMsoDataLabel getDataLabel() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(182)  public Integer getExplosion() throws ComException;
  @DeclDISPID(182)  public void setExplosion(Integer RHS) throws ComException;
  @DeclDISPID(77)  public Boolean getHasDataLabel() throws ComException;
  @DeclDISPID(77)  public void setHasDataLabel(Boolean RHS) throws ComException;
  @DeclDISPID(129)  public IMsoInterior getInterior() throws ComException;
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
  @DeclDISPID(211)  public Object Paste() throws ComException;
  @DeclDISPID(161)  public XlChartPictureType getPictureType() throws ComException;
  @DeclDISPID(161)  public void setPictureType(XlChartPictureType RHS) throws ComException;
  @DeclDISPID(162)  public Double getPictureUnit() throws ComException;
  @DeclDISPID(162)  public void setPictureUnit(Double RHS) throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(1659)  public Boolean getApplyPictToSides() throws ComException;
  @DeclDISPID(1659)  public void setApplyPictToSides(Boolean RHS) throws ComException;
  @DeclDISPID(1660)  public Boolean getApplyPictToFront() throws ComException;
  @DeclDISPID(1660)  public void setApplyPictToFront(Boolean RHS) throws ComException;
  @DeclDISPID(1661)  public Boolean getApplyPictToEnd() throws ComException;
  @DeclDISPID(1661)  public void setApplyPictToEnd(Boolean RHS) throws ComException;
  @DeclDISPID(103)  public Boolean getShadow() throws ComException;
  @DeclDISPID(103)  public void setShadow(Boolean RHS) throws ComException;
  @DeclDISPID(1662)  public Boolean getSecondaryPlot() throws ComException;
  @DeclDISPID(1662)  public void setSecondaryPlot(Boolean RHS) throws ComException;
  @DeclDISPID(1663)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(1922)  public Object ApplyDataLabels(XlDataLabelsType Type, Object IMsoLegendKey, Object AutoText, Object HasLeaderLines, Object ShowSeriesName, Object ShowCategoryName, Object ShowValue, Object ShowPercentage, Object ShowBubbleSize, Object Separator) throws ComException;
  @DeclDISPID(1665)  public Boolean getHas3DEffect() throws ComException;
  @DeclDISPID(1665)  public void setHas3DEffect(Boolean RHS) throws ComException;
  @DeclDISPID(1610743854)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(2649)  public Double getPictureUnit2() throws ComException;
  @DeclDISPID(2649)  public void setPictureUnit2(Double RHS) throws ComException;
  @DeclDISPID(2651)  public String getName() throws ComException;
  @DeclDISPID(2652)  public Double getHeight() throws ComException;
  @DeclDISPID(2653)  public Double getWidth() throws ComException;
  @DeclDISPID(2654)  public Double getLeft() throws ComException;
  @DeclDISPID(2655)  public Double getTop() throws ComException;
  @DeclDISPID(2656)  public Double PieSliceLocation(XlPieSliceLocation loc, XlPieSliceIndex Index) throws ComException;
}
