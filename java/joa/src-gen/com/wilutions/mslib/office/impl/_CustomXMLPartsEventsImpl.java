/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4260-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CustomXMLPartsEventsImpl extends Dispatch implements com.wilutions.mslib.office._CustomXMLPartsEvents {
  @DeclDISPID(1)  public void onPartAfterAdd(final com.wilutions.mslib.office.CustomXMLPart NewPart) throws ComException {
    this._dispatchCall(1,"PartAfterAdd", DISPATCH_METHOD,null,Dispatch.param(NewPart));
  }
  @DeclDISPID(2)  public void onPartBeforeDelete(final com.wilutions.mslib.office.CustomXMLPart OldPart) throws ComException {
    this._dispatchCall(2,"PartBeforeDelete", DISPATCH_METHOD,null,Dispatch.param(OldPart));
  }
  @DeclDISPID(3)  public void onPartAfterLoad(final com.wilutions.mslib.office.CustomXMLPart Part) throws ComException {
    this._dispatchCall(3,"PartAfterLoad", DISPATCH_METHOD,null,Dispatch.param(Part));
  }
  public _CustomXMLPartsEventsImpl(String progId) throws ComException {
    super(progId, "{000CDB0B-0000-0000-C000-000000000046}");
  }
  protected _CustomXMLPartsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CustomXMLPartsEventsImpl" + super.toString() + "]";
  }
}
