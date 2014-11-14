/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joactrllib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C9B8A9EE-2243-9959-3E23-16C59850EC23}")
public class IJoaBridgeDialogImpl extends Dispatch implements com.wilutions.joactrllib.IJoaBridgeDialog {
  @DeclDISPID(11)  public void ShowModal(Object owner) throws ComException {
    assert(owner != null);
    this._dispatchCall(11,"ShowModal", DISPATCH_METHOD,null,owner);
  }
  @DeclDISPID(10)  public void Close() throws ComException {
    this._dispatchCall(10,"Close", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1)  public Long getHWND() throws ComException {
    final Object obj = this._dispatchCall(1,"HWND", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Long)obj;
  }
  @DeclDISPID(1)  public void setHWND(Long value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"HWND", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public String getTitle() throws ComException {
    final Object obj = this._dispatchCall(2,"Title", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public void setTitle(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Title", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12)  public Integer getX() throws ComException {
    final Object obj = this._dispatchCall(12,"X", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(12)  public void setX(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"X", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(13)  public Integer getY() throws ComException {
    final Object obj = this._dispatchCall(13,"Y", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(13)  public void setY(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(13,"Y", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(14,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(14)  public void setWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(14,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(15)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(15,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(15)  public void setHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(15,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(16)  public Boolean getMinimizeBox() throws ComException {
    final Object obj = this._dispatchCall(16,"MinimizeBox", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(16)  public void setMinimizeBox(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(16,"MinimizeBox", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(17)  public Boolean getMaximizeBox() throws ComException {
    final Object obj = this._dispatchCall(17,"MaximizeBox", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(17)  public void setMaximizeBox(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(17,"MaximizeBox", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(18)  public Boolean getCenterOnOwner() throws ComException {
    final Object obj = this._dispatchCall(18,"CenterOnOwner", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(18)  public void setCenterOnOwner(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(18,"CenterOnOwner", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(19)  public Boolean getResizable() throws ComException {
    final Object obj = this._dispatchCall(19,"Resizable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(19)  public void setResizable(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(19,"Resizable", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(20)  public Integer getMinHeight() throws ComException {
    final Object obj = this._dispatchCall(20,"MinHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(20)  public void setMinHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(20,"MinHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(21)  public Integer getMaxHeight() throws ComException {
    final Object obj = this._dispatchCall(21,"MaxHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(21)  public void setMaxHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(21,"MaxHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(22)  public Integer getMinWidth() throws ComException {
    final Object obj = this._dispatchCall(22,"MinWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(22)  public void setMinWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(22,"MinWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(23)  public Integer getMaxWidth() throws ComException {
    final Object obj = this._dispatchCall(23,"MaxWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(23)  public void setMaxWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(23,"MaxWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(24)  public void SetFocusOnFirstChildWindow() throws ComException {
    this._dispatchCall(24,"SetFocusOnFirstChildWindow", DISPATCH_METHOD,null);
  }
  @DeclDISPID(25)  public void ShowModal2(Long hwndOwner) throws ComException {
    assert(hwndOwner != null);
    this._dispatchCall(25,"ShowModal2", DISPATCH_METHOD,null,hwndOwner);
  }
  @DeclDISPID(26)  public void ShowModal3(Dispatch dispOwner) throws ComException {
    assert(dispOwner != null);
    this._dispatchCall(26,"ShowModal3", DISPATCH_METHOD,null,dispOwner);
  }
  public IJoaBridgeDialogImpl(String progId) throws ComException {
    super(progId);
  }
  protected IJoaBridgeDialogImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IJoaBridgeDialogImpl" + super.toString() + "]";
  }
}
