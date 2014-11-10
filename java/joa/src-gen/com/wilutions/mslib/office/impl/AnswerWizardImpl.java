/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A0B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AnswerWizardImpl extends Dispatch implements com.wilutions.mslib.office.AnswerWizard {
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
  @DeclDISPID(1610809345)  public com.wilutions.mslib.office.AnswerWizardFiles getFiles() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Files", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.AnswerWizardFilesImpl.class);
  }
  @DeclDISPID(1610809346)  public void ClearFileList() throws ComException {
    this._dispatchCall(1610809346,"ClearFileList", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809347)  public void ResetFileList() throws ComException {
    this._dispatchCall(1610809347,"ResetFileList", DISPATCH_METHOD,null);
  }
  public AnswerWizardImpl(String progId) throws ComException {
    super(progId);
  }
  protected AnswerWizardImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AnswerWizardImpl" + super.toString() + "]";
  }
}
