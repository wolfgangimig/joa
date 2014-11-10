/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E7B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoLegendImpl extends Dispatch implements com.wilutions.mslib.office.IMsoLegend {
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
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoBorderImpl.class);
  }
  @DeclDISPID(117)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(117,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(146)  public com.wilutions.mslib.office.ChartFont getFont() throws ComException {
    final Object obj = this._dispatchCall(146,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ChartFontImpl.class);
  }
  @DeclDISPID(173)  public Dispatch LegendEntries(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(173,"LegendEntries", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(133)  public com.wilutions.mslib.office.XlLegendPosition getPosition() throws ComException {
    final Object obj = this._dispatchCall(133,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlLegendPosition.valueOf((Integer)obj);
  }
  @DeclDISPID(133)  public void setPosition(com.wilutions.mslib.office.XlLegendPosition value) throws ComException {
    assert(value != null);
    this._dispatchCall(133,"Position", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(103)  public Boolean getShadow() throws ComException {
    final Object obj = this._dispatchCall(103,"Shadow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setShadow(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Shadow", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(111)  public Object Clear() throws ComException {
    final Object obj = this._dispatchCall(111,"Clear", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(123)  public Double getHeight() throws ComException {
    final Object obj = this._dispatchCall(123,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(123)  public void setHeight(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(123,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(129)  public com.wilutions.mslib.office.IMsoInterior getInterior() throws ComException {
    final Object obj = this._dispatchCall(129,"Interior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoInteriorImpl.class);
  }
  @DeclDISPID(1663)  public com.wilutions.mslib.office.ChartFillFormat getFill() throws ComException {
    final Object obj = this._dispatchCall(1663,"Fill", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ChartFillFormatImpl.class);
  }
  @DeclDISPID(127)  public Double getLeft() throws ComException {
    final Object obj = this._dispatchCall(127,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(127)  public void setLeft(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(127,"Left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(126)  public Double getTop() throws ComException {
    final Object obj = this._dispatchCall(126,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(126)  public void setTop(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(126,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(122)  public Double getWidth() throws ComException {
    final Object obj = this._dispatchCall(122,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(122)  public void setWidth(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(122,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1525)  public Object getAutoScaleFont() throws ComException {
    final Object obj = this._dispatchCall(1525,"AutoScaleFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1525)  public void setAutoScaleFont(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1525,"AutoScaleFont", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(1610743834)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743834,"Format", DISPATCH_PROPERTYGET,null);
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
  public IMsoLegendImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoLegendImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoLegendImpl" + super.toString() + "]";
  }
}
