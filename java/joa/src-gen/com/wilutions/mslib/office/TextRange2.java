/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * TextRange2.
 * 
 */
@CoInterface(guid="{000C0397-0000-0000-C000-000000000046}")
public interface TextRange2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getText() throws ComException;
  @DeclDISPID(0)  public void setText(String value) throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(2)  public TextRange2 Item(Object Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(3)  public IDispatch getParent() throws ComException;
  @DeclDISPID(4)  public TextRange2 getParagraphs(Integer Start, Integer Length) throws ComException;
  @DeclDISPID(5)  public TextRange2 getSentences(Integer Start, Integer Length) throws ComException;
  @DeclDISPID(6)  public TextRange2 getWords(Integer Start, Integer Length) throws ComException;
  @DeclDISPID(7)  public TextRange2 getCharacters(Integer Start, Integer Length) throws ComException;
  @DeclDISPID(8)  public TextRange2 getLines(Integer Start, Integer Length) throws ComException;
  @DeclDISPID(9)  public TextRange2 getRuns(Integer Start, Integer Length) throws ComException;
  @DeclDISPID(10)  public ParagraphFormat2 getParagraphFormat() throws ComException;
  @DeclDISPID(11)  public Font2 getFont() throws ComException;
  @DeclDISPID(12)  public Integer getLength() throws ComException;
  @DeclDISPID(13)  public Integer getStart() throws ComException;
  @DeclDISPID(14)  public Float getBoundLeft() throws ComException;
  @DeclDISPID(15)  public Float getBoundTop() throws ComException;
  @DeclDISPID(16)  public Float getBoundWidth() throws ComException;
  @DeclDISPID(17)  public Float getBoundHeight() throws ComException;
  @DeclDISPID(18)  public TextRange2 TrimText() throws ComException;
  @DeclDISPID(19)  public TextRange2 InsertAfter(String NewText) throws ComException;
  @DeclDISPID(20)  public TextRange2 InsertBefore(String NewText) throws ComException;
  @DeclDISPID(21)  public TextRange2 InsertSymbol(String FontName, Integer CharNumber, MsoTriState Unicode) throws ComException;
  @DeclDISPID(22)  public void Select() throws ComException;
  @DeclDISPID(23)  public void Cut() throws ComException;
  @DeclDISPID(24)  public void Copy() throws ComException;
  @DeclDISPID(25)  public void Delete() throws ComException;
  @DeclDISPID(26)  public TextRange2 Paste() throws ComException;
  @DeclDISPID(27)  public TextRange2 PasteSpecial(MsoClipboardFormat Format) throws ComException;
  @DeclDISPID(28)  public void ChangeCase(MsoTextChangeCase Type) throws ComException;
  @DeclDISPID(29)  public void AddPeriods() throws ComException;
  @DeclDISPID(30)  public void RemovePeriods() throws ComException;
  @DeclDISPID(31)  public TextRange2 Find(String FindWhat, Integer After, MsoTriState MatchCase, MsoTriState WholeWords) throws ComException;
  @DeclDISPID(32)  public TextRange2 Replace(String FindWhat, String ReplaceWhat, Integer After, MsoTriState MatchCase, MsoTriState WholeWords) throws ComException;
  @DeclDISPID(33)  public void RotatedBounds(ByRef<Float> X1, ByRef<Float> Y1, ByRef<Float> X2, ByRef<Float> Y2, ByRef<Float> X3, ByRef<Float> Y3, ByRef<Float> x4, ByRef<Float> y4) throws ComException;
  @DeclDISPID(34)  public MsoLanguageID getLanguageID() throws ComException;
  @DeclDISPID(34)  public void setLanguageID(MsoLanguageID value) throws ComException;
  @DeclDISPID(35)  public void RtlRun() throws ComException;
  @DeclDISPID(36)  public void LtrRun() throws ComException;
  @DeclDISPID(37)  public TextRange2 getMathZones(Integer Start, Integer Length) throws ComException;
  @DeclDISPID(38)  public TextRange2 InsertChartField(MsoChartFieldType ChartFieldType, String Formula, Integer Position) throws ComException;
}
