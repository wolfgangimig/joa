/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ParagraphFormat2.
 * 
 */
@CoInterface(guid="{000C0399-0000-0000-C000-000000000046}")
public interface ParagraphFormat2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public MsoParagraphAlignment getAlignment() throws ComException;
  @DeclDISPID(2)  public void setAlignment(final MsoParagraphAlignment value) throws ComException;
  @DeclDISPID(3)  public MsoBaselineAlignment getBaselineAlignment() throws ComException;
  @DeclDISPID(3)  public void setBaselineAlignment(final MsoBaselineAlignment value) throws ComException;
  @DeclDISPID(4)  public BulletFormat2 getBullet() throws ComException;
  @DeclDISPID(5)  public MsoTriState getFarEastLineBreakLevel() throws ComException;
  @DeclDISPID(5)  public void setFarEastLineBreakLevel(final MsoTriState value) throws ComException;
  @DeclDISPID(6)  public Float getFirstLineIndent() throws ComException;
  @DeclDISPID(6)  public void setFirstLineIndent(final Float value) throws ComException;
  @DeclDISPID(7)  public MsoTriState getHangingPunctuation() throws ComException;
  @DeclDISPID(7)  public void setHangingPunctuation(final MsoTriState value) throws ComException;
  @DeclDISPID(8)  public Integer getIndentLevel() throws ComException;
  @DeclDISPID(8)  public void setIndentLevel(final Integer value) throws ComException;
  @DeclDISPID(9)  public Float getLeftIndent() throws ComException;
  @DeclDISPID(9)  public void setLeftIndent(final Float value) throws ComException;
  @DeclDISPID(10)  public MsoTriState getLineRuleAfter() throws ComException;
  @DeclDISPID(10)  public void setLineRuleAfter(final MsoTriState value) throws ComException;
  @DeclDISPID(11)  public MsoTriState getLineRuleBefore() throws ComException;
  @DeclDISPID(11)  public void setLineRuleBefore(final MsoTriState value) throws ComException;
  @DeclDISPID(12)  public MsoTriState getLineRuleWithin() throws ComException;
  @DeclDISPID(12)  public void setLineRuleWithin(final MsoTriState value) throws ComException;
  @DeclDISPID(13)  public Float getRightIndent() throws ComException;
  @DeclDISPID(13)  public void setRightIndent(final Float value) throws ComException;
  @DeclDISPID(14)  public Float getSpaceAfter() throws ComException;
  @DeclDISPID(14)  public void setSpaceAfter(final Float value) throws ComException;
  @DeclDISPID(15)  public Float getSpaceBefore() throws ComException;
  @DeclDISPID(15)  public void setSpaceBefore(final Float value) throws ComException;
  @DeclDISPID(16)  public Float getSpaceWithin() throws ComException;
  @DeclDISPID(16)  public void setSpaceWithin(final Float value) throws ComException;
  @DeclDISPID(17)  public TabStops2 getTabStops() throws ComException;
  @DeclDISPID(18)  public MsoTextDirection getTextDirection() throws ComException;
  @DeclDISPID(18)  public void setTextDirection(final MsoTextDirection value) throws ComException;
  @DeclDISPID(19)  public MsoTriState getWordWrap() throws ComException;
  @DeclDISPID(19)  public void setWordWrap(final MsoTriState value) throws ComException;
}
