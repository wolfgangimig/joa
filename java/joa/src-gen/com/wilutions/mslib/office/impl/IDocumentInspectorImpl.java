/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4E6D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IDocumentInspectorImpl extends Dispatch implements com.wilutions.mslib.office.IDocumentInspector {
  @DeclDISPID(1610678272)  public void GetInfo(ByRef<String> Name, ByRef<String> Desc) throws ComException {
    assert(Name != null);
    assert(Desc != null);
    this._dispatchCall(1610678272,"GetInfo", DISPATCH_METHOD,null,Name,Desc);
  }
  @DeclDISPID(1610678273)  public void Inspect(Dispatch Doc, ByRef<com.wilutions.mslib.office.MsoDocInspectorStatus> Status, ByRef<String> Result, ByRef<String> Action) throws ComException {
    assert(Status != null);
    assert(Result != null);
    assert(Action != null);
    this._dispatchCall(1610678273,"Inspect", DISPATCH_METHOD,null,(Doc!=null?Doc:Dispatch.NULL),Status,Result,Action);
  }
  @DeclDISPID(1610678274)  public void Fix(Dispatch Doc, Integer hwnd, ByRef<com.wilutions.mslib.office.MsoDocInspectorStatus> Status, ByRef<String> Result) throws ComException {
    assert(hwnd != null);
    assert(Status != null);
    assert(Result != null);
    this._dispatchCall(1610678274,"Fix", DISPATCH_METHOD,null,(Doc!=null?Doc:Dispatch.NULL),hwnd,Status,Result);
  }
  public IDocumentInspectorImpl(String progId) throws ComException {
    super(progId);
  }
  protected IDocumentInspectorImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IDocumentInspectorImpl" + super.toString() + "]";
  }
}
