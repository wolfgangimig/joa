/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * MultiPage.
 * 
 */
@CoClass(guid="{46E31370-3F7A-11CE-BED6-00AA00611080}")
public class MultiPage extends Dispatch implements IMultiPage {
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
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.FontImpl.class);
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
  @DeclDISPID(1610743833)  public void _SetTabFixedWidth(Integer Width) throws ComException {
    assert(Width != null);
    this._dispatchCall(1610743833,"_SetTabFixedWidth", DISPATCH_METHOD,null,Width);
  }
  @DeclDISPID(1610743834)  public void _GetTabFixedWidth(ByRef<Integer> Width) throws ComException {
    assert(Width != null);
    this._dispatchCall(1610743834,"_GetTabFixedWidth", DISPATCH_METHOD,null,Width);
  }
  @DeclDISPID(1610743835)  public void _SetTabFixedHeight(Integer Height) throws ComException {
    assert(Height != null);
    this._dispatchCall(1610743835,"_SetTabFixedHeight", DISPATCH_METHOD,null,Height);
  }
  @DeclDISPID(1610743836)  public void _GetTabFixedHeight(ByRef<Integer> Height) throws ComException {
    assert(Height != null);
    this._dispatchCall(1610743836,"_GetTabFixedHeight", DISPATCH_METHOD,null,Height);
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
  @DeclDISPID(545)  public Page getSelectedItem() throws ComException {
    final Object obj = this._dispatchCall(545,"SelectedItem", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(Page.class);
  }
  @DeclDISPID(0)  public Pages getPages() throws ComException {
    final Object obj = this._dispatchCall(0,"Pages", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.PagesImpl.class);
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
  public MultiPage() throws ComException {
    super("{46E31370-3F7A-11CE-BED6-00AA00611080}", "{04598FC9-866C-11CF-AB7C-00AA00C08FCF}");
  }
  protected MultiPage(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MultiPage" + super.toString() + "]";
  }
}
