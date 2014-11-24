/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IScheduledConferenceCollection.
 * IScheduledConferenceCollection Interface 
 */
@CoInterface(guid="{F423726D-0E9B-4B55-9569-E79865210F69}")
public interface IScheduledConferenceCollection extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IScheduledConference getItem(Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
