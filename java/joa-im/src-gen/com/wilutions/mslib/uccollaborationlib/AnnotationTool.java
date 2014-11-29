/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AnnotationTool.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class AnnotationTool {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static AnnotationTool ucAnnotationToolTelepointer = new AnnotationTool(0);
  public final static AnnotationTool ucAnnotationToolDrawLine = new AnnotationTool(1);
  public final static AnnotationTool ucAnnotationToolDrawArrowLine = new AnnotationTool(2);
  public final static AnnotationTool ucAnnotationToolDrawDoubleArrowLine = new AnnotationTool(3);
  public final static AnnotationTool ucAnnotationToolDrawRectangle = new AnnotationTool(4);
  public final static AnnotationTool ucAnnotationToolDrawEllipse = new AnnotationTool(5);
  public final static AnnotationTool ucAnnotationToolDrawPen = new AnnotationTool(6);
  public final static AnnotationTool ucAnnotationToolDrawHighlighter = new AnnotationTool(7);
  public final static AnnotationTool ucAnnotationToolPutCheckStamp = new AnnotationTool(8);
  public final static AnnotationTool ucAnnotationToolPutArrowStamp = new AnnotationTool(9);
  public final static AnnotationTool ucAnnotationToolPutXStamp = new AnnotationTool(10);
  public final static AnnotationTool ucAnnotationToolMAX = new AnnotationTool(11);

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
  private AnnotationTool(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  AnnotationTool valueOf(int value) {
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
    default: return new AnnotationTool(value);
    }
  }
}
