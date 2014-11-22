/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E4B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoDataLabelImpl extends Dispatch implements com.wilutions.mslib.office.IMsoDataLabel {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(110)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(110,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(235)  public Object Select() throws ComException {
    final Object obj = this._dispatchCall(235,"Select", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(128)  public com.wilutions.mslib.office.IMsoBorder getBorder() throws ComException {
    final Object obj = this._dispatchCall(128,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoBorder)obj;
  }
  @DeclDISPID(117)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(117,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(129)  public com.wilutions.mslib.office.IMsoInterior getInterior() throws ComException {
    final Object obj = this._dispatchCall(129,"Interior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoInterior)obj;
  }
  @DeclDISPID(1663)  public com.wilutions.mslib.office.ChartFillFormat getFill() throws ComException {
    final Object obj = this._dispatchCall(1663,"Fill", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.ChartFillFormat)obj;
  }
  @DeclDISPID(139)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(139,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(139)  public void setCaption(String RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(139,"Caption", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(603)  public com.wilutions.mslib.office.IMsoCharacters getCharacters(Object Start, Object Length) throws ComException {
    assert(Start != null);
    assert(Length != null);
    final Object obj = this._dispatchCall(603,"Characters", DISPATCH_PROPERTYGET,null,Start,Length);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoCharacters)obj;
  }
  @DeclDISPID(146)  public com.wilutions.mslib.office.ChartFont getFont() throws ComException {
    final Object obj = this._dispatchCall(146,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.ChartFont)obj;
  }
  @DeclDISPID(136)  public Object getHorizontalAlignment() throws ComException {
    final Object obj = this._dispatchCall(136,"HorizontalAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(136)  public void setHorizontalAlignment(Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(136,"HorizontalAlignment", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(127)  public Double getLeft() throws ComException {
    final Object obj = this._dispatchCall(127,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(127)  public void setLeft(Double RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(127,"Left", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(134)  public Object getOrientation() throws ComException {
    final Object obj = this._dispatchCall(134,"Orientation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(134)  public void setOrientation(Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(134,"Orientation", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(103)  public Boolean getShadow() throws ComException {
    final Object obj = this._dispatchCall(103,"Shadow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setShadow(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(103,"Shadow", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(138)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(138,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(138)  public void setText(String RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(138,"Text", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(126)  public Double getTop() throws ComException {
    final Object obj = this._dispatchCall(126,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(126)  public void setTop(Double RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(126,"Top", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(137)  public Object getVerticalAlignment() throws ComException {
    final Object obj = this._dispatchCall(137,"VerticalAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(137)  public void setVerticalAlignment(Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(137,"VerticalAlignment", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(975)  public Integer getReadingOrder() throws ComException {
    final Object obj = this._dispatchCall(975,"ReadingOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(975)  public void setReadingOrder(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(975,"ReadingOrder", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1525)  public Object getAutoScaleFont() throws ComException {
    final Object obj = this._dispatchCall(1525,"AutoScaleFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1525)  public void setAutoScaleFont(Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1525,"AutoScaleFont", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(135)  public Boolean getAutoText() throws ComException {
    final Object obj = this._dispatchCall(135,"AutoText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(135)  public void setAutoText(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(135,"AutoText", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(193)  public String getNumberFormat() throws ComException {
    final Object obj = this._dispatchCall(193,"NumberFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(193)  public void setNumberFormat(String RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(193,"NumberFormat", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(194)  public Boolean getNumberFormatLinked() throws ComException {
    final Object obj = this._dispatchCall(194,"NumberFormatLinked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(194)  public void setNumberFormatLinked(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(194,"NumberFormatLinked", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1097)  public Object getNumberFormatLocal() throws ComException {
    final Object obj = this._dispatchCall(1097,"NumberFormatLocal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1097)  public void setNumberFormatLocal(Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1097,"NumberFormatLocal", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(171)  public Boolean getShowLegendKey() throws ComException {
    final Object obj = this._dispatchCall(171,"ShowLegendKey", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(171)  public void setShowLegendKey(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(171,"ShowLegendKey", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(108)  public Object getType() throws ComException {
    final Object obj = this._dispatchCall(108,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(108)  public void setType(Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(108,"Type", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(133)  public com.wilutions.mslib.office.XlDataLabelPosition getPosition() throws ComException {
    final Object obj = this._dispatchCall(133,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlDataLabelPosition.valueOf((Integer)obj);
  }
  @DeclDISPID(133)  public void setPosition(com.wilutions.mslib.office.XlDataLabelPosition RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(133,"Position", DISPATCH_PROPERTYPUT,RHS.value);
  }
  @DeclDISPID(2022)  public Boolean getShowSeriesName() throws ComException {
    final Object obj = this._dispatchCall(2022,"ShowSeriesName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2022)  public void setShowSeriesName(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2022,"ShowSeriesName", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2023)  public Boolean getShowCategoryName() throws ComException {
    final Object obj = this._dispatchCall(2023,"ShowCategoryName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2023)  public void setShowCategoryName(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2023,"ShowCategoryName", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2024)  public Boolean getShowValue() throws ComException {
    final Object obj = this._dispatchCall(2024,"ShowValue", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2024)  public void setShowValue(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2024,"ShowValue", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2025)  public Boolean getShowPercentage() throws ComException {
    final Object obj = this._dispatchCall(2025,"ShowPercentage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2025)  public void setShowPercentage(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2025,"ShowPercentage", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2026)  public Boolean getShowBubbleSize() throws ComException {
    final Object obj = this._dispatchCall(2026,"ShowBubbleSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2026)  public void setShowBubbleSize(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2026,"ShowBubbleSize", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2027)  public Object getSeparator() throws ComException {
    final Object obj = this._dispatchCall(2027,"Separator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2027)  public void setSeparator(Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2027,"Separator", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1610743863)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743863,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoChartFormat)obj;
  }
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2031)  public void setFormula(String pbstr) throws ComException {
    assert(pbstr != null);
    this._dispatchCall(2031,"Formula", DISPATCH_PROPERTYPUT,pbstr);
  }
  @DeclDISPID(2031)  public String getFormula() throws ComException {
    final Object obj = this._dispatchCall(2031,"Formula", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2032)  public void setFormulaR1C1(String pbstr) throws ComException {
    assert(pbstr != null);
    this._dispatchCall(2032,"FormulaR1C1", DISPATCH_PROPERTYPUT,pbstr);
  }
  @DeclDISPID(2032)  public String getFormulaR1C1() throws ComException {
    final Object obj = this._dispatchCall(2032,"FormulaR1C1", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2033)  public void setFormulaLocal(String pbstr) throws ComException {
    assert(pbstr != null);
    this._dispatchCall(2033,"FormulaLocal", DISPATCH_PROPERTYPUT,pbstr);
  }
  @DeclDISPID(2033)  public String getFormulaLocal() throws ComException {
    final Object obj = this._dispatchCall(2033,"FormulaLocal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2034)  public void setFormulaR1C1Local(String pbstr) throws ComException {
    assert(pbstr != null);
    this._dispatchCall(2034,"FormulaR1C1Local", DISPATCH_PROPERTYPUT,pbstr);
  }
  @DeclDISPID(2034)  public String getFormulaR1C1Local() throws ComException {
    final Object obj = this._dispatchCall(2034,"FormulaR1C1Local", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2035)  public Boolean getShowRange() throws ComException {
    final Object obj = this._dispatchCall(2035,"ShowRange", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2035)  public void setShowRange(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2035,"ShowRange", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2036)  public Double getHeight() throws ComException {
    final Object obj = this._dispatchCall(2036,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(2036)  public void setHeight(Double pHeight) throws ComException {
    assert(pHeight != null);
    this._dispatchCall(2036,"Height", DISPATCH_PROPERTYPUT,pHeight);
  }
  @DeclDISPID(2037)  public Double getWidth() throws ComException {
    final Object obj = this._dispatchCall(2037,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(2037)  public void setWidth(Double pWidth) throws ComException {
    assert(pWidth != null);
    this._dispatchCall(2037,"Width", DISPATCH_PROPERTYPUT,pWidth);
  }
  public IMsoDataLabelImpl(String progId) throws ComException {
    super(progId, "{000C1720-0000-0000-C000-000000000046}");
  }
  protected IMsoDataLabelImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoDataLabelImpl" + super.toString() + "]";
  }
}
