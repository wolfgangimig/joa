/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A928-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ActionImpl extends Dispatch implements com.wilutions.mslib.outlook.Action {
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
  @DeclDISPID(100)  public com.wilutions.mslib.outlook.OlActionCopyLike getCopyLike() throws ComException {
    final Object obj = this._dispatchCall(100,"CopyLike", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlActionCopyLike.valueOf((Integer)obj);
  }
  @DeclDISPID(100)  public void setCopyLike(com.wilutions.mslib.outlook.OlActionCopyLike value) throws ComException {
    assert(value != null);
    this._dispatchCall(100,"CopyLike", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(26)  public String getMessageClass() throws ComException {
    final Object obj = this._dispatchCall(26,"MessageClass", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(26)  public void setMessageClass(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(26,"MessageClass", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12289)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(12289,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12289)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12289,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(61)  public String getPrefix() throws ComException {
    final Object obj = this._dispatchCall(61,"Prefix", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(61)  public void setPrefix(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(61,"Prefix", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(101)  public com.wilutions.mslib.outlook.OlActionReplyStyle getReplyStyle() throws ComException {
    final Object obj = this._dispatchCall(101,"ReplyStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlActionReplyStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(101)  public void setReplyStyle(com.wilutions.mslib.outlook.OlActionReplyStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"ReplyStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(102)  public com.wilutions.mslib.outlook.OlActionResponseStyle getResponseStyle() throws ComException {
    final Object obj = this._dispatchCall(102,"ResponseStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlActionResponseStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(102)  public void setResponseStyle(com.wilutions.mslib.outlook.OlActionResponseStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"ResponseStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(105)  public com.wilutions.mslib.outlook.OlActionShowOn getShowOn() throws ComException {
    final Object obj = this._dispatchCall(105,"ShowOn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlActionShowOn.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public void setShowOn(com.wilutions.mslib.outlook.OlActionShowOn value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"ShowOn", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(108)  public void Delete() throws ComException {
    this._dispatchCall(108,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(106)  public Dispatch Execute() throws ComException {
    final Object obj = this._dispatchCall(106,"Execute", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public ActionImpl(String progId) throws ComException {
    super(progId);
  }
  protected ActionImpl(long ndisp) {
    super(ndisp);
  }
  public ActionImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ActionImpl" + super.toString() + "]";
  }
}
