/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4AFFA5FA-1EE7-CA8E-1CBE-69476CF4FC8E}")
public class IReturnEffectImpl extends Dispatch implements com.wilutions.mslib.msforms.IReturnEffect {
  @DeclDISPID(0)  public void setValue(com.wilutions.mslib.msforms.fmDropEffect value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(0)  public com.wilutions.mslib.msforms.fmDropEffect getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmDropEffect.valueOf((Integer)obj);
  }
  public IReturnEffectImpl(String progId) throws ComException {
    super(progId);
  }
  protected IReturnEffectImpl(long ndisp) {
    super(ndisp);
  }
  public IReturnEffectImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IReturnEffectImpl" + super.toString() + "]";
  }
}
