/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPathFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPathFormat {
  msoPathTypeMixed(-2),
  msoPathTypeNone(0),
  msoPathType1(1),
  msoPathType2(2),
  msoPathType3(3),
  msoPathType4(4);

  public final int value;
  private MsoPathFormat(int value) { this.value = value; }
  public static  MsoPathFormat valueOf(int value) {
    switch(value) {
    case -2: return msoPathTypeMixed;
    case 0: return msoPathTypeNone;
    case 1: return msoPathType1;
    case 2: return msoPathType2;
    case 3: return msoPathType3;
    case 4: return msoPathType4;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPathFormat.class);
    }
  }
}
