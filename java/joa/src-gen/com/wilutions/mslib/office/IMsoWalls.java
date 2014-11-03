/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoWalls.
 * 
 */
@CoInterface(guid="{000C1715-0000-0000-C000-000000000046}")
public interface IMsoWalls extends IDispatch {
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(150)  public Dispatch getParent() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(112)  public Object ClearFormats() throws ComException;
  @DeclDISPID(129)  public IMsoInterior getInterior() throws ComException;
  @DeclDISPID(1663)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(161)  public Object getPictureType() throws ComException;
  @DeclDISPID(161)  public void setPictureType(Object value) throws ComException;
  @DeclDISPID(211)  public void Paste() throws ComException;
  @DeclDISPID(162)  public Object getPictureUnit() throws ComException;
  @DeclDISPID(162)  public void setPictureUnit(Object value) throws ComException;
  @DeclDISPID(2419)  public Integer getThickness() throws ComException;
  @DeclDISPID(2419)  public void setThickness(Integer value) throws ComException;
  @DeclDISPID(1610743822)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
