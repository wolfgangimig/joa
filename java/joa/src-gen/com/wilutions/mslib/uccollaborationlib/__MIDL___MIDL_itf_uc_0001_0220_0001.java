/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0220_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0220_0001 {
  ucAnnotationToolTelepointer(0),
  ucAnnotationToolDrawLine(1),
  ucAnnotationToolDrawArrowLine(2),
  ucAnnotationToolDrawDoubleArrowLine(3),
  ucAnnotationToolDrawRectangle(4),
  ucAnnotationToolDrawEllipse(5),
  ucAnnotationToolDrawPen(6),
  ucAnnotationToolDrawHighlighter(7),
  ucAnnotationToolPutCheckStamp(8),
  ucAnnotationToolPutArrowStamp(9),
  ucAnnotationToolPutXStamp(10),
  ucAnnotationToolMAX(11);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0220_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0220_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucAnnotationToolTelepointer;
    case 1: return ucAnnotationToolDrawLine;
    case 2: return ucAnnotationToolDrawArrowLine;
    case 3: return ucAnnotationToolDrawDoubleArrowLine;
    case 4: return ucAnnotationToolDrawRectangle;
    case 5: return ucAnnotationToolDrawEllipse;
    case 6: return ucAnnotationToolDrawPen;
    case 7: return ucAnnotationToolDrawHighlighter;
    case 8: return ucAnnotationToolPutCheckStamp;
    case 9: return ucAnnotationToolPutArrowStamp;
    case 10: return ucAnnotationToolPutXStamp;
    case 11: return ucAnnotationToolMAX;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0220_0001.class);
    }
  }
}
