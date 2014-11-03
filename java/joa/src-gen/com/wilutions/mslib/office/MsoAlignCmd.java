/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAlignCmd.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoAlignCmd {
  msoAlignLefts(0),
  msoAlignCenters(1),
  msoAlignRights(2),
  msoAlignTops(3),
  msoAlignMiddles(4),
  msoAlignBottoms(5);

  public final int value;
  private MsoAlignCmd(int value) { this.value = value; }
  public static  MsoAlignCmd valueOf(int value) {
    switch(value) {
    case 0: return msoAlignLefts;
    case 1: return msoAlignCenters;
    case 2: return msoAlignRights;
    case 3: return msoAlignTops;
    case 4: return msoAlignMiddles;
    case 5: return msoAlignBottoms;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoAlignCmd.class);
    }
  }
}
