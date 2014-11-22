/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A50-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CustomTaskPaneImpl extends Dispatch implements com.wilutions.mslib.office._CustomTaskPane {
  @DeclDISPID(0)  public String getTitle() throws ComException {
    final Object obj = this._dispatchCall(0,"Title", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(2)  public Dispatch getWindow() throws ComException {
    final Object obj = this._dispatchCall(2,"Window", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(3)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(3,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(3)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public Dispatch getContentControl() throws ComException {
    final Object obj = this._dispatchCall(4,"ContentControl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(5)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(5,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(5)  public void setHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(6)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(6,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(6)  public void setWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(7)  public com.wilutions.mslib.office.MsoCTPDockPosition getDockPosition() throws ComException {
    final Object obj = this._dispatchCall(7,"DockPosition", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoCTPDockPosition.valueOf((Integer)obj);
  }
  @DeclDISPID(7)  public void setDockPosition(com.wilutions.mslib.office.MsoCTPDockPosition value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"DockPosition", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(8)  public com.wilutions.mslib.office.MsoCTPDockPositionRestrict getDockPositionRestrict() throws ComException {
    final Object obj = this._dispatchCall(8,"DockPositionRestrict", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoCTPDockPositionRestrict.valueOf((Integer)obj);
  }
  @DeclDISPID(8)  public void setDockPositionRestrict(com.wilutions.mslib.office.MsoCTPDockPositionRestrict value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"DockPositionRestrict", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(9)  public void Delete() throws ComException {
    this._dispatchCall(9,"Delete", DISPATCH_METHOD,null);
  }
  public _CustomTaskPaneImpl(String progId) throws ComException {
    super(progId, "{000C033B-0000-0000-C000-000000000046}");
  }
  protected _CustomTaskPaneImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CustomTaskPaneImpl" + super.toString() + "]";
  }
}
