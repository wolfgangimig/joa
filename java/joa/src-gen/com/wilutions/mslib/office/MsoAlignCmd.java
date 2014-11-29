/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAlignCmd.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoAlignCmd {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoAlignCmd msoAlignLefts = new MsoAlignCmd(0);
  public final static MsoAlignCmd msoAlignCenters = new MsoAlignCmd(1);
  public final static MsoAlignCmd msoAlignRights = new MsoAlignCmd(2);
  public final static MsoAlignCmd msoAlignTops = new MsoAlignCmd(3);
  public final static MsoAlignCmd msoAlignMiddles = new MsoAlignCmd(4);
  public final static MsoAlignCmd msoAlignBottoms = new MsoAlignCmd(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoAlignLefts = 0;
  public final static int _msoAlignCenters = 1;
  public final static int _msoAlignRights = 2;
  public final static int _msoAlignTops = 3;
  public final static int _msoAlignMiddles = 4;
  public final static int _msoAlignBottoms = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoAlignCmd(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoAlignCmd valueOf(int value) {
    switch(value) {
    case 0: return msoAlignLefts;
    case 1: return msoAlignCenters;
    case 2: return msoAlignRights;
    case 3: return msoAlignTops;
    case 4: return msoAlignMiddles;
    case 5: return msoAlignBottoms;
    default: return new MsoAlignCmd(value);
    }
  }
}
