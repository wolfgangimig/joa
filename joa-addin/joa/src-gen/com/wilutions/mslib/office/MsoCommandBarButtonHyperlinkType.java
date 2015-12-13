/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCommandBarButtonHyperlinkType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCommandBarButtonHyperlinkType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoCommandBarButtonHyperlinkType msoCommandBarButtonHyperlinkNone = new MsoCommandBarButtonHyperlinkType(0);
  public final static MsoCommandBarButtonHyperlinkType msoCommandBarButtonHyperlinkOpen = new MsoCommandBarButtonHyperlinkType(1);
  public final static MsoCommandBarButtonHyperlinkType msoCommandBarButtonHyperlinkInsertPicture = new MsoCommandBarButtonHyperlinkType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoCommandBarButtonHyperlinkNone = 0;
  public final static int _msoCommandBarButtonHyperlinkOpen = 1;
  public final static int _msoCommandBarButtonHyperlinkInsertPicture = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoCommandBarButtonHyperlinkType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoCommandBarButtonHyperlinkType valueOf(int value) {
    switch(value) {
    case 0: return msoCommandBarButtonHyperlinkNone;
    case 1: return msoCommandBarButtonHyperlinkOpen;
    case 2: return msoCommandBarButtonHyperlinkInsertPicture;
    default: return new MsoCommandBarButtonHyperlinkType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoCommandBarButtonHyperlinkNone";
    case 1: return "msoCommandBarButtonHyperlinkOpen";
    case 2: return "msoCommandBarButtonHyperlinkInsertPicture";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoCommandBarButtonHyperlinkNone");
      if ((value & 1) != 0) sbuf.append("|msoCommandBarButtonHyperlinkOpen");
      if ((value & 2) != 0) sbuf.append("|msoCommandBarButtonHyperlinkInsertPicture");
      return sbuf.toString();
      }
    }
  }
}
