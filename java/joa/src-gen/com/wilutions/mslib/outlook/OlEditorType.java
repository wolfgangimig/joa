/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlEditorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlEditorType {
  olEditorText(1),
  olEditorHTML(2),
  olEditorRTF(3),
  olEditorWord(4);

  public final int value;
  private OlEditorType(int value) { this.value = value; }
  public static  OlEditorType valueOf(int value) {
    switch(value) {
    case 1: return olEditorText;
    case 2: return olEditorHTML;
    case 3: return olEditorRTF;
    case 4: return olEditorWord;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlEditorType.class);
    }
  }
}
