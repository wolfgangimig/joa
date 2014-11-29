/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CommandBars.
 * 
 */
@CoClass(guid="{55F88893-7708-11D1-ACEB-006008961DA5}")
public class CommandBars extends Dispatch implements _CommandBars {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809344)  public CommandBarControl getActionControl() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"ActionControl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarControlImpl.class);
  }
  @DeclDISPID(1610809345)  public CommandBar getActiveMenuBar() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"ActiveMenuBar", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarImpl.class);
  }
  @DeclDISPID(1610809346)  public CommandBar Add(Object Name, Object Position, Object MenuBar, Object Temporary) throws ComException {
    assert(Name != null);
    assert(Position != null);
    assert(MenuBar != null);
    assert(Temporary != null);
    final Object obj = this._dispatchCall(1610809346,"Add", DISPATCH_METHOD,null,Name,Position,MenuBar,Temporary);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarImpl.class);
  }
  @DeclDISPID(1610809347)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809348)  public Boolean getDisplayTooltips() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"DisplayTooltips", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809348)  public void setDisplayTooltips(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809348,"DisplayTooltips", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809350)  public Boolean getDisplayKeysInTooltips() throws ComException {
    final Object obj = this._dispatchCall(1610809350,"DisplayKeysInTooltips", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809350)  public void setDisplayKeysInTooltips(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809350,"DisplayKeysInTooltips", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809352)  public CommandBarControl FindControl(Object Type, Object Id, Object Tag, Object Visible) throws ComException {
    assert(Type != null);
    assert(Id != null);
    assert(Tag != null);
    assert(Visible != null);
    final Object obj = this._dispatchCall(1610809352,"FindControl", DISPATCH_METHOD,null,Type,Id,Tag,Visible);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarControlImpl.class);
  }
  @DeclDISPID(0)  public CommandBar getItem(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarImpl.class);
  }
  @DeclDISPID(1610809354)  public Boolean getLargeButtons() throws ComException {
    final Object obj = this._dispatchCall(1610809354,"LargeButtons", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809354)  public void setLargeButtons(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809354,"LargeButtons", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809356)  public MsoMenuAnimation getMenuAnimationStyle() throws ComException {
    final Object obj = this._dispatchCall(1610809356,"MenuAnimationStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return MsoMenuAnimation.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809356)  public void setMenuAnimationStyle(MsoMenuAnimation value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809356,"MenuAnimationStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610809359)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809359,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809360)  public void ReleaseFocus() throws ComException {
    this._dispatchCall(1610809360,"ReleaseFocus", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809363)  public Boolean getAdaptiveMenus() throws ComException {
    final Object obj = this._dispatchCall(1610809363,"AdaptiveMenus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809363)  public void setAdaptiveMenus(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809363,"AdaptiveMenus", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809365)  public CommandBarControls FindControls(Object Type, Object Id, Object Tag, Object Visible) throws ComException {
    assert(Type != null);
    assert(Id != null);
    assert(Tag != null);
    assert(Visible != null);
    final Object obj = this._dispatchCall(1610809365,"FindControls", DISPATCH_METHOD,null,Type,Id,Tag,Visible);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarControlsImpl.class);
  }
  @DeclDISPID(1610809367)  public Boolean getDisplayFonts() throws ComException {
    final Object obj = this._dispatchCall(1610809367,"DisplayFonts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809367)  public void setDisplayFonts(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809367,"DisplayFonts", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809369)  public Boolean getDisableCustomize() throws ComException {
    final Object obj = this._dispatchCall(1610809369,"DisableCustomize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809369)  public void setDisableCustomize(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809369,"DisableCustomize", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809371)  public Boolean getDisableAskAQuestionDropdown() throws ComException {
    final Object obj = this._dispatchCall(1610809371,"DisableAskAQuestionDropdown", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809371)  public void setDisableAskAQuestionDropdown(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809371,"DisableAskAQuestionDropdown", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809373)  public void ExecuteMso(String idMso) throws ComException {
    assert(idMso != null);
    this._dispatchCall(1610809373,"ExecuteMso", DISPATCH_METHOD,null,idMso);
  }
  @DeclDISPID(1610809374)  public Boolean GetEnabledMso(String idMso) throws ComException {
    assert(idMso != null);
    final Object obj = this._dispatchCall(1610809374,"GetEnabledMso", DISPATCH_METHOD,null,idMso);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809375)  public Boolean GetVisibleMso(String idMso) throws ComException {
    assert(idMso != null);
    final Object obj = this._dispatchCall(1610809375,"GetVisibleMso", DISPATCH_METHOD,null,idMso);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809376)  public Boolean GetPressedMso(String idMso) throws ComException {
    assert(idMso != null);
    final Object obj = this._dispatchCall(1610809376,"GetPressedMso", DISPATCH_METHOD,null,idMso);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809377)  public String GetLabelMso(String idMso) throws ComException {
    assert(idMso != null);
    final Object obj = this._dispatchCall(1610809377,"GetLabelMso", DISPATCH_METHOD,null,idMso);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809378)  public String GetScreentipMso(String idMso) throws ComException {
    assert(idMso != null);
    final Object obj = this._dispatchCall(1610809378,"GetScreentipMso", DISPATCH_METHOD,null,idMso);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809379)  public String GetSupertipMso(String idMso) throws ComException {
    assert(idMso != null);
    final Object obj = this._dispatchCall(1610809379,"GetSupertipMso", DISPATCH_METHOD,null,idMso);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809380)  public com.wilutions.mslib.stdole.IPictureDisp GetImageMso(String idMso, Integer Width, Integer Height) throws ComException {
    assert(idMso != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(1610809380,"GetImageMso", DISPATCH_METHOD,null,idMso,Width,Height);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.IPictureDispImpl.class);
  }
  @DeclDISPID(1610809381)  public void CommitRenderingTransaction(Integer hwnd) throws ComException {
    assert(hwnd != null);
    this._dispatchCall(1610809381,"CommitRenderingTransaction", DISPATCH_METHOD,null,hwnd);
  }
  public CommandBars() throws ComException {
    super("{55F88893-7708-11D1-ACEB-006008961DA5}", "{000C0302-0000-0000-C000-000000000046}");
  }
  protected CommandBars(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CommandBars" + super.toString() + "]";
  }
}
