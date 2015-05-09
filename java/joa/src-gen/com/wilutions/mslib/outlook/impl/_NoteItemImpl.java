/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A94E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _NoteItemImpl extends Dispatch implements com.wilutions.mslib.outlook._NoteItem {
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
  @DeclDISPID(37120)  public String getBody() throws ComException {
    final Object obj = this._dispatchCall(37120,"Body", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(37120)  public void setBody(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(37120,"Body", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(36865)  public String getCategories() throws ComException {
    final Object obj = this._dispatchCall(36865,"Categories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(36865)  public void setCategories(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(36865,"Categories", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12295)  public java.util.Date getCreationTime() throws ComException {
    final Object obj = this._dispatchCall(12295,"CreationTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(61470)  public String getEntryID() throws ComException {
    final Object obj = this._dispatchCall(61470,"EntryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(61502)  public com.wilutions.mslib.outlook._Inspector getGetInspector() throws ComException {
    final Object obj = this._dispatchCall(61502,"GetInspector", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._InspectorImpl.class);
  }
  @DeclDISPID(35587)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(35587,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(35587)  public void setHeight(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(35587,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12296)  public java.util.Date getLastModificationTime() throws ComException {
    final Object obj = this._dispatchCall(12296,"LastModificationTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(35588)  public Integer getLeft() throws ComException {
    final Object obj = this._dispatchCall(35588,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(35588)  public void setLeft(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(35588,"Left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(26)  public String getMessageClass() throws ComException {
    final Object obj = this._dispatchCall(26,"MessageClass", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(26)  public void setMessageClass(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(26,"MessageClass", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(61603)  public Boolean getSaved() throws ComException {
    final Object obj = this._dispatchCall(61603,"Saved", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(3592)  public Integer getSize() throws ComException {
    final Object obj = this._dispatchCall(3592,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(63392)  public String getSubject() throws ComException {
    final Object obj = this._dispatchCall(63392,"Subject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(35589)  public Integer getTop() throws ComException {
    final Object obj = this._dispatchCall(35589,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(35589)  public void setTop(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(35589,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(35586)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(35586,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(35586)  public void setWidth(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(35586,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(61475)  public void Close(final com.wilutions.mslib.outlook.OlInspectorClose SaveMode) throws ComException {
    assert(SaveMode != null);
    this._dispatchCall(61475,"Close", DISPATCH_METHOD,null,SaveMode.value);
  }
  @DeclDISPID(61490)  public IDispatch Copy() throws ComException {
    final Object obj = this._dispatchCall(61490,"Copy", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(61514)  public void Delete() throws ComException {
    this._dispatchCall(61514,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61606)  public void Display(final Object Modal) throws ComException {
    assert(Modal != null);
    this._dispatchCall(61606,"Display", DISPATCH_METHOD,null,Variant.param(Modal));
  }
  @DeclDISPID(61492)  public IDispatch Move(final com.wilutions.mslib.outlook.MAPIFolder DestFldr) throws ComException {
    final Object obj = this._dispatchCall(61492,"Move", DISPATCH_METHOD,null,Dispatch.param(DestFldr));
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(61491)  public void PrintOut() throws ComException {
    this._dispatchCall(61491,"PrintOut", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61512)  public void Save() throws ComException {
    this._dispatchCall(61512,"Save", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61521)  public void SaveAs(final String Path, final Object Type) throws ComException {
    assert(Path != null);
    assert(Type != null);
    this._dispatchCall(61521,"SaveAs", DISPATCH_METHOD,null,Path,Variant.param(Type));
  }
  @DeclDISPID(64077)  public com.wilutions.mslib.outlook.OlDownloadState getDownloadState() throws ComException {
    final Object obj = this._dispatchCall(64077,"DownloadState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlDownloadState.valueOf((Integer)obj);
  }
  @DeclDISPID(64009)  public com.wilutions.mslib.outlook.ItemProperties getItemProperties() throws ComException {
    final Object obj = this._dispatchCall(64009,"ItemProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ItemPropertiesImpl.class);
  }
  @DeclDISPID(34161)  public com.wilutions.mslib.outlook.OlRemoteStatus getMarkForDownload() throws ComException {
    final Object obj = this._dispatchCall(34161,"MarkForDownload", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlRemoteStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(34161)  public void setMarkForDownload(final com.wilutions.mslib.outlook.OlRemoteStatus value) throws ComException {
    assert(value != null);
    this._dispatchCall(34161,"MarkForDownload", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64164)  public Boolean getIsConflict() throws ComException {
    final Object obj = this._dispatchCall(64164,"IsConflict", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64186)  public Boolean getAutoResolvedWinner() throws ComException {
    final Object obj = this._dispatchCall(64186,"AutoResolvedWinner", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64187)  public com.wilutions.mslib.outlook.Conflicts getConflicts() throws ComException {
    final Object obj = this._dispatchCall(64187,"Conflicts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ConflictsImpl.class);
  }
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.PropertyAccessor.class);
  }
  public _NoteItemImpl(String progId) throws ComException {
    super(progId, "{00063025-0000-0000-C000-000000000046}");
  }
  protected _NoteItemImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_NoteItemImpl" + super.toString() + "]";
  }
}
