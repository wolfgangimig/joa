/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoExtraInfoMethod.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoExtraInfoMethod {
  msoMethodGet(0),
  msoMethodPost(1);

  public final int value;
  private MsoExtraInfoMethod(int value) { this.value = value; }
  public static  MsoExtraInfoMethod valueOf(int value) {
    switch(value) {
    case 0: return msoMethodGet;
    case 1: return msoMethodPost;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoExtraInfoMethod.class);
    }
  }
}
