/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoMixedType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoMixedType {
  msoIntegerMixed(32768),
  msoSingleMixed(-2147483648);

  public final int value;
  private MsoMixedType(int value) { this.value = value; }
  public static  MsoMixedType valueOf(int value) {
    switch(value) {
    case 32768: return msoIntegerMixed;
    case -2147483648: return msoSingleMixed;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoMixedType.class);
    }
  }
}
