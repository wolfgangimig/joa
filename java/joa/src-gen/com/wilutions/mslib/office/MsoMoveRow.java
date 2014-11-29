/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoMoveRow.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoMoveRow {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoMoveRow msoMoveRowFirst = new MsoMoveRow(-4);
  public final static MsoMoveRow msoMoveRowPrev = new MsoMoveRow(-3);
  public final static MsoMoveRow msoMoveRowNext = new MsoMoveRow(-2);
  public final static MsoMoveRow msoMoveRowNbr = new MsoMoveRow(-1);

  // Integer constants for bitsets and switch statements
  public final static int _msoMoveRowFirst = -4;
  public final static int _msoMoveRowPrev = -3;
  public final static int _msoMoveRowNext = -2;
  public final static int _msoMoveRowNbr = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoMoveRow(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoMoveRow valueOf(int value) {
    switch(value) {
    case -4: return msoMoveRowFirst;
    case -3: return msoMoveRowPrev;
    case -2: return msoMoveRowNext;
    case -1: return msoMoveRowNbr;
    default: return new MsoMoveRow(value);
    }
  }
}
