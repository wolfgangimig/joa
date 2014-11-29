/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * TextFrame2.
 * 
 */
@CoInterface(guid="{000C0398-0000-0000-C000-000000000046}")
public interface TextFrame2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(100)  public Float getMarginBottom() throws ComException;
  @DeclDISPID(100)  public void setMarginBottom(Float value) throws ComException;
  @DeclDISPID(101)  public Float getMarginLeft() throws ComException;
  @DeclDISPID(101)  public void setMarginLeft(Float value) throws ComException;
  @DeclDISPID(102)  public Float getMarginRight() throws ComException;
  @DeclDISPID(102)  public void setMarginRight(Float value) throws ComException;
  @DeclDISPID(103)  public Float getMarginTop() throws ComException;
  @DeclDISPID(103)  public void setMarginTop(Float value) throws ComException;
  @DeclDISPID(104)  public MsoTextOrientation getOrientation() throws ComException;
  @DeclDISPID(104)  public void setOrientation(MsoTextOrientation value) throws ComException;
  @DeclDISPID(105)  public MsoHorizontalAnchor getHorizontalAnchor() throws ComException;
  @DeclDISPID(105)  public void setHorizontalAnchor(MsoHorizontalAnchor value) throws ComException;
  @DeclDISPID(106)  public MsoVerticalAnchor getVerticalAnchor() throws ComException;
  @DeclDISPID(106)  public void setVerticalAnchor(MsoVerticalAnchor value) throws ComException;
  @DeclDISPID(107)  public MsoPathFormat getPathFormat() throws ComException;
  @DeclDISPID(107)  public void setPathFormat(MsoPathFormat value) throws ComException;
  @DeclDISPID(108)  public MsoWarpFormat getWarpFormat() throws ComException;
  @DeclDISPID(108)  public void setWarpFormat(MsoWarpFormat value) throws ComException;
  @DeclDISPID(109)  public MsoPresetTextEffect getWordArtformat() throws ComException;
  @DeclDISPID(109)  public void setWordArtformat(MsoPresetTextEffect value) throws ComException;
  @DeclDISPID(110)  public MsoTriState getWordWrap() throws ComException;
  @DeclDISPID(110)  public void setWordWrap(MsoTriState value) throws ComException;
  @DeclDISPID(111)  public MsoAutoSize getAutoSize() throws ComException;
  @DeclDISPID(111)  public void setAutoSize(MsoAutoSize value) throws ComException;
  @DeclDISPID(112)  public ThreeDFormat getThreeD() throws ComException;
  @DeclDISPID(113)  public MsoTriState getHasText() throws ComException;
  @DeclDISPID(114)  public TextRange2 getTextRange() throws ComException;
  @DeclDISPID(115)  public TextColumn2 getColumn() throws ComException;
  @DeclDISPID(116)  public Ruler2 getRuler() throws ComException;
  @DeclDISPID(117)  public void DeleteText() throws ComException;
  @DeclDISPID(118)  public MsoTriState getNoTextRotation() throws ComException;
  @DeclDISPID(118)  public void setNoTextRotation(MsoTriState value) throws ComException;
}
