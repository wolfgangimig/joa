/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A32-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoDispCagNotifySinkImpl extends Dispatch implements com.wilutions.mslib.office.IMsoDispCagNotifySink {
  @DeclDISPID(1)  public void InsertClip(Object pClipMoniker, Object pItemMoniker) throws ComException {
    assert(pClipMoniker != null);
    assert(pItemMoniker != null);
    this._dispatchCall(1,"InsertClip", DISPATCH_METHOD,null,pClipMoniker,pItemMoniker);
  }
  @DeclDISPID(2)  public void WindowIsClosing() throws ComException {
    this._dispatchCall(2,"WindowIsClosing", DISPATCH_METHOD,null);
  }
  public IMsoDispCagNotifySinkImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoDispCagNotifySinkImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoDispCagNotifySinkImpl" + super.toString() + "]";
  }
}
