/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * IMessengerConversationWnd.
 * Messenger Conversation Window Interface 
 */
@CoInterface(guid="{D6B0E4C9-FAD6-4885-B271-0DC5A584ADF8}")
public interface IMessengerConversationWnd extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(2053)  public void Close() throws ComException;
  @DeclDISPID(2048)  public Integer getHWND() throws ComException;
  @DeclDISPID(2049)  public Integer getleft() throws ComException;
  @DeclDISPID(2049)  public void setleft(final Integer value) throws ComException;
  @DeclDISPID(2050)  public Integer gettop() throws ComException;
  @DeclDISPID(2050)  public void settop(final Integer value) throws ComException;
  @DeclDISPID(2051)  public Integer getWidth() throws ComException;
  @DeclDISPID(2051)  public void setWidth(final Integer value) throws ComException;
  @DeclDISPID(2052)  public Integer getHeight() throws ComException;
  @DeclDISPID(2052)  public void setHeight(final Integer value) throws ComException;
  @DeclDISPID(2055)  public Boolean getIsClosed() throws ComException;
  @DeclDISPID(2054)  public void Show() throws ComException;
  @DeclDISPID(2056)  public Object getProperty(final MWINDOWPROPERTY ePropType) throws ComException;
  @DeclDISPID(2056)  public void setProperty(final MWINDOWPROPERTY ePropType, final Object value2) throws ComException;
  @DeclDISPID(2057)  public IDispatch getContacts() throws ComException;
  @DeclDISPID(2058)  public String getHistory() throws ComException;
  @DeclDISPID(2059)  public void AddContact(final Object vContact) throws ComException;
}
