/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E7A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoDataTableImpl extends Dispatch implements com.wilutions.mslib.office.IMsoDataTable {
  @DeclDISPID(1610743808)  public void setShowLegendKey(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743808,"ShowLegendKey", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743808)  public Boolean getShowLegendKey() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ShowLegendKey", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public void setHasBorderHorizontal(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743810,"HasBorderHorizontal", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743810)  public Boolean getHasBorderHorizontal() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"HasBorderHorizontal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public void setHasBorderVertical(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"HasBorderVertical", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743812)  public Boolean getHasBorderVertical() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"HasBorderVertical", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743814)  public void setHasBorderOutline(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"HasBorderOutline", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public Boolean getHasBorderOutline() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"HasBorderOutline", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.office.IMsoBorder getBorder() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoBorderImpl.class);
  }
  @DeclDISPID(1610743817)  public com.wilutions.mslib.office.ChartFont getFont() throws ComException {
    final Object obj = this._dispatchCall(1610743817,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ChartFontImpl.class);
  }
  @DeclDISPID(1610743818)  public void Select() throws ComException {
    this._dispatchCall(1610743818,"Select", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743819)  public void Delete() throws ComException {
    this._dispatchCall(1610743819,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743820)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743821)  public Object getAutoScaleFont() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"AutoScaleFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743821)  public void setAutoScaleFont(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743821,"AutoScaleFont", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743823)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"Format", DISPATCH_PROPERTYGET,null);
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
  public IMsoDataTableImpl(String progId) throws ComException {
    super(progId, "{000C1711-0000-0000-C000-000000000046}");
  }
  protected IMsoDataTableImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoDataTableImpl" + super.toString() + "]";
  }
}
