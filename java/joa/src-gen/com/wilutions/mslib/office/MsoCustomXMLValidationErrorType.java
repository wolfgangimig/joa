/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCustomXMLValidationErrorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCustomXMLValidationErrorType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoCustomXMLValidationErrorType msoCustomXMLValidationErrorSchemaGenerated = new MsoCustomXMLValidationErrorType(0);
  public final static MsoCustomXMLValidationErrorType msoCustomXMLValidationErrorAutomaticallyCleared = new MsoCustomXMLValidationErrorType(1);
  public final static MsoCustomXMLValidationErrorType msoCustomXMLValidationErrorManual = new MsoCustomXMLValidationErrorType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoCustomXMLValidationErrorSchemaGenerated = 0;
  public final static int _msoCustomXMLValidationErrorAutomaticallyCleared = 1;
  public final static int _msoCustomXMLValidationErrorManual = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoCustomXMLValidationErrorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoCustomXMLValidationErrorType valueOf(int value) {
    switch(value) {
    case 0: return msoCustomXMLValidationErrorSchemaGenerated;
    case 1: return msoCustomXMLValidationErrorAutomaticallyCleared;
    case 2: return msoCustomXMLValidationErrorManual;
    default: return new MsoCustomXMLValidationErrorType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoCustomXMLValidationErrorSchemaGenerated";
    case 1: return "msoCustomXMLValidationErrorAutomaticallyCleared";
    case 2: return "msoCustomXMLValidationErrorManual";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoCustomXMLValidationErrorSchemaGenerated");
      if ((value & 1) != 0) sbuf.append("|msoCustomXMLValidationErrorAutomaticallyCleared");
      if ((value & 2) != 0) sbuf.append("|msoCustomXMLValidationErrorManual");
      return sbuf.toString();
      }
    }
  }
}
