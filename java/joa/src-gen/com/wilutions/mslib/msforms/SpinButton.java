/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * SpinButton.
 * 
 */
@CoClass(guid="{79176FB0-B7F2-11CE-97EF-00AA006D2776}")
public class SpinButton extends Dispatch implements ISpinbutton {
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
  @DeclDISPID(105)  public void setOrientation(fmOrientation value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"Orientation", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(105)  public fmOrientation getOrientation() throws ComException {
    final Object obj = this._dispatchCall(105,"Orientation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmOrientation.valueOf((Integer)obj);
  }
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
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
  public SpinButton() throws ComException {
    super("{79176FB0-B7F2-11CE-97EF-00AA006D2776}", "{79176FB3-B7F2-11CE-97EF-00AA006D2776}");
  }
  protected SpinButton(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SpinButton" + super.toString() + "]";
  }
}
