/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ShapeNode.
 * 
 */
@CoInterface(guid="{000C0318-0000-0000-C000-000000000046}")
public interface ShapeNode extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(100)  public MsoEditingType getEditingType() throws ComException;
  @DeclDISPID(101)  public Object getPoints() throws ComException;
  @DeclDISPID(102)  public MsoSegmentType getSegmentType() throws ComException;
}
