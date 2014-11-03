/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDistributeCmd.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoDistributeCmd {
  msoDistributeHorizontally(0),
  msoDistributeVertically(1);

  public final int value;
  private MsoDistributeCmd(int value) { this.value = value; }
  public static  MsoDistributeCmd valueOf(int value) {
    switch(value) {
    case 0: return msoDistributeHorizontally;
    case 1: return msoDistributeVertically;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoDistributeCmd.class);
    }
  }
}
