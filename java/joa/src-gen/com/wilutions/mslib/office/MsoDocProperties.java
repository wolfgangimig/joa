/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDocProperties.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoDocProperties {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoDocProperties msoPropertyTypeNumber = new MsoDocProperties(1);
  public final static MsoDocProperties msoPropertyTypeBoolean = new MsoDocProperties(2);
  public final static MsoDocProperties msoPropertyTypeDate = new MsoDocProperties(3);
  public final static MsoDocProperties msoPropertyTypeString = new MsoDocProperties(4);
  public final static MsoDocProperties msoPropertyTypeFloat = new MsoDocProperties(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoPropertyTypeNumber = 1;
  public final static int _msoPropertyTypeBoolean = 2;
  public final static int _msoPropertyTypeDate = 3;
  public final static int _msoPropertyTypeString = 4;
  public final static int _msoPropertyTypeFloat = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoDocProperties(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoDocProperties valueOf(int value) {
    switch(value) {
    case 1: return msoPropertyTypeNumber;
    case 2: return msoPropertyTypeBoolean;
    case 3: return msoPropertyTypeDate;
    case 4: return msoPropertyTypeString;
    case 5: return msoPropertyTypeFloat;
    default: return new MsoDocProperties(value);
    }
  }
}
