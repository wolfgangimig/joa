/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E58-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoCategoryImpl extends Dispatch implements com.wilutions.mslib.office.IMsoCategory {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(110)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(110,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2887)  public Boolean getIsFiltered() throws ComException {
    final Object obj = this._dispatchCall(2887,"IsFiltered", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2887)  public void setIsFiltered(Boolean pfIsFiltered) throws ComException {
    assert(pfIsFiltered != null);
    this._dispatchCall(2887,"IsFiltered", DISPATCH_PROPERTYPUT,pfIsFiltered);
  }
  public IMsoCategoryImpl(String progId) throws ComException {
    super(progId, "{000C1733-0000-0000-C000-000000000046}");
  }
  protected IMsoCategoryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoCategoryImpl" + super.toString() + "]";
  }
}
