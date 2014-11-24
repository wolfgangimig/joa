/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoExtrusionColorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoExtrusionColorType {

  // Typed constants
  public final static MsoExtrusionColorType msoExtrusionColorTypeMixed = new MsoExtrusionColorType(-2);
  public final static MsoExtrusionColorType msoExtrusionColorAutomatic = new MsoExtrusionColorType(1);
  public final static MsoExtrusionColorType msoExtrusionColorCustom = new MsoExtrusionColorType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoExtrusionColorTypeMixed = -2;
  public final static int _msoExtrusionColorAutomatic = 1;
  public final static int _msoExtrusionColorCustom = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoExtrusionColorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoExtrusionColorType valueOf(int value) {
    switch(value) {
    case -2: return msoExtrusionColorTypeMixed;
    case 1: return msoExtrusionColorAutomatic;
    case 2: return msoExtrusionColorCustom;
    default: return new MsoExtrusionColorType(value);
    }
  }
}
