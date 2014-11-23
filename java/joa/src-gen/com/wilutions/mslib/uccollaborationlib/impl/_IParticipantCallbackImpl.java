/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E65F4006-D941-95DF-0924-842B113D609E}")
public class _IParticipantCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IParticipantCallback {
  @DeclDISPID(1152)  public void OnSetMuteAction(com.wilutions.mslib.uccollaborationlib.IParticipant _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1152,"OnSetMuteAction", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1151)  public void OnSetParticipantProperty(com.wilutions.mslib.uccollaborationlib.IParticipant _source, com.wilutions.mslib.uccollaborationlib.ParticipantProperty _propertyType, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_propertyType != null);
    this._dispatchCall(1151,"OnSetParticipantProperty", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),_propertyType.value,(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1153)  public void OnAdmit(com.wilutions.mslib.uccollaborationlib.IParticipant _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1153,"OnAdmit", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1154)  public void OnDeny(com.wilutions.mslib.uccollaborationlib.IParticipant _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1154,"OnDeny", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IParticipantCallbackImpl(String progId) throws ComException {
    super(progId, "{26C8D96D-7D22-4E9E-948A-EDCCB4CA9C64}");
  }
  protected _IParticipantCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IParticipantCallbackImpl" + super.toString() + "]";
  }
}
