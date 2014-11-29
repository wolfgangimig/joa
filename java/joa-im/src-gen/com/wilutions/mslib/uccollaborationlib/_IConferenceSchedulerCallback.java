/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IConferenceSchedulerCallback.
 * _IConferenceSchedulerCallback Interface 
 */
@CoInterface(guid="{C22CE6BF-3A47-46B7-8544-44305BADFEF9}")
public interface _IConferenceSchedulerCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1850)  public void OnScheduleConference(IConferenceScheduler _source, IConferenceInfo _conferenceInfo, String _conferenceUri, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1851)  public void OnModifyConference(IConferenceScheduler _source, IConferenceInfo _conferenceInfo, String _conferenceUri, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1852)  public void OnGetConferenceInfo(IConferenceScheduler _source, IConferenceInfo _conferenceInfo, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1853)  public void OnGetAllConferences(IConferenceScheduler _source, IConferenceInfoCollection _conferenceInfos, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1854)  public void OnDeleteConference(IConferenceScheduler _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1855)  public void OnGetAvailableModalities(IConferenceScheduler _source, ModalityTypes _modes, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1856)  public void OnGetCapabilities(IConferenceScheduler _source, IConferenceCapabilities _conferenceCapabilities, IAsynchronousOperation _asyncOperation) throws ComException;
}
