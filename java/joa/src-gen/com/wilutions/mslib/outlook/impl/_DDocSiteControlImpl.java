/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091694D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _DDocSiteControlImpl extends Dispatch implements com.wilutions.mslib.outlook._DDocSiteControl {
  @DeclDISPID(-2147356664)  public Byte getReadOnly() throws ComException {
    final Object obj = this._dispatchCall(-2147356664,"ReadOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Byte)obj;
  }
  @DeclDISPID(-2147356664)  public void setReadOnly(Byte value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356664,"ReadOnly", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64483)  public Byte getSuppressAttachments() throws ComException {
    final Object obj = this._dispatchCall(64483,"SuppressAttachments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Byte)obj;
  }
  @DeclDISPID(64483)  public void setSuppressAttachments(Byte value) throws ComException {
    assert(value != null);
    this._dispatchCall(64483,"SuppressAttachments", DISPATCH_PROPERTYPUT,value);
  }
  public _DDocSiteControlImpl(String progId) throws ComException {
    super(progId, "{0006F026-0000-0000-C000-000000000046}");
  }
  protected _DDocSiteControlImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_DDocSiteControlImpl" + super.toString() + "]";
  }
}
