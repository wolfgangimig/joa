/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SoftEdgeFormat.
 * 
 */
@CoInterface(guid="{000C03BC-0000-0000-C000-000000000046}")
public interface SoftEdgeFormat extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public MsoSoftEdgeType getType() throws ComException;
  @DeclDISPID(1)  public void setType(MsoSoftEdgeType value) throws ComException;
  @DeclDISPID(2)  public Float getRadius() throws ComException;
  @DeclDISPID(2)  public void setRadius(Float value) throws ComException;
}
