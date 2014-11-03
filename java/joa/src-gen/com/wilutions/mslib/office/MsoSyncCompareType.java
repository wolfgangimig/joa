/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncCompareType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSyncCompareType {
  msoSyncCompareAndMerge(0),
  msoSyncCompareSideBySide(1);

  public final int value;
  private MsoSyncCompareType(int value) { this.value = value; }
  public static  MsoSyncCompareType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncCompareAndMerge;
    case 1: return msoSyncCompareSideBySide;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSyncCompareType.class);
    }
  }
}
