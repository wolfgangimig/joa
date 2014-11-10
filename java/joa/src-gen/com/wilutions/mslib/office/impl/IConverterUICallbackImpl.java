/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ABD-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IConverterUICallbackImpl extends Dispatch implements com.wilutions.mslib.office.IConverterUICallback {
  @DeclDISPID(1)  public void HrReportProgress(Integer uPercentComplete) throws ComException {
    assert(uPercentComplete != null);
    this._dispatchCall(1,"HrReportProgress", DISPATCH_METHOD,null,uPercentComplete);
  }
  @DeclDISPID(2)  public void HrMessageBox(String bstrText, String bstrCaption, Integer uType, ByRef<Integer> pidResult) throws ComException {
    assert(bstrText != null);
    assert(bstrCaption != null);
    assert(uType != null);
    assert(pidResult != null);
    this._dispatchCall(2,"HrMessageBox", DISPATCH_METHOD,null,bstrText,bstrCaption,uType,pidResult);
  }
  @DeclDISPID(3)  public void HrInputBox(String bstrText, String bstrCaption, ByRef<String> pbstrInput, Integer fPassword) throws ComException {
    assert(bstrText != null);
    assert(bstrCaption != null);
    assert(pbstrInput != null);
    assert(fPassword != null);
    this._dispatchCall(3,"HrInputBox", DISPATCH_METHOD,null,bstrText,bstrCaption,pbstrInput,fPassword);
  }
  public IConverterUICallbackImpl(String progId) throws ComException {
    super(progId);
  }
  protected IConverterUICallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConverterUICallbackImpl" + super.toString() + "]";
  }
}
