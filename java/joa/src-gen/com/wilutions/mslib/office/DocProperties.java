/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DocProperties.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum DocProperties {
  offPropertyTypeNumber(1),
  offPropertyTypeBoolean(2),
  offPropertyTypeDate(3),
  offPropertyTypeString(4),
  offPropertyTypeFloat(5);

  public final int value;
  private DocProperties(int value) { this.value = value; }
  public static  DocProperties valueOf(int value) {
    switch(value) {
    case 1: return offPropertyTypeNumber;
    case 2: return offPropertyTypeBoolean;
    case 3: return offPropertyTypeDate;
    case 4: return offPropertyTypeString;
    case 5: return offPropertyTypeFloat;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + DocProperties.class);
    }
  }
}
