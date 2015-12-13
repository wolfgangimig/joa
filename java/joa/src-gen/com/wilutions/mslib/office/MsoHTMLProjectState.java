/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoHTMLProjectState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoHTMLProjectState implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoHTMLProjectState msoHTMLProjectStateDocumentLocked = new MsoHTMLProjectState(1);
  public final static MsoHTMLProjectState msoHTMLProjectStateProjectLocked = new MsoHTMLProjectState(2);
  public final static MsoHTMLProjectState msoHTMLProjectStateDocumentProjectUnlocked = new MsoHTMLProjectState(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoHTMLProjectStateDocumentLocked = 1;
  public final static int _msoHTMLProjectStateProjectLocked = 2;
  public final static int _msoHTMLProjectStateDocumentProjectUnlocked = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoHTMLProjectState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoHTMLProjectState valueOf(int value) {
    switch(value) {
    case 1: return msoHTMLProjectStateDocumentLocked;
    case 2: return msoHTMLProjectStateProjectLocked;
    case 3: return msoHTMLProjectStateDocumentProjectUnlocked;
    default: return new MsoHTMLProjectState(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "msoHTMLProjectStateDocumentLocked";
    case 2: return "msoHTMLProjectStateProjectLocked";
    case 3: return "msoHTMLProjectStateDocumentProjectUnlocked";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|msoHTMLProjectStateDocumentLocked");
      if ((value & 2) != 0) sbuf.append("|msoHTMLProjectStateProjectLocked");
      if ((value & 3) != 0) sbuf.append("|msoHTMLProjectStateDocumentProjectUnlocked");
      return sbuf.toString();
      }
    }
  }
}
