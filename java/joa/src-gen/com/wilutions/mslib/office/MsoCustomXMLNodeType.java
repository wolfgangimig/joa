/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCustomXMLNodeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCustomXMLNodeType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoCustomXMLNodeType msoCustomXMLNodeElement = new MsoCustomXMLNodeType(1);
  public final static MsoCustomXMLNodeType msoCustomXMLNodeAttribute = new MsoCustomXMLNodeType(2);
  public final static MsoCustomXMLNodeType msoCustomXMLNodeText = new MsoCustomXMLNodeType(3);
  public final static MsoCustomXMLNodeType msoCustomXMLNodeCData = new MsoCustomXMLNodeType(4);
  public final static MsoCustomXMLNodeType msoCustomXMLNodeProcessingInstruction = new MsoCustomXMLNodeType(7);
  public final static MsoCustomXMLNodeType msoCustomXMLNodeComment = new MsoCustomXMLNodeType(8);
  public final static MsoCustomXMLNodeType msoCustomXMLNodeDocument = new MsoCustomXMLNodeType(9);

  // Integer constants for bitsets and switch statements
  public final static int _msoCustomXMLNodeElement = 1;
  public final static int _msoCustomXMLNodeAttribute = 2;
  public final static int _msoCustomXMLNodeText = 3;
  public final static int _msoCustomXMLNodeCData = 4;
  public final static int _msoCustomXMLNodeProcessingInstruction = 7;
  public final static int _msoCustomXMLNodeComment = 8;
  public final static int _msoCustomXMLNodeDocument = 9;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoCustomXMLNodeType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoCustomXMLNodeType valueOf(int value) {
    switch(value) {
    case 1: return msoCustomXMLNodeElement;
    case 2: return msoCustomXMLNodeAttribute;
    case 3: return msoCustomXMLNodeText;
    case 4: return msoCustomXMLNodeCData;
    case 7: return msoCustomXMLNodeProcessingInstruction;
    case 8: return msoCustomXMLNodeComment;
    case 9: return msoCustomXMLNodeDocument;
    default: return new MsoCustomXMLNodeType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 9: return "msoCustomXMLNodeDocument";
    case 1: return "msoCustomXMLNodeElement";
    case 2: return "msoCustomXMLNodeAttribute";
    case 3: return "msoCustomXMLNodeText";
    case 4: return "msoCustomXMLNodeCData";
    case 7: return "msoCustomXMLNodeProcessingInstruction";
    case 8: return "msoCustomXMLNodeComment";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 9) != 0) sbuf.append("|msoCustomXMLNodeDocument");
      if ((value & 1) != 0) sbuf.append("|msoCustomXMLNodeElement");
      if ((value & 2) != 0) sbuf.append("|msoCustomXMLNodeAttribute");
      if ((value & 3) != 0) sbuf.append("|msoCustomXMLNodeText");
      if ((value & 4) != 0) sbuf.append("|msoCustomXMLNodeCData");
      if ((value & 7) != 0) sbuf.append("|msoCustomXMLNodeProcessingInstruction");
      if ((value & 8) != 0) sbuf.append("|msoCustomXMLNodeComment");
      return sbuf.toString();
      }
    }
  }
}
