/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AE3-A463-DB41-5DAE-69E7A5F7FCBC}")
public class DocumentLibraryVersionsImpl extends Dispatch implements com.wilutions.mslib.office.DocumentLibraryVersions {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.DocumentLibraryVersion getItem(Integer lIndex) throws ComException {
    assert(lIndex != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,lIndex);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.DocumentLibraryVersionImpl.class);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(2,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(3)  public Boolean getIsVersioningEnabled() throws ComException {
    final Object obj = this._dispatchCall(3,"IsVersioningEnabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public DocumentLibraryVersionsImpl(String progId) throws ComException {
    super(progId);
  }
  protected DocumentLibraryVersionsImpl(long ndisp) {
    super(ndisp);
  }
  public DocumentLibraryVersionsImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DocumentLibraryVersionsImpl" + super.toString() + "]";
  }
}
