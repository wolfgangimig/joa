/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlOfficeDocItemsType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlOfficeDocItemsType {

  // Typed constants
  public final static OlOfficeDocItemsType olExcelWorkSheetItem = new OlOfficeDocItemsType(8);
  public final static OlOfficeDocItemsType olWordDocumentItem = new OlOfficeDocItemsType(9);
  public final static OlOfficeDocItemsType olPowerPointShowItem = new OlOfficeDocItemsType(10);

  // Integer constants for bitsets and switch statements
  public final static int _olExcelWorkSheetItem = 8;
  public final static int _olWordDocumentItem = 9;
  public final static int _olPowerPointShowItem = 10;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlOfficeDocItemsType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlOfficeDocItemsType valueOf(int value) {
    switch(value) {
    case 8: return olExcelWorkSheetItem;
    case 9: return olWordDocumentItem;
    case 10: return olPowerPointShowItem;
    default: return new OlOfficeDocItemsType(value);
    }
  }
}
