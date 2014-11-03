/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AFC-A463-DB41-5DAE-69E7A5F7FCBC}")
public class TextRange2Impl extends Dispatch implements com.wilutions.mslib.office.TextRange2 {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(0,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.TextRange2 Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(2,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(3)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(3,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.TextRange2 getParagraphs(Integer Start, Integer Length) throws ComException {
    assert(Start != null);
    assert(Length != null);
    final Object obj = this._dispatchCall(4,"Paragraphs", DISPATCH_PROPERTYGET,null,Start,Length);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.TextRange2 getSentences(Integer Start, Integer Length) throws ComException {
    assert(Start != null);
    assert(Length != null);
    final Object obj = this._dispatchCall(5,"Sentences", DISPATCH_PROPERTYGET,null,Start,Length);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(6)  public com.wilutions.mslib.office.TextRange2 getWords(Integer Start, Integer Length) throws ComException {
    assert(Start != null);
    assert(Length != null);
    final Object obj = this._dispatchCall(6,"Words", DISPATCH_PROPERTYGET,null,Start,Length);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(7)  public com.wilutions.mslib.office.TextRange2 getCharacters(Integer Start, Integer Length) throws ComException {
    assert(Start != null);
    assert(Length != null);
    final Object obj = this._dispatchCall(7,"Characters", DISPATCH_PROPERTYGET,null,Start,Length);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(8)  public com.wilutions.mslib.office.TextRange2 getLines(Integer Start, Integer Length) throws ComException {
    assert(Start != null);
    assert(Length != null);
    final Object obj = this._dispatchCall(8,"Lines", DISPATCH_PROPERTYGET,null,Start,Length);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(9)  public com.wilutions.mslib.office.TextRange2 getRuns(Integer Start, Integer Length) throws ComException {
    assert(Start != null);
    assert(Length != null);
    final Object obj = this._dispatchCall(9,"Runs", DISPATCH_PROPERTYGET,null,Start,Length);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(10)  public com.wilutions.mslib.office.ParagraphFormat2 getParagraphFormat() throws ComException {
    final Object obj = this._dispatchCall(10,"ParagraphFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ParagraphFormat2Impl.class);
  }
  @DeclDISPID(11)  public com.wilutions.mslib.office.Font2 getFont() throws ComException {
    final Object obj = this._dispatchCall(11,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.Font2Impl.class);
  }
  @DeclDISPID(12)  public Integer getLength() throws ComException {
    final Object obj = this._dispatchCall(12,"Length", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(13)  public Integer getStart() throws ComException {
    final Object obj = this._dispatchCall(13,"Start", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(14)  public Float getBoundLeft() throws ComException {
    final Object obj = this._dispatchCall(14,"BoundLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(15)  public Float getBoundTop() throws ComException {
    final Object obj = this._dispatchCall(15,"BoundTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(16)  public Float getBoundWidth() throws ComException {
    final Object obj = this._dispatchCall(16,"BoundWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(17)  public Float getBoundHeight() throws ComException {
    final Object obj = this._dispatchCall(17,"BoundHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(18)  public com.wilutions.mslib.office.TextRange2 TrimText() throws ComException {
    final Object obj = this._dispatchCall(18,"TrimText", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(19)  public com.wilutions.mslib.office.TextRange2 InsertAfter(String NewText) throws ComException {
    assert(NewText != null);
    final Object obj = this._dispatchCall(19,"InsertAfter", DISPATCH_METHOD,null,NewText);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(20)  public com.wilutions.mslib.office.TextRange2 InsertBefore(String NewText) throws ComException {
    assert(NewText != null);
    final Object obj = this._dispatchCall(20,"InsertBefore", DISPATCH_METHOD,null,NewText);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(21)  public com.wilutions.mslib.office.TextRange2 InsertSymbol(String FontName, Integer CharNumber, com.wilutions.mslib.office.MsoTriState Unicode) throws ComException {
    assert(FontName != null);
    assert(CharNumber != null);
    assert(Unicode != null);
    final Object obj = this._dispatchCall(21,"InsertSymbol", DISPATCH_METHOD,null,FontName,CharNumber,Unicode.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(22)  public void Select() throws ComException {
    this._dispatchCall(22,"Select", DISPATCH_METHOD,null);
  }
  @DeclDISPID(23)  public void Cut() throws ComException {
    this._dispatchCall(23,"Cut", DISPATCH_METHOD,null);
  }
  @DeclDISPID(24)  public void Copy() throws ComException {
    this._dispatchCall(24,"Copy", DISPATCH_METHOD,null);
  }
  @DeclDISPID(25)  public void Delete() throws ComException {
    this._dispatchCall(25,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(26)  public com.wilutions.mslib.office.TextRange2 Paste() throws ComException {
    final Object obj = this._dispatchCall(26,"Paste", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(27)  public com.wilutions.mslib.office.TextRange2 PasteSpecial(com.wilutions.mslib.office.MsoClipboardFormat Format) throws ComException {
    assert(Format != null);
    final Object obj = this._dispatchCall(27,"PasteSpecial", DISPATCH_METHOD,null,Format.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(28)  public void ChangeCase(com.wilutions.mslib.office.MsoTextChangeCase Type) throws ComException {
    assert(Type != null);
    this._dispatchCall(28,"ChangeCase", DISPATCH_METHOD,null,Type.value);
  }
  @DeclDISPID(29)  public void AddPeriods() throws ComException {
    this._dispatchCall(29,"AddPeriods", DISPATCH_METHOD,null);
  }
  @DeclDISPID(30)  public void RemovePeriods() throws ComException {
    this._dispatchCall(30,"RemovePeriods", DISPATCH_METHOD,null);
  }
  @DeclDISPID(31)  public com.wilutions.mslib.office.TextRange2 Find(String FindWhat, Integer After, com.wilutions.mslib.office.MsoTriState MatchCase, com.wilutions.mslib.office.MsoTriState WholeWords) throws ComException {
    assert(FindWhat != null);
    assert(After != null);
    assert(MatchCase != null);
    assert(WholeWords != null);
    final Object obj = this._dispatchCall(31,"Find", DISPATCH_METHOD,null,FindWhat,After,MatchCase.value,WholeWords.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(32)  public com.wilutions.mslib.office.TextRange2 Replace(String FindWhat, String ReplaceWhat, Integer After, com.wilutions.mslib.office.MsoTriState MatchCase, com.wilutions.mslib.office.MsoTriState WholeWords) throws ComException {
    assert(FindWhat != null);
    assert(ReplaceWhat != null);
    assert(After != null);
    assert(MatchCase != null);
    assert(WholeWords != null);
    final Object obj = this._dispatchCall(32,"Replace", DISPATCH_METHOD,null,FindWhat,ReplaceWhat,After,MatchCase.value,WholeWords.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(33)  public void RotatedBounds(ByRef<Float> X1, ByRef<Float> Y1, ByRef<Float> X2, ByRef<Float> Y2, ByRef<Float> X3, ByRef<Float> Y3, ByRef<Float> x4, ByRef<Float> y4) throws ComException {
    assert(X1 != null);
    assert(Y1 != null);
    assert(X2 != null);
    assert(Y2 != null);
    assert(X3 != null);
    assert(Y3 != null);
    assert(x4 != null);
    assert(y4 != null);
    this._dispatchCall(33,"RotatedBounds", DISPATCH_METHOD,null,X1,Y1,X2,Y2,X3,Y3,x4,y4);
  }
  @DeclDISPID(34)  public com.wilutions.mslib.office.MsoLanguageID getLanguageID() throws ComException {
    final Object obj = this._dispatchCall(34,"LanguageID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoLanguageID.valueOf((Integer)obj);
  }
  @DeclDISPID(34)  public void setLanguageID(com.wilutions.mslib.office.MsoLanguageID value) throws ComException {
    assert(value != null);
    this._dispatchCall(34,"LanguageID", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(35)  public void RtlRun() throws ComException {
    this._dispatchCall(35,"RtlRun", DISPATCH_METHOD,null);
  }
  @DeclDISPID(36)  public void LtrRun() throws ComException {
    this._dispatchCall(36,"LtrRun", DISPATCH_METHOD,null);
  }
  @DeclDISPID(37)  public com.wilutions.mslib.office.TextRange2 getMathZones(Integer Start, Integer Length) throws ComException {
    assert(Start != null);
    assert(Length != null);
    final Object obj = this._dispatchCall(37,"MathZones", DISPATCH_PROPERTYGET,null,Start,Length);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(38)  public com.wilutions.mslib.office.TextRange2 InsertChartField(com.wilutions.mslib.office.MsoChartFieldType ChartFieldType, String Formula, Integer Position) throws ComException {
    assert(ChartFieldType != null);
    assert(Formula != null);
    assert(Position != null);
    final Object obj = this._dispatchCall(38,"InsertChartField", DISPATCH_METHOD,null,ChartFieldType.value,Formula,Position);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  public TextRange2Impl(String progId) throws ComException {
    super(progId);
  }
  protected TextRange2Impl(long ndisp) {
    super(ndisp);
  }
  public TextRange2Impl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TextRange2Impl" + super.toString() + "]";
  }
}
