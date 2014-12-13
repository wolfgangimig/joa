/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * Label2.
 * 
 */
@CoClass(guid="{5052A832-2C0F-46C7-B67C-1F1FEC37B280}")
public class Label2 extends Dispatch implements ILabelControl {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-500)  public void setAutoSize(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-500,"AutoSize", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException {
    final Object obj = this._dispatchCall(-500,"AutoSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-501)  public void setBackColor(final OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException {
    final Object obj = this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(-502)  public void setBackStyle(final fmBackStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-502,"BackStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-502)  public fmBackStyle getBackStyle() throws ComException {
    final Object obj = this._dispatchCall(-502,"BackStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmBackStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-503)  public void setBorderColor(final OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-503,"BorderColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-503)  public OLE_COLOR getBorderColor() throws ComException {
    final Object obj = this._dispatchCall(-503,"BorderColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(-504)  public void setBorderStyle(final fmBorderStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-504)  public fmBorderStyle getBorderStyle() throws ComException {
    final Object obj = this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmBorderStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(0)  public void setCaption(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(0,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-512)  public void setFont(final Font value) throws ComException {
    this._dispatchCall(-512,"Font", DISPATCH_PROPERTYPUTREF,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-512)  public Font getFont() throws ComException {
    final Object obj = this._dispatchCall(-512,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.FontImpl.class);
  }
  @DeclDISPID(-513)  public void setForeColor(final OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException {
    final Object obj = this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-521)  public void setMousePointer(final fmMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(-523)  public void setPicture(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-523,"Picture", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-523)  public com.wilutions.mslib.stdole.Picture getPicture() throws ComException {
    final Object obj = this._dispatchCall(-523,"Picture", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(11)  public void setPicturePosition(final fmPicturePosition value) throws ComException {
    assert(value != null);
    this._dispatchCall(11,"PicturePosition", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(11)  public fmPicturePosition getPicturePosition() throws ComException {
    final Object obj = this._dispatchCall(11,"PicturePosition", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmPicturePosition.valueOf((Integer)obj);
  }
  @DeclDISPID(12)  public void setSpecialEffect(final fmSpecialEffect value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(12)  public fmSpecialEffect getSpecialEffect() throws ComException {
    final Object obj = this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmSpecialEffect.valueOf((Integer)obj);
  }
  @DeclDISPID(13)  public void setTextAlign(final fmTextAlign value) throws ComException {
    assert(value != null);
    this._dispatchCall(13,"TextAlign", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(13)  public fmTextAlign getTextAlign() throws ComException {
    final Object obj = this._dispatchCall(13,"TextAlign", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmTextAlign.valueOf((Integer)obj);
  }
  @DeclDISPID(-536)  public void setWordWrap(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-536,"WordWrap", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-536)  public Boolean getWordWrap() throws ComException {
    final Object obj = this._dispatchCall(-536,"WordWrap", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-543)  public void setAccelerator(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-543,"Accelerator", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-543)  public String getAccelerator() throws ComException {
    final Object obj = this._dispatchCall(-543,"Accelerator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public Label2() throws ComException {
    super("{5052A832-2C0F-46C7-B67C-1F1FEC37B280}", "{04598FC1-866C-11CF-AB7C-00AA00C08FCF}");
  }
  protected Label2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Label2" + super.toString() + "]";
  }
}
