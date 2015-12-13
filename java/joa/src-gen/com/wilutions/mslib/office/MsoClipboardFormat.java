/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoClipboardFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoClipboardFormat implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoClipboardFormat msoClipboardFormatMixed = new MsoClipboardFormat(-2);
  public final static MsoClipboardFormat msoClipboardFormatNative = new MsoClipboardFormat(1);
  public final static MsoClipboardFormat msoClipboardFormatHTML = new MsoClipboardFormat(2);
  public final static MsoClipboardFormat msoClipboardFormatRTF = new MsoClipboardFormat(3);
  public final static MsoClipboardFormat msoClipboardFormatPlainText = new MsoClipboardFormat(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoClipboardFormatMixed = -2;
  public final static int _msoClipboardFormatNative = 1;
  public final static int _msoClipboardFormatHTML = 2;
  public final static int _msoClipboardFormatRTF = 3;
  public final static int _msoClipboardFormatPlainText = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoClipboardFormat(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoClipboardFormat valueOf(int value) {
    switch(value) {
    case -2: return msoClipboardFormatMixed;
    case 1: return msoClipboardFormatNative;
    case 2: return msoClipboardFormatHTML;
    case 3: return msoClipboardFormatRTF;
    case 4: return msoClipboardFormatPlainText;
    default: return new MsoClipboardFormat(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoClipboardFormatMixed";
    case 1: return "msoClipboardFormatNative";
    case 2: return "msoClipboardFormatHTML";
    case 3: return "msoClipboardFormatRTF";
    case 4: return "msoClipboardFormatPlainText";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoClipboardFormatMixed");
      if ((value & 1) != 0) sbuf.append("|msoClipboardFormatNative");
      if ((value & 2) != 0) sbuf.append("|msoClipboardFormatHTML");
      if ((value & 3) != 0) sbuf.append("|msoClipboardFormatRTF");
      if ((value & 4) != 0) sbuf.append("|msoClipboardFormatPlainText");
      return sbuf.toString();
      }
    }
  }
}
