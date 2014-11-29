/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSaveAsType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSaveAsType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlSaveAsType olTXT = new OlSaveAsType(0);
  public final static OlSaveAsType olRTF = new OlSaveAsType(1);
  public final static OlSaveAsType olTemplate = new OlSaveAsType(2);
  public final static OlSaveAsType olMSG = new OlSaveAsType(3);
  public final static OlSaveAsType olDoc = new OlSaveAsType(4);
  public final static OlSaveAsType olHTML = new OlSaveAsType(5);
  public final static OlSaveAsType olVCard = new OlSaveAsType(6);
  public final static OlSaveAsType olVCal = new OlSaveAsType(7);
  public final static OlSaveAsType olICal = new OlSaveAsType(8);
  public final static OlSaveAsType olMSGUnicode = new OlSaveAsType(9);
  public final static OlSaveAsType olMHTML = new OlSaveAsType(10);

  // Integer constants for bitsets and switch statements
  public final static int _olTXT = 0;
  public final static int _olRTF = 1;
  public final static int _olTemplate = 2;
  public final static int _olMSG = 3;
  public final static int _olDoc = 4;
  public final static int _olHTML = 5;
  public final static int _olVCard = 6;
  public final static int _olVCal = 7;
  public final static int _olICal = 8;
  public final static int _olMSGUnicode = 9;
  public final static int _olMHTML = 10;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSaveAsType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlSaveAsType valueOf(int value) {
    switch(value) {
    case 0: return olTXT;
    case 1: return olRTF;
    case 2: return olTemplate;
    case 3: return olMSG;
    case 4: return olDoc;
    case 5: return olHTML;
    case 6: return olVCard;
    case 7: return olVCal;
    case 8: return olICal;
    case 9: return olMSGUnicode;
    case 10: return olMHTML;
    default: return new OlSaveAsType(value);
    }
  }
}
