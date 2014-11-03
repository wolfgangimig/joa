/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDocProperties.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoDocProperties {
  msoPropertyTypeNumber(1),
  msoPropertyTypeBoolean(2),
  msoPropertyTypeDate(3),
  msoPropertyTypeString(4),
  msoPropertyTypeFloat(5);

  public final int value;
  private MsoDocProperties(int value) { this.value = value; }
  public static  MsoDocProperties valueOf(int value) {
    switch(value) {
    case 1: return msoPropertyTypeNumber;
    case 2: return msoPropertyTypeBoolean;
    case 3: return msoPropertyTypeDate;
    case 4: return msoPropertyTypeString;
    case 5: return msoPropertyTypeFloat;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoDocProperties.class);
    }
  }
}
