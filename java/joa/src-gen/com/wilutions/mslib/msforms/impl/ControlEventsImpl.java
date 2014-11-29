/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{5ADC2638-EA25-CB5A-1613-694DA5C9C7D3}")
public class ControlEventsImpl extends Dispatch implements com.wilutions.mslib.msforms.ControlEvents {
  @DeclDISPID(-2147384830)  public void onEnter() throws ComException {
    this._dispatchCall(-2147384830,"Enter", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-2147384829)  public void onExit(com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    this._dispatchCall(-2147384829,"Exit", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL));
  }
  @DeclDISPID(-2147384831)  public void onBeforeUpdate(com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    this._dispatchCall(-2147384831,"BeforeUpdate", DISPATCH_METHOD,null,(Cancel!=null?Cancel:Dispatch.NULL));
  }
  @DeclDISPID(-2147384832)  public void onAfterUpdate() throws ComException {
    this._dispatchCall(-2147384832,"AfterUpdate", DISPATCH_METHOD,null);
  }
  public ControlEventsImpl(String progId) throws ComException {
    super(progId, "{9A4BBF53-4E46-101B-8BBD-00AA003E3B29}");
  }
  protected ControlEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ControlEventsImpl" + super.toString() + "]";
  }
}
