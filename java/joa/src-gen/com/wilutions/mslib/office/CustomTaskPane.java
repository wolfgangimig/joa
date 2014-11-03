/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomTaskPane.
 * 
 */
@CoClass(guid="{C5771BE5-A188-466B-AB31-00A6A32B1B1C}")
public class CustomTaskPane extends Dispatch implements _CustomTaskPane {
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
  @DeclDISPID(7)  public MsoCTPDockPosition getDockPosition() throws ComException {
    final Object obj = this._dispatchCall(7,"DockPosition", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return MsoCTPDockPosition.valueOf((Integer)obj);
  }
  @DeclDISPID(7)  public void setDockPosition(MsoCTPDockPosition value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"DockPosition", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(8)  public MsoCTPDockPositionRestrict getDockPositionRestrict() throws ComException {
    final Object obj = this._dispatchCall(8,"DockPositionRestrict", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return MsoCTPDockPositionRestrict.valueOf((Integer)obj);
  }
  @DeclDISPID(8)  public void setDockPositionRestrict(MsoCTPDockPositionRestrict value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"DockPositionRestrict", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(9)  public void Delete() throws ComException {
    this._dispatchCall(9,"Delete", DISPATCH_METHOD,null);
  }
  public CustomTaskPane() throws ComException {
    super("{C5771BE5-A188-466B-AB31-00A6A32B1B1C}");
  }
  protected CustomTaskPane(long ndisp) {
    super(ndisp);
  }
  public CustomTaskPane(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomTaskPane" + super.toString() + "]";
  }
}
