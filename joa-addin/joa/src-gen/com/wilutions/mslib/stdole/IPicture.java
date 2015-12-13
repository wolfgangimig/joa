/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole;
import com.wilutions.com.*;

/**
 * IPicture.
 * Picture Object 
 */
@CoInterface(guid="{7BF80980-BF32-101A-8BBB-00AA00300CAB}")
public interface IPicture extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610678272)  public OLE_HANDLE getHandle() throws ComException;
  @DeclDISPID(1610678273)  public OLE_HANDLE gethPal() throws ComException;
  @DeclDISPID(1610678274)  public Short getType() throws ComException;
  @DeclDISPID(1610678275)  public OLE_XSIZE_HIMETRIC getWidth() throws ComException;
  @DeclDISPID(1610678276)  public OLE_YSIZE_HIMETRIC getHeight() throws ComException;
  @DeclDISPID(1610678277)  public void Render(final Integer hdc, final Integer x, final Integer y, final Integer cx, final Integer cy, final OLE_XPOS_HIMETRIC xSrc, final OLE_YPOS_HIMETRIC ySrc, final OLE_XSIZE_HIMETRIC cxSrc, final OLE_YSIZE_HIMETRIC cySrc, final byte[] prcWBounds) throws ComException;
  @DeclDISPID(1610678273)  public void sethPal(final OLE_HANDLE phpal) throws ComException;
  @DeclDISPID(1610678279)  public Integer getCurDC() throws ComException;
  @DeclDISPID(1610678280)  public void SelectPicture(final Integer hdcIn, final ByRef<Integer> phdcOut, final ByRef<OLE_HANDLE> phbmpOut) throws ComException;
  @DeclDISPID(1610678281)  public Boolean getKeepOriginalFormat() throws ComException;
  @DeclDISPID(1610678281)  public void setKeepOriginalFormat(final Boolean pfkeep) throws ComException;
  @DeclDISPID(1610678283)  public void PictureChanged() throws ComException;
  @DeclDISPID(1610678284)  public void SaveAsFile(final byte[] pstm, final Boolean fSaveMemCopy, final ByRef<Integer> pcbSize) throws ComException;
  @DeclDISPID(1610678285)  public Integer getAttributes() throws ComException;
  @DeclDISPID(1610678286)  public void SetHdc(final OLE_HANDLE hdc) throws ComException;
}
