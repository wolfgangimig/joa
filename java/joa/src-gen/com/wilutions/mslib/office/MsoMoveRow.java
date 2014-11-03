/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoMoveRow.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoMoveRow {
  msoMoveRowFirst(-4),
  msoMoveRowPrev(-3),
  msoMoveRowNext(-2),
  msoMoveRowNbr(-1);

  public final int value;
  private MsoMoveRow(int value) { this.value = value; }
  public static  MsoMoveRow valueOf(int value) {
    switch(value) {
    case -4: return msoMoveRowFirst;
    case -3: return msoMoveRowPrev;
    case -2: return msoMoveRowNext;
    case -1: return msoMoveRowNbr;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoMoveRow.class);
    }
  }
}
