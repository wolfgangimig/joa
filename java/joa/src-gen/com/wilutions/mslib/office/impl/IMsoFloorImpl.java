/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E7D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoFloorImpl extends Dispatch implements com.wilutions.mslib.office.IMsoFloor {
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
  @DeclDISPID(112)  public Object ClearFormats() throws ComException {
    final Object obj = this._dispatchCall(112,"ClearFormats", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
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
  @DeclDISPID(161)  public Object getPictureType() throws ComException {
    final Object obj = this._dispatchCall(161,"PictureType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(161)  public void setPictureType(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(161,"PictureType", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(211)  public void Paste() throws ComException {
    this._dispatchCall(211,"Paste", DISPATCH_METHOD,null);
  }
  @DeclDISPID(2419)  public Integer getThickness() throws ComException {
    final Object obj = this._dispatchCall(2419,"Thickness", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2419)  public void setThickness(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(2419,"Thickness", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743820)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"Format", DISPATCH_PROPERTYGET,null);
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
  public IMsoFloorImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoFloorImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoFloorImpl" + super.toString() + "]";
  }
}
