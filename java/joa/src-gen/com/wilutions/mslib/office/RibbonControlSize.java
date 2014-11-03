/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * RibbonControlSize.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum RibbonControlSize {
  RibbonControlSizeRegular(0),
  RibbonControlSizeLarge(1);

  public final int value;
  private RibbonControlSize(int value) { this.value = value; }
  public static  RibbonControlSize valueOf(int value) {
    switch(value) {
    case 0: return RibbonControlSizeRegular;
    case 1: return RibbonControlSizeLarge;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + RibbonControlSize.class);
    }
  }
}
