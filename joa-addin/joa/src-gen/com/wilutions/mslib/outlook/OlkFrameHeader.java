/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkFrameHeader.
 * 
 */
@CoClass(guid="{0006F057-0000-0000-C000-000000000046}")
public class OlkFrameHeader extends Dispatch implements _OlkFrameHeader {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(710)  public OlAlignment getAlignment() throws ComException {
    final Object obj = this._dispatchCall(710,"Alignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlAlignment.valueOf((Integer)obj);
  }
  @DeclDISPID(710)  public void setAlignment(final OlAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(710,"Alignment", DISPATCH_PROPERTYPUT,value.value);
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
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,Dispatch.param(value));
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
  public OlkFrameHeader() throws ComException {
    super("{0006F057-0000-0000-C000-000000000046}", "{00067352-0000-0000-C000-000000000046}");
  }
  protected OlkFrameHeader(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OlkFrameHeader" + super.toString() + "]";
  }
}
