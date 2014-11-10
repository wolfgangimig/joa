/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ReturnEffect.
 * 
 */
@CoClass(guid="{8A683C93-BA84-11CF-8110-00A0C9030074}")
public class ReturnEffect extends Dispatch implements IReturnEffect {
  @DeclDISPID(0)  public void setValue(fmDropEffect value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(0)  public fmDropEffect getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmDropEffect.valueOf((Integer)obj);
  }
  public ReturnEffect() throws ComException {
    super("{8A683C93-BA84-11CF-8110-00A0C9030074}");
  }
  protected ReturnEffect(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ReturnEffect" + super.toString() + "]";
  }
}
