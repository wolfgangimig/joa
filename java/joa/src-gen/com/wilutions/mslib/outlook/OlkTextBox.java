/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkTextBox.
 * Outlook TextBox 
 */
@CoClass(guid="{0006F068-0000-0000-C000-000000000046}")
public class OlkTextBox extends Dispatch implements _OlkTextBox {
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
  @DeclDISPID(217)  public Boolean getAutoTab() throws ComException {
    final Object obj = this._dispatchCall(217,"AutoTab", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(217)  public void setAutoTab(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(217,"AutoTab", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(-504)  public OlBorderStyle getBorderStyle() throws ComException {
    final Object obj = this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlBorderStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-504)  public void setBorderStyle(final OlBorderStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(225)  public OlDragBehavior getDragBehavior() throws ComException {
    final Object obj = this._dispatchCall(225,"DragBehavior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlDragBehavior.valueOf((Integer)obj);
  }
  @DeclDISPID(225)  public void setDragBehavior(final OlDragBehavior value) throws ComException {
    assert(value != null);
    this._dispatchCall(225,"DragBehavior", DISPATCH_PROPERTYPUT,value.value);
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
  @DeclDISPID(-544)  public Boolean getEnterKeyBehavior() throws ComException {
    final Object obj = this._dispatchCall(-544,"EnterKeyBehavior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-544)  public void setEnterKeyBehavior(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-544,"EnterKeyBehavior", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(604)  public Boolean getIntegralHeight() throws ComException {
    final Object obj = this._dispatchCall(604,"IntegralHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(604)  public void setIntegralHeight(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(604,"IntegralHeight", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(-533)  public Integer getMaxLength() throws ComException {
    final Object obj = this._dispatchCall(-533,"MaxLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-533)  public void setMaxLength(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-533,"MaxLength", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(-537)  public Boolean getMultiLine() throws ComException {
    final Object obj = this._dispatchCall(-537,"MultiLine", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-537)  public void setMultiLine(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-537,"MultiLine", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-534)  public String getPasswordChar() throws ComException {
    final Object obj = this._dispatchCall(-534,"PasswordChar", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-534)  public void setPasswordChar(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-534,"PasswordChar", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-535)  public OlScrollBars getScrollbars() throws ComException {
    final Object obj = this._dispatchCall(-535,"Scrollbars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlScrollBars.valueOf((Integer)obj);
  }
  @DeclDISPID(-535)  public void setScrollbars(final OlScrollBars value) throws ComException {
    assert(value != null);
    this._dispatchCall(-535,"Scrollbars", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(220)  public Boolean getSelectionMargin() throws ComException {
    final Object obj = this._dispatchCall(220,"SelectionMargin", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(220)  public void setSelectionMargin(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(220,"SelectionMargin", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-545)  public Boolean getTabKeyBehavior() throws ComException {
    final Object obj = this._dispatchCall(-545,"TabKeyBehavior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-545)  public void setTabKeyBehavior(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-545,"TabKeyBehavior", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(-536)  public Boolean getWordWrap() throws ComException {
    final Object obj = this._dispatchCall(-536,"WordWrap", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-536)  public void setWordWrap(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-536,"WordWrap", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-547)  public Integer getSelStart() throws ComException {
    final Object obj = this._dispatchCall(-547,"SelStart", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-547)  public void setSelStart(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-547,"SelStart", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-548)  public Integer getSelLength() throws ComException {
    final Object obj = this._dispatchCall(-548,"SelLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-548)  public void setSelLength(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-548,"SelLength", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-546)  public String getSelText() throws ComException {
    final Object obj = this._dispatchCall(-546,"SelText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(21)  public void Cut() throws ComException {
    this._dispatchCall(21,"Cut", DISPATCH_METHOD,null);
  }
  @DeclDISPID(22)  public void Copy() throws ComException {
    this._dispatchCall(22,"Copy", DISPATCH_METHOD,null);
  }
  @DeclDISPID(24)  public void Paste() throws ComException {
    this._dispatchCall(24,"Paste", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-554)  public void Clear() throws ComException {
    this._dispatchCall(-554,"Clear", DISPATCH_METHOD,null);
  }
  public OlkTextBox() throws ComException {
    super("{0006F068-0000-0000-C000-000000000046}", "{000672DA-0000-0000-C000-000000000046}");
  }
  protected OlkTextBox(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OlkTextBox" + super.toString() + "]";
  }
}
