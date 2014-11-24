/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ShapeNodes.
 * 
 */
@CoInterface(guid="{000C0319-0000-0000-C000-000000000046}")
public interface ShapeNodes extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public ShapeNode Item(Object Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(11)  public void Delete(Integer Index) throws ComException;
  @DeclDISPID(12)  public void Insert(Integer Index, MsoSegmentType SegmentType, MsoEditingType EditingType, Float X1, Float Y1, Float X2, Float Y2, Float X3, Float Y3) throws ComException;
  @DeclDISPID(13)  public void SetEditingType(Integer Index, MsoEditingType EditingType) throws ComException;
  @DeclDISPID(14)  public void SetPosition(Integer Index, Float X1, Float Y1) throws ComException;
  @DeclDISPID(15)  public void SetSegmentType(Integer Index, MsoSegmentType SegmentType) throws ComException;
}
