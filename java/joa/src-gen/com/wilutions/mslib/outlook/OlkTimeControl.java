/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkTimeControl.
 * 
 */
@CoClass(guid="{0006F051-0000-0000-C000-000000000046}")
public class OlkTimeControl extends Dispatch implements _OlkTimeControl {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException {
    final Object obj = this._dispatchCall(-500,"AutoSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-500)  public void setAutoSize(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-500,"AutoSize", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(218)  public Boolean getAutoWordSelect() throws ComException {
    final Object obj = this._dispatchCall(218,"AutoWordSelect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(218)  public void setAutoWordSelect(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(218,"AutoWordSelect", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-501)  public com.wilutions.mslib.stdole.OLE_COLOR getBackColor() throws ComException {
    final Object obj = this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_COLOR(als);
  }
  @DeclDISPID(-501)  public void setBackColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-502)  public OlBackStyle getBackStyle() throws ComException {
    final Object obj = this._dispatchCall(-502,"BackStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlBackStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-502)  public void setBackStyle(final OlBackStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-502,"BackStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(224)  public OlEnterFieldBehavior getEnterFieldBehavior() throws ComException {
    final Object obj = this._dispatchCall(224,"EnterFieldBehavior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlEnterFieldBehavior.valueOf((Integer)obj);
  }
  @DeclDISPID(224)  public void setEnterFieldBehavior(final OlEnterFieldBehavior value) throws ComException {
    assert(value != null);
    this._dispatchCall(224,"EnterFieldBehavior", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-512)  public com.wilutions.mslib.stdole.Font getFont() throws ComException {
    final Object obj = this._dispatchCall(-512,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.FontImpl.class);
  }
  @DeclDISPID(-513)  public com.wilutions.mslib.stdole.OLE_COLOR getForeColor() throws ComException {
    final Object obj = this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_COLOR(als);
  }
  @DeclDISPID(-513)  public void setForeColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(207)  public Boolean getHideSelection() throws ComException {
    final Object obj = this._dispatchCall(207,"HideSelection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(207)  public void setHideSelection(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(207,"HideSelection", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10)  public Boolean getLocked() throws ComException {
    final Object obj = this._dispatchCall(10,"Locked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(10)  public void setLocked(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"Locked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(-521)  public void setMousePointer(final OlMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64468)  public java.util.Date getReferenceTime() throws ComException {
    final Object obj = this._dispatchCall(64468,"ReferenceTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64468)  public void setReferenceTime(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(64468,"ReferenceTime", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64469)  public OlTimeStyle getStyle() throws ComException {
    final Object obj = this._dispatchCall(64469,"Style", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlTimeStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(64469)  public void setStyle(final OlTimeStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(64469,"Style", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64466)  public java.util.Date getTime() throws ComException {
    final Object obj = this._dispatchCall(64466,"Time", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64466)  public void setTime(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(64466,"Time", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-517)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(-517,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-517)  public void setText(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-517,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10004)  public OlTextAlign getTextAlign() throws ComException {
    final Object obj = this._dispatchCall(10004,"TextAlign", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlTextAlign.valueOf((Integer)obj);
  }
  @DeclDISPID(10004)  public void setTextAlign(final OlTextAlign value) throws ComException {
    assert(value != null);
    this._dispatchCall(10004,"TextAlign", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(0)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setValue(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64475)  public java.util.Date getIntervalTime() throws ComException {
    final Object obj = this._dispatchCall(64475,"IntervalTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64475)  public void setIntervalTime(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(64475,"IntervalTime", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1001)  public void DropDown() throws ComException {
    this._dispatchCall(1001,"DropDown", DISPATCH_METHOD,null);
  }
  public OlkTimeControl() throws ComException {
    super("{0006F051-0000-0000-C000-000000000046}", "{000672EF-0000-0000-C000-000000000046}");
  }
  protected OlkTimeControl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OlkTimeControl" + super.toString() + "]";
  }
}
