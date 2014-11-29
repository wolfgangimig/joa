/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Action.
 * 
 */
@CoInterface(guid="{00063043-0000-0000-C000-000000000046}")
public interface Action extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(100)  public OlActionCopyLike getCopyLike() throws ComException;
  @DeclDISPID(100)  public void setCopyLike(final OlActionCopyLike value) throws ComException;
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(103)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(26)  public String getMessageClass() throws ComException;
  @DeclDISPID(26)  public void setMessageClass(final String value) throws ComException;
  @DeclDISPID(12289)  public String getName() throws ComException;
  @DeclDISPID(12289)  public void setName(final String value) throws ComException;
  @DeclDISPID(61)  public String getPrefix() throws ComException;
  @DeclDISPID(61)  public void setPrefix(final String value) throws ComException;
  @DeclDISPID(101)  public OlActionReplyStyle getReplyStyle() throws ComException;
  @DeclDISPID(101)  public void setReplyStyle(final OlActionReplyStyle value) throws ComException;
  @DeclDISPID(102)  public OlActionResponseStyle getResponseStyle() throws ComException;
  @DeclDISPID(102)  public void setResponseStyle(final OlActionResponseStyle value) throws ComException;
  @DeclDISPID(105)  public OlActionShowOn getShowOn() throws ComException;
  @DeclDISPID(105)  public void setShowOn(final OlActionShowOn value) throws ComException;
  @DeclDISPID(108)  public void Delete() throws ComException;
  @DeclDISPID(106)  public IDispatch Execute() throws ComException;
}
