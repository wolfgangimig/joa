/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceScheduler.
 * IConferenceScheduler Interface 
 */
@CoInterface(guid="{C7ACB102-B692-49CC-92DA-5824822C7B96}")
public interface IConferenceScheduler extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IConferenceInfo CreateConferenceInfo() throws ComException;
  @DeclDISPID(1610743809)  public IAsynchronousOperation ScheduleConference(final IConferenceInfo _confInfo, final Object _conferenceSchedulerCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743810)  public IAsynchronousOperation GetConferenceInfo(final String _conferenceId, final Object _conferenceSchedulerCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743811)  public IAsynchronousOperation GetAllConferences(final Boolean _isPublic, final Object _conferenceSchedulerCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743812)  public IAsynchronousOperation ModifyConference(final IConferenceInfo _conferenceInfo, final Object _conferenceSchedulerCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation DeleteConference(final String _confId, final Object _conferenceSchedulerCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743814)  public IAsynchronousOperation GetAvailableModalities(final Object _conferenceSchedulerCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation GetCapabilities(final Object _conferenceSchedulerCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743816)  public IConferenceSettingDictionary GetSettings() throws ComException;
}
