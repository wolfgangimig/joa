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
  @DeclDISPID(1850)  public void OnScheduleConference(final IConferenceScheduler _source, final IConferenceInfo _conferenceInfo, final String _conferenceUri, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1851)  public void OnModifyConference(final IConferenceScheduler _source, final IConferenceInfo _conferenceInfo, final String _conferenceUri, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1852)  public void OnGetConferenceInfo(final IConferenceScheduler _source, final IConferenceInfo _conferenceInfo, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1853)  public void OnGetAllConferences(final IConferenceScheduler _source, final IConferenceInfoCollection _conferenceInfos, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1854)  public void OnDeleteConference(final IConferenceScheduler _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1855)  public void OnGetAvailableModalities(final IConferenceScheduler _source, final ModalityTypes _modes, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1856)  public void OnGetCapabilities(final IConferenceScheduler _source, final IConferenceCapabilities _conferenceCapabilities, final IAsynchronousOperation _asyncOperation) throws ComException;
}
