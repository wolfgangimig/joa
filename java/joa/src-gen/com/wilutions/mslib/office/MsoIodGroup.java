/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoIodGroup.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{750D0562-9930-40DD-9DA7-887B50F2111F}")
public enum MsoIodGroup {
  msoIodGroupPIAs(0),
  msoIodGroupVSTOR35Mgd(1),
  msoIodGroupVSTOR40Mgd(2);

  public final int value;
  private MsoIodGroup(int value) { this.value = value; }
  public static  MsoIodGroup valueOf(int value) {
    switch(value) {
    case 0: return msoIodGroupPIAs;
    case 1: return msoIodGroupVSTOR35Mgd;
    case 2: return msoIodGroupVSTOR40Mgd;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoIodGroup.class);
    }
  }
}
