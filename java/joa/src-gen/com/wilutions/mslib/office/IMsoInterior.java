/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoInterior.
 * 
 */
@CoInterface(guid="{000C171B-0000-0000-C000-000000000046}")
public interface IMsoInterior extends IDispatch {
  @DeclDISPID(1610743808)  public void setColor(Object value) throws ComException;
  @DeclDISPID(1610743808)  public Object getColor() throws ComException;
  @DeclDISPID(1610743810)  public void setColorIndex(Object value) throws ComException;
  @DeclDISPID(1610743810)  public Object getColorIndex() throws ComException;
  @DeclDISPID(1610743812)  public void setInvertIfNegative(Object value) throws ComException;
  @DeclDISPID(1610743812)  public Object getInvertIfNegative() throws ComException;
  @DeclDISPID(1610743814)  public void setPattern(Object value) throws ComException;
  @DeclDISPID(1610743814)  public Object getPattern() throws ComException;
  @DeclDISPID(1610743816)  public void setPatternColor(Object value) throws ComException;
  @DeclDISPID(1610743816)  public Object getPatternColor() throws ComException;
  @DeclDISPID(1610743818)  public void setPatternColorIndex(Object value) throws ComException;
  @DeclDISPID(1610743818)  public Object getPatternColorIndex() throws ComException;
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(150)  public Dispatch getParent() throws ComException;
}
