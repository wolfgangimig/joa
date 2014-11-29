/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlVAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlVAlign {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlVAlign xlVAlignBottom = new XlVAlign(-4107);
  public final static XlVAlign xlVAlignCenter = new XlVAlign(-4108);
  public final static XlVAlign xlVAlignDistributed = new XlVAlign(-4117);
  public final static XlVAlign xlVAlignJustify = new XlVAlign(-4130);
  public final static XlVAlign xlVAlignTop = new XlVAlign(-4160);

  // Integer constants for bitsets and switch statements
  public final static int _xlVAlignBottom = -4107;
  public final static int _xlVAlignCenter = -4108;
  public final static int _xlVAlignDistributed = -4117;
  public final static int _xlVAlignJustify = -4130;
  public final static int _xlVAlignTop = -4160;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlVAlign(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlVAlign valueOf(int value) {
    switch(value) {
    case -4107: return xlVAlignBottom;
    case -4108: return xlVAlignCenter;
    case -4117: return xlVAlignDistributed;
    case -4130: return xlVAlignJustify;
    case -4160: return xlVAlignTop;
    default: return new XlVAlign(value);
    }
  }
}
