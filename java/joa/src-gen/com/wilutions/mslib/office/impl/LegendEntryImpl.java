/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E71-A463-DB41-5DAE-69E7A5F7FCBC}")
public class LegendEntryImpl extends Dispatch implements com.wilutions.mslib.office.LegendEntry {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(117)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(117,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(146)  public com.wilutions.mslib.office.ChartFont getFont() throws ComException {
    final Object obj = this._dispatchCall(146,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.ChartFont)obj;
  }
  @DeclDISPID(486)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(486,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(174)  public com.wilutions.mslib.office.IMsoLegendKey getLegendKey() throws ComException {
    final Object obj = this._dispatchCall(174,"LegendKey", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoLegendKey)obj;
  }
  @DeclDISPID(235)  public Object Select() throws ComException {
    final Object obj = this._dispatchCall(235,"Select", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
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
  @DeclDISPID(127)  public Double getLeft() throws ComException {
    final Object obj = this._dispatchCall(127,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(126)  public Double getTop() throws ComException {
    final Object obj = this._dispatchCall(126,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(122)  public Double getWidth() throws ComException {
    final Object obj = this._dispatchCall(122,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(123)  public Double getHeight() throws ComException {
    final Object obj = this._dispatchCall(123,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1610743820)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"Format", DISPATCH_PROPERTYGET,null);
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
  public LegendEntryImpl(String progId) throws ComException {
    super(progId);
  }
  protected LegendEntryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[LegendEntryImpl" + super.toString() + "]";
  }
}
