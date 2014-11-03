/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSaveAsType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSaveAsType {
  olTXT(0),
  olRTF(1),
  olTemplate(2),
  olMSG(3),
  olDoc(4),
  olHTML(5),
  olVCard(6),
  olVCal(7),
  olICal(8),
  olMSGUnicode(9),
  olMHTML(10);

  public final int value;
  private OlSaveAsType(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSaveAsType.class);
    }
  }
}
