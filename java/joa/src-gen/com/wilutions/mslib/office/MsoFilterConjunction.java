/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFilterConjunction.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFilterConjunction {
  msoFilterConjunctionAnd(0),
  msoFilterConjunctionOr(1);

  public final int value;
  private MsoFilterConjunction(int value) { this.value = value; }
  public static  MsoFilterConjunction valueOf(int value) {
    switch(value) {
    case 0: return msoFilterConjunctionAnd;
    case 1: return msoFilterConjunctionOr;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFilterConjunction.class);
    }
  }
}
