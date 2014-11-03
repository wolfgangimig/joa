/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlOfficeDocItemsType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlOfficeDocItemsType {
  olExcelWorkSheetItem(8),
  olWordDocumentItem(9),
  olPowerPointShowItem(10);

  public final int value;
  private OlOfficeDocItemsType(int value) { this.value = value; }
  public static  OlOfficeDocItemsType valueOf(int value) {
    switch(value) {
    case 8: return olExcelWorkSheetItem;
    case 9: return olWordDocumentItem;
    case 10: return olPowerPointShowItem;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlOfficeDocItemsType.class);
    }
  }
}
