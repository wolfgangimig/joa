/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{AE379C38-305A-961B-2C48-B5F200BA5448}")
public class IMsoDisplayUnitLabelImpl extends Dispatch implements com.wilutions.mslib.office.IMsoDisplayUnitLabel {
  @DeclDISPID(1610743808)  public void setCaption(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743808,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743808)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.office.IMsoCharacters getCharacters(Object Start, Object Length) throws ComException {
    assert(Start != null);
    assert(Length != null);
    final Object obj = this._dispatchCall(1610743810,"Characters", DISPATCH_PROPERTYGET,null,Start,Length);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoCharactersImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.office.ChartFont getFont() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ChartFontImpl.class);
  }
  @DeclDISPID(1610743812)  public void setHorizontalAlignment(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"HorizontalAlignment", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743812)  public Object getHorizontalAlignment() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"HorizontalAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743814)  public Double getLeft() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743814)  public void setLeft(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"Left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743816)  public void setOrientation(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743816,"Orientation", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743816)  public Object getOrientation() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"Orientation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743818)  public Boolean getShadow() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"Shadow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743818)  public void setShadow(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743818,"Shadow", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743820)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743820,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743820)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743822)  public Double getTop() throws ComException {
    final Object obj = this._dispatchCall(1610743822,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743822)  public void setTop(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743822,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743824)  public void setVerticalAlignment(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743824,"VerticalAlignment", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743824)  public Object getVerticalAlignment() throws ComException {
    final Object obj = this._dispatchCall(1610743824,"VerticalAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743826)  public Integer getReadingOrder() throws ComException {
    final Object obj = this._dispatchCall(1610743826,"ReadingOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743826)  public void setReadingOrder(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743826,"ReadingOrder", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743828)  public void setAutoScaleFont(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743828,"AutoScaleFont", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743828)  public Object getAutoScaleFont() throws ComException {
    final Object obj = this._dispatchCall(1610743828,"AutoScaleFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743830)  public com.wilutions.mslib.office.IMsoInterior getInterior() throws ComException {
    final Object obj = this._dispatchCall(1610743830,"Interior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoInteriorImpl.class);
  }
  @DeclDISPID(1610743831)  public com.wilutions.mslib.office.ChartFillFormat getFill() throws ComException {
    final Object obj = this._dispatchCall(1610743831,"Fill", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ChartFillFormatImpl.class);
  }
  @DeclDISPID(1610743832)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(1610743832,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743833)  public com.wilutions.mslib.office.IMsoBorder getBorder() throws ComException {
    final Object obj = this._dispatchCall(1610743833,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoBorderImpl.class);
  }
  @DeclDISPID(1610743834)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610743834,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743835)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610743835,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743836)  public Object Select() throws ComException {
    final Object obj = this._dispatchCall(1610743836,"Select", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2418)  public Boolean getIncludeInLayout() throws ComException {
    final Object obj = this._dispatchCall(2418,"IncludeInLayout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2418)  public void setIncludeInLayout(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(2418,"IncludeInLayout", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1671)  public com.wilutions.mslib.office.XlChartElementPosition getPosition() throws ComException {
    final Object obj = this._dispatchCall(1671,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlChartElementPosition.valueOf((Integer)obj);
  }
  @DeclDISPID(1671)  public void setPosition(com.wilutions.mslib.office.XlChartElementPosition value) throws ComException {
    assert(value != null);
    this._dispatchCall(1671,"Position", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743841)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743841,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoChartFormatImpl.class);
  }
  @DeclDISPID(1610743842)  public Double getHeight() throws ComException {
    final Object obj = this._dispatchCall(1610743842,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
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
  @DeclDISPID(1610743845)  public Double getWidth() throws ComException {
    final Object obj = this._dispatchCall(1610743845,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743846)  public void setFormula(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743846,"Formula", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743846)  public String getFormula() throws ComException {
    final Object obj = this._dispatchCall(1610743846,"Formula", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743848)  public void setFormulaR1C1(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743848,"FormulaR1C1", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743848)  public String getFormulaR1C1() throws ComException {
    final Object obj = this._dispatchCall(1610743848,"FormulaR1C1", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743850)  public void setFormulaLocal(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743850,"FormulaLocal", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743850)  public String getFormulaLocal() throws ComException {
    final Object obj = this._dispatchCall(1610743850,"FormulaLocal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743852)  public void setFormulaR1C1Local(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743852,"FormulaR1C1Local", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743852)  public String getFormulaR1C1Local() throws ComException {
    final Object obj = this._dispatchCall(1610743852,"FormulaR1C1Local", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IMsoDisplayUnitLabelImpl(String progId) throws ComException {
    super(progId, "{6EA00553-9439-4D5A-B1E6-DC15A54DA8B2}");
  }
  protected IMsoDisplayUnitLabelImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoDisplayUnitLabelImpl" + super.toString() + "]";
  }
}
