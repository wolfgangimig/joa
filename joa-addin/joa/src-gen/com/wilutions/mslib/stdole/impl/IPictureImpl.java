/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BB6F90EB-1B51-CB5B-1615-694DA5C7F051}")
public class IPictureImpl extends Dispatch implements com.wilutions.mslib.stdole.IPicture {
  @DeclDISPID(1610678272)  public com.wilutions.mslib.stdole.OLE_HANDLE getHandle() throws ComException {
    final Object obj = this._dispatchCall(1610678272,"Handle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_HANDLE(als);
  }
  @DeclDISPID(1610678273)  public com.wilutions.mslib.stdole.OLE_HANDLE gethPal() throws ComException {
    final Object obj = this._dispatchCall(1610678273,"hPal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_HANDLE(als);
  }
  @DeclDISPID(1610678274)  public Short getType() throws ComException {
    final Object obj = this._dispatchCall(1610678274,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Short)obj;
  }
  @DeclDISPID(1610678275)  public com.wilutions.mslib.stdole.OLE_XSIZE_HIMETRIC getWidth() throws ComException {
    final Object obj = this._dispatchCall(1610678275,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_XSIZE_HIMETRIC(als);
  }
  @DeclDISPID(1610678276)  public com.wilutions.mslib.stdole.OLE_YSIZE_HIMETRIC getHeight() throws ComException {
    final Object obj = this._dispatchCall(1610678276,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_YSIZE_HIMETRIC(als);
  }
  @DeclDISPID(1610678277)  public void Render(final Integer hdc, final Integer x, final Integer y, final Integer cx, final Integer cy, final com.wilutions.mslib.stdole.OLE_XPOS_HIMETRIC xSrc, final com.wilutions.mslib.stdole.OLE_YPOS_HIMETRIC ySrc, final com.wilutions.mslib.stdole.OLE_XSIZE_HIMETRIC cxSrc, final com.wilutions.mslib.stdole.OLE_YSIZE_HIMETRIC cySrc, final byte[] prcWBounds) throws ComException {
    assert(hdc != null);
    assert(x != null);
    assert(y != null);
    assert(cx != null);
    assert(cy != null);
    assert(xSrc != null);
    assert(ySrc != null);
    assert(cxSrc != null);
    assert(cySrc != null);
    assert(prcWBounds != null);
    this._dispatchCall(1610678277,"Render", DISPATCH_METHOD,null,hdc,x,y,cx,cy,xSrc.getValue(),ySrc.getValue(),cxSrc.getValue(),cySrc.getValue(),prcWBounds);
  }
  @DeclDISPID(1610678273)  public void sethPal(final com.wilutions.mslib.stdole.OLE_HANDLE phpal) throws ComException {
    assert(phpal != null);
    this._dispatchCall(1610678273,"hPal", DISPATCH_PROPERTYPUT,phpal.getValue());
  }
  @DeclDISPID(1610678279)  public Integer getCurDC() throws ComException {
    final Object obj = this._dispatchCall(1610678279,"CurDC", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610678280)  public void SelectPicture(final Integer hdcIn, final ByRef<Integer> phdcOut, final ByRef<com.wilutions.mslib.stdole.OLE_HANDLE> phbmpOut) throws ComException {
    assert(hdcIn != null);
    assert(phdcOut != null);
    assert(phbmpOut != null);
    this._dispatchCall(1610678280,"SelectPicture", DISPATCH_METHOD,null,hdcIn,phdcOut,phbmpOut);
  }
  @DeclDISPID(1610678281)  public Boolean getKeepOriginalFormat() throws ComException {
    final Object obj = this._dispatchCall(1610678281,"KeepOriginalFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610678281)  public void setKeepOriginalFormat(final Boolean pfkeep) throws ComException {
    assert(pfkeep != null);
    this._dispatchCall(1610678281,"KeepOriginalFormat", DISPATCH_PROPERTYPUT,pfkeep);
  }
  @DeclDISPID(1610678283)  public void PictureChanged() throws ComException {
    this._dispatchCall(1610678283,"PictureChanged", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610678284)  public void SaveAsFile(final byte[] pstm, final Boolean fSaveMemCopy, final ByRef<Integer> pcbSize) throws ComException {
    assert(pstm != null);
    assert(fSaveMemCopy != null);
    assert(pcbSize != null);
    this._dispatchCall(1610678284,"SaveAsFile", DISPATCH_METHOD,null,pstm,fSaveMemCopy,pcbSize);
  }
  @DeclDISPID(1610678285)  public Integer getAttributes() throws ComException {
    final Object obj = this._dispatchCall(1610678285,"Attributes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610678286)  public void SetHdc(final com.wilutions.mslib.stdole.OLE_HANDLE hdc) throws ComException {
    assert(hdc != null);
    this._dispatchCall(1610678286,"SetHdc", DISPATCH_METHOD,null,hdc.getValue());
  }
  public IPictureImpl(String progId) throws ComException {
    super(progId, "{7BF80980-BF32-101A-8BBB-00AA00300CAB}");
  }
  protected IPictureImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPictureImpl" + super.toString() + "]";
  }
}
