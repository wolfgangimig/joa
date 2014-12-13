/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * UserForm2.
 * 
 */
@CoClass(guid="{4795051A-6429-4D63-BCA0-D706532954AC}")
public class UserForm2 extends Dispatch implements _UserForm {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(256)  public Control getActiveControl() throws ComException {
    final Object obj = this._dispatchCall(256,"ActiveControl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(Control.class);
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
  @DeclDISPID(257)  public Boolean getCanPaste() throws ComException {
    final Object obj = this._dispatchCall(257,"CanPaste", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(258)  public Boolean getCanRedo() throws ComException {
    final Object obj = this._dispatchCall(258,"CanRedo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(259)  public Boolean getCanUndo() throws ComException {
    final Object obj = this._dispatchCall(259,"CanUndo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-518)  public void setCaption(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-518,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-518)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(-518,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public Controls getControls() throws ComException {
    final Object obj = this._dispatchCall(0,"Controls", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.ControlsImpl.class);
  }
  @DeclDISPID(260)  public void setCycle(final fmCycle value) throws ComException {
    assert(value != null);
    this._dispatchCall(260,"Cycle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(260)  public fmCycle getCycle() throws ComException {
    final Object obj = this._dispatchCall(260,"Cycle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmCycle.valueOf((Integer)obj);
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
  @DeclDISPID(1610743830)  public void _GetInsideHeight(final ByRef<Integer> InsideHeight) throws ComException {
    assert(InsideHeight != null);
    this._dispatchCall(1610743830,"_GetInsideHeight", DISPATCH_METHOD,null,InsideHeight);
  }
  @DeclDISPID(262)  public Float getInsideHeight() throws ComException {
    final Object obj = this._dispatchCall(262,"InsideHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743832)  public void _GetInsideWidth(final ByRef<Integer> InsideWidth) throws ComException {
    assert(InsideWidth != null);
    this._dispatchCall(1610743832,"_GetInsideWidth", DISPATCH_METHOD,null,InsideWidth);
  }
  @DeclDISPID(263)  public Float getInsideWidth() throws ComException {
    final Object obj = this._dispatchCall(263,"InsideWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(264)  public void setKeepScrollBarsVisible(final fmScrollBars value) throws ComException {
    assert(value != null);
    this._dispatchCall(264,"KeepScrollBarsVisible", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(264)  public fmScrollBars getKeepScrollBarsVisible() throws ComException {
    final Object obj = this._dispatchCall(264,"KeepScrollBarsVisible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmScrollBars.valueOf((Integer)obj);
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
  @DeclDISPID(26)  public void setPictureAlignment(final fmPictureAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(26,"PictureAlignment", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(26)  public fmPictureAlignment getPictureAlignment() throws ComException {
    final Object obj = this._dispatchCall(26,"PictureAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmPictureAlignment.valueOf((Integer)obj);
  }
  @DeclDISPID(-523)  public void setPicture(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-523,"Picture", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-523)  public com.wilutions.mslib.stdole.Picture getPicture() throws ComException {
    final Object obj = this._dispatchCall(-523,"Picture", DISPATCH_PROPERTYGET,null);
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
  @DeclDISPID(28)  public void setPictureTiling(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(28,"PictureTiling", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(28)  public Boolean getPictureTiling() throws ComException {
    final Object obj = this._dispatchCall(28,"PictureTiling", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(265)  public void setScrollBars(final fmScrollBars value) throws ComException {
    assert(value != null);
    this._dispatchCall(265,"ScrollBars", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(265)  public fmScrollBars getScrollBars() throws ComException {
    final Object obj = this._dispatchCall(265,"ScrollBars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmScrollBars.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743852)  public void _SetScrollHeight(final Integer ScrollHeight) throws ComException {
    assert(ScrollHeight != null);
    this._dispatchCall(1610743852,"_SetScrollHeight", DISPATCH_METHOD,null,ScrollHeight);
  }
  @DeclDISPID(1610743853)  public void _GetScrollHeight(final ByRef<Integer> ScrollHeight) throws ComException {
    assert(ScrollHeight != null);
    this._dispatchCall(1610743853,"_GetScrollHeight", DISPATCH_METHOD,null,ScrollHeight);
  }
  @DeclDISPID(266)  public void setScrollHeight(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(266,"ScrollHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(266)  public Float getScrollHeight() throws ComException {
    final Object obj = this._dispatchCall(266,"ScrollHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743856)  public void _SetScrollLeft(final Integer ScrollLeft) throws ComException {
    assert(ScrollLeft != null);
    this._dispatchCall(1610743856,"_SetScrollLeft", DISPATCH_METHOD,null,ScrollLeft);
  }
  @DeclDISPID(1610743857)  public void _GetScrollLeft(final ByRef<Integer> ScrollLeft) throws ComException {
    assert(ScrollLeft != null);
    this._dispatchCall(1610743857,"_GetScrollLeft", DISPATCH_METHOD,null,ScrollLeft);
  }
  @DeclDISPID(267)  public void setScrollLeft(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(267,"ScrollLeft", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(267)  public Float getScrollLeft() throws ComException {
    final Object obj = this._dispatchCall(267,"ScrollLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743860)  public void _SetScrollTop(final Integer ScrollTop) throws ComException {
    assert(ScrollTop != null);
    this._dispatchCall(1610743860,"_SetScrollTop", DISPATCH_METHOD,null,ScrollTop);
  }
  @DeclDISPID(1610743861)  public void _GetScrollTop(final ByRef<Integer> ScrollTop) throws ComException {
    assert(ScrollTop != null);
    this._dispatchCall(1610743861,"_GetScrollTop", DISPATCH_METHOD,null,ScrollTop);
  }
  @DeclDISPID(268)  public void setScrollTop(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(268,"ScrollTop", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(268)  public Float getScrollTop() throws ComException {
    final Object obj = this._dispatchCall(268,"ScrollTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743864)  public void _SetScrollWidth(final Integer ScrollWidth) throws ComException {
    assert(ScrollWidth != null);
    this._dispatchCall(1610743864,"_SetScrollWidth", DISPATCH_METHOD,null,ScrollWidth);
  }
  @DeclDISPID(1610743865)  public void _GetScrollWidth(final ByRef<Integer> ScrollWidth) throws ComException {
    assert(ScrollWidth != null);
    this._dispatchCall(1610743865,"_GetScrollWidth", DISPATCH_METHOD,null,ScrollWidth);
  }
  @DeclDISPID(269)  public void setScrollWidth(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(269,"ScrollWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(269)  public Float getScrollWidth() throws ComException {
    final Object obj = this._dispatchCall(269,"ScrollWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
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
  @DeclDISPID(271)  public void setVerticalScrollBarSide(final fmVerticalScrollBarSide value) throws ComException {
    assert(value != null);
    this._dispatchCall(271,"VerticalScrollBarSide", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(271)  public fmVerticalScrollBarSide getVerticalScrollBarSide() throws ComException {
    final Object obj = this._dispatchCall(271,"VerticalScrollBarSide", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmVerticalScrollBarSide.valueOf((Integer)obj);
  }
  @DeclDISPID(272)  public void setZoom(final Short value) throws ComException {
    assert(value != null);
    this._dispatchCall(272,"Zoom", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(272)  public Short getZoom() throws ComException {
    final Object obj = this._dispatchCall(272,"Zoom", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Short)obj;
  }
  @DeclDISPID(512)  public void Copy() throws ComException {
    this._dispatchCall(512,"Copy", DISPATCH_METHOD,null);
  }
  @DeclDISPID(513)  public void Cut() throws ComException {
    this._dispatchCall(513,"Cut", DISPATCH_METHOD,null);
  }
  @DeclDISPID(514)  public void Paste() throws ComException {
    this._dispatchCall(514,"Paste", DISPATCH_METHOD,null);
  }
  @DeclDISPID(515)  public void RedoAction() throws ComException {
    this._dispatchCall(515,"RedoAction", DISPATCH_METHOD,null);
  }
  @DeclDISPID(516)  public void Repaint() throws ComException {
    this._dispatchCall(516,"Repaint", DISPATCH_METHOD,null);
  }
  @DeclDISPID(517)  public void Scroll(final Object xAction, final Object yAction) throws ComException {
    assert(xAction != null);
    assert(yAction != null);
    this._dispatchCall(517,"Scroll", DISPATCH_METHOD,null,xAction,yAction);
  }
  @DeclDISPID(518)  public void SetDefaultTabOrder() throws ComException {
    this._dispatchCall(518,"SetDefaultTabOrder", DISPATCH_METHOD,null);
  }
  @DeclDISPID(519)  public void UndoAction() throws ComException {
    this._dispatchCall(519,"UndoAction", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743893)  public void _SetGridX(final Integer GridX) throws ComException {
    assert(GridX != null);
    this._dispatchCall(1610743893,"_SetGridX", DISPATCH_METHOD,null,GridX);
  }
  @DeclDISPID(1610743894)  public void _GetGridX(final ByRef<Integer> GridX) throws ComException {
    assert(GridX != null);
    this._dispatchCall(1610743894,"_GetGridX", DISPATCH_METHOD,null,GridX);
  }
  @DeclDISPID(1610743897)  public void _SetGridY(final Integer GridY) throws ComException {
    assert(GridY != null);
    this._dispatchCall(1610743897,"_SetGridY", DISPATCH_METHOD,null,GridY);
  }
  @DeclDISPID(1610743898)  public void _GetGridY(final ByRef<Integer> GridY) throws ComException {
    assert(GridY != null);
    this._dispatchCall(1610743898,"_GetGridY", DISPATCH_METHOD,null,GridY);
  }
  @DeclDISPID(395)  public void setDrawBuffer(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(395,"DrawBuffer", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(395)  public Integer getDrawBuffer() throws ComException {
    final Object obj = this._dispatchCall(395,"DrawBuffer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public UserForm2() throws ComException {
    super("{4795051A-6429-4D63-BCA0-D706532954AC}", "{04598FC8-866C-11CF-AB7C-00AA00C08FCF}");
  }
  protected UserForm2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[UserForm2" + super.toString() + "]";
  }
}
