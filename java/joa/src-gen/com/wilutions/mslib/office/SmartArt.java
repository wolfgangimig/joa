/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SmartArt.
 * 
 */
@CoInterface(guid="{000C03C6-0000-0000-C000-000000000046}")
public interface SmartArt extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Dispatch getParent() throws ComException;
  @DeclDISPID(2)  public SmartArtNodes getAllNodes() throws ComException;
  @DeclDISPID(3)  public SmartArtNodes getNodes() throws ComException;
  @DeclDISPID(4)  public SmartArtLayout getLayout() throws ComException;
  @DeclDISPID(4)  public void setLayout(SmartArtLayout value) throws ComException;
  @DeclDISPID(5)  public SmartArtQuickStyle getQuickStyle() throws ComException;
  @DeclDISPID(5)  public void setQuickStyle(SmartArtQuickStyle value) throws ComException;
  @DeclDISPID(6)  public SmartArtColor getColor() throws ComException;
  @DeclDISPID(6)  public void setColor(SmartArtColor value) throws ComException;
  @DeclDISPID(7)  public MsoTriState getReverse() throws ComException;
  @DeclDISPID(7)  public void setReverse(MsoTriState value) throws ComException;
  @DeclDISPID(8)  public void Reset() throws ComException;
}
