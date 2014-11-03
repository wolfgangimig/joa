/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BB6F90EA-1B51-CB5B-1615-694DA5C7F051}")
public class PictureImpl extends Dispatch implements com.wilutions.mslib.stdole.Picture {
  @DeclDISPID(6)  public void Render(Integer hdc, Integer x, Integer y, Integer cx, Integer cy, com.wilutions.mslib.stdole.OLE_XPOS_HIMETRIC xSrc, com.wilutions.mslib.stdole.OLE_YPOS_HIMETRIC ySrc, com.wilutions.mslib.stdole.OLE_XSIZE_HIMETRIC cxSrc, com.wilutions.mslib.stdole.OLE_YSIZE_HIMETRIC cySrc, byte[] prcWBounds) throws ComException {
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
    super(progId);
  }
  protected PictureImpl(long ndisp) {
    super(ndisp);
  }
  public PictureImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PictureImpl" + super.toString() + "]";
  }
}
