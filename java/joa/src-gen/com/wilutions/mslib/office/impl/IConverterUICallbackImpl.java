/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ABD-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IConverterUICallbackImpl extends Dispatch implements com.wilutions.mslib.office.IConverterUICallback {
  @DeclDISPID(1)  public void HrReportProgress(final Integer uPercentComplete) throws ComException {
    assert(uPercentComplete != null);
    this._dispatchCall(1,"HrReportProgress", DISPATCH_METHOD,null,uPercentComplete);
  }
  @DeclDISPID(2)  public void HrMessageBox(final String bstrText, final String bstrCaption, final Integer uType, final ByRef<Integer> pidResult) throws ComException {
    assert(bstrText != null);
    assert(bstrCaption != null);
    assert(uType != null);
    assert(pidResult != null);
    this._dispatchCall(2,"HrMessageBox", DISPATCH_METHOD,null,bstrText,bstrCaption,uType,pidResult);
  }
  @DeclDISPID(3)  public void HrInputBox(final String bstrText, final String bstrCaption, final ByRef<String> pbstrInput, final Integer fPassword) throws ComException {
    assert(bstrText != null);
    assert(bstrCaption != null);
    assert(pbstrInput != null);
    assert(fPassword != null);
    this._dispatchCall(3,"HrInputBox", DISPATCH_METHOD,null,bstrText,bstrCaption,pbstrInput,fPassword);
  }
  public IConverterUICallbackImpl(String progId) throws ComException {
    super(progId, "{000C03D6-0000-0000-C000-000000000046}");
  }
  protected IConverterUICallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConverterUICallbackImpl" + super.toString() + "]";
  }
}
