/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DocProperties.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class DocProperties implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static DocProperties offPropertyTypeNumber = new DocProperties(1);
  public final static DocProperties offPropertyTypeBoolean = new DocProperties(2);
  public final static DocProperties offPropertyTypeDate = new DocProperties(3);
  public final static DocProperties offPropertyTypeString = new DocProperties(4);
  public final static DocProperties offPropertyTypeFloat = new DocProperties(5);

  // Integer constants for bitsets and switch statements
  public final static int _offPropertyTypeNumber = 1;
  public final static int _offPropertyTypeBoolean = 2;
  public final static int _offPropertyTypeDate = 3;
  public final static int _offPropertyTypeString = 4;
  public final static int _offPropertyTypeFloat = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private DocProperties(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  DocProperties valueOf(int value) {
    switch(value) {
    case 1: return offPropertyTypeNumber;
    case 2: return offPropertyTypeBoolean;
    case 3: return offPropertyTypeDate;
    case 4: return offPropertyTypeString;
    case 5: return offPropertyTypeFloat;
    default: return new DocProperties(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "offPropertyTypeNumber";
    case 2: return "offPropertyTypeBoolean";
    case 3: return "offPropertyTypeDate";
    case 4: return "offPropertyTypeString";
    case 5: return "offPropertyTypeFloat";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|offPropertyTypeNumber");
      if ((value & 2) != 0) sbuf.append("|offPropertyTypeBoolean");
      if ((value & 3) != 0) sbuf.append("|offPropertyTypeDate");
      if ((value & 4) != 0) sbuf.append("|offPropertyTypeString");
      if ((value & 5) != 0) sbuf.append("|offPropertyTypeFloat");
      return sbuf.toString();
      }
    }
  }
}
