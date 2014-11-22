/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _DocSiteControl.
 * 
 */
@CoClass(guid="{0006F024-0000-0000-C000-000000000046}")
public class _DocSiteControl extends Dispatch implements _DDocSiteControl {
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
  public _DocSiteControl() throws ComException {
    super("{0006F024-0000-0000-C000-000000000046}", "{0006F026-0000-0000-C000-000000000046}");
  }
  protected _DocSiteControl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_DocSiteControl" + super.toString() + "]";
  }
}
