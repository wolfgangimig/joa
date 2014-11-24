/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AF8-A463-DB41-5DAE-69E7A5F7FCBC}")
public class DocumentInspectorImpl extends Dispatch implements com.wilutions.mslib.office.DocumentInspector {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(1,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public void Inspect(ByRef<com.wilutions.mslib.office.MsoDocInspectorStatus> Status, ByRef<String> Results) throws ComException {
    assert(Status != null);
    assert(Results != null);
    this._dispatchCall(2,"Inspect", DISPATCH_METHOD,null,Status,Results);
  }
  @DeclDISPID(3)  public void Fix(ByRef<com.wilutions.mslib.office.MsoDocInspectorStatus> Status, ByRef<String> Results) throws ComException {
    assert(Status != null);
    assert(Results != null);
    this._dispatchCall(3,"Fix", DISPATCH_METHOD,null,Status,Results);
  }
  @DeclDISPID(4)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(4,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public DocumentInspectorImpl(String progId) throws ComException {
    super(progId, "{000C0393-0000-0000-C000-000000000046}");
  }
  protected DocumentInspectorImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DocumentInspectorImpl" + super.toString() + "]";
  }
}
