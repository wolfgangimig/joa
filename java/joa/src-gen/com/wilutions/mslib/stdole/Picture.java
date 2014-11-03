/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole;
import com.wilutions.com.*;

/**
 * Picture.
 * 
 */
@CoInterface(guid="{7BF80981-BF32-101A-8BBB-00AA00300CAB}")
public interface Picture extends IDispatch {
  @DeclDISPID(6)  public void Render(Integer hdc, Integer x, Integer y, Integer cx, Integer cy, OLE_XPOS_HIMETRIC xSrc, OLE_YPOS_HIMETRIC ySrc, OLE_XSIZE_HIMETRIC cxSrc, OLE_YSIZE_HIMETRIC cySrc, byte[] prcWBounds) throws ComException;
}
