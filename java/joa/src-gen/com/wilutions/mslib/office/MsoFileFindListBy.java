/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileFindListBy.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFileFindListBy {
  msoListbyName(1),
  msoListbyTitle(2);

  public final int value;
  private MsoFileFindListBy(int value) { this.value = value; }
  public static  MsoFileFindListBy valueOf(int value) {
    switch(value) {
    case 1: return msoListbyName;
    case 2: return msoListbyTitle;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFileFindListBy.class);
    }
  }
}
