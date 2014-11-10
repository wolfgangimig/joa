/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E4D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoTickLabelsImpl extends Dispatch implements com.wilutions.mslib.office.IMsoTickLabels {
  @DeclDISPID(1610743808)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.office.ChartFont getFont() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ChartFontImpl.class);
  }
  @DeclDISPID(1610743811)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743812)  public String getNumberFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"NumberFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743812)  public void setNumberFormat(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"NumberFormat", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public Boolean getNumberFormatLinked() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"NumberFormatLinked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743814)  public void setNumberFormatLinked(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"NumberFormatLinked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743816)  public Object getNumberFormatLocal() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"NumberFormatLocal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743816)  public void setNumberFormatLocal(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743816,"NumberFormatLocal", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743818)  public com.wilutions.mslib.office.XlTickLabelOrientation getOrientation() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"Orientation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlTickLabelOrientation.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743818)  public void setOrientation(com.wilutions.mslib.office.XlTickLabelOrientation value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743818,"Orientation", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743820)  public Object Select() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"Select", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743821)  public Integer getReadingOrder() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"ReadingOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743821)  public void setReadingOrder(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743821,"ReadingOrder", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743823)  public Object getAutoScaleFont() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"AutoScaleFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743823)  public void setAutoScaleFont(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743823,"AutoScaleFont", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743825)  public Integer getDepth() throws ComException {
    final Object obj = this._dispatchCall(1610743825,"Depth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743826)  public Integer getOffset() throws ComException {
    final Object obj = this._dispatchCall(1610743826,"Offset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743826)  public void setOffset(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743826,"Offset", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743828)  public Integer getAlignment() throws ComException {
    final Object obj = this._dispatchCall(1610743828,"Alignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743828)  public void setAlignment(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743828,"Alignment", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743830)  public Boolean getMultiLevel() throws ComException {
    final Object obj = this._dispatchCall(1610743830,"MultiLevel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743830)  public void setMultiLevel(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743830,"MultiLevel", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743832)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743832,"Format", DISPATCH_PROPERTYGET,null);
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
  public IMsoTickLabelsImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoTickLabelsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoTickLabelsImpl" + super.toString() + "]";
  }
}
