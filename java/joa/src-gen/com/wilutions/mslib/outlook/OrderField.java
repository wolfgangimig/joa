/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OrderField.
 * 
 */
@CoClass(guid="{0006109B-0000-0000-C000-000000000046}")
public class OrderField extends Dispatch implements _OrderField {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(8450)  public String getViewXMLSchemaName() throws ComException {
    final Object obj = this._dispatchCall(8450,"ViewXMLSchemaName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64394)  public Boolean getIsDescending() throws ComException {
    final Object obj = this._dispatchCall(64394,"IsDescending", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64394)  public void setIsDescending(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64394,"IsDescending", DISPATCH_PROPERTYPUT,value);
  }
  public OrderField() throws ComException {
    super("{0006109B-0000-0000-C000-000000000046}", "{0006309B-0000-0000-C000-000000000046}");
  }
  protected OrderField(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OrderField" + super.toString() + "]";
  }
}
