/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A92D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FormDescriptionImpl extends Dispatch implements com.wilutions.mslib.outlook.FormDescription {
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
  @DeclDISPID(13060)  public String getCategory() throws ComException {
    final Object obj = this._dispatchCall(13060,"Category", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(13060)  public void setCategory(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(13060,"Category", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(13061)  public String getCategorySub() throws ComException {
    final Object obj = this._dispatchCall(13061,"CategorySub", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(13061)  public void setCategorySub(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(13061,"CategorySub", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12292)  public String getComment() throws ComException {
    final Object obj = this._dispatchCall(12292,"Comment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12292)  public void setComment(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12292,"Comment", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(13059)  public String getContactName() throws ComException {
    final Object obj = this._dispatchCall(13059,"ContactName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(13059)  public void setContactName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(13059,"ContactName", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(13063)  public Boolean getHidden() throws ComException {
    final Object obj = this._dispatchCall(13063,"Hidden", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(13063)  public void setHidden(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(13063,"Hidden", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4093)  public String getIcon() throws ComException {
    final Object obj = this._dispatchCall(4093,"Icon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4093)  public void setIcon(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(4093,"Icon", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(102)  public Boolean getLocked() throws ComException {
    final Object obj = this._dispatchCall(102,"Locked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(102)  public void setLocked(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"Locked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(26)  public String getMessageClass() throws ComException {
    final Object obj = this._dispatchCall(26,"MessageClass", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4092)  public String getMiniIcon() throws ComException {
    final Object obj = this._dispatchCall(4092,"MiniIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4092)  public void setMiniIcon(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(4092,"MiniIcon", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(61469)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(61469,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(61469)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(61469,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(104)  public String getNumber() throws ComException {
    final Object obj = this._dispatchCall(104,"Number", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(104)  public void setNumber(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"Number", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(101)  public Boolean getOneOff() throws ComException {
    final Object obj = this._dispatchCall(101,"OneOff", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(101)  public void setOneOff(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"OneOff", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(109)  public String getScriptText() throws ComException {
    final Object obj = this._dispatchCall(109,"ScriptText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(106)  public String getTemplate() throws ComException {
    final Object obj = this._dispatchCall(106,"Template", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(106)  public void setTemplate(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"Template", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(105)  public Boolean getUseWordMail() throws ComException {
    final Object obj = this._dispatchCall(105,"UseWordMail", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(105)  public void setUseWordMail(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"UseWordMail", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(13057)  public String getVersion() throws ComException {
    final Object obj = this._dispatchCall(13057,"Version", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(13057)  public void setVersion(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(13057,"Version", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(107)  public void PublishForm(com.wilutions.mslib.outlook.OlFormRegistry Registry, Object Folder) throws ComException {
    assert(Registry != null);
    assert(Folder != null);
    this._dispatchCall(107,"PublishForm", DISPATCH_METHOD,null,Registry.value,Folder);
  }
  public FormDescriptionImpl(String progId) throws ComException {
    super(progId);
  }
  protected FormDescriptionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FormDescriptionImpl" + super.toString() + "]";
  }
}
