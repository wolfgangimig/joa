/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatDuration.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatDuration {
  olFormatDurationShort(1),
  olFormatDurationLong(2),
  olFormatDurationShortBusiness(3),
  olFormatDurationLongBusiness(4);

  public final int value;
  private OlFormatDuration(int value) { this.value = value; }
  public static  OlFormatDuration valueOf(int value) {
    switch(value) {
    case 1: return olFormatDurationShort;
    case 2: return olFormatDurationLong;
    case 3: return olFormatDurationShortBusiness;
    case 4: return olFormatDurationLongBusiness;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatDuration.class);
    }
  }
}
