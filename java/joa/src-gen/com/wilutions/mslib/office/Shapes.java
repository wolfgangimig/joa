/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Shapes.
 * 
 */
@CoInterface(guid="{000C031E-0000-0000-C000-000000000046}")
public interface Shapes extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Dispatch getParent() throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Shape Item(Object Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(10)  public Shape AddCallout(MsoCalloutType Type, Float Left, Float Top, Float Width, Float Height) throws ComException;
  @DeclDISPID(11)  public Shape AddConnector(MsoConnectorType Type, Float BeginX, Float BeginY, Float EndX, Float EndY) throws ComException;
  @DeclDISPID(12)  public Shape AddCurve(Object SafeArrayOfPoints) throws ComException;
  @DeclDISPID(13)  public Shape AddLabel(MsoTextOrientation Orientation, Float Left, Float Top, Float Width, Float Height) throws ComException;
  @DeclDISPID(14)  public Shape AddLine(Float BeginX, Float BeginY, Float EndX, Float EndY) throws ComException;
  @DeclDISPID(15)  public Shape AddPicture(String FileName, MsoTriState LinkToFile, MsoTriState SaveWithDocument, Float Left, Float Top, Float Width, Float Height) throws ComException;
  @DeclDISPID(16)  public Shape AddPolyline(Object SafeArrayOfPoints) throws ComException;
  @DeclDISPID(17)  public Shape AddShape(MsoAutoShapeType Type, Float Left, Float Top, Float Width, Float Height) throws ComException;
  @DeclDISPID(18)  public Shape AddTextEffect(MsoPresetTextEffect PresetTextEffect, String Text, String FontName, Float FontSize, MsoTriState FontBold, MsoTriState FontItalic, Float Left, Float Top) throws ComException;
  @DeclDISPID(19)  public Shape AddTextbox(MsoTextOrientation Orientation, Float Left, Float Top, Float Width, Float Height) throws ComException;
  @DeclDISPID(20)  public FreeformBuilder BuildFreeform(MsoEditingType EditingType, Float X1, Float Y1) throws ComException;
  @DeclDISPID(21)  public ShapeRange Range(Object Index) throws ComException;
  @DeclDISPID(22)  public void SelectAll() throws ComException;
  @DeclDISPID(100)  public Shape getBackground() throws ComException;
  @DeclDISPID(101)  public Shape getDefault() throws ComException;
  @DeclDISPID(28)  public Shape AddSmartArt(SmartArtLayout Layout, Float Left, Float Top, Float Width, Float Height) throws ComException;
  @DeclDISPID(29)  public Shape AddChart2(Integer Style, XlChartType Type, Float Left, Float Top, Float Width, Float Height, Boolean NewLayout) throws ComException;
  @DeclDISPID(30)  public Shape AddPicture2(String FileName, MsoTriState LinkToFile, MsoTriState SaveWithDocument, Float Left, Float Top, Float Width, Float Height, MsoPictureCompress Compress) throws ComException;
}
