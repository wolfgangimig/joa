/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceScheduler.
 * IConferenceScheduler Interface 
 */
@CoInterface(guid="{C7ACB102-B692-49CC-92DA-5824822C7B96}")
public interface IConferenceScheduler extends IDispatch {
  @DeclDISPID(1610743808)  public IConferenceInfo CreateConferenceInfo() throws ComException;
  @DeclDISPID(1610743809)  public IAsynchronousOperation ScheduleConference(IConferenceInfo _confInfo, Object _conferenceSchedulerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743810)  public IAsynchronousOperation GetConferenceInfo(String _conferenceId, Object _conferenceSchedulerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743811)  public IAsynchronousOperation GetAllConferences(Boolean _isPublic, Object _conferenceSchedulerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743812)  public IAsynchronousOperation ModifyConference(IConferenceInfo _conferenceInfo, Object _conferenceSchedulerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation DeleteConference(String _confId, Object _conferenceSchedulerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743814)  public IAsynchronousOperation GetAvailableModalities(Object _conferenceSchedulerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation GetCapabilities(Object _conferenceSchedulerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743816)  public IConferenceSettingDictionary GetSettings() throws ComException;
}
