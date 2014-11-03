/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextTabAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextTabAlign {
  msoTabAlignMixed(-2),
  msoTabAlignLeft(0),
  msoTabAlignCenter(1),
  msoTabAlignRight(2),
  msoTabAlignDecimal(3);

  public final int value;
  private MsoTextTabAlign(int value) { this.value = value; }
  public static  MsoTextTabAlign valueOf(int value) {
    switch(value) {
    case -2: return msoTabAlignMixed;
    case 0: return msoTabAlignLeft;
    case 1: return msoTabAlignCenter;
    case 2: return msoTabAlignRight;
    case 3: return msoTabAlignDecimal;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextTabAlign.class);
    }
  }
}
