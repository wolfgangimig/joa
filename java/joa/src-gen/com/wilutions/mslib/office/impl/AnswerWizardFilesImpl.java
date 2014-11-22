/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A0A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AnswerWizardFilesImpl extends Dispatch implements com.wilutions.mslib.office.AnswerWizardFiles {
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
  @DeclDISPID(0)  public String getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809346)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809347)  public void Add(String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(1610809347,"Add", DISPATCH_METHOD,null,FileName);
  }
  @DeclDISPID(1610809348)  public void Delete(String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(1610809348,"Delete", DISPATCH_METHOD,null,FileName);
  }
  public AnswerWizardFilesImpl(String progId) throws ComException {
    super(progId, "{000C0361-0000-0000-C000-000000000046}");
  }
  protected AnswerWizardFilesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AnswerWizardFilesImpl" + super.toString() + "]";
  }
}
