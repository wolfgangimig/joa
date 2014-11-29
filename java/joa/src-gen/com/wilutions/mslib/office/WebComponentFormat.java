/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * WebComponentFormat.
 * 
 */
@CoInterface(guid="{000CD102-0000-0000-C000-000000000046}")
public interface WebComponentFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(2)  public IDispatch getParent() throws ComException;
  @DeclDISPID(3)  public String getURL() throws ComException;
  @DeclDISPID(3)  public void setURL(String value) throws ComException;
  @DeclDISPID(4)  public String getHTML() throws ComException;
  @DeclDISPID(4)  public void setHTML(String value) throws ComException;
  @DeclDISPID(5)  public String getName() throws ComException;
  @DeclDISPID(5)  public void setName(String value) throws ComException;
  @DeclDISPID(6)  public Integer getWidth() throws ComException;
  @DeclDISPID(6)  public void setWidth(Integer value) throws ComException;
  @DeclDISPID(7)  public Integer getHeight() throws ComException;
  @DeclDISPID(7)  public void setHeight(Integer value) throws ComException;
  @DeclDISPID(8)  public String getPreviewGraphic() throws ComException;
  @DeclDISPID(8)  public void setPreviewGraphic(String value) throws ComException;
  @DeclDISPID(9)  public void LaunchPropertiesWindow() throws ComException;
}
