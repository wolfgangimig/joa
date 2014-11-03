/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFillType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFillType {
  msoFillMixed(-2),
  msoFillSolid(1),
  msoFillPatterned(2),
  msoFillGradient(3),
  msoFillTextured(4),
  msoFillBackground(5),
  msoFillPicture(6);

  public final int value;
  private MsoFillType(int value) { this.value = value; }
  public static  MsoFillType valueOf(int value) {
    switch(value) {
    case -2: return msoFillMixed;
    case 1: return msoFillSolid;
    case 2: return msoFillPatterned;
    case 3: return msoFillGradient;
    case 4: return msoFillTextured;
    case 5: return msoFillBackground;
    case 6: return msoFillPicture;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFillType.class);
    }
  }
}
