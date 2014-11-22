/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8206BB27-7A9D-931A-13C7-051F0F72378C}")
public class IAssistanceImpl extends Dispatch implements com.wilutions.mslib.office.IAssistance {
  @DeclDISPID(1610743808)  public void ShowHelp(String HelpId, String Scope) throws ComException {
    assert(HelpId != null);
    assert(Scope != null);
    this._dispatchCall(1610743808,"ShowHelp", DISPATCH_METHOD,null,HelpId,Scope);
  }
  @DeclDISPID(1610743809)  public void SearchHelp(String Query, String Scope) throws ComException {
    assert(Query != null);
    assert(Scope != null);
    this._dispatchCall(1610743809,"SearchHelp", DISPATCH_METHOD,null,Query,Scope);
  }
  @DeclDISPID(1610743810)  public void SetDefaultContext(String HelpId) throws ComException {
    assert(HelpId != null);
    this._dispatchCall(1610743810,"SetDefaultContext", DISPATCH_METHOD,null,HelpId);
  }
  @DeclDISPID(1610743811)  public void ClearDefaultContext(String HelpId) throws ComException {
    assert(HelpId != null);
    this._dispatchCall(1610743811,"ClearDefaultContext", DISPATCH_METHOD,null,HelpId);
  }
  public IAssistanceImpl(String progId) throws ComException {
    super(progId, "{4291224C-DEFE-485B-8E69-6CF8AA85CB76}");
  }
  protected IAssistanceImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IAssistanceImpl" + super.toString() + "]";
  }
}
