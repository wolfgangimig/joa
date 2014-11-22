/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{83C7E4BB-257E-CA8F-28CB-694DA5977350}")
public class _IDocSiteControlImpl extends Dispatch implements com.wilutions.mslib.outlook._IDocSiteControl {
  @DeclDISPID(-2147356664)  public Byte getReadOnly() throws ComException {
    final Object obj = this._dispatchCall(-2147356664,"ReadOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Byte)obj;
  }
  @DeclDISPID(-2147356664)  public void setReadOnly(Byte ReadOnly) throws ComException {
    assert(ReadOnly != null);
    this._dispatchCall(-2147356664,"ReadOnly", DISPATCH_PROPERTYPUT,ReadOnly);
  }
  @DeclDISPID(64483)  public Byte getSuppressAttachments() throws ComException {
    final Object obj = this._dispatchCall(64483,"SuppressAttachments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Byte)obj;
  }
  @DeclDISPID(64483)  public void setSuppressAttachments(Byte SuppressAttachments) throws ComException {
    assert(SuppressAttachments != null);
    this._dispatchCall(64483,"SuppressAttachments", DISPATCH_PROPERTYPUT,SuppressAttachments);
  }
  public _IDocSiteControlImpl(String progId) throws ComException {
    super(progId, "{43507DD0-811D-11CE-B565-00AA00608FAA}");
  }
  protected _IDocSiteControlImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IDocSiteControlImpl" + super.toString() + "]";
  }
}
