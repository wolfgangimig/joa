/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ChartPoint.
 * 
 */
@CoInterface(guid="{000C170C-0000-0000-C000-000000000046}")
public interface ChartPoint extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(112)  public Object ClearFormats() throws ComException;
  @DeclDISPID(551)  public Object Copy() throws ComException;
  @DeclDISPID(158)  public IMsoDataLabel getDataLabel() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(182)  public Integer getExplosion() throws ComException;
  @DeclDISPID(182)  public void setExplosion(final Integer RHS) throws ComException;
  @DeclDISPID(77)  public Boolean getHasDataLabel() throws ComException;
  @DeclDISPID(77)  public void setHasDataLabel(final Boolean RHS) throws ComException;
  @DeclDISPID(129)  public IMsoInterior getInterior() throws ComException;
  @DeclDISPID(132)  public Boolean getInvertIfNegative() throws ComException;
  @DeclDISPID(132)  public void setInvertIfNegative(final Boolean RHS) throws ComException;
  @DeclDISPID(73)  public Integer getMarkerBackgroundColor() throws ComException;
  @DeclDISPID(73)  public void setMarkerBackgroundColor(final Integer RHS) throws ComException;
  @DeclDISPID(74)  public XlColorIndex getMarkerBackgroundColorIndex() throws ComException;
  @DeclDISPID(74)  public void setMarkerBackgroundColorIndex(final XlColorIndex RHS) throws ComException;
  @DeclDISPID(75)  public Integer getMarkerForegroundColor() throws ComException;
  @DeclDISPID(75)  public void setMarkerForegroundColor(final Integer RHS) throws ComException;
  @DeclDISPID(76)  public XlColorIndex getMarkerForegroundColorIndex() throws ComException;
  @DeclDISPID(76)  public void setMarkerForegroundColorIndex(final XlColorIndex RHS) throws ComException;
  @DeclDISPID(231)  public Integer getMarkerSize() throws ComException;
  @DeclDISPID(231)  public void setMarkerSize(final Integer RHS) throws ComException;
  @DeclDISPID(72)  public XlMarkerStyle getMarkerStyle() throws ComException;
  @DeclDISPID(72)  public void setMarkerStyle(final XlMarkerStyle RHS) throws ComException;
  @DeclDISPID(211)  public Object Paste() throws ComException;
  @DeclDISPID(161)  public XlChartPictureType getPictureType() throws ComException;
  @DeclDISPID(161)  public void setPictureType(final XlChartPictureType RHS) throws ComException;
  @DeclDISPID(162)  public Double getPictureUnit() throws ComException;
  @DeclDISPID(162)  public void setPictureUnit(final Double RHS) throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(1659)  public Boolean getApplyPictToSides() throws ComException;
  @DeclDISPID(1659)  public void setApplyPictToSides(final Boolean RHS) throws ComException;
  @DeclDISPID(1660)  public Boolean getApplyPictToFront() throws ComException;
  @DeclDISPID(1660)  public void setApplyPictToFront(final Boolean RHS) throws ComException;
  @DeclDISPID(1661)  public Boolean getApplyPictToEnd() throws ComException;
  @DeclDISPID(1661)  public void setApplyPictToEnd(final Boolean RHS) throws ComException;
  @DeclDISPID(103)  public Boolean getShadow() throws ComException;
  @DeclDISPID(103)  public void setShadow(final Boolean RHS) throws ComException;
  @DeclDISPID(1662)  public Boolean getSecondaryPlot() throws ComException;
  @DeclDISPID(1662)  public void setSecondaryPlot(final Boolean RHS) throws ComException;
  @DeclDISPID(1663)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(1922)  public Object ApplyDataLabels(final XlDataLabelsType Type, final Object IMsoLegendKey, final Object AutoText, final Object HasLeaderLines, final Object ShowSeriesName, final Object ShowCategoryName, final Object ShowValue, final Object ShowPercentage, final Object ShowBubbleSize, final Object Separator) throws ComException;
  @DeclDISPID(1665)  public Boolean getHas3DEffect() throws ComException;
  @DeclDISPID(1665)  public void setHas3DEffect(final Boolean RHS) throws ComException;
  @DeclDISPID(1610743854)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(2649)  public Double getPictureUnit2() throws ComException;
  @DeclDISPID(2649)  public void setPictureUnit2(final Double RHS) throws ComException;
  @DeclDISPID(2651)  public String getName() throws ComException;
  @DeclDISPID(2652)  public Double getHeight() throws ComException;
  @DeclDISPID(2653)  public Double getWidth() throws ComException;
  @DeclDISPID(2654)  public Double getLeft() throws ComException;
  @DeclDISPID(2655)  public Double getTop() throws ComException;
  @DeclDISPID(2656)  public Double PieSliceLocation(final XlPieSliceLocation loc, final XlPieSliceIndex Index) throws ComException;
}
