/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CalloutFormat.
 * 
 */
@CoInterface(guid="{000C0311-0000-0000-C000-000000000046}")
public interface CalloutFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(10)  public void AutomaticLength() throws ComException;
  @DeclDISPID(11)  public void CustomDrop(final Float Drop) throws ComException;
  @DeclDISPID(12)  public void CustomLength(final Float Length) throws ComException;
  @DeclDISPID(13)  public void PresetDrop(final MsoCalloutDropType DropType) throws ComException;
  @DeclDISPID(100)  public MsoTriState getAccent() throws ComException;
  @DeclDISPID(100)  public void setAccent(final MsoTriState value) throws ComException;
  @DeclDISPID(101)  public MsoCalloutAngleType getAngle() throws ComException;
  @DeclDISPID(101)  public void setAngle(final MsoCalloutAngleType value) throws ComException;
  @DeclDISPID(102)  public MsoTriState getAutoAttach() throws ComException;
  @DeclDISPID(102)  public void setAutoAttach(final MsoTriState value) throws ComException;
  @DeclDISPID(103)  public MsoTriState getAutoLength() throws ComException;
  @DeclDISPID(104)  public MsoTriState getBorder() throws ComException;
  @DeclDISPID(104)  public void setBorder(final MsoTriState value) throws ComException;
  @DeclDISPID(105)  public Float getDrop() throws ComException;
  @DeclDISPID(106)  public MsoCalloutDropType getDropType() throws ComException;
  @DeclDISPID(107)  public Float getGap() throws ComException;
  @DeclDISPID(107)  public void setGap(final Float value) throws ComException;
  @DeclDISPID(108)  public Float getLength() throws ComException;
  @DeclDISPID(109)  public MsoCalloutType getType() throws ComException;
  @DeclDISPID(109)  public void setType(final MsoCalloutType value) throws ComException;
}
