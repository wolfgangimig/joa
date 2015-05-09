/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * Image2.
 * 
 */
@CoClass(guid="{DCA0ED3C-B95D-490F-9C60-0FF3726C789A}")
public class Image2 extends Dispatch implements IImage {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
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
  @DeclDISPID(-523)  public void setPicture(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-523,"Picture", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(-523)  public com.wilutions.mslib.stdole.Picture getPicture() throws ComException {
    final Object obj = this._dispatchCall(-523,"Picture", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(27)  public void setPictureSizeMode(final fmPictureSizeMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(27,"PictureSizeMode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(27)  public fmPictureSizeMode getPictureSizeMode() throws ComException {
    final Object obj = this._dispatchCall(27,"PictureSizeMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmPictureSizeMode.valueOf((Integer)obj);
  }
  @DeclDISPID(26)  public void setPictureAlignment(final fmPictureAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(26,"PictureAlignment", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(26)  public fmPictureAlignment getPictureAlignment() throws ComException {
    final Object obj = this._dispatchCall(26,"PictureAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmPictureAlignment.valueOf((Integer)obj);
  }
  @DeclDISPID(28)  public void setPictureTiling(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(28,"PictureTiling", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(28)  public Boolean getPictureTiling() throws ComException {
    final Object obj = this._dispatchCall(28,"PictureTiling", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
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
  public Image2() throws ComException {
    super("{DCA0ED3C-B95D-490F-9C60-0FF3726C789A}", "{4C599243-6926-101B-9992-00000B65C6F9}");
  }
  protected Image2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Image2" + super.toString() + "]";
  }
}
