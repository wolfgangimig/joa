/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E43-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoChartAreaImpl extends Dispatch implements com.wilutions.mslib.office.IMsoChartArea {
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
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(128)  public com.wilutions.mslib.office.IMsoBorder getBorder() throws ComException {
    final Object obj = this._dispatchCall(128,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoBorderImpl.class);
  }
  @DeclDISPID(111)  public Object Clear() throws ComException {
    final Object obj = this._dispatchCall(111,"Clear", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(113)  public Object ClearContents() throws ComException {
    final Object obj = this._dispatchCall(113,"ClearContents", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(551)  public Object Copy() throws ComException {
    final Object obj = this._dispatchCall(551,"Copy", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(146)  public com.wilutions.mslib.office.ChartFont getFont() throws ComException {
    final Object obj = this._dispatchCall(146,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ChartFontImpl.class);
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
  @DeclDISPID(112)  public Object ClearFormats() throws ComException {
    final Object obj = this._dispatchCall(112,"ClearFormats", DISPATCH_METHOD,null);
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
  @DeclDISPID(1610743831)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743831,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoChartFormatImpl.class);
  }
  @DeclDISPID(1610743832)  public Boolean getRoundedCorners() throws ComException {
    final Object obj = this._dispatchCall(1610743832,"RoundedCorners", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743832)  public void setRoundedCorners(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743832,"RoundedCorners", DISPATCH_PROPERTYPUT,value);
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
  public IMsoChartAreaImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoChartAreaImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoChartAreaImpl" + super.toString() + "]";
  }
}
