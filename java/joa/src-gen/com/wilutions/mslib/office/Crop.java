/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Crop.
 * 
 */
@CoInterface(guid="{000C03D3-0000-0000-C000-000000000046}")
public interface Crop extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public Float getPictureOffsetX() throws ComException;
  @DeclDISPID(0)  public void setPictureOffsetX(final Float value) throws ComException;
  @DeclDISPID(1)  public Float getPictureOffsetY() throws ComException;
  @DeclDISPID(1)  public void setPictureOffsetY(final Float value) throws ComException;
  @DeclDISPID(2)  public Float getPictureWidth() throws ComException;
  @DeclDISPID(2)  public void setPictureWidth(final Float value) throws ComException;
  @DeclDISPID(3)  public Float getPictureHeight() throws ComException;
  @DeclDISPID(3)  public void setPictureHeight(final Float value) throws ComException;
  @DeclDISPID(5)  public Float getShapeLeft() throws ComException;
  @DeclDISPID(5)  public void setShapeLeft(final Float value) throws ComException;
  @DeclDISPID(6)  public Float getShapeTop() throws ComException;
  @DeclDISPID(6)  public void setShapeTop(final Float value) throws ComException;
  @DeclDISPID(7)  public Float getShapeWidth() throws ComException;
  @DeclDISPID(7)  public void setShapeWidth(final Float value) throws ComException;
  @DeclDISPID(8)  public Float getShapeHeight() throws ComException;
  @DeclDISPID(8)  public void setShapeHeight(final Float value) throws ComException;
}
