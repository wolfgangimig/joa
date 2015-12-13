/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BB6F90EA-1B51-CB5B-1615-694DA5C7F051}")
public class PictureImpl extends Dispatch implements com.wilutions.mslib.stdole.Picture {
  @DeclDISPID(6)  public void Render(final Integer hdc, final Integer x, final Integer y, final Integer cx, final Integer cy, final com.wilutions.mslib.stdole.OLE_XPOS_HIMETRIC xSrc, final com.wilutions.mslib.stdole.OLE_YPOS_HIMETRIC ySrc, final com.wilutions.mslib.stdole.OLE_XSIZE_HIMETRIC cxSrc, final com.wilutions.mslib.stdole.OLE_YSIZE_HIMETRIC cySrc, final byte[] prcWBounds) throws ComException {
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
    this._dispatchCall(6,"Render", DISPATCH_METHOD,null,hdc,x,y,cx,cy,xSrc.getValue(),ySrc.getValue(),cxSrc.getValue(),cySrc.getValue(),prcWBounds);
  }
  public PictureImpl(String progId) throws ComException {
    super(progId, "{7BF80981-BF32-101A-8BBB-00AA00300CAB}");
  }
  protected PictureImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PictureImpl" + super.toString() + "]";
  }
}
