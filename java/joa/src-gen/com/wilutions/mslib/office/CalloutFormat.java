/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CalloutFormat.
 * 
 */
@CoInterface(guid="{000C0311-0000-0000-C000-000000000046}")
public interface CalloutFormat extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(10)  public void AutomaticLength() throws ComException;
  @DeclDISPID(11)  public void CustomDrop(Float Drop) throws ComException;
  @DeclDISPID(12)  public void CustomLength(Float Length) throws ComException;
  @DeclDISPID(13)  public void PresetDrop(MsoCalloutDropType DropType) throws ComException;
  @DeclDISPID(100)  public MsoTriState getAccent() throws ComException;
  @DeclDISPID(100)  public void setAccent(MsoTriState value) throws ComException;
  @DeclDISPID(101)  public MsoCalloutAngleType getAngle() throws ComException;
  @DeclDISPID(101)  public void setAngle(MsoCalloutAngleType value) throws ComException;
  @DeclDISPID(102)  public MsoTriState getAutoAttach() throws ComException;
  @DeclDISPID(102)  public void setAutoAttach(MsoTriState value) throws ComException;
  @DeclDISPID(103)  public MsoTriState getAutoLength() throws ComException;
  @DeclDISPID(104)  public MsoTriState getBorder() throws ComException;
  @DeclDISPID(104)  public void setBorder(MsoTriState value) throws ComException;
  @DeclDISPID(105)  public Float getDrop() throws ComException;
  @DeclDISPID(106)  public MsoCalloutDropType getDropType() throws ComException;
  @DeclDISPID(107)  public Float getGap() throws ComException;
  @DeclDISPID(107)  public void setGap(Float value) throws ComException;
  @DeclDISPID(108)  public Float getLength() throws ComException;
  @DeclDISPID(109)  public MsoCalloutType getType() throws ComException;
  @DeclDISPID(109)  public void setType(MsoCalloutType value) throws ComException;
}
