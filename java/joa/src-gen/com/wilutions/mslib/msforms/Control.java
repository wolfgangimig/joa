/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * Control.
 * 
 */
@CoClass(guid="{909E0AE0-16DC-11CE-9E98-00AA00574A4F}")
public class Control extends Dispatch implements IControl {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-2147418056)  public void setCancel(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418056,"Cancel", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418056)  public Boolean getCancel() throws ComException {
    final Object obj = this._dispatchCall(-2147418056,"Cancel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-2147385343)  public void setControlSource(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147385343,"ControlSource", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147385343)  public String getControlSource() throws ComException {
    final Object obj = this._dispatchCall(-2147385343,"ControlSource", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147418043)  public void setControlTipText(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418043,"ControlTipText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418043)  public String getControlTipText() throws ComException {
    final Object obj = this._dispatchCall(-2147418043,"ControlTipText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147418057)  public void setDefault(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418057,"Default", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418057)  public Boolean getDefault() throws ComException {
    final Object obj = this._dispatchCall(-2147418057,"Default", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743816)  public void _SetHeight(final Integer Height) throws ComException {
    assert(Height != null);
    this._dispatchCall(1610743816,"_SetHeight", DISPATCH_METHOD,null,Height);
  }
  @DeclDISPID(1610743817)  public void _GetHeight(final ByRef<Integer> Height) throws ComException {
    assert(Height != null);
    this._dispatchCall(1610743817,"_GetHeight", DISPATCH_METHOD,null,Height);
  }
  @DeclDISPID(-2147418106)  public void setHeight(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418106,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418106)  public Float getHeight() throws ComException {
    final Object obj = this._dispatchCall(-2147418106,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(-2147418062)  public void setHelpContextID(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418062,"HelpContextID", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418062)  public Integer getHelpContextID() throws ComException {
    final Object obj = this._dispatchCall(-2147418062,"HelpContextID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-2147385340)  public fmLayoutEffect getLayoutEffect() throws ComException {
    final Object obj = this._dispatchCall(-2147385340,"LayoutEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmLayoutEffect.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743825)  public void _SetLeft(final Integer Left) throws ComException {
    assert(Left != null);
    this._dispatchCall(1610743825,"_SetLeft", DISPATCH_METHOD,null,Left);
  }
  @DeclDISPID(1610743826)  public void _GetLeft(final ByRef<Integer> Left) throws ComException {
    assert(Left != null);
    this._dispatchCall(1610743826,"_GetLeft", DISPATCH_METHOD,null,Left);
  }
  @DeclDISPID(-2147418109)  public void setLeft(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418109,"Left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418109)  public Float getLeft() throws ComException {
    final Object obj = this._dispatchCall(-2147418109,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(-2147418112)  public void setName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418112,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418112)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(-2147418112,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743831)  public void _GetOldHeight(final ByRef<Integer> OldHeight) throws ComException {
    assert(OldHeight != null);
    this._dispatchCall(1610743831,"_GetOldHeight", DISPATCH_METHOD,null,OldHeight);
  }
  @DeclDISPID(-2147385339)  public Float getOldHeight() throws ComException {
    final Object obj = this._dispatchCall(-2147385339,"OldHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743833)  public void _GetOldLeft(final ByRef<Integer> OldLeft) throws ComException {
    assert(OldLeft != null);
    this._dispatchCall(1610743833,"_GetOldLeft", DISPATCH_METHOD,null,OldLeft);
  }
  @DeclDISPID(-2147385338)  public Float getOldLeft() throws ComException {
    final Object obj = this._dispatchCall(-2147385338,"OldLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743835)  public void _GetOldTop(final ByRef<Integer> OldTop) throws ComException {
    assert(OldTop != null);
    this._dispatchCall(1610743835,"_GetOldTop", DISPATCH_METHOD,null,OldTop);
  }
  @DeclDISPID(-2147385337)  public Float getOldTop() throws ComException {
    final Object obj = this._dispatchCall(-2147385337,"OldTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743837)  public void _GetOldWidth(final ByRef<Integer> OldWidth) throws ComException {
    assert(OldWidth != null);
    this._dispatchCall(1610743837,"_GetOldWidth", DISPATCH_METHOD,null,OldWidth);
  }
  @DeclDISPID(-2147385336)  public Float getOldWidth() throws ComException {
    final Object obj = this._dispatchCall(-2147385336,"OldWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(-2147385335)  public IDispatch getObject() throws ComException {
    final Object obj = this._dispatchCall(-2147385335,"Object", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(-2147418104)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(-2147418104,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(-2147385330)  public void setRowSource(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147385330,"RowSource", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147385330)  public String getRowSource() throws ComException {
    final Object obj = this._dispatchCall(-2147385330,"RowSource", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147385329)  public void setRowSourceType(final Short value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147385329,"RowSourceType", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147385329)  public Short getRowSourceType() throws ComException {
    final Object obj = this._dispatchCall(-2147385329,"RowSourceType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Short)obj;
  }
  @DeclDISPID(-2147418097)  public void setTabIndex(final Short value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418097,"TabIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418097)  public Short getTabIndex() throws ComException {
    final Object obj = this._dispatchCall(-2147418097,"TabIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Short)obj;
  }
  @DeclDISPID(-2147418098)  public void setTabStop(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418098,"TabStop", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418098)  public Boolean getTabStop() throws ComException {
    final Object obj = this._dispatchCall(-2147418098,"TabStop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-2147418101)  public void setTag(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418101,"Tag", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418101)  public String getTag() throws ComException {
    final Object obj = this._dispatchCall(-2147418101,"Tag", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743851)  public void _SetTop(final Integer Top) throws ComException {
    assert(Top != null);
    this._dispatchCall(1610743851,"_SetTop", DISPATCH_METHOD,null,Top);
  }
  @DeclDISPID(1610743852)  public void _GetTop(final ByRef<Integer> Top) throws ComException {
    assert(Top != null);
    this._dispatchCall(1610743852,"_GetTop", DISPATCH_METHOD,null,Top);
  }
  @DeclDISPID(-2147418108)  public void setTop(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418108,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418108)  public Float getTop() throws ComException {
    final Object obj = this._dispatchCall(-2147418108,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(-2147418105)  public void setVisible(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418105,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418105)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(-2147418105,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743859)  public void _SetWidth(final Integer Width) throws ComException {
    assert(Width != null);
    this._dispatchCall(1610743859,"_SetWidth", DISPATCH_METHOD,null,Width);
  }
  @DeclDISPID(1610743860)  public void _GetWidth(final ByRef<Integer> Width) throws ComException {
    assert(Width != null);
    this._dispatchCall(1610743860,"_GetWidth", DISPATCH_METHOD,null,Width);
  }
  @DeclDISPID(-2147418107)  public void setWidth(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418107,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418107)  public Float getWidth() throws ComException {
    final Object obj = this._dispatchCall(-2147418107,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(-2147385088)  public void Move(final Object Left, final Object Top, final Object Width, final Object Height, final Object Layout) throws ComException {
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    assert(Layout != null);
    this._dispatchCall(-2147385088,"Move", DISPATCH_METHOD,null,Variant.param(Left),Variant.param(Top),Variant.param(Width),Variant.param(Height),Variant.param(Layout));
  }
  @DeclDISPID(-2147385083)  public void ZOrder(final Object zPosition) throws ComException {
    assert(zPosition != null);
    this._dispatchCall(-2147385083,"ZOrder", DISPATCH_METHOD,null,Variant.param(zPosition));
  }
  @DeclDISPID(-2147385085)  public void SetFocus() throws ComException {
    this._dispatchCall(-2147385085,"SetFocus", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743867)  public Integer _GethWnd() throws ComException {
    final Object obj = this._dispatchCall(1610743867,"_GethWnd", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743868)  public Integer _GetID() throws ComException {
    final Object obj = this._dispatchCall(1610743868,"_GetID", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743869)  public void _Move(final Integer Left, final Integer Top, final Integer Width, final Integer Height) throws ComException {
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    this._dispatchCall(1610743869,"_Move", DISPATCH_METHOD,null,Left,Top,Width,Height);
  }
  @DeclDISPID(1610743870)  public void _ZOrder(final fmZOrder zPosition) throws ComException {
    assert(zPosition != null);
    this._dispatchCall(1610743870,"_ZOrder", DISPATCH_METHOD,null,zPosition.value);
  }
  public Control() throws ComException {
    super("{909E0AE0-16DC-11CE-9E98-00AA00574A4F}", "{04598FC6-866C-11CF-AB7C-00AA00C08FCF}");
  }
  protected Control(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Control" + super.toString() + "]";
  }
}
