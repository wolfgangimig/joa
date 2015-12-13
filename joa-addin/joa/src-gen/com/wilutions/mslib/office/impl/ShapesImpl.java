/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A75-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ShapesImpl extends Dispatch implements com.wilutions.mslib.office.Shapes {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(2)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.Shape Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(10)  public com.wilutions.mslib.office.Shape AddCallout(final com.wilutions.mslib.office.MsoCalloutType Type, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException {
    assert(Type != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(10,"AddCallout", DISPATCH_METHOD,null,Type.value,Left,Top,Width,Height);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(11)  public com.wilutions.mslib.office.Shape AddConnector(final com.wilutions.mslib.office.MsoConnectorType Type, final Float BeginX, final Float BeginY, final Float EndX, final Float EndY) throws ComException {
    assert(Type != null);
    assert(BeginX != null);
    assert(BeginY != null);
    assert(EndX != null);
    assert(EndY != null);
    final Object obj = this._dispatchCall(11,"AddConnector", DISPATCH_METHOD,null,Type.value,BeginX,BeginY,EndX,EndY);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(12)  public com.wilutions.mslib.office.Shape AddCurve(final Object SafeArrayOfPoints) throws ComException {
    assert(SafeArrayOfPoints != null);
    final Object obj = this._dispatchCall(12,"AddCurve", DISPATCH_METHOD,null,SafeArrayOfPoints);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(13)  public com.wilutions.mslib.office.Shape AddLabel(final com.wilutions.mslib.office.MsoTextOrientation Orientation, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException {
    assert(Orientation != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(13,"AddLabel", DISPATCH_METHOD,null,Orientation.value,Left,Top,Width,Height);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(14)  public com.wilutions.mslib.office.Shape AddLine(final Float BeginX, final Float BeginY, final Float EndX, final Float EndY) throws ComException {
    assert(BeginX != null);
    assert(BeginY != null);
    assert(EndX != null);
    assert(EndY != null);
    final Object obj = this._dispatchCall(14,"AddLine", DISPATCH_METHOD,null,BeginX,BeginY,EndX,EndY);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(15)  public com.wilutions.mslib.office.Shape AddPicture(final String FileName, final com.wilutions.mslib.office.MsoTriState LinkToFile, final com.wilutions.mslib.office.MsoTriState SaveWithDocument, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException {
    assert(FileName != null);
    assert(LinkToFile != null);
    assert(SaveWithDocument != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(15,"AddPicture", DISPATCH_METHOD,null,FileName,LinkToFile.value,SaveWithDocument.value,Left,Top,Width,Height);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(16)  public com.wilutions.mslib.office.Shape AddPolyline(final Object SafeArrayOfPoints) throws ComException {
    assert(SafeArrayOfPoints != null);
    final Object obj = this._dispatchCall(16,"AddPolyline", DISPATCH_METHOD,null,SafeArrayOfPoints);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(17)  public com.wilutions.mslib.office.Shape AddShape(final com.wilutions.mslib.office.MsoAutoShapeType Type, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException {
    assert(Type != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(17,"AddShape", DISPATCH_METHOD,null,Type.value,Left,Top,Width,Height);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(18)  public com.wilutions.mslib.office.Shape AddTextEffect(final com.wilutions.mslib.office.MsoPresetTextEffect PresetTextEffect, final String Text, final String FontName, final Float FontSize, final com.wilutions.mslib.office.MsoTriState FontBold, final com.wilutions.mslib.office.MsoTriState FontItalic, final Float Left, final Float Top) throws ComException {
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
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(19)  public com.wilutions.mslib.office.Shape AddTextbox(final com.wilutions.mslib.office.MsoTextOrientation Orientation, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException {
    assert(Orientation != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(19,"AddTextbox", DISPATCH_METHOD,null,Orientation.value,Left,Top,Width,Height);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(20)  public com.wilutions.mslib.office.FreeformBuilder BuildFreeform(final com.wilutions.mslib.office.MsoEditingType EditingType, final Float X1, final Float Y1) throws ComException {
    assert(EditingType != null);
    assert(X1 != null);
    assert(Y1 != null);
    final Object obj = this._dispatchCall(20,"BuildFreeform", DISPATCH_METHOD,null,EditingType.value,X1,Y1);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.FreeformBuilderImpl.class);
  }
  @DeclDISPID(21)  public com.wilutions.mslib.office.ShapeRange Range(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(21,"Range", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeRangeImpl.class);
  }
  @DeclDISPID(22)  public void SelectAll() throws ComException {
    this._dispatchCall(22,"SelectAll", DISPATCH_METHOD,null);
  }
  @DeclDISPID(100)  public com.wilutions.mslib.office.Shape getBackground() throws ComException {
    final Object obj = this._dispatchCall(100,"Background", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.Shape getDefault() throws ComException {
    final Object obj = this._dispatchCall(101,"Default", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(28)  public com.wilutions.mslib.office.Shape AddSmartArt(final com.wilutions.mslib.office.SmartArtLayout Layout, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException {
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    final Object obj = this._dispatchCall(28,"AddSmartArt", DISPATCH_METHOD,null,Dispatch.param(Layout),Left,Top,Width,Height);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(29)  public com.wilutions.mslib.office.Shape AddChart2(final Integer Style, final com.wilutions.mslib.office.XlChartType Type, final Float Left, final Float Top, final Float Width, final Float Height, final Boolean NewLayout) throws ComException {
    assert(Style != null);
    assert(Type != null);
    assert(Left != null);
    assert(Top != null);
    assert(Width != null);
    assert(Height != null);
    assert(NewLayout != null);
    final Object obj = this._dispatchCall(29,"AddChart2", DISPATCH_METHOD,null,Style,Type.value,Left,Top,Width,Height,NewLayout);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(30)  public com.wilutions.mslib.office.Shape AddPicture2(final String FileName, final com.wilutions.mslib.office.MsoTriState LinkToFile, final com.wilutions.mslib.office.MsoTriState SaveWithDocument, final Float Left, final Float Top, final Float Width, final Float Height, final com.wilutions.mslib.office.MsoPictureCompress Compress) throws ComException {
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
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
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
