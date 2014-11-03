/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAutoSize.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoAutoSize {
  msoAutoSizeMixed(-2),
  msoAutoSizeNone(0),
  msoAutoSizeShapeToFitText(1),
  msoAutoSizeTextToFitShape(2);

  public final int value;
  private MsoAutoSize(int value) { this.value = value; }
  public static  MsoAutoSize valueOf(int value) {
    switch(value) {
    case -2: return msoAutoSizeMixed;
    case 0: return msoAutoSizeNone;
    case 1: return msoAutoSizeShapeToFitText;
    case 2: return msoAutoSizeTextToFitShape;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoAutoSize.class);
    }
  }
}
