/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoEditingType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoEditingType {
  msoEditingAuto(0),
  msoEditingCorner(1),
  msoEditingSmooth(2),
  msoEditingSymmetric(3);

  public final int value;
  private MsoEditingType(int value) { this.value = value; }
  public static  MsoEditingType valueOf(int value) {
    switch(value) {
    case 0: return msoEditingAuto;
    case 1: return msoEditingCorner;
    case 2: return msoEditingSmooth;
    case 3: return msoEditingSymmetric;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoEditingType.class);
    }
  }
}
