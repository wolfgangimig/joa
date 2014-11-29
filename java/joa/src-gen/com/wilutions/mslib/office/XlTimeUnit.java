/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlTimeUnit.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{14710A1D-071F-4BFF-B1C2-4BEF5E8B2CEA}")
public class XlTimeUnit {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlTimeUnit xlDays = new XlTimeUnit(0);
  public final static XlTimeUnit xlMonths = new XlTimeUnit(1);
  public final static XlTimeUnit xlYears = new XlTimeUnit(2);

  // Integer constants for bitsets and switch statements
  public final static int _xlDays = 0;
  public final static int _xlMonths = 1;
  public final static int _xlYears = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlTimeUnit(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlTimeUnit valueOf(int value) {
    switch(value) {
    case 0: return xlDays;
    case 1: return xlMonths;
    case 2: return xlYears;
    default: return new XlTimeUnit(value);
    }
  }
}
