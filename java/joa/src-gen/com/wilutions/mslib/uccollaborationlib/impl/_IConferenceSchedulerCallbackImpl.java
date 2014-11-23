/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{02BB7FD4-9E24-9DF6-18EA-2DD7FE5A0203}")
public class _IConferenceSchedulerCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IConferenceSchedulerCallback {
  @DeclDISPID(1850)  public void OnScheduleConference(com.wilutions.mslib.uccollaborationlib.IConferenceScheduler _source, com.wilutions.mslib.uccollaborationlib.IConferenceInfo _conferenceInfo, String _conferenceUri, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_conferenceUri != null);
    this._dispatchCall(1850,"OnScheduleConference", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_conferenceInfo!=null?_conferenceInfo:Dispatch.NULL),_conferenceUri,(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1851)  public void OnModifyConference(com.wilutions.mslib.uccollaborationlib.IConferenceScheduler _source, com.wilutions.mslib.uccollaborationlib.IConferenceInfo _conferenceInfo, String _conferenceUri, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_conferenceUri != null);
    this._dispatchCall(1851,"OnModifyConference", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_conferenceInfo!=null?_conferenceInfo:Dispatch.NULL),_conferenceUri,(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1852)  public void OnGetConferenceInfo(com.wilutions.mslib.uccollaborationlib.IConferenceScheduler _source, com.wilutions.mslib.uccollaborationlib.IConferenceInfo _conferenceInfo, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1852,"OnGetConferenceInfo", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_conferenceInfo!=null?_conferenceInfo:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1853)  public void OnGetAllConferences(com.wilutions.mslib.uccollaborationlib.IConferenceScheduler _source, com.wilutions.mslib.uccollaborationlib.IConferenceInfoCollection _conferenceInfos, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1853,"OnGetAllConferences", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_conferenceInfos!=null?_conferenceInfos:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1854)  public void OnDeleteConference(com.wilutions.mslib.uccollaborationlib.IConferenceScheduler _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1854,"OnDeleteConference", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1855)  public void OnGetAvailableModalities(com.wilutions.mslib.uccollaborationlib.IConferenceScheduler _source, com.wilutions.mslib.uccollaborationlib.ModalityTypes _modes, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_modes != null);
    this._dispatchCall(1855,"OnGetAvailableModalities", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),_modes.value,(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1856)  public void OnGetCapabilities(com.wilutions.mslib.uccollaborationlib.IConferenceScheduler _source, com.wilutions.mslib.uccollaborationlib.IConferenceCapabilities _conferenceCapabilities, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1856,"OnGetCapabilities", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_conferenceCapabilities!=null?_conferenceCapabilities:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IConferenceSchedulerCallbackImpl(String progId) throws ComException {
    super(progId, "{C22CE6BF-3A47-46B7-8544-44305BADFEF9}");
  }
  protected _IConferenceSchedulerCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IConferenceSchedulerCallbackImpl" + super.toString() + "]";
  }
}
