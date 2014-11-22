/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ComboBox.
 * 
 */
@CoClass(guid="{8BD21D30-EC42-11CE-9E0D-00AA006002F3}")
public class ComboBox extends Dispatch implements IMdcCombo {
  @DeclDISPID(-500)  public void setAutoSize(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-500,"AutoSize", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException {
    final Object obj = this._dispatchCall(-500,"AutoSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(217)  public void setAutoTab(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(217,"AutoTab", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(217)  public Boolean getAutoTab() throws ComException {
    final Object obj = this._dispatchCall(217,"AutoTab", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(218)  public void setAutoWordSelect(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(218,"AutoWordSelect", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(218)  public Boolean getAutoWordSelect() throws ComException {
    final Object obj = this._dispatchCall(218,"AutoWordSelect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-501)  public void setBackColor(OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException {
    final Object obj = this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(-502)  public void setBackStyle(fmBackStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-502,"BackStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-502)  public fmBackStyle getBackStyle() throws ComException {
    final Object obj = this._dispatchCall(-502,"BackStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmBackStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-503)  public void setBorderColor(OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-503,"BorderColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-503)  public OLE_COLOR getBorderColor() throws ComException {
    final Object obj = this._dispatchCall(-503,"BorderColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(-504)  public void setBorderStyle(fmBorderStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-504)  public fmBorderStyle getBorderStyle() throws ComException {
    final Object obj = this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmBorderStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(501)  public void setBoundColumn(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(501,"BoundColumn", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(501)  public Object getBoundColumn() throws ComException {
    final Object obj = this._dispatchCall(501,"BoundColumn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(25)  public Boolean getCanPaste() throws ComException {
    final Object obj = this._dispatchCall(25,"CanPaste", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(601)  public void setColumnCount(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(601,"ColumnCount", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(601)  public Integer getColumnCount() throws ComException {
    final Object obj = this._dispatchCall(601,"ColumnCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(602)  public void setColumnHeads(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(602,"ColumnHeads", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(602)  public Boolean getColumnHeads() throws ComException {
    final Object obj = this._dispatchCall(602,"ColumnHeads", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(603)  public void setColumnWidths(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(603,"ColumnWidths", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(603)  public String getColumnWidths() throws ComException {
    final Object obj = this._dispatchCall(603,"ColumnWidths", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(210)  public Integer getCurTargetX() throws ComException {
    final Object obj = this._dispatchCall(210,"CurTargetX", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(208)  public void setCurX(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(208,"CurX", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(208)  public Integer getCurX() throws ComException {
    final Object obj = this._dispatchCall(208,"CurX", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(305)  public void setDropButtonStyle(fmDropButtonStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(305,"DropButtonStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(305)  public fmDropButtonStyle getDropButtonStyle() throws ComException {
    final Object obj = this._dispatchCall(305,"DropButtonStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmDropButtonStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-512)  public void setFont(Font value) throws ComException {
    this._dispatchCall(-512,"Font", DISPATCH_PROPERTYPUTREF,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-512)  public Font getFont() throws ComException {
    final Object obj = this._dispatchCall(-512,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.msforms.impl.FontImpl.class);
  }
  @DeclDISPID(-513)  public void setForeColor(OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException {
    final Object obj = this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(207)  public void setHideSelection(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(207,"HideSelection", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(207)  public Boolean getHideSelection() throws ComException {
    final Object obj = this._dispatchCall(207,"HideSelection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(214)  public Integer getLineCount() throws ComException {
    final Object obj = this._dispatchCall(214,"LineCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-531)  public Integer getListCount() throws ComException {
    final Object obj = this._dispatchCall(-531,"ListCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-526)  public void setListIndex(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(-526,"ListIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-526)  public Object getListIndex() throws ComException {
    final Object obj = this._dispatchCall(-526,"ListIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(605)  public void setListRows(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(605,"ListRows", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(605)  public Integer getListRows() throws ComException {
    final Object obj = this._dispatchCall(605,"ListRows", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(307)  public void setListStyle(fmListStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(307,"ListStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(307)  public fmListStyle getListStyle() throws ComException {
    final Object obj = this._dispatchCall(307,"ListStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmListStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(606)  public void setListWidth(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(606,"ListWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(606)  public Object getListWidth() throws ComException {
    final Object obj = this._dispatchCall(606,"ListWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(10)  public void setLocked(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"Locked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10)  public Boolean getLocked() throws ComException {
    final Object obj = this._dispatchCall(10,"Locked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(504)  public void setMatchEntry(fmMatchEntry value) throws ComException {
    assert(value != null);
    this._dispatchCall(504,"MatchEntry", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(504)  public fmMatchEntry getMatchEntry() throws ComException {
    final Object obj = this._dispatchCall(504,"MatchEntry", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmMatchEntry.valueOf((Integer)obj);
  }
  @DeclDISPID(505)  public Boolean getMatchFound() throws ComException {
    final Object obj = this._dispatchCall(505,"MatchFound", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(503)  public void setMatchRequired(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(503,"MatchRequired", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(503)  public Boolean getMatchRequired() throws ComException {
    final Object obj = this._dispatchCall(503,"MatchRequired", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-533)  public void setMaxLength(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-533,"MaxLength", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-533)  public Integer getMaxLength() throws ComException {
    final Object obj = this._dispatchCall(-533,"MaxLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-521)  public void setMousePointer(fmMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(220)  public void setSelectionMargin(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(220,"SelectionMargin", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(220)  public Boolean getSelectionMargin() throws ComException {
    final Object obj = this._dispatchCall(220,"SelectionMargin", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-548)  public void setSelLength(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-548,"SelLength", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-548)  public Integer getSelLength() throws ComException {
    final Object obj = this._dispatchCall(-548,"SelLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-547)  public void setSelStart(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-547,"SelStart", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-547)  public Integer getSelStart() throws ComException {
    final Object obj = this._dispatchCall(-547,"SelStart", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-546)  public void setSelText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-546,"SelText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-546)  public String getSelText() throws ComException {
    final Object obj = this._dispatchCall(-546,"SelText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(304)  public void setShowDropButtonWhen(fmShowDropButtonWhen value) throws ComException {
    assert(value != null);
    this._dispatchCall(304,"ShowDropButtonWhen", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(304)  public fmShowDropButtonWhen getShowDropButtonWhen() throws ComException {
    final Object obj = this._dispatchCall(304,"ShowDropButtonWhen", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmShowDropButtonWhen.valueOf((Integer)obj);
  }
  @DeclDISPID(12)  public void setSpecialEffect(fmSpecialEffect value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(12)  public fmSpecialEffect getSpecialEffect() throws ComException {
    final Object obj = this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmSpecialEffect.valueOf((Integer)obj);
  }
  @DeclDISPID(308)  public void setStyle(fmStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(308,"Style", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(308)  public fmStyle getStyle() throws ComException {
    final Object obj = this._dispatchCall(308,"Style", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-517)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-517,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-517)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(-517,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(10004)  public void setTextAlign(fmTextAlign value) throws ComException {
    assert(value != null);
    this._dispatchCall(10004,"TextAlign", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(10004)  public fmTextAlign getTextAlign() throws ComException {
    final Object obj = this._dispatchCall(10004,"TextAlign", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmTextAlign.valueOf((Integer)obj);
  }
  @DeclDISPID(502)  public void setTextColumn(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(502,"TextColumn", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(502)  public Object getTextColumn() throws ComException {
    final Object obj = this._dispatchCall(502,"TextColumn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(216)  public Integer getTextLength() throws ComException {
    final Object obj = this._dispatchCall(216,"TextLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(611)  public void setTopIndex(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(611,"TopIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(611)  public Object getTopIndex() throws ComException {
    final Object obj = this._dispatchCall(611,"TopIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setValue(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(-529)  public Object getColumn(Object pvargColumn, Object pvargIndex) throws ComException {
    assert(pvargColumn != null);
    assert(pvargIndex != null);
    final Object obj = this._dispatchCall(-529,"Column", DISPATCH_PROPERTYGET,null,pvargColumn,pvargIndex);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(-529)  public void setColumn(Object pvargColumn, Object pvargIndex, Object value3) throws ComException {
    assert(value3 != null);
    assert(pvargColumn != null);
    assert(pvargIndex != null);
    this._dispatchCall(-529,"Column", DISPATCH_PROPERTYPUT,value3,pvargColumn,pvargIndex);
  }
  @DeclDISPID(-528)  public Object getList(Object pvargIndex, Object pvargColumn) throws ComException {
    assert(pvargIndex != null);
    assert(pvargColumn != null);
    final Object obj = this._dispatchCall(-528,"List", DISPATCH_PROPERTYGET,null,pvargIndex,pvargColumn);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(-528)  public void setList(Object pvargIndex, Object pvargColumn, Object value3) throws ComException {
    assert(value3 != null);
    assert(pvargIndex != null);
    assert(pvargColumn != null);
    this._dispatchCall(-528,"List", DISPATCH_PROPERTYPUT,value3,pvargIndex,pvargColumn);
  }
  @DeclDISPID(-553)  public void AddItem(Object pvargItem, Object pvargIndex) throws ComException {
    assert(pvargItem != null);
    assert(pvargIndex != null);
    this._dispatchCall(-553,"AddItem", DISPATCH_METHOD,null,pvargItem,pvargIndex);
  }
  @DeclDISPID(-554)  public void Clear() throws ComException {
    this._dispatchCall(-554,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1001)  public void DropDown() throws ComException {
    this._dispatchCall(1001,"DropDown", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-555)  public void RemoveItem(Object pvargIndex) throws ComException {
    assert(pvargIndex != null);
    this._dispatchCall(-555,"RemoveItem", DISPATCH_METHOD,null,pvargIndex);
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
  @DeclDISPID(-542)  public void setIMEMode(fmIMEMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(-542,"IMEMode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-542)  public fmIMEMode getIMEMode() throws ComException {
    final Object obj = this._dispatchCall(-542,"IMEMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmIMEMode.valueOf((Integer)obj);
  }
  @DeclDISPID(224)  public void setEnterFieldBehavior(fmEnterFieldBehavior value) throws ComException {
    assert(value != null);
    this._dispatchCall(224,"EnterFieldBehavior", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(224)  public fmEnterFieldBehavior getEnterFieldBehavior() throws ComException {
    final Object obj = this._dispatchCall(224,"EnterFieldBehavior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmEnterFieldBehavior.valueOf((Integer)obj);
  }
  @DeclDISPID(225)  public void setDragBehavior(fmDragBehavior value) throws ComException {
    assert(value != null);
    this._dispatchCall(225,"DragBehavior", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(225)  public fmDragBehavior getDragBehavior() throws ComException {
    final Object obj = this._dispatchCall(225,"DragBehavior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmDragBehavior.valueOf((Integer)obj);
  }
  public ComboBox() throws ComException {
    super("{8BD21D30-EC42-11CE-9E0D-00AA006002F3}", "{8BD21D33-EC42-11CE-9E0D-00AA006002F3}");
  }
  protected ComboBox(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ComboBox" + super.toString() + "]";
  }
}
