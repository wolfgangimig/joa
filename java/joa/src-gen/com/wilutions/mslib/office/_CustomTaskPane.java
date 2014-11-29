/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * _CustomTaskPane.
 * 
 */
@CoInterface(guid="{000C033B-0000-0000-C000-000000000046}")
public interface _CustomTaskPane extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(0)  public String getTitle() throws ComException;
  @DeclDISPID(1)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(2)  public IDispatch getWindow() throws ComException;
  @DeclDISPID(3)  public Boolean getVisible() throws ComException;
  @DeclDISPID(3)  public void setVisible(Boolean value) throws ComException;
  @DeclDISPID(4)  public IDispatch getContentControl() throws ComException;
  @DeclDISPID(5)  public Integer getHeight() throws ComException;
  @DeclDISPID(5)  public void setHeight(Integer value) throws ComException;
  @DeclDISPID(6)  public Integer getWidth() throws ComException;
  @DeclDISPID(6)  public void setWidth(Integer value) throws ComException;
  @DeclDISPID(7)  public MsoCTPDockPosition getDockPosition() throws ComException;
  @DeclDISPID(7)  public void setDockPosition(MsoCTPDockPosition value) throws ComException;
  @DeclDISPID(8)  public MsoCTPDockPositionRestrict getDockPositionRestrict() throws ComException;
  @DeclDISPID(8)  public void setDockPositionRestrict(MsoCTPDockPositionRestrict value) throws ComException;
  @DeclDISPID(9)  public void Delete() throws ComException;
}
