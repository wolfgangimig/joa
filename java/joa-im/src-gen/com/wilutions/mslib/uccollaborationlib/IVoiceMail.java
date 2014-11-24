/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IVoiceMail.
 * IVoiceMail Interface 
 */
@CoInterface(guid="{25A47938-5C31-4F43-9108-DA01EE5869C0}")
public interface IVoiceMail extends IDispatch {
  @DeclDISPID(1610743808)  public String getId() throws ComException;
  @DeclDISPID(1610743809)  public String getEntryId() throws ComException;
  @DeclDISPID(1610743810)  public String getSender() throws ComException;
  @DeclDISPID(1610743811)  public String getSenderUri() throws ComException;
  @DeclDISPID(1610743812)  public java.util.Date getReceiveTime() throws ComException;
  @DeclDISPID(1610743813)  public INamedPropertyList getProperties() throws ComException;
  @DeclDISPID(1610743814)  public Boolean getIsRead() throws ComException;
  @DeclDISPID(1610743815)  public IConversation CallVoiceMail() throws ComException;
  @DeclDISPID(1610743816)  public IAsynchronousOperation Delete(Object _callback, Object _state) throws ComException;
}
