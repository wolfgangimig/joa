/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A96C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AttachmentImpl extends Dispatch implements com.wilutions.mslib.outlook.Attachment {
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
  @DeclDISPID(113)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(113,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(12289)  public String getDisplayName() throws ComException {
    final Object obj = this._dispatchCall(12289,"DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12289)  public void setDisplayName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12289,"DisplayName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14084)  public String getFileName() throws ComException {
    final Object obj = this._dispatchCall(14084,"FileName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(91)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(91,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(14088)  public String getPathName() throws ComException {
    final Object obj = this._dispatchCall(14088,"PathName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(114)  public Integer getPosition() throws ComException {
    final Object obj = this._dispatchCall(114,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(114)  public void setPosition(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(114,"Position", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14085)  public com.wilutions.mslib.outlook.OlAttachmentType getType() throws ComException {
    final Object obj = this._dispatchCall(14085,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlAttachmentType.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public void Delete() throws ComException {
    this._dispatchCall(105,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(104)  public void SaveAsFile(String Path) throws ComException {
    assert(Path != null);
    this._dispatchCall(104,"SaveAsFile", DISPATCH_METHOD,null,Path);
  }
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.PropertyAccessor.class);
  }
  @DeclDISPID(64489)  public Integer getSize() throws ComException {
    final Object obj = this._dispatchCall(64489,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64536)  public com.wilutions.mslib.outlook.OlAttachmentBlockLevel getBlockLevel() throws ComException {
    final Object obj = this._dispatchCall(64536,"BlockLevel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlAttachmentBlockLevel.valueOf((Integer)obj);
  }
  @DeclDISPID(64634)  public String GetTemporaryFilePath() throws ComException {
    final Object obj = this._dispatchCall(64634,"GetTemporaryFilePath", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public AttachmentImpl(String progId) throws ComException {
    super(progId, "{00063007-0000-0000-C000-000000000046}");
  }
  protected AttachmentImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AttachmentImpl" + super.toString() + "]";
  }
}
