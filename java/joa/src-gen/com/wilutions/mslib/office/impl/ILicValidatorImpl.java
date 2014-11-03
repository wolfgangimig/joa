/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{510D3B47-1DCE-CA92-10F7-69B7A1747819}")
public class ILicValidatorImpl extends Dispatch implements com.wilutions.mslib.office.ILicValidator {
  @DeclDISPID(1)  public Object getProducts() throws ComException {
    final Object obj = this._dispatchCall(1,"Products", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2)  public Integer getSelection() throws ComException {
    final Object obj = this._dispatchCall(2,"Selection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public void setSelection(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Selection", DISPATCH_PROPERTYPUT,value);
  }
  public ILicValidatorImpl(String progId) throws ComException {
    super(progId);
  }
  protected ILicValidatorImpl(long ndisp) {
    super(ndisp);
  }
  public ILicValidatorImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ILicValidatorImpl" + super.toString() + "]";
  }
}
