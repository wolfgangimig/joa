/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ShapeNodes.
 * 
 */
@CoInterface(guid="{000C0319-0000-0000-C000-000000000046}")
public interface ShapeNodes extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public ShapeNode Item(final Object Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(11)  public void Delete(final Integer Index) throws ComException;
  @DeclDISPID(12)  public void Insert(final Integer Index, final MsoSegmentType SegmentType, final MsoEditingType EditingType, final Float X1, final Float Y1, final Float X2, final Float Y2, final Float X3, final Float Y3) throws ComException;
  @DeclDISPID(13)  public void SetEditingType(final Integer Index, final MsoEditingType EditingType) throws ComException;
  @DeclDISPID(14)  public void SetPosition(final Integer Index, final Float X1, final Float Y1) throws ComException;
  @DeclDISPID(15)  public void SetSegmentType(final Integer Index, final MsoSegmentType SegmentType) throws ComException;
}
