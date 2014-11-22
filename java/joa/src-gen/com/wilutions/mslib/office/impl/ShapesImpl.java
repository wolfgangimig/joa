/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A75-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ShapesImpl extends Dispatch implements com.wilutions.mslib.office.Shapes {
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
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(2)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.Shape Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(10)  public com.wilutions.mslib.office.Shape AddCallout(com.wilutions.mslib.office.MsoCalloutType Type, Float Left, Float Top, Float Width, Float Height) throws ComException {
    assert(Type != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(10,"AddCallout", DISPATCH_METHOD,null,Type.value,Left,Top,Width,Height);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(11)  public com.wilutions.mslib.office.Shape AddConnector(com.wilutions.mslib.office.MsoConnectorType Type, Float BeginX, Float BeginY, Float EndX, Float EndY) throws ComException {
    assert(Type != null);
    assert(BeginX != null);
    assert(BeginY != null);
    assert(EndX != null);
    assert(EndY != null);
    final Object obj = this._dispatchCall(11,"AddConnector", DISPATCH_METHOD,null,Type.value,BeginX,BeginY,EndX,EndY);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(12)  public com.wilutions.mslib.office.Shape AddCurve(Object SafeArrayOfPoints) throws ComException {
    assert(SafeArrayOfPoints != null);
    final Object obj = this._dispatchCall(12,"AddCurve", DISPATCH_METHOD,null,SafeArrayOfPoints);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(13)  public com.wilutions.mslib.office.Shape AddLabel(com.wilutions.mslib.office.MsoTextOrientation Orientation, Float Left, Float Top, Float Width, Float Height) throws ComException {
    assert(Orientation != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(13,"AddLabel", DISPATCH_METHOD,null,Orientation.value,Left,Top,Width,Height);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(14)  public com.wilutions.mslib.office.Shape AddLine(Float BeginX, Float BeginY, Float EndX, Float EndY) throws ComException {
    assert(BeginX != null);
    assert(BeginY != null);
    assert(EndX != null);
    assert(EndY != null);
    final Object obj = this._dispatchCall(14,"AddLine", DISPATCH_METHOD,null,BeginX,BeginY,EndX,EndY);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(15)  public com.wilutions.mslib.office.Shape AddPicture(String FileName, com.wilutions.mslib.office.MsoTriState LinkToFile, com.wilutions.mslib.office.MsoTriState SaveWithDocument, Float Left, Float Top, Float Width, Float Height) throws ComException {
    assert(FileName != null);
    assert(LinkToFile != null);
    assert(SaveWithDocument != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(15,"AddPicture", DISPATCH_METHOD,null,FileName,LinkToFile.value,SaveWithDocument.value,Left,Top,Width,Height);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(16)  public com.wilutions.mslib.office.Shape AddPolyline(Object SafeArrayOfPoints) throws ComException {
    assert(SafeArrayOfPoints != null);
    final Object obj = this._dispatchCall(16,"AddPolyline", DISPATCH_METHOD,null,SafeArrayOfPoints);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(17)  public com.wilutions.mslib.office.Shape AddShape(com.wilutions.mslib.office.MsoAutoShapeType Type, Float Left, Float Top, Float Width, Float Height) throws ComException {
    assert(Type != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(17,"AddShape", DISPATCH_METHOD,null,Type.value,Left,Top,Width,Height);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(18)  public com.wilutions.mslib.office.Shape AddTextEffect(com.wilutions.mslib.office.MsoPresetTextEffect PresetTextEffect, String Text, String FontName, Float FontSize, com.wilutions.mslib.office.MsoTriState FontBold, com.wilutions.mslib.office.MsoTriState FontItalic, Float Left, Float Top) throws ComException {
    assert(PresetTextEffect != null);
    assert(Text != null);
    assert(FontName != null);
    assert(FontSize != null);
    assert(FontBold != null);
    assert(FontItalic != null);
    assert(Left != null);
    assert(Top != null);
    final Object obj = this._dispatchCall(18,"AddTextEffect", DISPATCH_METHOD,null,PresetTextEffect.value,Text,FontName,FontSize,FontBold.value,FontItalic.value,Left,Top);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(19)  public com.wilutions.mslib.office.Shape AddTextbox(com.wilutions.mslib.office.MsoTextOrientation Orientation, Float Left, Float Top, Float Width, Float Height) throws ComException {
    assert(Orientation != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(19,"AddTextbox", DISPATCH_METHOD,null,Orientation.value,Left,Top,Width,Height);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(20)  public com.wilutions.mslib.office.FreeformBuilder BuildFreeform(com.wilutions.mslib.office.MsoEditingType EditingType, Float X1, Float Y1) throws ComException {
    assert(EditingType != null);
    assert(X1 != null);
    assert(Y1 != null);
    final Object obj = this._dispatchCall(20,"BuildFreeform", DISPATCH_METHOD,null,EditingType.value,X1,Y1);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.FreeformBuilderImpl.class);
  }
  @DeclDISPID(21)  public com.wilutions.mslib.office.ShapeRange Range(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(21,"Range", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeRangeImpl.class);
  }
  @DeclDISPID(22)  public void SelectAll() throws ComException {
    this._dispatchCall(22,"SelectAll", DISPATCH_METHOD,null);
  }
  @DeclDISPID(100)  public com.wilutions.mslib.office.Shape getBackground() throws ComException {
    final Object obj = this._dispatchCall(100,"Background", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.Shape getDefault() throws ComException {
    final Object obj = this._dispatchCall(101,"Default", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(28)  public com.wilutions.mslib.office.Shape AddSmartArt(com.wilutions.mslib.office.SmartArtLayout Layout, Float Left, Float Top, Float Width, Float Height) throws ComException {
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(28,"AddSmartArt", DISPATCH_METHOD,null,(Layout!=null?Layout:Dispatch.NULL),Left,Top,Width,Height);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(29)  public com.wilutions.mslib.office.Shape AddChart2(Integer Style, com.wilutions.mslib.office.XlChartType Type, Float Left, Float Top, Float Width, Float Height, Boolean NewLayout) throws ComException {
    assert(Style != null);
    assert(Type != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    assert(NewLayout != null);
    final Object obj = this._dispatchCall(29,"AddChart2", DISPATCH_METHOD,null,Style,Type.value,Left,Top,Width,Height,NewLayout);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(30)  public com.wilutions.mslib.office.Shape AddPicture2(String FileName, com.wilutions.mslib.office.MsoTriState LinkToFile, com.wilutions.mslib.office.MsoTriState SaveWithDocument, Float Left, Float Top, Float Width, Float Height, com.wilutions.mslib.office.MsoPictureCompress Compress) throws ComException {
    assert(FileName != null);
    assert(LinkToFile != null);
    assert(SaveWithDocument != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    assert(Compress != null);
    final Object obj = this._dispatchCall(30,"AddPicture2", DISPATCH_METHOD,null,FileName,LinkToFile.value,SaveWithDocument.value,Left,Top,Width,Height,Compress.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  public ShapesImpl(String progId) throws ComException {
    super(progId, "{000C031E-0000-0000-C000-000000000046}");
  }
  protected ShapesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ShapesImpl" + super.toString() + "]";
  }
}
