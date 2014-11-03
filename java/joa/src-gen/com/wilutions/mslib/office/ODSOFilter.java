/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ODSOFilter.
 * 
 */
@CoInterface(guid="{000C1533-0000-0000-C000-000000000046}")
public interface ODSOFilter extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Integer getIndex() throws ComException;
  @DeclDISPID(2)  public Dispatch getParent() throws ComException;
  @DeclDISPID(3)  public String getColumn() throws ComException;
  @DeclDISPID(3)  public void setColumn(String value) throws ComException;
  @DeclDISPID(4)  public MsoFilterComparison getComparison() throws ComException;
  @DeclDISPID(4)  public void setComparison(MsoFilterComparison value) throws ComException;
  @DeclDISPID(5)  public String getCompareTo() throws ComException;
  @DeclDISPID(5)  public void setCompareTo(String value) throws ComException;
  @DeclDISPID(6)  public MsoFilterConjunction getConjunction() throws ComException;
  @DeclDISPID(6)  public void setConjunction(MsoFilterConjunction value) throws ComException;
}
