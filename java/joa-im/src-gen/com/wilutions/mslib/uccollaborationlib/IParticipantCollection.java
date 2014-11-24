/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IParticipantCollection.
 * IParticipantCollection Interface 
 */
@CoInterface(guid="{FD02E775-CB9D-4CE3-9243-115C81E5F11C}")
public interface IParticipantCollection extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IParticipant getItem(Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743811)  public Integer IndexOf(IParticipant _participant) throws ComException;
}
