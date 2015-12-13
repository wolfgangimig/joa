/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormRegionIcon.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormRegionIcon implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormRegionIcon olFormRegionIconDefault = new OlFormRegionIcon(1);
  public final static OlFormRegionIcon olFormRegionIconUnread = new OlFormRegionIcon(2);
  public final static OlFormRegionIcon olFormRegionIconRead = new OlFormRegionIcon(3);
  public final static OlFormRegionIcon olFormRegionIconReplied = new OlFormRegionIcon(4);
  public final static OlFormRegionIcon olFormRegionIconForwarded = new OlFormRegionIcon(5);
  public final static OlFormRegionIcon olFormRegionIconUnsent = new OlFormRegionIcon(6);
  public final static OlFormRegionIcon olFormRegionIconSubmitted = new OlFormRegionIcon(7);
  public final static OlFormRegionIcon olFormRegionIconSigned = new OlFormRegionIcon(8);
  public final static OlFormRegionIcon olFormRegionIconEncrypted = new OlFormRegionIcon(9);
  public final static OlFormRegionIcon olFormRegionIconWindow = new OlFormRegionIcon(10);
  public final static OlFormRegionIcon olFormRegionIconPage = new OlFormRegionIcon(11);
  public final static OlFormRegionIcon olFormRegionIconRecurring = new OlFormRegionIcon(12);

  // Integer constants for bitsets and switch statements
  public final static int _olFormRegionIconDefault = 1;
  public final static int _olFormRegionIconUnread = 2;
  public final static int _olFormRegionIconRead = 3;
  public final static int _olFormRegionIconReplied = 4;
  public final static int _olFormRegionIconForwarded = 5;
  public final static int _olFormRegionIconUnsent = 6;
  public final static int _olFormRegionIconSubmitted = 7;
  public final static int _olFormRegionIconSigned = 8;
  public final static int _olFormRegionIconEncrypted = 9;
  public final static int _olFormRegionIconWindow = 10;
  public final static int _olFormRegionIconPage = 11;
  public final static int _olFormRegionIconRecurring = 12;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormRegionIcon(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormRegionIcon valueOf(int value) {
    switch(value) {
    case 1: return olFormRegionIconDefault;
    case 2: return olFormRegionIconUnread;
    case 3: return olFormRegionIconRead;
    case 4: return olFormRegionIconReplied;
    case 5: return olFormRegionIconForwarded;
    case 6: return olFormRegionIconUnsent;
    case 7: return olFormRegionIconSubmitted;
    case 8: return olFormRegionIconSigned;
    case 9: return olFormRegionIconEncrypted;
    case 10: return olFormRegionIconWindow;
    case 11: return olFormRegionIconPage;
    case 12: return olFormRegionIconRecurring;
    default: return new OlFormRegionIcon(value);
    }
  }

  public String toString() {
    switch(value) {
    case 9: return "olFormRegionIconEncrypted";
    case 1: return "olFormRegionIconDefault";
    case 2: return "olFormRegionIconUnread";
    case 3: return "olFormRegionIconRead";
    case 4: return "olFormRegionIconReplied";
    case 5: return "olFormRegionIconForwarded";
    case 6: return "olFormRegionIconUnsent";
    case 7: return "olFormRegionIconSubmitted";
    case 8: return "olFormRegionIconSigned";
    case 10: return "olFormRegionIconWindow";
    case 11: return "olFormRegionIconPage";
    case 12: return "olFormRegionIconRecurring";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 9) != 0) sbuf.append("|olFormRegionIconEncrypted");
      if ((value & 1) != 0) sbuf.append("|olFormRegionIconDefault");
      if ((value & 2) != 0) sbuf.append("|olFormRegionIconUnread");
      if ((value & 3) != 0) sbuf.append("|olFormRegionIconRead");
      if ((value & 4) != 0) sbuf.append("|olFormRegionIconReplied");
      if ((value & 5) != 0) sbuf.append("|olFormRegionIconForwarded");
      if ((value & 6) != 0) sbuf.append("|olFormRegionIconUnsent");
      if ((value & 7) != 0) sbuf.append("|olFormRegionIconSubmitted");
      if ((value & 8) != 0) sbuf.append("|olFormRegionIconSigned");
      if ((value & 10) != 0) sbuf.append("|olFormRegionIconWindow");
      if ((value & 11) != 0) sbuf.append("|olFormRegionIconPage");
      if ((value & 12) != 0) sbuf.append("|olFormRegionIconRecurring");
      return sbuf.toString();
      }
    }
  }
}
