/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091EBB4-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _OlkListBoxImpl extends Dispatch implements com.wilutions.mslib.outlook._OlkListBox {
  @DeclDISPID(-504)  public com.wilutions.mslib.outlook.OlBorderStyle getBorderStyle() throws ComException {
    final Object obj = this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlBorderStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-504)  public void setBorderStyle(com.wilutions.mslib.outlook.OlBorderStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-501)  public com.wilutions.mslib.stdole.OLE_COLOR getBackColor() throws ComException {
    final Object obj = this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_COLOR(als);
  }
  @DeclDISPID(-501)  public void setBackColor(com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYPUT,value.getValue());
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
  @DeclDISPID(10)  public Boolean getLocked() throws ComException {
    final Object obj = this._dispatchCall(10,"Locked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(10)  public void setLocked(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"Locked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(504)  public com.wilutions.mslib.outlook.OlMatchEntry getMatchEntry() throws ComException {
    final Object obj = this._dispatchCall(504,"MatchEntry", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlMatchEntry.valueOf((Integer)obj);
  }
  @DeclDISPID(504)  public void setMatchEntry(com.wilutions.mslib.outlook.OlMatchEntry value) throws ComException {
    assert(value != null);
    this._dispatchCall(504,"MatchEntry", DISPATCH_PROPERTYPUT,value.value);
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
  @DeclDISPID(-532)  public com.wilutions.mslib.outlook.OlMultiSelect getMultiSelect() throws ComException {
    final Object obj = this._dispatchCall(-532,"MultiSelect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlMultiSelect.valueOf((Integer)obj);
  }
  @DeclDISPID(-532)  public void setMultiSelect(com.wilutions.mslib.outlook.OlMultiSelect value) throws ComException {
    assert(value != null);
    this._dispatchCall(-532,"MultiSelect", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-517)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(-517,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-517)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-517,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10004)  public com.wilutions.mslib.outlook.OlTextAlign getTextAlign() throws ComException {
    final Object obj = this._dispatchCall(10004,"TextAlign", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlTextAlign.valueOf((Integer)obj);
  }
  @DeclDISPID(10004)  public void setTextAlign(com.wilutions.mslib.outlook.OlTextAlign value) throws ComException {
    assert(value != null);
    this._dispatchCall(10004,"TextAlign", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(611)  public Integer getTopIndex() throws ComException {
    final Object obj = this._dispatchCall(611,"TopIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(611)  public void setTopIndex(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(611,"TopIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setValue(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-526)  public Integer getListIndex() throws ComException {
    final Object obj = this._dispatchCall(-526,"ListIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-526)  public void setListIndex(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-526,"ListIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-531)  public Integer getListCount() throws ComException {
    final Object obj = this._dispatchCall(-531,"ListCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8457)  public String GetItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(8457,"GetItem", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64478)  public void SetItem(Integer Index, String Item) throws ComException {
    assert(Index != null);
    assert(Item != null);
    this._dispatchCall(64478,"SetItem", DISPATCH_METHOD,null,Index,Item);
  }
  @DeclDISPID(64479)  public Boolean GetSelected(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(64479,"GetSelected", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64480)  public void SetSelected(Integer Index, Boolean Selected) throws ComException {
    assert(Index != null);
    assert(Selected != null);
    this._dispatchCall(64480,"SetSelected", DISPATCH_METHOD,null,Index,Selected);
  }
  @DeclDISPID(22)  public void Copy() throws ComException {
    this._dispatchCall(22,"Copy", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-554)  public void Clear() throws ComException {
    this._dispatchCall(-554,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-553)  public void AddItem(String ItemText, Object Index) throws ComException {
    assert(ItemText != null);
    assert(Index != null);
    this._dispatchCall(-553,"AddItem", DISPATCH_METHOD,null,ItemText,Index);
  }
  @DeclDISPID(-555)  public void RemoveItem(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(-555,"RemoveItem", DISPATCH_METHOD,null,Index);
  }
  public _OlkListBoxImpl(String progId) throws ComException {
    super(progId);
  }
  protected _OlkListBoxImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_OlkListBoxImpl" + super.toString() + "]";
  }
}
