/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ContactCard.
 * 
 */
@CoInterface(guid="{000C03F1-0000-0000-C000-000000000046}")
public interface ContactCard extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public void Close() throws ComException;
  @DeclDISPID(2)  public void Show(MsoContactCardStyle CardStyle, Integer RectangleLeft, Integer RectangleRight, Integer RectangleTop, Integer RectangleBottom, Integer HorizontalPosition, Boolean ShowWithDelay) throws ComException;
}
