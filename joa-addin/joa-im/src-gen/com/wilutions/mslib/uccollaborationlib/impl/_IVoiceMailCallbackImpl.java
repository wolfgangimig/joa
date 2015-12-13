/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A826654D-10EC-961E-2DEF-E7C3C38124CC}")
public class _IVoiceMailCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IVoiceMailCallback {
  @DeclDISPID(3900)  public void OnDelete(final com.wilutions.mslib.uccollaborationlib.IVoiceMail _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(3900,"OnDelete", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IVoiceMailCallbackImpl(String progId) throws ComException {
    super(progId, "{68B1FC26-B48F-4D5F-B041-8E246676D836}");
  }
  protected _IVoiceMailCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IVoiceMailCallbackImpl" + super.toString() + "]";
  }
}
