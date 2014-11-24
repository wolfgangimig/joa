/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F65A580D-EB42-9DEC-3BA0-ECB6579BE1BB}")
public class _IParticipant2CallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IParticipant2Callback {
  @DeclDISPID(5140)  public void OnPinVideo(com.wilutions.mslib.uccollaborationlib.IParticipant2 _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(5140,"OnPinVideo", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(5142)  public void OnUnPinVideo(com.wilutions.mslib.uccollaborationlib.IParticipant2 _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(5142,"OnUnPinVideo", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(5141)  public void OnLockVideo(com.wilutions.mslib.uccollaborationlib.IParticipant2 _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(5141,"OnLockVideo", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(5143)  public void OnUnLockVideo(com.wilutions.mslib.uccollaborationlib.IParticipant2 _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(5143,"OnUnLockVideo", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IParticipant2CallbackImpl(String progId) throws ComException {
    super(progId, "{36CDC166-4F21-46AD-A60E-8551F26C1D41}");
  }
  protected _IParticipant2CallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IParticipant2CallbackImpl" + super.toString() + "]";
  }
}
