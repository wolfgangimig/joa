/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E78-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoAxisImpl extends Dispatch implements com.wilutions.mslib.office.IMsoAxis {
  @DeclDISPID(1610743808)  public Boolean getAxisBetweenCategories() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"AxisBetweenCategories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743808)  public void setAxisBetweenCategories(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743808,"AxisBetweenCategories", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.office.XlAxisGroup getAxisGroup() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"AxisGroup", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlAxisGroup.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.office.IMsoAxisTitle getAxisTitle() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"AxisTitle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoAxisTitleImpl.class);
  }
  @DeclDISPID(1610743812)  public Object getCategoryNames() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"CategoryNames", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743812)  public void setCategoryNames(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"CategoryNames", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.office.XlAxisCrosses getCrosses() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Crosses", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlAxisCrosses.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public void setCrosses(com.wilutions.mslib.office.XlAxisCrosses value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"Crosses", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743816)  public Double getCrossesAt() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"CrossesAt", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743816)  public void setCrossesAt(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743816,"CrossesAt", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743818)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743819)  public Boolean getHasMajorGridlines() throws ComException {
    final Object obj = this._dispatchCall(1610743819,"HasMajorGridlines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743819)  public void setHasMajorGridlines(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743819,"HasMajorGridlines", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743821)  public Boolean getHasMinorGridlines() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"HasMinorGridlines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743821)  public void setHasMinorGridlines(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743821,"HasMinorGridlines", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743823)  public Boolean getHasTitle() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"HasTitle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743823)  public void setHasTitle(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743823,"HasTitle", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743825)  public com.wilutions.mslib.office.GridLines getMajorGridlines() throws ComException {
    final Object obj = this._dispatchCall(1610743825,"MajorGridlines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.GridLinesImpl.class);
  }
  @DeclDISPID(1610743826)  public com.wilutions.mslib.office.XlTickMark getMajorTickMark() throws ComException {
    final Object obj = this._dispatchCall(1610743826,"MajorTickMark", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlTickMark.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743826)  public void setMajorTickMark(com.wilutions.mslib.office.XlTickMark value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743826,"MajorTickMark", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743828)  public Double getMajorUnit() throws ComException {
    final Object obj = this._dispatchCall(1610743828,"MajorUnit", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743828)  public void setMajorUnit(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743828,"MajorUnit", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743830)  public Double getLogBase() throws ComException {
    final Object obj = this._dispatchCall(1610743830,"LogBase", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743830)  public void setLogBase(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743830,"LogBase", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743832)  public Boolean getTickLabelSpacingIsAuto() throws ComException {
    final Object obj = this._dispatchCall(1610743832,"TickLabelSpacingIsAuto", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743832)  public void setTickLabelSpacingIsAuto(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743832,"TickLabelSpacingIsAuto", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743834)  public Boolean getMajorUnitIsAuto() throws ComException {
    final Object obj = this._dispatchCall(1610743834,"MajorUnitIsAuto", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743834)  public void setMajorUnitIsAuto(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743834,"MajorUnitIsAuto", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743836)  public Double getMaximumScale() throws ComException {
    final Object obj = this._dispatchCall(1610743836,"MaximumScale", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743836)  public void setMaximumScale(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743836,"MaximumScale", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743838)  public Boolean getMaximumScaleIsAuto() throws ComException {
    final Object obj = this._dispatchCall(1610743838,"MaximumScaleIsAuto", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743838)  public void setMaximumScaleIsAuto(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743838,"MaximumScaleIsAuto", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743840)  public Double getMinimumScale() throws ComException {
    final Object obj = this._dispatchCall(1610743840,"MinimumScale", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743840)  public void setMinimumScale(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743840,"MinimumScale", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743842)  public Boolean getMinimumScaleIsAuto() throws ComException {
    final Object obj = this._dispatchCall(1610743842,"MinimumScaleIsAuto", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743842)  public void setMinimumScaleIsAuto(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743842,"MinimumScaleIsAuto", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743844)  public com.wilutions.mslib.office.GridLines getMinorGridlines() throws ComException {
    final Object obj = this._dispatchCall(1610743844,"MinorGridlines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.GridLinesImpl.class);
  }
  @DeclDISPID(1610743845)  public com.wilutions.mslib.office.XlTickMark getMinorTickMark() throws ComException {
    final Object obj = this._dispatchCall(1610743845,"MinorTickMark", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlTickMark.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743845)  public void setMinorTickMark(com.wilutions.mslib.office.XlTickMark value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743845,"MinorTickMark", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743847)  public Double getMinorUnit() throws ComException {
    final Object obj = this._dispatchCall(1610743847,"MinorUnit", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743847)  public void setMinorUnit(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743847,"MinorUnit", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743849)  public Boolean getMinorUnitIsAuto() throws ComException {
    final Object obj = this._dispatchCall(1610743849,"MinorUnitIsAuto", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743849)  public void setMinorUnitIsAuto(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743849,"MinorUnitIsAuto", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743851)  public Boolean getReversePlotOrder() throws ComException {
    final Object obj = this._dispatchCall(1610743851,"ReversePlotOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743851)  public void setReversePlotOrder(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743851,"ReversePlotOrder", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743853)  public com.wilutions.mslib.office.XlScaleType getScaleType() throws ComException {
    final Object obj = this._dispatchCall(1610743853,"ScaleType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlScaleType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743853)  public void setScaleType(com.wilutions.mslib.office.XlScaleType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743853,"ScaleType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743855)  public Object Select() throws ComException {
    final Object obj = this._dispatchCall(1610743855,"Select", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743856)  public com.wilutions.mslib.office.XlTickLabelPosition getTickLabelPosition() throws ComException {
    final Object obj = this._dispatchCall(1610743856,"TickLabelPosition", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlTickLabelPosition.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743856)  public void setTickLabelPosition(com.wilutions.mslib.office.XlTickLabelPosition value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743856,"TickLabelPosition", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743858)  public com.wilutions.mslib.office.IMsoTickLabels getTickLabels() throws ComException {
    final Object obj = this._dispatchCall(1610743858,"TickLabels", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoTickLabelsImpl.class);
  }
  @DeclDISPID(1610743859)  public Integer getTickLabelSpacing() throws ComException {
    final Object obj = this._dispatchCall(1610743859,"TickLabelSpacing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743859)  public void setTickLabelSpacing(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743859,"TickLabelSpacing", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743861)  public Integer getTickMarkSpacing() throws ComException {
    final Object obj = this._dispatchCall(1610743861,"TickMarkSpacing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743861)  public void setTickMarkSpacing(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743861,"TickMarkSpacing", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743863)  public com.wilutions.mslib.office.XlAxisType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743863,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlAxisType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743863)  public void setType(com.wilutions.mslib.office.XlAxisType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743863,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743865)  public com.wilutions.mslib.office.XlTimeUnit getBaseUnit() throws ComException {
    final Object obj = this._dispatchCall(1610743865,"BaseUnit", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlTimeUnit.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743865)  public void setBaseUnit(com.wilutions.mslib.office.XlTimeUnit value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743865,"BaseUnit", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743867)  public Boolean getBaseUnitIsAuto() throws ComException {
    final Object obj = this._dispatchCall(1610743867,"BaseUnitIsAuto", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743867)  public void setBaseUnitIsAuto(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743867,"BaseUnitIsAuto", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743869)  public com.wilutions.mslib.office.XlTimeUnit getMajorUnitScale() throws ComException {
    final Object obj = this._dispatchCall(1610743869,"MajorUnitScale", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlTimeUnit.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743869)  public void setMajorUnitScale(com.wilutions.mslib.office.XlTimeUnit value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743869,"MajorUnitScale", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743871)  public com.wilutions.mslib.office.XlTimeUnit getMinorUnitScale() throws ComException {
    final Object obj = this._dispatchCall(1610743871,"MinorUnitScale", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlTimeUnit.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743871)  public void setMinorUnitScale(com.wilutions.mslib.office.XlTimeUnit value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743871,"MinorUnitScale", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743873)  public com.wilutions.mslib.office.XlCategoryType getCategoryType() throws ComException {
    final Object obj = this._dispatchCall(1610743873,"CategoryType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlCategoryType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743873)  public void setCategoryType(com.wilutions.mslib.office.XlCategoryType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743873,"CategoryType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743875)  public Double getLeft() throws ComException {
    final Object obj = this._dispatchCall(1610743875,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743876)  public Double getTop() throws ComException {
    final Object obj = this._dispatchCall(1610743876,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743877)  public Double getWidth() throws ComException {
    final Object obj = this._dispatchCall(1610743877,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743878)  public Double getHeight() throws ComException {
    final Object obj = this._dispatchCall(1610743878,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743879)  public com.wilutions.mslib.office.XlDisplayUnit getDisplayUnit() throws ComException {
    final Object obj = this._dispatchCall(1610743879,"DisplayUnit", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlDisplayUnit.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743879)  public void setDisplayUnit(com.wilutions.mslib.office.XlDisplayUnit value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743879,"DisplayUnit", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743881)  public Double getDisplayUnitCustom() throws ComException {
    final Object obj = this._dispatchCall(1610743881,"DisplayUnitCustom", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743881)  public void setDisplayUnitCustom(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743881,"DisplayUnitCustom", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743883)  public Boolean getHasDisplayUnitLabel() throws ComException {
    final Object obj = this._dispatchCall(1610743883,"HasDisplayUnitLabel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743883)  public void setHasDisplayUnitLabel(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743883,"HasDisplayUnitLabel", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743885)  public com.wilutions.mslib.office.IMsoDisplayUnitLabel getDisplayUnitLabel() throws ComException {
    final Object obj = this._dispatchCall(1610743885,"DisplayUnitLabel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoDisplayUnitLabelImpl.class);
  }
  @DeclDISPID(1610743886)  public com.wilutions.mslib.office.IMsoBorder getBorder() throws ComException {
    final Object obj = this._dispatchCall(1610743886,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoBorderImpl.class);
  }
  @DeclDISPID(1610743887)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610743887,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743888)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743888,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoChartFormatImpl.class);
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
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public IMsoAxisImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoAxisImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoAxisImpl" + super.toString() + "]";
  }
}
