/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncCompareType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSyncCompareType {

  // Typed constants
  public final static MsoSyncCompareType msoSyncCompareAndMerge = new MsoSyncCompareType(0);
  public final static MsoSyncCompareType msoSyncCompareSideBySide = new MsoSyncCompareType(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoSyncCompareAndMerge = 0;
  public final static int _msoSyncCompareSideBySide = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSyncCompareType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSyncCompareType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncCompareAndMerge;
    case 1: return msoSyncCompareSideBySide;
    default: return new MsoSyncCompareType(value);
    }
  }
}
