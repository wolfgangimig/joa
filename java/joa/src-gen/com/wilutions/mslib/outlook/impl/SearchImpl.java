/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A960-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SearchImpl extends Dispatch implements com.wilutions.mslib.outlook.Search {
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
  @DeclDISPID(64100)  public String getFilter() throws ComException {
    final Object obj = this._dispatchCall(64100,"Filter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64104)  public Boolean getIsSynchronous() throws ComException {
    final Object obj = this._dispatchCall(64104,"IsSynchronous", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64105)  public com.wilutions.mslib.outlook._Results getResults() throws ComException {
    final Object obj = this._dispatchCall(64105,"Results", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ResultsImpl.class);
  }
  @DeclDISPID(64102)  public Boolean getSearchSubFolders() throws ComException {
    final Object obj = this._dispatchCall(64102,"SearchSubFolders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64103)  public void Stop() throws ComException {
    this._dispatchCall(64103,"Stop", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64109)  public String getTag() throws ComException {
    final Object obj = this._dispatchCall(64109,"Tag", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64165)  public String getScope() throws ComException {
    final Object obj = this._dispatchCall(64165,"Scope", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64173)  public com.wilutions.mslib.outlook.MAPIFolder Save(final String Name) throws ComException {
    assert(Name != null);
    final Object obj = this._dispatchCall(64173,"Save", DISPATCH_METHOD,null,Name);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64285)  public com.wilutions.mslib.outlook.Table GetTable() throws ComException {
    final Object obj = this._dispatchCall(64285,"GetTable", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Table.class);
  }
  public SearchImpl(String progId) throws ComException {
    super(progId, "{0006300B-0000-0000-C000-000000000046}");
  }
  protected SearchImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SearchImpl" + super.toString() + "]";
  }
}
