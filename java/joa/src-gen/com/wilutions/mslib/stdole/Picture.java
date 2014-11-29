/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole;
import com.wilutions.com.*;

/**
 * Picture.
 * 
 */
@CoInterface(guid="{7BF80981-BF32-101A-8BBB-00AA00300CAB}")
public interface Picture extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(6)  public void Render(final Integer hdc, final Integer x, final Integer y, final Integer cx, final Integer cy, final OLE_XPOS_HIMETRIC xSrc, final OLE_YPOS_HIMETRIC ySrc, final OLE_XSIZE_HIMETRIC cxSrc, final OLE_YSIZE_HIMETRIC cySrc, final byte[] prcWBounds) throws ComException;
}
