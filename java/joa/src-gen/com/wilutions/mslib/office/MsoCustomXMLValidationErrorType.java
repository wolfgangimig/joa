/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCustomXMLValidationErrorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoCustomXMLValidationErrorType {
  msoCustomXMLValidationErrorSchemaGenerated(0),
  msoCustomXMLValidationErrorAutomaticallyCleared(1),
  msoCustomXMLValidationErrorManual(2);

  public final int value;
  private MsoCustomXMLValidationErrorType(int value) { this.value = value; }
  public static  MsoCustomXMLValidationErrorType valueOf(int value) {
    switch(value) {
    case 0: return msoCustomXMLValidationErrorSchemaGenerated;
    case 1: return msoCustomXMLValidationErrorAutomaticallyCleared;
    case 2: return msoCustomXMLValidationErrorManual;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoCustomXMLValidationErrorType.class);
    }
  }
}
