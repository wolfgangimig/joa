/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoHorizontalAnchor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoHorizontalAnchor {
  msoHorizontalAnchorMixed(-2),
  msoAnchorNone(1),
  msoAnchorCenter(2);

  public final int value;
  private MsoHorizontalAnchor(int value) { this.value = value; }
  public static  MsoHorizontalAnchor valueOf(int value) {
    switch(value) {
    case -2: return msoHorizontalAnchorMixed;
    case 1: return msoAnchorNone;
    case 2: return msoAnchorCenter;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoHorizontalAnchor.class);
    }
  }
}
