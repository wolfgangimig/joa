/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A6F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class CommandBarImpl extends Dispatch implements com.wilutions.mslib.office.CommandBar {
  @DeclDISPID(1610809344)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809345)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874880)  public Boolean getBuiltIn() throws ComException {
    final Object obj = this._dispatchCall(1610874880,"BuiltIn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874881)  public String getContext() throws ComException {
    final Object obj = this._dispatchCall(1610874881,"Context", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874881)  public void setContext(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874881,"Context", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874883)  public com.wilutions.mslib.office.CommandBarControls getControls() throws ComException {
    final Object obj = this._dispatchCall(1610874883,"Controls", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarControlsImpl.class);
  }
  @DeclDISPID(1610874884)  public void Delete() throws ComException {
    this._dispatchCall(1610874884,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610874885)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(1610874885,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874885)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874885,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874887)  public com.wilutions.mslib.office.CommandBarControl FindControl(Object Type, Object Id, Object Tag, Object Visible, Object Recursive) throws ComException {
    assert(Type != null);
    assert(Id != null);
    assert(Tag != null);
    assert(Visible != null);
    assert(Recursive != null);
    final Object obj = this._dispatchCall(1610874887,"FindControl", DISPATCH_METHOD,null,Type,Id,Tag,Visible,Recursive);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CommandBarControlImpl.class);
  }
  @DeclDISPID(1610874888)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(1610874888,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874888)  public void setHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874888,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874890)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(1610874890,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874892)  public Integer getLeft() throws ComException {
    final Object obj = this._dispatchCall(1610874892,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874892)  public void setLeft(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874892,"Left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874894)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610874894,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874894)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874894,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874896)  public String getNameLocal() throws ComException {
    final Object obj = this._dispatchCall(1610874896,"NameLocal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874896)  public void setNameLocal(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874896,"NameLocal", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874898)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610874898,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610874899)  public com.wilutions.mslib.office.MsoBarPosition getPosition() throws ComException {
    final Object obj = this._dispatchCall(1610874899,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBarPosition.valueOf((Integer)obj);
  }
  @DeclDISPID(1610874899)  public void setPosition(com.wilutions.mslib.office.MsoBarPosition value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874899,"Position", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610874901)  public Integer getRowIndex() throws ComException {
    final Object obj = this._dispatchCall(1610874901,"RowIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874901)  public void setRowIndex(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874901,"RowIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874903)  public com.wilutions.mslib.office.MsoBarProtection getProtection() throws ComException {
    final Object obj = this._dispatchCall(1610874903,"Protection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBarProtection.valueOf((Integer)obj);
  }
  @DeclDISPID(1610874903)  public void setProtection(com.wilutions.mslib.office.MsoBarProtection value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874903,"Protection", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610874905)  public void Reset() throws ComException {
    this._dispatchCall(1610874905,"Reset", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610874906)  public void ShowPopup(Object x, Object y) throws ComException {
    assert(x != null);
    assert(y != null);
    this._dispatchCall(1610874906,"ShowPopup", DISPATCH_METHOD,null,x,y);
  }
  @DeclDISPID(1610874907)  public Integer getTop() throws ComException {
    final Object obj = this._dispatchCall(1610874907,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874907)  public void setTop(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874907,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874909)  public com.wilutions.mslib.office.MsoBarType getType() throws ComException {
    final Object obj = this._dispatchCall(1610874909,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBarType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610874910)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(1610874910,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874910)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874910,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874912)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(1610874912,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874912)  public void setWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874912,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874914)  public Boolean getAdaptiveMenu() throws ComException {
    final Object obj = this._dispatchCall(1610874914,"AdaptiveMenu", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874914)  public void setAdaptiveMenu(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874914,"AdaptiveMenu", DISPATCH_PROPERTYPUT,value);
  }
  public CommandBarImpl(String progId) throws ComException {
    super(progId, "{000C0304-0000-0000-C000-000000000046}");
  }
  protected CommandBarImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CommandBarImpl" + super.toString() + "]";
  }
}
