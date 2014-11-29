/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlTickMark.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{E5EAD0BB-3A16-48F3-BECD-5839F6B552CA}")
public class XlTickMark {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlTickMark xlTickMarkCross = new XlTickMark(4);
  public final static XlTickMark xlTickMarkInside = new XlTickMark(2);
  public final static XlTickMark xlTickMarkNone = new XlTickMark(-4142);
  public final static XlTickMark xlTickMarkOutside = new XlTickMark(3);

  // Integer constants for bitsets and switch statements
  public final static int _xlTickMarkCross = 4;
  public final static int _xlTickMarkInside = 2;
  public final static int _xlTickMarkNone = -4142;
  public final static int _xlTickMarkOutside = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlTickMark(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlTickMark valueOf(int value) {
    switch(value) {
    case 4: return xlTickMarkCross;
    case 2: return xlTickMarkInside;
    case -4142: return xlTickMarkNone;
    case 3: return xlTickMarkOutside;
    default: return new XlTickMark(value);
    }
  }
}
