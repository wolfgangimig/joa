/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlUnderlineStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{9B1665EA-5EA9-4D9B-9B61-D6D1E7C087E2}")
public class XlUnderlineStyle {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlUnderlineStyle xlUnderlineStyleDouble = new XlUnderlineStyle(-4119);
  public final static XlUnderlineStyle xlUnderlineStyleDoubleAccounting = new XlUnderlineStyle(5);
  public final static XlUnderlineStyle xlUnderlineStyleNone = new XlUnderlineStyle(-4142);
  public final static XlUnderlineStyle xlUnderlineStyleSingle = new XlUnderlineStyle(2);
  public final static XlUnderlineStyle xlUnderlineStyleSingleAccounting = new XlUnderlineStyle(4);

  // Integer constants for bitsets and switch statements
  public final static int _xlUnderlineStyleDouble = -4119;
  public final static int _xlUnderlineStyleDoubleAccounting = 5;
  public final static int _xlUnderlineStyleNone = -4142;
  public final static int _xlUnderlineStyleSingle = 2;
  public final static int _xlUnderlineStyleSingleAccounting = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlUnderlineStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlUnderlineStyle valueOf(int value) {
    switch(value) {
    case -4119: return xlUnderlineStyleDouble;
    case 5: return xlUnderlineStyleDoubleAccounting;
    case -4142: return xlUnderlineStyleNone;
    case 2: return xlUnderlineStyleSingle;
    case 4: return xlUnderlineStyleSingleAccounting;
    default: return new XlUnderlineStyle(value);
    }
  }
}
