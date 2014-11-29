/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoIodGroup.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{750D0562-9930-40DD-9DA7-887B50F2111F}")
public class MsoIodGroup {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoIodGroup msoIodGroupPIAs = new MsoIodGroup(0);
  public final static MsoIodGroup msoIodGroupVSTOR35Mgd = new MsoIodGroup(1);
  public final static MsoIodGroup msoIodGroupVSTOR40Mgd = new MsoIodGroup(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoIodGroupPIAs = 0;
  public final static int _msoIodGroupVSTOR35Mgd = 1;
  public final static int _msoIodGroupVSTOR40Mgd = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoIodGroup(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoIodGroup valueOf(int value) {
    switch(value) {
    case 0: return msoIodGroupPIAs;
    case 1: return msoIodGroupVSTOR35Mgd;
    case 2: return msoIodGroupVSTOR40Mgd;
    default: return new MsoIodGroup(value);
    }
  }
}
