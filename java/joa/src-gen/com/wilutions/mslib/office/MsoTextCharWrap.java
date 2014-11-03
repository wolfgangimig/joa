/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextCharWrap.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextCharWrap {
  msoCharWrapMixed(-2),
  msoNoCharWrap(0),
  msoStandardCharWrap(1),
  msoStrictCharWrap(2),
  msoCustomCharWrap(3);

  public final int value;
  private MsoTextCharWrap(int value) { this.value = value; }
  public static  MsoTextCharWrap valueOf(int value) {
    switch(value) {
    case -2: return msoCharWrapMixed;
    case 0: return msoNoCharWrap;
    case 1: return msoStandardCharWrap;
    case 2: return msoStrictCharWrap;
    case 3: return msoCustomCharWrap;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextCharWrap.class);
    }
  }
}
