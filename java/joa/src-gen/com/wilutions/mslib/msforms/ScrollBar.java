/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ScrollBar.
 * 
 */
@CoClass(guid="{DFD181E0-5E2F-11CE-A449-00AA004A803D}")
public class ScrollBar extends Dispatch implements IScrollbar {
  @DeclDISPID(-501)  public void setBackColor(OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException {
    final Object obj = this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(-513)  public void setForeColor(OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException {
    final Object obj = this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-521)  public void setMousePointer(fmMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(0)  public void setValue(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Integer getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(100)  public void setMin(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(100,"Min", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(100)  public Integer getMin() throws ComException {
    final Object obj = this._dispatchCall(100,"Min", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(101)  public void setMax(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"Max", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(101)  public Integer getMax() throws ComException {
    final Object obj = this._dispatchCall(101,"Max", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(102)  public void setSmallChange(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"SmallChange", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(102)  public Integer getSmallChange() throws ComException {
    final Object obj = this._dispatchCall(102,"SmallChange", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(103)  public void setLargeChange(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"LargeChange", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(103)  public Integer getLargeChange() throws ComException {
    final Object obj = this._dispatchCall(103,"LargeChange", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(104)  public void setProportionalThumb(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"ProportionalThumb", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(104)  public Boolean getProportionalThumb() throws ComException {
    final Object obj = this._dispatchCall(104,"ProportionalThumb", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(105)  public void setOrientation(fmOrientation value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"Orientation", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(105)  public fmOrientation getOrientation() throws ComException {
    final Object obj = this._dispatchCall(105,"Orientation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmOrientation.valueOf((Integer)obj);
  }
  @DeclDISPID(106)  public void setDelay(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"Delay", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(106)  public Integer getDelay() throws ComException {
    final Object obj = this._dispatchCall(106,"Delay", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  public ScrollBar() throws ComException {
    super("{DFD181E0-5E2F-11CE-A449-00AA004A803D}");
  }
  protected ScrollBar(long ndisp) {
    super(ndisp);
  }
  public ScrollBar(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ScrollBar" + super.toString() + "]";
  }
}
