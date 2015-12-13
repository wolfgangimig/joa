/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8E618961-0BEB-CA91-05E8-6927EA356569}")
public class FontEventsImpl extends Dispatch implements com.wilutions.mslib.stdole.FontEvents {
  @DeclDISPID(9)  public void onFontChanged(final String PropertyName) throws ComException {
    assert(PropertyName != null);
    this._dispatchCall(9,"FontChanged", DISPATCH_METHOD,null,PropertyName);
  }
  public FontEventsImpl(String progId) throws ComException {
    super(progId, "{4EF6100A-AF88-11D0-9846-00C04FC29993}");
  }
  protected FontEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FontEventsImpl" + super.toString() + "]";
  }
}
