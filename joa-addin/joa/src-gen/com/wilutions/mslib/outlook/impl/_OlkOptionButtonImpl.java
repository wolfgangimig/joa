/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091EBB7-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _OlkOptionButtonImpl extends Dispatch implements com.wilutions.mslib.outlook._OlkOptionButton {
  @DeclDISPID(-543)  public String getAccelerator() throws ComException {
    final Object obj = this._dispatchCall(-543,"Accelerator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-543)  public void setAccelerator(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-543,"Accelerator", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(710)  public com.wilutions.mslib.outlook.OlAlignment getAlignment() throws ComException {
    final Object obj = this._dispatchCall(710,"Alignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlAlignment.valueOf((Integer)obj);
  }
  @DeclDISPID(710)  public void setAlignment(final com.wilutions.mslib.outlook.OlAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(710,"Alignment", DISPATCH_PROPERTYPUT,value.value);
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
  @DeclDISPID(-502)  public com.wilutions.mslib.outlook.OlBackStyle getBackStyle() throws ComException {
    final Object obj = this._dispatchCall(-502,"BackStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlBackStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-502)  public void setBackStyle(final com.wilutions.mslib.outlook.OlBackStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-502,"BackStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-518)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(-518,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-518)  public void setCaption(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-518,"Caption", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(-541)  public String getGroupName() throws ComException {
    final Object obj = this._dispatchCall(-541,"GroupName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-541)  public void setGroupName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"GroupName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(-521)  public com.wilutions.mslib.outlook.OlMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(-521)  public void setMousePointer(final com.wilutions.mslib.outlook.OlMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
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
  @DeclDISPID(-536)  public Boolean getWordWrap() throws ComException {
    final Object obj = this._dispatchCall(-536,"WordWrap", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-536)  public void setWordWrap(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-536,"WordWrap", DISPATCH_PROPERTYPUT,value);
  }
  public _OlkOptionButtonImpl(String progId) throws ComException {
    super(progId, "{000672DC-0000-0000-C000-000000000046}");
  }
  protected _OlkOptionButtonImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_OlkOptionButtonImpl" + super.toString() + "]";
  }
}
