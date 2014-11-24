/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDistributeCmd.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoDistributeCmd {

  // Typed constants
  public final static MsoDistributeCmd msoDistributeHorizontally = new MsoDistributeCmd(0);
  public final static MsoDistributeCmd msoDistributeVertically = new MsoDistributeCmd(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoDistributeHorizontally = 0;
  public final static int _msoDistributeVertically = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoDistributeCmd(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoDistributeCmd valueOf(int value) {
    switch(value) {
    case 0: return msoDistributeHorizontally;
    case 1: return msoDistributeVertically;
    default: return new MsoDistributeCmd(value);
    }
  }
}
