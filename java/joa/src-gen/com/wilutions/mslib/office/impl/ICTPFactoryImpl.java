/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A56-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ICTPFactoryImpl extends Dispatch implements com.wilutions.mslib.office.ICTPFactory {
  @DeclDISPID(1)  public com.wilutions.mslib.office._CustomTaskPane CreateCTP(String CTPAxID, String CTPTitle, Object CTPParentWindow) throws ComException {
    assert(CTPAxID != null);
    assert(CTPTitle != null);
    assert(CTPParentWindow != null);
    final Object obj = this._dispatchCall(1,"CreateCTP", DISPATCH_METHOD,null,CTPAxID,CTPTitle,CTPParentWindow);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl._CustomTaskPaneImpl.class);
  }
  public ICTPFactoryImpl(String progId) throws ComException {
    super(progId);
  }
  protected ICTPFactoryImpl(long ndisp) {
    super(ndisp);
  }
  public ICTPFactoryImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ICTPFactoryImpl" + super.toString() + "]";
  }
}
