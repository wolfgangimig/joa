/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlDisplayUnit.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{BF78D790-8DCF-4CF1-9CD4-4FCEB78EBE14}")
public enum XlDisplayUnit {
  xlHundreds(-2),
  xlThousands(-3),
  xlTenThousands(-4),
  xlHundredThousands(-5),
  xlMillions(-6),
  xlTenMillions(-7),
  xlHundredMillions(-8),
  xlThousandMillions(-9),
  xlMillionMillions(-10),
  xlDisplayUnitCustom(-4114),
  xlDisplayUnitNone(-4142);

  public final int value;
  private XlDisplayUnit(int value) { this.value = value; }
  public static  XlDisplayUnit valueOf(int value) {
    switch(value) {
    case -2: return xlHundreds;
    case -3: return xlThousands;
    case -4: return xlTenThousands;
    case -5: return xlHundredThousands;
    case -6: return xlMillions;
    case -7: return xlTenMillions;
    case -8: return xlHundredMillions;
    case -9: return xlThousandMillions;
    case -10: return xlMillionMillions;
    case -4114: return xlDisplayUnitCustom;
    case -4142: return xlDisplayUnitNone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlDisplayUnit.class);
    }
  }
}
