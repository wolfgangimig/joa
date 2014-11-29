/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A02-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ScopeFoldersImpl extends Dispatch implements com.wilutions.mslib.office.ScopeFolders {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.ScopeFolder getItem(final Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ScopeFolderImpl.class);
  }
  @DeclDISPID(4)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(4,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public ScopeFoldersImpl(String progId) throws ComException {
    super(progId, "{000C0369-0000-0000-C000-000000000046}");
  }
  protected ScopeFoldersImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ScopeFoldersImpl" + super.toString() + "]";
  }
}
