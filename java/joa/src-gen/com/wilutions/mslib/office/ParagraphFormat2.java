/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ParagraphFormat2.
 * 
 */
@CoInterface(guid="{000C0399-0000-0000-C000-000000000046}")
public interface ParagraphFormat2 extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Dispatch getParent() throws ComException;
  @DeclDISPID(2)  public MsoParagraphAlignment getAlignment() throws ComException;
  @DeclDISPID(2)  public void setAlignment(MsoParagraphAlignment value) throws ComException;
  @DeclDISPID(3)  public MsoBaselineAlignment getBaselineAlignment() throws ComException;
  @DeclDISPID(3)  public void setBaselineAlignment(MsoBaselineAlignment value) throws ComException;
  @DeclDISPID(4)  public BulletFormat2 getBullet() throws ComException;
  @DeclDISPID(5)  public MsoTriState getFarEastLineBreakLevel() throws ComException;
  @DeclDISPID(5)  public void setFarEastLineBreakLevel(MsoTriState value) throws ComException;
  @DeclDISPID(6)  public Float getFirstLineIndent() throws ComException;
  @DeclDISPID(6)  public void setFirstLineIndent(Float value) throws ComException;
  @DeclDISPID(7)  public MsoTriState getHangingPunctuation() throws ComException;
  @DeclDISPID(7)  public void setHangingPunctuation(MsoTriState value) throws ComException;
  @DeclDISPID(8)  public Integer getIndentLevel() throws ComException;
  @DeclDISPID(8)  public void setIndentLevel(Integer value) throws ComException;
  @DeclDISPID(9)  public Float getLeftIndent() throws ComException;
  @DeclDISPID(9)  public void setLeftIndent(Float value) throws ComException;
  @DeclDISPID(10)  public MsoTriState getLineRuleAfter() throws ComException;
  @DeclDISPID(10)  public void setLineRuleAfter(MsoTriState value) throws ComException;
  @DeclDISPID(11)  public MsoTriState getLineRuleBefore() throws ComException;
  @DeclDISPID(11)  public void setLineRuleBefore(MsoTriState value) throws ComException;
  @DeclDISPID(12)  public MsoTriState getLineRuleWithin() throws ComException;
  @DeclDISPID(12)  public void setLineRuleWithin(MsoTriState value) throws ComException;
  @DeclDISPID(13)  public Float getRightIndent() throws ComException;
  @DeclDISPID(13)  public void setRightIndent(Float value) throws ComException;
  @DeclDISPID(14)  public Float getSpaceAfter() throws ComException;
  @DeclDISPID(14)  public void setSpaceAfter(Float value) throws ComException;
  @DeclDISPID(15)  public Float getSpaceBefore() throws ComException;
  @DeclDISPID(15)  public void setSpaceBefore(Float value) throws ComException;
  @DeclDISPID(16)  public Float getSpaceWithin() throws ComException;
  @DeclDISPID(16)  public void setSpaceWithin(Float value) throws ComException;
  @DeclDISPID(17)  public TabStops2 getTabStops() throws ComException;
  @DeclDISPID(18)  public MsoTextDirection getTextDirection() throws ComException;
  @DeclDISPID(18)  public void setTextDirection(MsoTextDirection value) throws ComException;
  @DeclDISPID(19)  public MsoTriState getWordWrap() throws ComException;
  @DeclDISPID(19)  public void setWordWrap(MsoTriState value) throws ComException;
}
