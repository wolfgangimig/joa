/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A96E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _InspectorImpl extends Dispatch implements com.wilutions.mslib.outlook._Inspector {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(8450)  public IDispatch getCurrentItem() throws ComException {
    final Object obj = this._dispatchCall(8450,"CurrentItem", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(8464)  public com.wilutions.mslib.outlook.OlEditorType getEditorType() throws ComException {
    final Object obj = this._dispatchCall(8464,"EditorType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlEditorType.valueOf((Integer)obj);
  }
  @DeclDISPID(8454)  public IDispatch getModifiedFormPages() throws ComException {
    final Object obj = this._dispatchCall(8454,"ModifiedFormPages", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(8451)  public void Close(final com.wilutions.mslib.outlook.OlInspectorClose SaveMode) throws ComException {
    assert(SaveMode != null);
    this._dispatchCall(8451,"Close", DISPATCH_METHOD,null,SaveMode.value);
  }
  @DeclDISPID(8452)  public void Display(final Object Modal) throws ComException {
    assert(Modal != null);
    this._dispatchCall(8452,"Display", DISPATCH_METHOD,null,Variant.param(Modal));
  }
  @DeclDISPID(8456)  public void HideFormPage(final String PageName) throws ComException {
    assert(PageName != null);
    this._dispatchCall(8456,"HideFormPage", DISPATCH_METHOD,null,PageName);
  }
  @DeclDISPID(8453)  public Boolean IsWordMail() throws ComException {
    final Object obj = this._dispatchCall(8453,"IsWordMail", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(8460)  public void SetCurrentFormPage(final String PageName) throws ComException {
    assert(PageName != null);
    this._dispatchCall(8460,"SetCurrentFormPage", DISPATCH_METHOD,null,PageName);
  }
  @DeclDISPID(8457)  public void ShowFormPage(final String PageName) throws ComException {
    assert(PageName != null);
    this._dispatchCall(8457,"ShowFormPage", DISPATCH_METHOD,null,PageName);
  }
  @DeclDISPID(8463)  public IDispatch getWordEditor() throws ComException {
    final Object obj = this._dispatchCall(8463,"WordEditor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(8465)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(8465,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8468)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(8468,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8468)  public void setHeight(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8468,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8469)  public Integer getLeft() throws ComException {
    final Object obj = this._dispatchCall(8469,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8469)  public void setLeft(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8469,"Left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8470)  public Integer getTop() throws ComException {
    final Object obj = this._dispatchCall(8470,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8470)  public void setTop(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8470,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8471)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(8471,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8471)  public void setWidth(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8471,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8466)  public com.wilutions.mslib.outlook.OlWindowState getWindowState() throws ComException {
    final Object obj = this._dispatchCall(8466,"WindowState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlWindowState.valueOf((Integer)obj);
  }
  @DeclDISPID(8466)  public void setWindowState(final com.wilutions.mslib.outlook.OlWindowState value) throws ComException {
    assert(value != null);
    this._dispatchCall(8466,"WindowState", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(8467)  public void Activate() throws ComException {
    this._dispatchCall(8467,"Activate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64201)  public void SetControlItemProperty(final IDispatch Control, final String PropertyName) throws ComException {
    assert(PropertyName != null);
    this._dispatchCall(64201,"SetControlItemProperty", DISPATCH_METHOD,null,Dispatch.param(Control),PropertyName);
  }
  @DeclDISPID(64493)  public IDispatch NewFormRegion() throws ComException {
    final Object obj = this._dispatchCall(64493,"NewFormRegion", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64511)  public IDispatch OpenFormRegion(final String Path) throws ComException {
    assert(Path != null);
    final Object obj = this._dispatchCall(64511,"OpenFormRegion", DISPATCH_METHOD,null,Path);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64512)  public void SaveFormRegion(final IDispatch Page, final String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(64512,"SaveFormRegion", DISPATCH_METHOD,null,Dispatch.param(Page),FileName);
  }
  @DeclDISPID(64632)  public com.wilutions.mslib.outlook._AttachmentSelection getAttachmentSelection() throws ComException {
    final Object obj = this._dispatchCall(64632,"AttachmentSelection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._AttachmentSelectionImpl.class);
  }
  @DeclDISPID(64647)  public void SetSchedulingStartTime(final java.util.Date Start) throws ComException {
    assert(Start != null);
    this._dispatchCall(64647,"SetSchedulingStartTime", DISPATCH_METHOD,null,Start);
  }
  public _InspectorImpl(String progId) throws ComException {
    super(progId, "{00063005-0000-0000-C000-000000000046}");
  }
  protected _InspectorImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_InspectorImpl" + super.toString() + "]";
  }
}
