/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0220_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0220_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolTelepointer = new __MIDL___MIDL_itf_uc_0001_0220_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolDrawLine = new __MIDL___MIDL_itf_uc_0001_0220_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolDrawArrowLine = new __MIDL___MIDL_itf_uc_0001_0220_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolDrawDoubleArrowLine = new __MIDL___MIDL_itf_uc_0001_0220_0001(3);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolDrawRectangle = new __MIDL___MIDL_itf_uc_0001_0220_0001(4);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolDrawEllipse = new __MIDL___MIDL_itf_uc_0001_0220_0001(5);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolDrawPen = new __MIDL___MIDL_itf_uc_0001_0220_0001(6);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolDrawHighlighter = new __MIDL___MIDL_itf_uc_0001_0220_0001(7);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolPutCheckStamp = new __MIDL___MIDL_itf_uc_0001_0220_0001(8);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolPutArrowStamp = new __MIDL___MIDL_itf_uc_0001_0220_0001(9);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolPutXStamp = new __MIDL___MIDL_itf_uc_0001_0220_0001(10);
  public final static __MIDL___MIDL_itf_uc_0001_0220_0001 ucAnnotationToolMAX = new __MIDL___MIDL_itf_uc_0001_0220_0001(11);

  // Integer constants for bitsets and switch statements
  public final static int _ucAnnotationToolTelepointer = 0;
  public final static int _ucAnnotationToolDrawLine = 1;
  public final static int _ucAnnotationToolDrawArrowLine = 2;
  public final static int _ucAnnotationToolDrawDoubleArrowLine = 3;
  public final static int _ucAnnotationToolDrawRectangle = 4;
  public final static int _ucAnnotationToolDrawEllipse = 5;
  public final static int _ucAnnotationToolDrawPen = 6;
  public final static int _ucAnnotationToolDrawHighlighter = 7;
  public final static int _ucAnnotationToolPutCheckStamp = 8;
  public final static int _ucAnnotationToolPutArrowStamp = 9;
  public final static int _ucAnnotationToolPutXStamp = 10;
  public final static int _ucAnnotationToolMAX = 11;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0220_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new __MIDL___MIDL_itf_uc_0001_0220_0001(value);
    }
  }
}
