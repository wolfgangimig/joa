/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBarType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBarType {
  msoBarTypeNormal(0),
  msoBarTypeMenuBar(1),
  msoBarTypePopup(2);

  public final int value;
  private MsoBarType(int value) { this.value = value; }
  public static  MsoBarType valueOf(int value) {
    switch(value) {
    case 0: return msoBarTypeNormal;
    case 1: return msoBarTypeMenuBar;
    case 2: return msoBarTypePopup;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBarType.class);
    }
  }
}
