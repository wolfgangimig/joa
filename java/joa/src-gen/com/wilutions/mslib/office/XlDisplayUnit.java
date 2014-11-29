/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlDisplayUnit.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{BF78D790-8DCF-4CF1-9CD4-4FCEB78EBE14}")
public class XlDisplayUnit {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlDisplayUnit xlHundreds = new XlDisplayUnit(-2);
  public final static XlDisplayUnit xlThousands = new XlDisplayUnit(-3);
  public final static XlDisplayUnit xlTenThousands = new XlDisplayUnit(-4);
  public final static XlDisplayUnit xlHundredThousands = new XlDisplayUnit(-5);
  public final static XlDisplayUnit xlMillions = new XlDisplayUnit(-6);
  public final static XlDisplayUnit xlTenMillions = new XlDisplayUnit(-7);
  public final static XlDisplayUnit xlHundredMillions = new XlDisplayUnit(-8);
  public final static XlDisplayUnit xlThousandMillions = new XlDisplayUnit(-9);
  public final static XlDisplayUnit xlMillionMillions = new XlDisplayUnit(-10);
  public final static XlDisplayUnit xlDisplayUnitCustom = new XlDisplayUnit(-4114);
  public final static XlDisplayUnit xlDisplayUnitNone = new XlDisplayUnit(-4142);

  // Integer constants for bitsets and switch statements
  public final static int _xlHundreds = -2;
  public final static int _xlThousands = -3;
  public final static int _xlTenThousands = -4;
  public final static int _xlHundredThousands = -5;
  public final static int _xlMillions = -6;
  public final static int _xlTenMillions = -7;
  public final static int _xlHundredMillions = -8;
  public final static int _xlThousandMillions = -9;
  public final static int _xlMillionMillions = -10;
  public final static int _xlDisplayUnitCustom = -4114;
  public final static int _xlDisplayUnitNone = -4142;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlDisplayUnit(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new XlDisplayUnit(value);
    }
  }
}
