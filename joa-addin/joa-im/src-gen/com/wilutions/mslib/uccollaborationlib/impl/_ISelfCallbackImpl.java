/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{693D2FCB-F0DA-9F58-3701-02C17A5BE97F}")
public class _ISelfCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._ISelfCallback {
  @DeclDISPID(1751)  public void OnSetPhones(final com.wilutions.mslib.uccollaborationlib.ISelf _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1751,"OnSetPhones", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1752)  public void OnSetPhone(final com.wilutions.mslib.uccollaborationlib.ISelf _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1752,"OnSetPhone", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1753)  public void OnRemovePhone(final com.wilutions.mslib.uccollaborationlib.ISelf _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1753,"OnRemovePhone", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1754)  public void OnPublishContactInformation(final com.wilutions.mslib.uccollaborationlib.ISelf _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1754,"OnPublishContactInformation", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _ISelfCallbackImpl(String progId) throws ComException {
    super(progId, "{A9AAB6A0-54B9-4419-AAAF-6B26DFAC1585}");
  }
  protected _ISelfCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ISelfCallbackImpl" + super.toString() + "]";
  }
}
