/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlTickMark.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{E5EAD0BB-3A16-48F3-BECD-5839F6B552CA}")
public enum XlTickMark {
  xlTickMarkCross(4),
  xlTickMarkInside(2),
  xlTickMarkNone(-4142),
  xlTickMarkOutside(3);

  public final int value;
  private XlTickMark(int value) { this.value = value; }
  public static  XlTickMark valueOf(int value) {
    switch(value) {
    case 4: return xlTickMarkCross;
    case 2: return xlTickMarkInside;
    case -4142: return xlTickMarkNone;
    case 3: return xlTickMarkOutside;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlTickMark.class);
    }
  }
}
