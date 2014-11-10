/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ABE-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IConverterApplicationPreferencesImpl extends Dispatch implements com.wilutions.mslib.office.IConverterApplicationPreferences {
  @DeclDISPID(1)  public void HrGetLcid(ByRef<Integer> plcid) throws ComException {
    assert(plcid != null);
    this._dispatchCall(1,"HrGetLcid", DISPATCH_METHOD,null,plcid);
  }
  @DeclDISPID(2)  public void HrGetHwnd(ByRef<Integer> phwnd) throws ComException {
    assert(phwnd != null);
    this._dispatchCall(2,"HrGetHwnd", DISPATCH_METHOD,null,phwnd);
  }
  @DeclDISPID(3)  public void HrGetApplication(ByRef<String> pbstrApplication) throws ComException {
    assert(pbstrApplication != null);
    this._dispatchCall(3,"HrGetApplication", DISPATCH_METHOD,null,pbstrApplication);
  }
  @DeclDISPID(4)  public void HrCheckFormat(ByRef<Integer> pFormat) throws ComException {
    assert(pFormat != null);
    this._dispatchCall(4,"HrCheckFormat", DISPATCH_METHOD,null,pFormat);
  }
  public IConverterApplicationPreferencesImpl(String progId) throws ComException {
    super(progId);
  }
  protected IConverterApplicationPreferencesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConverterApplicationPreferencesImpl" + super.toString() + "]";
  }
}
