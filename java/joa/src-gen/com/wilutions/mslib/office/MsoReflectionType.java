/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoReflectionType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoReflectionType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoReflectionType msoReflectionTypeMixed = new MsoReflectionType(-2);
  public final static MsoReflectionType msoReflectionTypeNone = new MsoReflectionType(0);
  public final static MsoReflectionType msoReflectionType1 = new MsoReflectionType(1);
  public final static MsoReflectionType msoReflectionType2 = new MsoReflectionType(2);
  public final static MsoReflectionType msoReflectionType3 = new MsoReflectionType(3);
  public final static MsoReflectionType msoReflectionType4 = new MsoReflectionType(4);
  public final static MsoReflectionType msoReflectionType5 = new MsoReflectionType(5);
  public final static MsoReflectionType msoReflectionType6 = new MsoReflectionType(6);
  public final static MsoReflectionType msoReflectionType7 = new MsoReflectionType(7);
  public final static MsoReflectionType msoReflectionType8 = new MsoReflectionType(8);
  public final static MsoReflectionType msoReflectionType9 = new MsoReflectionType(9);

  // Integer constants for bitsets and switch statements
  public final static int _msoReflectionTypeMixed = -2;
  public final static int _msoReflectionTypeNone = 0;
  public final static int _msoReflectionType1 = 1;
  public final static int _msoReflectionType2 = 2;
  public final static int _msoReflectionType3 = 3;
  public final static int _msoReflectionType4 = 4;
  public final static int _msoReflectionType5 = 5;
  public final static int _msoReflectionType6 = 6;
  public final static int _msoReflectionType7 = 7;
  public final static int _msoReflectionType8 = 8;
  public final static int _msoReflectionType9 = 9;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoReflectionType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoReflectionType valueOf(int value) {
    switch(value) {
    case -2: return msoReflectionTypeMixed;
    case 0: return msoReflectionTypeNone;
    case 1: return msoReflectionType1;
    case 2: return msoReflectionType2;
    case 3: return msoReflectionType3;
    case 4: return msoReflectionType4;
    case 5: return msoReflectionType5;
    case 6: return msoReflectionType6;
    case 7: return msoReflectionType7;
    case 8: return msoReflectionType8;
    case 9: return msoReflectionType9;
    default: return new MsoReflectionType(value);
    }
  }
}
