/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlHAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlHAlign {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlHAlign xlHAlignCenter = new XlHAlign(-4108);
  public final static XlHAlign xlHAlignCenterAcrossSelection = new XlHAlign(7);
  public final static XlHAlign xlHAlignDistributed = new XlHAlign(-4117);
  public final static XlHAlign xlHAlignFill = new XlHAlign(5);
  public final static XlHAlign xlHAlignGeneral = new XlHAlign(1);
  public final static XlHAlign xlHAlignJustify = new XlHAlign(-4130);
  public final static XlHAlign xlHAlignLeft = new XlHAlign(-4131);
  public final static XlHAlign xlHAlignRight = new XlHAlign(-4152);

  // Integer constants for bitsets and switch statements
  public final static int _xlHAlignCenter = -4108;
  public final static int _xlHAlignCenterAcrossSelection = 7;
  public final static int _xlHAlignDistributed = -4117;
  public final static int _xlHAlignFill = 5;
  public final static int _xlHAlignGeneral = 1;
  public final static int _xlHAlignJustify = -4130;
  public final static int _xlHAlignLeft = -4131;
  public final static int _xlHAlignRight = -4152;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlHAlign(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlHAlign valueOf(int value) {
    switch(value) {
    case -4108: return xlHAlignCenter;
    case 7: return xlHAlignCenterAcrossSelection;
    case -4117: return xlHAlignDistributed;
    case 5: return xlHAlignFill;
    case 1: return xlHAlignGeneral;
    case -4130: return xlHAlignJustify;
    case -4131: return xlHAlignLeft;
    case -4152: return xlHAlignRight;
    default: return new XlHAlign(value);
    }
  }
}
