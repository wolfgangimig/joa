/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLineStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoLineStyle {
  msoLineStyleMixed(-2),
  msoLineSingle(1),
  msoLineThinThin(2),
  msoLineThinThick(3),
  msoLineThickThin(4),
  msoLineThickBetweenThin(5);

  public final int value;
  private MsoLineStyle(int value) { this.value = value; }
  public static  MsoLineStyle valueOf(int value) {
    switch(value) {
    case -2: return msoLineStyleMixed;
    case 1: return msoLineSingle;
    case 2: return msoLineThinThin;
    case 3: return msoLineThinThick;
    case 4: return msoLineThickThin;
    case 5: return msoLineThickBetweenThin;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoLineStyle.class);
    }
  }
}
