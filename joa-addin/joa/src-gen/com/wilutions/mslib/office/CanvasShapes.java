/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CanvasShapes.
 * 
 */
@CoInterface(guid="{000C0371-0000-0000-C000-000000000046}")
public interface CanvasShapes extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Shape Item(final Object Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(10)  public Shape AddCallout(final MsoCalloutType Type, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException;
  @DeclDISPID(11)  public Shape AddConnector(final MsoConnectorType Type, final Float BeginX, final Float BeginY, final Float EndX, final Float EndY) throws ComException;
  @DeclDISPID(12)  public Shape AddCurve(final Object SafeArrayOfPoints) throws ComException;
  @DeclDISPID(13)  public Shape AddLabel(final MsoTextOrientation Orientation, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException;
  @DeclDISPID(14)  public Shape AddLine(final Float BeginX, final Float BeginY, final Float EndX, final Float EndY) throws ComException;
  @DeclDISPID(15)  public Shape AddPicture(final String FileName, final MsoTriState LinkToFile, final MsoTriState SaveWithDocument, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException;
  @DeclDISPID(16)  public Shape AddPolyline(final Object SafeArrayOfPoints) throws ComException;
  @DeclDISPID(17)  public Shape AddShape(final MsoAutoShapeType Type, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException;
  @DeclDISPID(18)  public Shape AddTextEffect(final MsoPresetTextEffect PresetTextEffect, final String Text, final String FontName, final Float FontSize, final MsoTriState FontBold, final MsoTriState FontItalic, final Float Left, final Float Top) throws ComException;
  @DeclDISPID(19)  public Shape AddTextbox(final MsoTextOrientation Orientation, final Float Left, final Float Top, final Float Width, final Float Height) throws ComException;
  @DeclDISPID(20)  public FreeformBuilder BuildFreeform(final MsoEditingType EditingType, final Float X1, final Float Y1) throws ComException;
  @DeclDISPID(21)  public ShapeRange Range(final Object Index) throws ComException;
  @DeclDISPID(22)  public void SelectAll() throws ComException;
  @DeclDISPID(100)  public Shape getBackground() throws ComException;
}
