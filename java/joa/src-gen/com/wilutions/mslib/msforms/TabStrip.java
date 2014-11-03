/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * TabStrip.
 * 
 */
@CoClass(guid="{EAE50EB0-4A62-11CE-BED6-00AA00611080}")
public class TabStrip extends Dispatch implements ITabStrip {
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
  @DeclDISPID(-512)  public void setFont(Font value) throws ComException {
    this._dispatchCall(-512,"Font", DISPATCH_PROPERTYPUTREF,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-512)  public Font getFont() throws ComException {
    final Object obj = this._dispatchCall(-512,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.msforms.impl.FontImpl.class);
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
  @DeclDISPID(514)  public void setMultiRow(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(514,"MultiRow", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(514)  public Boolean getMultiRow() throws ComException {
    final Object obj = this._dispatchCall(514,"MultiRow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(513)  public void setStyle(fmTabStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(513,"Style", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(513)  public fmTabStyle getStyle() throws ComException {
    final Object obj = this._dispatchCall(513,"Style", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmTabStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(512)  public void setTabOrientation(fmTabOrientation value) throws ComException {
    assert(value != null);
    this._dispatchCall(512,"TabOrientation", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(512)  public fmTabOrientation getTabOrientation() throws ComException {
    final Object obj = this._dispatchCall(512,"TabOrientation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmTabOrientation.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743840)  public void _SetTabFixedWidth(Integer TabFixedWidth) throws ComException {
    assert(TabFixedWidth != null);
    this._dispatchCall(1610743840,"_SetTabFixedWidth", DISPATCH_METHOD,null,TabFixedWidth);
  }
  @DeclDISPID(1610743841)  public void _GetTabFixedWidth(ByRef<Integer> TabFixedWidth) throws ComException {
    assert(TabFixedWidth != null);
    this._dispatchCall(1610743841,"_GetTabFixedWidth", DISPATCH_METHOD,null,TabFixedWidth);
  }
  @DeclDISPID(1610743842)  public void _SetTabFixedHeight(Integer TabFixedHeight) throws ComException {
    assert(TabFixedHeight != null);
    this._dispatchCall(1610743842,"_SetTabFixedHeight", DISPATCH_METHOD,null,TabFixedHeight);
  }
  @DeclDISPID(1610743843)  public void _GetTabFixedHeight(ByRef<Integer> TabFixedHeight) throws ComException {
    assert(TabFixedHeight != null);
    this._dispatchCall(1610743843,"_GetTabFixedHeight", DISPATCH_METHOD,null,TabFixedHeight);
  }
  @DeclDISPID(1610743844)  public void _GetClientTop(ByRef<Integer> ClientTop) throws ComException {
    assert(ClientTop != null);
    this._dispatchCall(1610743844,"_GetClientTop", DISPATCH_METHOD,null,ClientTop);
  }
  @DeclDISPID(548)  public Float getClientTop() throws ComException {
    final Object obj = this._dispatchCall(548,"ClientTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743846)  public void _GetClientLeft(ByRef<Integer> ClientLeft) throws ComException {
    assert(ClientLeft != null);
    this._dispatchCall(1610743846,"_GetClientLeft", DISPATCH_METHOD,null,ClientLeft);
  }
  @DeclDISPID(547)  public Float getClientLeft() throws ComException {
    final Object obj = this._dispatchCall(547,"ClientLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743848)  public void _GetClientWidth(ByRef<Integer> ClientWidth) throws ComException {
    assert(ClientWidth != null);
    this._dispatchCall(1610743848,"_GetClientWidth", DISPATCH_METHOD,null,ClientWidth);
  }
  @DeclDISPID(549)  public Float getClientWidth() throws ComException {
    final Object obj = this._dispatchCall(549,"ClientWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743850)  public void _GetClientHeight(ByRef<Integer> ClientHeight) throws ComException {
    assert(ClientHeight != null);
    this._dispatchCall(1610743850,"_GetClientHeight", DISPATCH_METHOD,null,ClientHeight);
  }
  @DeclDISPID(546)  public Float getClientHeight() throws ComException {
    final Object obj = this._dispatchCall(546,"ClientHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(0)  public Tabs getTabs() throws ComException {
    final Object obj = this._dispatchCall(0,"Tabs", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.msforms.impl.TabsImpl.class);
  }
  @DeclDISPID(545)  public Tab getSelectedItem() throws ComException {
    final Object obj = this._dispatchCall(545,"SelectedItem", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.msforms.impl.TabImpl.class);
  }
  @DeclDISPID(528)  public void setValue(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(528,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(528)  public Integer getValue() throws ComException {
    final Object obj = this._dispatchCall(528,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(515)  public void setTabFixedWidth(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(515,"TabFixedWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(515)  public Float getTabFixedWidth() throws ComException {
    final Object obj = this._dispatchCall(515,"TabFixedWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(516)  public void setTabFixedHeight(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(516,"TabFixedHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(516)  public Float getTabFixedHeight() throws ComException {
    final Object obj = this._dispatchCall(516,"TabFixedHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  public TabStrip() throws ComException {
    super("{EAE50EB0-4A62-11CE-BED6-00AA00611080}");
  }
  protected TabStrip(long ndisp) {
    super(ndisp);
  }
  public TabStrip(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TabStrip" + super.toString() + "]";
  }
}
