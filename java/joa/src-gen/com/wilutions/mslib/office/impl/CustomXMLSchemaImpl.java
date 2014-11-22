/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B426A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class CustomXMLSchemaImpl extends Dispatch implements com.wilutions.mslib.office.CustomXMLSchema {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809345)  public String getLocation() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Location", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809346)  public String getNamespaceURI() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"NamespaceURI", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809347)  public void Delete() throws ComException {
    this._dispatchCall(1610809347,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809348)  public void Reload() throws ComException {
    this._dispatchCall(1610809348,"Reload", DISPATCH_METHOD,null);
  }
  public CustomXMLSchemaImpl(String progId) throws ComException {
    super(progId, "{000CDB01-0000-0000-C000-000000000046}");
  }
  protected CustomXMLSchemaImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomXMLSchemaImpl" + super.toString() + "]";
  }
}
