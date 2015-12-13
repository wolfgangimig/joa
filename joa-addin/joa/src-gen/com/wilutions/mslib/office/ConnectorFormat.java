/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ConnectorFormat.
 * 
 */
@CoInterface(guid="{000C0313-0000-0000-C000-000000000046}")
public interface ConnectorFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(10)  public void BeginConnect(final Shape ConnectedShape, final Integer ConnectionSite) throws ComException;
  @DeclDISPID(11)  public void BeginDisconnect() throws ComException;
  @DeclDISPID(12)  public void EndConnect(final Shape ConnectedShape, final Integer ConnectionSite) throws ComException;
  @DeclDISPID(13)  public void EndDisconnect() throws ComException;
  @DeclDISPID(100)  public MsoTriState getBeginConnected() throws ComException;
  @DeclDISPID(101)  public Shape getBeginConnectedShape() throws ComException;
  @DeclDISPID(102)  public Integer getBeginConnectionSite() throws ComException;
  @DeclDISPID(103)  public MsoTriState getEndConnected() throws ComException;
  @DeclDISPID(104)  public Shape getEndConnectedShape() throws ComException;
  @DeclDISPID(105)  public Integer getEndConnectionSite() throws ComException;
  @DeclDISPID(106)  public MsoConnectorType getType() throws ComException;
  @DeclDISPID(106)  public void setType(final MsoConnectorType value) throws ComException;
}
