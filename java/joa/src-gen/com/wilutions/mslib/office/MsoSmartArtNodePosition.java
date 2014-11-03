/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSmartArtNodePosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSmartArtNodePosition {
  msoSmartArtNodeDefault(1),
  msoSmartArtNodeAfter(2),
  msoSmartArtNodeBefore(3),
  msoSmartArtNodeAbove(4),
  msoSmartArtNodeBelow(5);

  public final int value;
  private MsoSmartArtNodePosition(int value) { this.value = value; }
  public static  MsoSmartArtNodePosition valueOf(int value) {
    switch(value) {
    case 1: return msoSmartArtNodeDefault;
    case 2: return msoSmartArtNodeAfter;
    case 3: return msoSmartArtNodeBefore;
    case 4: return msoSmartArtNodeAbove;
    case 5: return msoSmartArtNodeBelow;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSmartArtNodePosition.class);
    }
  }
}
