/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * FreeformBuilder.
 * 
 */
@CoInterface(guid="{000C0315-0000-0000-C000-000000000046}")
public interface FreeformBuilder extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Dispatch getParent() throws ComException;
  @DeclDISPID(10)  public void AddNodes(MsoSegmentType SegmentType, MsoEditingType EditingType, Float X1, Float Y1, Float X2, Float Y2, Float X3, Float Y3) throws ComException;
  @DeclDISPID(11)  public Shape ConvertToShape() throws ComException;
}
