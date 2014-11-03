/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoReflectionType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoReflectionType {
  msoReflectionTypeMixed(-2),
  msoReflectionTypeNone(0),
  msoReflectionType1(1),
  msoReflectionType2(2),
  msoReflectionType3(3),
  msoReflectionType4(4),
  msoReflectionType5(5),
  msoReflectionType6(6),
  msoReflectionType7(7),
  msoReflectionType8(8),
  msoReflectionType9(9);

  public final int value;
  private MsoReflectionType(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoReflectionType.class);
    }
  }
}
