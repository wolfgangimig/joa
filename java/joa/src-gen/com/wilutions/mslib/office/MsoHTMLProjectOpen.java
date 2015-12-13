/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoHTMLProjectOpen.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoHTMLProjectOpen implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoHTMLProjectOpen msoHTMLProjectOpenSourceView = new MsoHTMLProjectOpen(1);
  public final static MsoHTMLProjectOpen msoHTMLProjectOpenTextView = new MsoHTMLProjectOpen(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoHTMLProjectOpenSourceView = 1;
  public final static int _msoHTMLProjectOpenTextView = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoHTMLProjectOpen(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoHTMLProjectOpen valueOf(int value) {
    switch(value) {
    case 1: return msoHTMLProjectOpenSourceView;
    case 2: return msoHTMLProjectOpenTextView;
    default: return new MsoHTMLProjectOpen(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "msoHTMLProjectOpenSourceView";
    case 2: return "msoHTMLProjectOpenTextView";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|msoHTMLProjectOpenSourceView");
      if ((value & 2) != 0) sbuf.append("|msoHTMLProjectOpenTextView");
      return sbuf.toString();
      }
    }
  }
}
