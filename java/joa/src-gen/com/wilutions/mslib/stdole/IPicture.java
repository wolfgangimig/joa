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
  @DeclDISPID(1610678277)  public void Render(Integer hdc, Integer x, Integer y, Integer cx, Integer cy, OLE_XPOS_HIMETRIC xSrc, OLE_YPOS_HIMETRIC ySrc, OLE_XSIZE_HIMETRIC cxSrc, OLE_YSIZE_HIMETRIC cySrc, byte[] prcWBounds) throws ComException;
  @DeclDISPID(1610678273)  public void sethPal(OLE_HANDLE phpal) throws ComException;
  @DeclDISPID(1610678279)  public Integer getCurDC() throws ComException;
  @DeclDISPID(1610678280)  public void SelectPicture(Integer hdcIn, ByRef<Integer> phdcOut, ByRef<OLE_HANDLE> phbmpOut) throws ComException;
  @DeclDISPID(1610678281)  public Boolean getKeepOriginalFormat() throws ComException;
  @DeclDISPID(1610678281)  public void setKeepOriginalFormat(Boolean pfkeep) throws ComException;
  @DeclDISPID(1610678283)  public void PictureChanged() throws ComException;
  @DeclDISPID(1610678284)  public void SaveAsFile(byte[] pstm, Boolean fSaveMemCopy, ByRef<Integer> pcbSize) throws ComException;
  @DeclDISPID(1610678285)  public Integer getAttributes() throws ComException;
  @DeclDISPID(1610678286)  public void SetHdc(OLE_HANDLE hdc) throws ComException;
}
