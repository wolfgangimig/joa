/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextChangeCase.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextChangeCase {
  msoCaseSentence(1),
  msoCaseLower(2),
  msoCaseUpper(3),
  msoCaseTitle(4),
  msoCaseToggle(5);

  public final int value;
  private MsoTextChangeCase(int value) { this.value = value; }
  public static  MsoTextChangeCase valueOf(int value) {
    switch(value) {
    case 1: return msoCaseSentence;
    case 2: return msoCaseLower;
    case 3: return msoCaseUpper;
    case 4: return msoCaseTitle;
    case 5: return msoCaseToggle;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextChangeCase.class);
    }
  }
}
