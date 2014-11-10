/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091EA39-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _OlkFrameHeaderImpl extends Dispatch implements com.wilutions.mslib.outlook._OlkFrameHeader {
  @DeclDISPID(710)  public com.wilutions.mslib.outlook.OlAlignment getAlignment() throws ComException {
    final Object obj = this._dispatchCall(710,"Alignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlAlignment.valueOf((Integer)obj);
  }
  @DeclDISPID(710)  public void setAlignment(com.wilutions.mslib.outlook.OlAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(710,"Alignment", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-518)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(-518,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-518)  public void setCaption(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-518,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-512)  public com.wilutions.mslib.stdole.Font getFont() throws ComException {
    final Object obj = this._dispatchCall(-512,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.stdole.impl.FontImpl.class);
  }
  @DeclDISPID(-513)  public com.wilutions.mslib.stdole.OLE_COLOR getForeColor() throws ComException {
    final Object obj = this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_COLOR(als);
  }
  @DeclDISPID(-513)  public void setForeColor(com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-521)  public com.wilutions.mslib.outlook.OlMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(-521)  public void setMousePointer(com.wilutions.mslib.outlook.OlMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  public _OlkFrameHeaderImpl(String progId) throws ComException {
    super(progId);
  }
  protected _OlkFrameHeaderImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_OlkFrameHeaderImpl" + super.toString() + "]";
  }
}
