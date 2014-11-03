/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFlipCmd.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFlipCmd {
  msoFlipHorizontal(0),
  msoFlipVertical(1);

  public final int value;
  private MsoFlipCmd(int value) { this.value = value; }
  public static  MsoFlipCmd valueOf(int value) {
    switch(value) {
    case 0: return msoFlipHorizontal;
    case 1: return msoFlipVertical;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFlipCmd.class);
    }
  }
}
