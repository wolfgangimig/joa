/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E74-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoDataLabelsImpl extends Dispatch implements com.wilutions.mslib.office.IMsoDataLabels {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
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
  @DeclDISPID(1610743815)  public com.wilutions.mslib.office.IMsoCharacters getCharacters(final Object Start, final Object Length) throws ComException {
    assert(Start != null);
    assert(Length != null);
    final Object obj = this._dispatchCall(1610743815,"Characters", DISPATCH_PROPERTYGET,null,Start,Length);
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
  @DeclDISPID(136)  public void setHorizontalAlignment(final Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(136,"HorizontalAlignment", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(134)  public Object getOrientation() throws ComException {
    final Object obj = this._dispatchCall(134,"Orientation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(134)  public void setOrientation(final Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(134,"Orientation", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(103)  public Boolean getShadow() throws ComException {
    final Object obj = this._dispatchCall(103,"Shadow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setShadow(final Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(103,"Shadow", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(137)  public Object getVerticalAlignment() throws ComException {
    final Object obj = this._dispatchCall(137,"VerticalAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(137)  public void setVerticalAlignment(final Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(137,"VerticalAlignment", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(975)  public Integer getReadingOrder() throws ComException {
    final Object obj = this._dispatchCall(975,"ReadingOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(975)  public void setReadingOrder(final Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(975,"ReadingOrder", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1525)  public Object getAutoScaleFont() throws ComException {
    final Object obj = this._dispatchCall(1525,"AutoScaleFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1525)  public void setAutoScaleFont(final Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1525,"AutoScaleFont", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(135)  public Boolean getAutoText() throws ComException {
    final Object obj = this._dispatchCall(135,"AutoText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(135)  public void setAutoText(final Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(135,"AutoText", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(193)  public String getNumberFormat() throws ComException {
    final Object obj = this._dispatchCall(193,"NumberFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(193)  public void setNumberFormat(final String RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(193,"NumberFormat", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(194)  public Boolean getNumberFormatLinked() throws ComException {
    final Object obj = this._dispatchCall(194,"NumberFormatLinked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(194)  public void setNumberFormatLinked(final Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(194,"NumberFormatLinked", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1097)  public Object getNumberFormatLocal() throws ComException {
    final Object obj = this._dispatchCall(1097,"NumberFormatLocal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1097)  public void setNumberFormatLocal(final Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1097,"NumberFormatLocal", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(171)  public Boolean getShowLegendKey() throws ComException {
    final Object obj = this._dispatchCall(171,"ShowLegendKey", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(171)  public void setShowLegendKey(final Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(171,"ShowLegendKey", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(108)  public Object getType() throws ComException {
    final Object obj = this._dispatchCall(108,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(108)  public void setType(final Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(108,"Type", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(133)  public com.wilutions.mslib.office.XlDataLabelPosition getPosition() throws ComException {
    final Object obj = this._dispatchCall(133,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlDataLabelPosition.valueOf((Integer)obj);
  }
  @DeclDISPID(133)  public void setPosition(final com.wilutions.mslib.office.XlDataLabelPosition RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(133,"Position", DISPATCH_PROPERTYPUT,RHS.value);
  }
  @DeclDISPID(2022)  public Boolean getShowSeriesName() throws ComException {
    final Object obj = this._dispatchCall(2022,"ShowSeriesName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2022)  public void setShowSeriesName(final Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2022,"ShowSeriesName", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2023)  public Boolean getShowCategoryName() throws ComException {
    final Object obj = this._dispatchCall(2023,"ShowCategoryName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2023)  public void setShowCategoryName(final Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2023,"ShowCategoryName", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2024)  public Boolean getShowValue() throws ComException {
    final Object obj = this._dispatchCall(2024,"ShowValue", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2024)  public void setShowValue(final Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2024,"ShowValue", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2025)  public Boolean getShowPercentage() throws ComException {
    final Object obj = this._dispatchCall(2025,"ShowPercentage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2025)  public void setShowPercentage(final Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2025,"ShowPercentage", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2026)  public Boolean getShowBubbleSize() throws ComException {
    final Object obj = this._dispatchCall(2026,"ShowBubbleSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2026)  public void setShowBubbleSize(final Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2026,"ShowBubbleSize", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2027)  public Object getSeparator() throws ComException {
    final Object obj = this._dispatchCall(2027,"Separator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2027)  public void setSeparator(final Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2027,"Separator", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(118)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(118,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(170)  public com.wilutions.mslib.office.IMsoDataLabel Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(170,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoDataLabel)obj;
  }
  @DeclDISPID(-4)  public Object _NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743858)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743858,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoChartFormat)obj;
  }
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.IMsoDataLabel get_Default(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"_Default", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoDataLabel)obj;
  }
  @DeclDISPID(2028)  public void Propagate(final Object Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(2028,"Propagate", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(2029)  public Boolean getShowRange() throws ComException {
    final Object obj = this._dispatchCall(2029,"ShowRange", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2029)  public void setShowRange(final Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2029,"ShowRange", DISPATCH_PROPERTYPUT,RHS);
  }
  public IMsoDataLabelsImpl(String progId) throws ComException {
    super(progId, "{000C171F-0000-0000-C000-000000000046}");
  }
  protected IMsoDataLabelsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoDataLabelsImpl" + super.toString() + "]";
  }
}
