/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSmartArtNodePosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSmartArtNodePosition {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoSmartArtNodePosition msoSmartArtNodeDefault = new MsoSmartArtNodePosition(1);
  public final static MsoSmartArtNodePosition msoSmartArtNodeAfter = new MsoSmartArtNodePosition(2);
  public final static MsoSmartArtNodePosition msoSmartArtNodeBefore = new MsoSmartArtNodePosition(3);
  public final static MsoSmartArtNodePosition msoSmartArtNodeAbove = new MsoSmartArtNodePosition(4);
  public final static MsoSmartArtNodePosition msoSmartArtNodeBelow = new MsoSmartArtNodePosition(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoSmartArtNodeDefault = 1;
  public final static int _msoSmartArtNodeAfter = 2;
  public final static int _msoSmartArtNodeBefore = 3;
  public final static int _msoSmartArtNodeAbove = 4;
  public final static int _msoSmartArtNodeBelow = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSmartArtNodePosition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSmartArtNodePosition valueOf(int value) {
    switch(value) {
    case 1: return msoSmartArtNodeDefault;
    case 2: return msoSmartArtNodeAfter;
    case 3: return msoSmartArtNodeBefore;
    case 4: return msoSmartArtNodeAbove;
    case 5: return msoSmartArtNodeBelow;
    default: return new MsoSmartArtNodePosition(value);
    }
  }
}
