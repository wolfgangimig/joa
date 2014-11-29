/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * WebComponent.
 * 
 */
@CoInterface(guid="{000CD100-0000-0000-C000-000000000046}")
public interface WebComponent extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public IDispatch getShape() throws ComException;
  @DeclDISPID(2)  public String getURL() throws ComException;
  @DeclDISPID(2)  public void setURL(String value) throws ComException;
  @DeclDISPID(3)  public String getHTML() throws ComException;
  @DeclDISPID(3)  public void setHTML(String value) throws ComException;
  @DeclDISPID(4)  public String getName() throws ComException;
  @DeclDISPID(4)  public void setName(String value) throws ComException;
  @DeclDISPID(5)  public Integer getWidth() throws ComException;
  @DeclDISPID(5)  public void setWidth(Integer value) throws ComException;
  @DeclDISPID(6)  public Integer getHeight() throws ComException;
  @DeclDISPID(6)  public void setHeight(Integer value) throws ComException;
  @DeclDISPID(7)  public void SetPlaceHolderGraphic(String PlaceHolderGraphic) throws ComException;
  @DeclDISPID(8)  public void Commit() throws ComException;
  @DeclDISPID(9)  public void Revert() throws ComException;
}
