/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A0C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SearchScopeImpl extends Dispatch implements com.wilutions.mslib.office.SearchScope {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.MsoSearchIn getType() throws ComException {
    final Object obj = this._dispatchCall(0,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoSearchIn.valueOf((Integer)obj);
  }
  @DeclDISPID(1)  public com.wilutions.mslib.office.ScopeFolder getScopeFolder() throws ComException {
    final Object obj = this._dispatchCall(1,"ScopeFolder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ScopeFolderImpl.class);
  }
  public SearchScopeImpl(String progId) throws ComException {
    super(progId);
  }
  protected SearchScopeImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SearchScopeImpl" + super.toString() + "]";
  }
}
