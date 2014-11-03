/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextDirection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextDirection {
  msoTextDirectionMixed(-2),
  msoTextDirectionLeftToRight(1),
  msoTextDirectionRightToLeft(2);

  public final int value;
  private MsoTextDirection(int value) { this.value = value; }
  public static  MsoTextDirection valueOf(int value) {
    switch(value) {
    case -2: return msoTextDirectionMixed;
    case 1: return msoTextDirectionLeftToRight;
    case 2: return msoTextDirectionRightToLeft;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextDirection.class);
    }
  }
}
