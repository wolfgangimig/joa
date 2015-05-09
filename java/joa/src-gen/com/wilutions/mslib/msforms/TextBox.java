/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * TextBox.
 * 
 */
@CoClass(guid="{8BD21D10-EC42-11CE-9E0D-00AA006002F3}")
public class TextBox extends Dispatch implements IMdcText {
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
  @DeclDISPID(217)  public void setAutoTab(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(217,"AutoTab", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(217)  public Boolean getAutoTab() throws ComException {
    final Object obj = this._dispatchCall(217,"AutoTab", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(218)  public void setAutoWordSelect(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(218,"AutoWordSelect", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(218)  public Boolean getAutoWordSelect() throws ComException {
    final Object obj = this._dispatchCall(218,"AutoWordSelect", DISPATCH_PROPERTYGET,null);
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
  @DeclDISPID(25)  public Boolean getCanPaste() throws ComException {
    final Object obj = this._dispatchCall(25,"CanPaste", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(212)  public void setCurLine(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(212,"CurLine", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(212)  public Integer getCurLine() throws ComException {
    final Object obj = this._dispatchCall(212,"CurLine", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(210)  public Integer getCurTargetX() throws ComException {
    final Object obj = this._dispatchCall(210,"CurTargetX", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(208)  public void setCurX(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(208,"CurX", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(208)  public Integer getCurX() throws ComException {
    final Object obj = this._dispatchCall(208,"CurX", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-544)  public void setEnterKeyBehavior(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-544,"EnterKeyBehavior", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-544)  public Boolean getEnterKeyBehavior() throws ComException {
    final Object obj = this._dispatchCall(-544,"EnterKeyBehavior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
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
    this._dispatchCall(-512,"Font", DISPATCH_PROPERTYPUTREF,Dispatch.param(value));
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
  @DeclDISPID(207)  public void setHideSelection(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(207,"HideSelection", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(207)  public Boolean getHideSelection() throws ComException {
    final Object obj = this._dispatchCall(207,"HideSelection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(604)  public void setIntegralHeight(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(604,"IntegralHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(604)  public Boolean getIntegralHeight() throws ComException {
    final Object obj = this._dispatchCall(604,"IntegralHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(214)  public Integer getLineCount() throws ComException {
    final Object obj = this._dispatchCall(214,"LineCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(10)  public void setLocked(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"Locked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10)  public Boolean getLocked() throws ComException {
    final Object obj = this._dispatchCall(10,"Locked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-533)  public void setMaxLength(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-533,"MaxLength", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-533)  public Integer getMaxLength() throws ComException {
    final Object obj = this._dispatchCall(-533,"MaxLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,Dispatch.param(value));
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
  @DeclDISPID(-537)  public void setMultiLine(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-537,"MultiLine", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-537)  public Boolean getMultiLine() throws ComException {
    final Object obj = this._dispatchCall(-537,"MultiLine", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-534)  public void setPasswordChar(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-534,"PasswordChar", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-534)  public String getPasswordChar() throws ComException {
    final Object obj = this._dispatchCall(-534,"PasswordChar", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-535)  public void setScrollBars(final fmScrollBars value) throws ComException {
    assert(value != null);
    this._dispatchCall(-535,"ScrollBars", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-535)  public fmScrollBars getScrollBars() throws ComException {
    final Object obj = this._dispatchCall(-535,"ScrollBars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmScrollBars.valueOf((Integer)obj);
  }
  @DeclDISPID(220)  public void setSelectionMargin(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(220,"SelectionMargin", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(220)  public Boolean getSelectionMargin() throws ComException {
    final Object obj = this._dispatchCall(220,"SelectionMargin", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-548)  public void setSelLength(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-548,"SelLength", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-548)  public Integer getSelLength() throws ComException {
    final Object obj = this._dispatchCall(-548,"SelLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-547)  public void setSelStart(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-547,"SelStart", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-547)  public Integer getSelStart() throws ComException {
    final Object obj = this._dispatchCall(-547,"SelStart", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-546)  public void setSelText(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-546,"SelText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-546)  public String getSelText() throws ComException {
    final Object obj = this._dispatchCall(-546,"SelText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
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
  @DeclDISPID(-545)  public void setTabKeyBehavior(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-545,"TabKeyBehavior", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-545)  public Boolean getTabKeyBehavior() throws ComException {
    final Object obj = this._dispatchCall(-545,"TabKeyBehavior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-517)  public void setText(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-517,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-517)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(-517,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(10004)  public void setTextAlign(final fmTextAlign value) throws ComException {
    assert(value != null);
    this._dispatchCall(10004,"TextAlign", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(10004)  public fmTextAlign getTextAlign() throws ComException {
    final Object obj = this._dispatchCall(10004,"TextAlign", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmTextAlign.valueOf((Integer)obj);
  }
  @DeclDISPID(216)  public Integer getTextLength() throws ComException {
    final Object obj = this._dispatchCall(216,"TextLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public void setValue(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
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
  @DeclDISPID(22)  public void Copy() throws ComException {
    this._dispatchCall(22,"Copy", DISPATCH_METHOD,null);
  }
  @DeclDISPID(21)  public void Cut() throws ComException {
    this._dispatchCall(21,"Cut", DISPATCH_METHOD,null);
  }
  @DeclDISPID(24)  public void Paste() throws ComException {
    this._dispatchCall(24,"Paste", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-542)  public void setIMEMode(final fmIMEMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(-542,"IMEMode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-542)  public fmIMEMode getIMEMode() throws ComException {
    final Object obj = this._dispatchCall(-542,"IMEMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmIMEMode.valueOf((Integer)obj);
  }
  @DeclDISPID(224)  public void setEnterFieldBehavior(final fmEnterFieldBehavior value) throws ComException {
    assert(value != null);
    this._dispatchCall(224,"EnterFieldBehavior", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(224)  public fmEnterFieldBehavior getEnterFieldBehavior() throws ComException {
    final Object obj = this._dispatchCall(224,"EnterFieldBehavior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmEnterFieldBehavior.valueOf((Integer)obj);
  }
  @DeclDISPID(225)  public void setDragBehavior(final fmDragBehavior value) throws ComException {
    assert(value != null);
    this._dispatchCall(225,"DragBehavior", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(225)  public fmDragBehavior getDragBehavior() throws ComException {
    final Object obj = this._dispatchCall(225,"DragBehavior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmDragBehavior.valueOf((Integer)obj);
  }
  public TextBox() throws ComException {
    super("{8BD21D10-EC42-11CE-9E0D-00AA006002F3}", "{8BD21D13-EC42-11CE-9E0D-00AA006002F3}");
  }
  protected TextBox(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TextBox" + super.toString() + "]";
  }
}
