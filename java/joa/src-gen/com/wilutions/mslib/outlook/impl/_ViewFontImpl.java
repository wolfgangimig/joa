/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9F6-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _ViewFontImpl extends Dispatch implements com.wilutions.mslib.outlook._ViewFont {
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
  @DeclDISPID(64385)  public Boolean getBold() throws ComException {
    final Object obj = this._dispatchCall(64385,"Bold", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64385)  public void setBold(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64385,"Bold", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64387)  public Boolean getItalic() throws ComException {
    final Object obj = this._dispatchCall(64387,"Italic", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64387)  public void setItalic(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64387,"Italic", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64388)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(64388,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64388)  public void setName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64388,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64389)  public Integer getSize() throws ComException {
    final Object obj = this._dispatchCall(64389,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64389)  public void setSize(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64389,"Size", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64390)  public Boolean getStrikethrough() throws ComException {
    final Object obj = this._dispatchCall(64390,"Strikethrough", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64390)  public void setStrikethrough(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64390,"Strikethrough", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64391)  public Boolean getUnderline() throws ComException {
    final Object obj = this._dispatchCall(64391,"Underline", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64391)  public void setUnderline(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64391,"Underline", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64395)  public com.wilutions.mslib.outlook.OlColor getColor() throws ComException {
    final Object obj = this._dispatchCall(64395,"Color", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlColor.valueOf((Integer)obj);
  }
  @DeclDISPID(64395)  public void setColor(final com.wilutions.mslib.outlook.OlColor value) throws ComException {
    assert(value != null);
    this._dispatchCall(64395,"Color", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64638)  public com.wilutions.mslib.outlook.OlCategoryColor getExtendedColor() throws ComException {
    final Object obj = this._dispatchCall(64638,"ExtendedColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlCategoryColor.valueOf((Integer)obj);
  }
  @DeclDISPID(64638)  public void setExtendedColor(final com.wilutions.mslib.outlook.OlCategoryColor value) throws ComException {
    assert(value != null);
    this._dispatchCall(64638,"ExtendedColor", DISPATCH_PROPERTYPUT,value.value);
  }
  public _ViewFontImpl(String progId) throws ComException {
    super(progId, "{0006309D-0000-0000-C000-000000000046}");
  }
  protected _ViewFontImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ViewFontImpl" + super.toString() + "]";
  }
}
