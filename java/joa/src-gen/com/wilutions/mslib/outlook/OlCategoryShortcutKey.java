/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlCategoryShortcutKey.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlCategoryShortcutKey implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlCategoryShortcutKey olCategoryShortcutKeyNone = new OlCategoryShortcutKey(0);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF2 = new OlCategoryShortcutKey(1);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF3 = new OlCategoryShortcutKey(2);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF4 = new OlCategoryShortcutKey(3);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF5 = new OlCategoryShortcutKey(4);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF6 = new OlCategoryShortcutKey(5);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF7 = new OlCategoryShortcutKey(6);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF8 = new OlCategoryShortcutKey(7);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF9 = new OlCategoryShortcutKey(8);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF10 = new OlCategoryShortcutKey(9);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF11 = new OlCategoryShortcutKey(10);
  public final static OlCategoryShortcutKey olCategoryShortcutKeyCtrlF12 = new OlCategoryShortcutKey(11);

  // Integer constants for bitsets and switch statements
  public final static int _olCategoryShortcutKeyNone = 0;
  public final static int _olCategoryShortcutKeyCtrlF2 = 1;
  public final static int _olCategoryShortcutKeyCtrlF3 = 2;
  public final static int _olCategoryShortcutKeyCtrlF4 = 3;
  public final static int _olCategoryShortcutKeyCtrlF5 = 4;
  public final static int _olCategoryShortcutKeyCtrlF6 = 5;
  public final static int _olCategoryShortcutKeyCtrlF7 = 6;
  public final static int _olCategoryShortcutKeyCtrlF8 = 7;
  public final static int _olCategoryShortcutKeyCtrlF9 = 8;
  public final static int _olCategoryShortcutKeyCtrlF10 = 9;
  public final static int _olCategoryShortcutKeyCtrlF11 = 10;
  public final static int _olCategoryShortcutKeyCtrlF12 = 11;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlCategoryShortcutKey(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlCategoryShortcutKey valueOf(int value) {
    switch(value) {
    case 0: return olCategoryShortcutKeyNone;
    case 1: return olCategoryShortcutKeyCtrlF2;
    case 2: return olCategoryShortcutKeyCtrlF3;
    case 3: return olCategoryShortcutKeyCtrlF4;
    case 4: return olCategoryShortcutKeyCtrlF5;
    case 5: return olCategoryShortcutKeyCtrlF6;
    case 6: return olCategoryShortcutKeyCtrlF7;
    case 7: return olCategoryShortcutKeyCtrlF8;
    case 8: return olCategoryShortcutKeyCtrlF9;
    case 9: return olCategoryShortcutKeyCtrlF10;
    case 10: return olCategoryShortcutKeyCtrlF11;
    case 11: return olCategoryShortcutKeyCtrlF12;
    default: return new OlCategoryShortcutKey(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "olCategoryShortcutKeyCtrlF9";
    case 10: return "olCategoryShortcutKeyCtrlF11";
    case 0: return "olCategoryShortcutKeyNone";
    case 1: return "olCategoryShortcutKeyCtrlF2";
    case 2: return "olCategoryShortcutKeyCtrlF3";
    case 3: return "olCategoryShortcutKeyCtrlF4";
    case 4: return "olCategoryShortcutKeyCtrlF5";
    case 5: return "olCategoryShortcutKeyCtrlF6";
    case 6: return "olCategoryShortcutKeyCtrlF7";
    case 7: return "olCategoryShortcutKeyCtrlF8";
    case 9: return "olCategoryShortcutKeyCtrlF10";
    case 11: return "olCategoryShortcutKeyCtrlF12";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF9");
      if ((value & 10) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF11");
      if ((value & 0) != 0) sbuf.append("|olCategoryShortcutKeyNone");
      if ((value & 1) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF2");
      if ((value & 2) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF3");
      if ((value & 3) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF4");
      if ((value & 4) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF5");
      if ((value & 5) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF6");
      if ((value & 6) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF7");
      if ((value & 7) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF8");
      if ((value & 9) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF10");
      if ((value & 11) != 0) sbuf.append("|olCategoryShortcutKeyCtrlF12");
      return sbuf.toString();
      }
    }
  }
}
