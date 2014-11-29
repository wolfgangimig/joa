/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8CCE0B28-CD45-CB5A-043C-69E7AE923A03}")
public class IImageImpl extends Dispatch implements com.wilutions.mslib.msforms.IImage {
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-521)  public void setMousePointer(final com.wilutions.mslib.msforms.fmMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-521)  public com.wilutions.mslib.msforms.fmMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmMousePointer.valueOf((Integer)obj);
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
  @DeclDISPID(-501)  public void setBackColor(final com.wilutions.mslib.msforms.OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-501)  public com.wilutions.mslib.msforms.OLE_COLOR getBackColor() throws ComException {
    final Object obj = this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.msforms.OLE_COLOR(als);
  }
  @DeclDISPID(-502)  public void setBackStyle(final com.wilutions.mslib.msforms.fmBackStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-502,"BackStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-502)  public com.wilutions.mslib.msforms.fmBackStyle getBackStyle() throws ComException {
    final Object obj = this._dispatchCall(-502,"BackStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmBackStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-503)  public void setBorderColor(final com.wilutions.mslib.msforms.OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-503,"BorderColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-503)  public com.wilutions.mslib.msforms.OLE_COLOR getBorderColor() throws ComException {
    final Object obj = this._dispatchCall(-503,"BorderColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.msforms.OLE_COLOR(als);
  }
  @DeclDISPID(-504)  public void setBorderStyle(final com.wilutions.mslib.msforms.fmBorderStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-504)  public com.wilutions.mslib.msforms.fmBorderStyle getBorderStyle() throws ComException {
    final Object obj = this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmBorderStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-523)  public void setPicture(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-523,"Picture", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-523)  public com.wilutions.mslib.stdole.Picture getPicture() throws ComException {
    final Object obj = this._dispatchCall(-523,"Picture", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(27)  public void setPictureSizeMode(final com.wilutions.mslib.msforms.fmPictureSizeMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(27,"PictureSizeMode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(27)  public com.wilutions.mslib.msforms.fmPictureSizeMode getPictureSizeMode() throws ComException {
    final Object obj = this._dispatchCall(27,"PictureSizeMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmPictureSizeMode.valueOf((Integer)obj);
  }
  @DeclDISPID(26)  public void setPictureAlignment(final com.wilutions.mslib.msforms.fmPictureAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(26,"PictureAlignment", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(26)  public com.wilutions.mslib.msforms.fmPictureAlignment getPictureAlignment() throws ComException {
    final Object obj = this._dispatchCall(26,"PictureAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmPictureAlignment.valueOf((Integer)obj);
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
  @DeclDISPID(12)  public void setSpecialEffect(final com.wilutions.mslib.msforms.fmSpecialEffect value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(12)  public com.wilutions.mslib.msforms.fmSpecialEffect getSpecialEffect() throws ComException {
    final Object obj = this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmSpecialEffect.valueOf((Integer)obj);
  }
  public IImageImpl(String progId) throws ComException {
    super(progId, "{4C599243-6926-101B-9992-00000B65C6F9}");
  }
  protected IImageImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IImageImpl" + super.toString() + "]";
  }
}
