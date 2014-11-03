/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A91B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _OutlookBarPaneImpl extends Dispatch implements com.wilutions.mslib.outlook._OutlookBarPane {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(8448)  public com.wilutions.mslib.outlook.OutlookBarStorage getContents() throws ComException {
    final Object obj = this._dispatchCall(8448,"Contents", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.OutlookBarStorageImpl.class);
  }
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8451)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(8451,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(8451)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(8451,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  public _OutlookBarPaneImpl(String progId) throws ComException {
    super(progId);
  }
  protected _OutlookBarPaneImpl(long ndisp) {
    super(ndisp);
  }
  public _OutlookBarPaneImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_OutlookBarPaneImpl" + super.toString() + "]";
  }
}
