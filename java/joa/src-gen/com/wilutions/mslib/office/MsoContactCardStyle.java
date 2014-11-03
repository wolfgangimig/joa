/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoContactCardStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{0739EEEF-D856-414C-9494-F2F791FD1F22}")
public enum MsoContactCardStyle {
  msoContactCardHover(0),
  msoContactCardFull(1);

  public final int value;
  private MsoContactCardStyle(int value) { this.value = value; }
  public static  MsoContactCardStyle valueOf(int value) {
    switch(value) {
    case 0: return msoContactCardHover;
    case 1: return msoContactCardFull;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoContactCardStyle.class);
    }
  }
}
