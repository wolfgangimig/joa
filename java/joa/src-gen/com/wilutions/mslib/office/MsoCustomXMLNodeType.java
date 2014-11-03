/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCustomXMLNodeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoCustomXMLNodeType {
  msoCustomXMLNodeElement(1),
  msoCustomXMLNodeAttribute(2),
  msoCustomXMLNodeText(3),
  msoCustomXMLNodeCData(4),
  msoCustomXMLNodeProcessingInstruction(7),
  msoCustomXMLNodeComment(8),
  msoCustomXMLNodeDocument(9);

  public final int value;
  private MsoCustomXMLNodeType(int value) { this.value = value; }
  public static  MsoCustomXMLNodeType valueOf(int value) {
    switch(value) {
    case 1: return msoCustomXMLNodeElement;
    case 2: return msoCustomXMLNodeAttribute;
    case 3: return msoCustomXMLNodeText;
    case 4: return msoCustomXMLNodeCData;
    case 7: return msoCustomXMLNodeProcessingInstruction;
    case 8: return msoCustomXMLNodeComment;
    case 9: return msoCustomXMLNodeDocument;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoCustomXMLNodeType.class);
    }
  }
}
