/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLineFillType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoLineFillType {
  msoLineFillMixed(-2),
  msoLineFillNone(0),
  msoLineFillSolid(1),
  msoLineFillPatterned(2),
  msoLineFillGradient(3),
  msoLineFillTextured(4),
  msoLineFillBackground(5),
  msoLineFillPicture(6);

  public final int value;
  private MsoLineFillType(int value) { this.value = value; }
  public static  MsoLineFillType valueOf(int value) {
    switch(value) {
    case -2: return msoLineFillMixed;
    case 0: return msoLineFillNone;
    case 1: return msoLineFillSolid;
    case 2: return msoLineFillPatterned;
    case 3: return msoLineFillGradient;
    case 4: return msoLineFillTextured;
    case 5: return msoLineFillBackground;
    case 6: return msoLineFillPicture;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoLineFillType.class);
    }
  }
}
