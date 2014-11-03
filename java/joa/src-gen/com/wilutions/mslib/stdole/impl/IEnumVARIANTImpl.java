/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C0959D6F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IEnumVARIANTImpl extends Dispatch implements com.wilutions.mslib.stdole.IEnumVARIANT {
  @DeclDISPID(1610678272)  public void Next(Integer celt, Object rgvar, ByRef<Integer> pceltFetched) throws ComException {
    assert(celt != null);
    assert(rgvar != null);
    assert(pceltFetched != null);
    this._dispatchCall(1610678272,"Next", DISPATCH_METHOD,null,celt,rgvar,pceltFetched);
  }
  @DeclDISPID(1610678273)  public void Skip(Integer celt) throws ComException {
    assert(celt != null);
    this._dispatchCall(1610678273,"Skip", DISPATCH_METHOD,null,celt);
  }
  @DeclDISPID(1610678274)  public void Reset() throws ComException {
    this._dispatchCall(1610678274,"Reset", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610678275)  public void Clone(ByRef<com.wilutions.mslib.stdole.IEnumVARIANT> ppenum) throws ComException {
    assert(ppenum != null);
    this._dispatchCall(1610678275,"Clone", DISPATCH_METHOD,null,ppenum);
  }
  public IEnumVARIANTImpl(String progId) throws ComException {
    super(progId);
  }
  protected IEnumVARIANTImpl(long ndisp) {
    super(ndisp);
  }
  public IEnumVARIANTImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IEnumVARIANTImpl" + super.toString() + "]";
  }
}
