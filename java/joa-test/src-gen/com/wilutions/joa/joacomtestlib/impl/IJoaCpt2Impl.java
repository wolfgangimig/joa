/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joa.joacomtestlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{78637DED-8A05-93B6-097E-B6DC1E3677B6}")
public class IJoaCpt2Impl extends Dispatch implements com.wilutions.joa.joacomtestlib.IJoaCpt2 {
  @DeclDISPID(1)  public void TriggerConnpointsInLibFolder() throws ComException {
    this._dispatchCall(1,"TriggerConnpointsInLibFolder", DISPATCH_METHOD,null);
  }
  @DeclDISPID(2)  public void TriggerGrrr(String Grrr) throws ComException {
    assert(Grrr != null);
    this._dispatchCall(2,"TriggerGrrr", DISPATCH_METHOD,null,Grrr);
  }
  public IJoaCpt2Impl(String progId) throws ComException {
    super(progId);
  }
  protected IJoaCpt2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IJoaCpt2Impl" + super.toString() + "]";
  }
}
