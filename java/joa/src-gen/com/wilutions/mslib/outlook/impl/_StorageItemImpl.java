/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9A0-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _StorageItemImpl extends Dispatch implements com.wilutions.mslib.outlook._StorageItem {
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
  @DeclDISPID(12295)  public java.util.Date getCreationTime() throws ComException {
    final Object obj = this._dispatchCall(12295,"CreationTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(12296)  public java.util.Date getLastModificationTime() throws ComException {
    final Object obj = this._dispatchCall(12296,"LastModificationTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(61470)  public String getEntryID() throws ComException {
    final Object obj = this._dispatchCall(61470,"EntryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(61512)  public void Save() throws ComException {
    this._dispatchCall(61512,"Save", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61514)  public void Delete() throws ComException {
    this._dispatchCall(61514,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(37120)  public String getBody() throws ComException {
    final Object obj = this._dispatchCall(37120,"Body", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(37120)  public void setBody(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(37120,"Body", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(63509)  public com.wilutions.mslib.outlook.Attachments getAttachments() throws ComException {
    final Object obj = this._dispatchCall(63509,"Attachments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AttachmentsImpl.class);
  }
  @DeclDISPID(3592)  public Integer getSize() throws ComException {
    final Object obj = this._dispatchCall(3592,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(63510)  public com.wilutions.mslib.outlook.UserProperties getUserProperties() throws ComException {
    final Object obj = this._dispatchCall(63510,"UserProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.UserPropertiesImpl.class);
  }
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.PropertyAccessor.class);
  }
  @DeclDISPID(55)  public String getSubject() throws ComException {
    final Object obj = this._dispatchCall(55,"Subject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(55)  public void setSubject(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(55,"Subject", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34236)  public String getCreator() throws ComException {
    final Object obj = this._dispatchCall(34236,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34236)  public void setCreator(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34236,"Creator", DISPATCH_PROPERTYPUT,value);
  }
  public _StorageItemImpl(String progId) throws ComException {
    super(progId);
  }
  protected _StorageItemImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_StorageItemImpl" + super.toString() + "]";
  }
}
