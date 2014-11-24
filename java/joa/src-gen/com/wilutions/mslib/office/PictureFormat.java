/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * PictureFormat.
 * 
 */
@CoInterface(guid="{000C031A-0000-0000-C000-000000000046}")
public interface PictureFormat extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(10)  public void IncrementBrightness(Float Increment) throws ComException;
  @DeclDISPID(11)  public void IncrementContrast(Float Increment) throws ComException;
  @DeclDISPID(100)  public Float getBrightness() throws ComException;
  @DeclDISPID(100)  public void setBrightness(Float value) throws ComException;
  @DeclDISPID(101)  public MsoPictureColorType getColorType() throws ComException;
  @DeclDISPID(101)  public void setColorType(MsoPictureColorType value) throws ComException;
  @DeclDISPID(102)  public Float getContrast() throws ComException;
  @DeclDISPID(102)  public void setContrast(Float value) throws ComException;
  @DeclDISPID(103)  public Float getCropBottom() throws ComException;
  @DeclDISPID(103)  public void setCropBottom(Float value) throws ComException;
  @DeclDISPID(104)  public Float getCropLeft() throws ComException;
  @DeclDISPID(104)  public void setCropLeft(Float value) throws ComException;
  @DeclDISPID(105)  public Float getCropRight() throws ComException;
  @DeclDISPID(105)  public void setCropRight(Float value) throws ComException;
  @DeclDISPID(106)  public Float getCropTop() throws ComException;
  @DeclDISPID(106)  public void setCropTop(Float value) throws ComException;
  @DeclDISPID(107)  public MsoRGBType getTransparencyColor() throws ComException;
  @DeclDISPID(107)  public void setTransparencyColor(MsoRGBType value) throws ComException;
  @DeclDISPID(108)  public MsoTriState getTransparentBackground() throws ComException;
  @DeclDISPID(108)  public void setTransparentBackground(MsoTriState value) throws ComException;
  @DeclDISPID(109)  public Crop getCrop() throws ComException;
}
