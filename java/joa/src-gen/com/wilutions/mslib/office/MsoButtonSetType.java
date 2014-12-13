/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoButtonSetType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoButtonSetType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoButtonSetType msoButtonSetNone = new MsoButtonSetType(0);
  public final static MsoButtonSetType msoButtonSetOK = new MsoButtonSetType(1);
  public final static MsoButtonSetType msoButtonSetCancel = new MsoButtonSetType(2);
  public final static MsoButtonSetType msoButtonSetOkCancel = new MsoButtonSetType(3);
  public final static MsoButtonSetType msoButtonSetYesNo = new MsoButtonSetType(4);
  public final static MsoButtonSetType msoButtonSetYesNoCancel = new MsoButtonSetType(5);
  public final static MsoButtonSetType msoButtonSetBackClose = new MsoButtonSetType(6);
  public final static MsoButtonSetType msoButtonSetNextClose = new MsoButtonSetType(7);
  public final static MsoButtonSetType msoButtonSetBackNextClose = new MsoButtonSetType(8);
  public final static MsoButtonSetType msoButtonSetRetryCancel = new MsoButtonSetType(9);
  public final static MsoButtonSetType msoButtonSetAbortRetryIgnore = new MsoButtonSetType(10);
  public final static MsoButtonSetType msoButtonSetSearchClose = new MsoButtonSetType(11);
  public final static MsoButtonSetType msoButtonSetBackNextSnooze = new MsoButtonSetType(12);
  public final static MsoButtonSetType msoButtonSetTipsOptionsClose = new MsoButtonSetType(13);
  public final static MsoButtonSetType msoButtonSetYesAllNoCancel = new MsoButtonSetType(14);

  // Integer constants for bitsets and switch statements
  public final static int _msoButtonSetNone = 0;
  public final static int _msoButtonSetOK = 1;
  public final static int _msoButtonSetCancel = 2;
  public final static int _msoButtonSetOkCancel = 3;
  public final static int _msoButtonSetYesNo = 4;
  public final static int _msoButtonSetYesNoCancel = 5;
  public final static int _msoButtonSetBackClose = 6;
  public final static int _msoButtonSetNextClose = 7;
  public final static int _msoButtonSetBackNextClose = 8;
  public final static int _msoButtonSetRetryCancel = 9;
  public final static int _msoButtonSetAbortRetryIgnore = 10;
  public final static int _msoButtonSetSearchClose = 11;
  public final static int _msoButtonSetBackNextSnooze = 12;
  public final static int _msoButtonSetTipsOptionsClose = 13;
  public final static int _msoButtonSetYesAllNoCancel = 14;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoButtonSetType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoButtonSetType valueOf(int value) {
    switch(value) {
    case 0: return msoButtonSetNone;
    case 1: return msoButtonSetOK;
    case 2: return msoButtonSetCancel;
    case 3: return msoButtonSetOkCancel;
    case 4: return msoButtonSetYesNo;
    case 5: return msoButtonSetYesNoCancel;
    case 6: return msoButtonSetBackClose;
    case 7: return msoButtonSetNextClose;
    case 8: return msoButtonSetBackNextClose;
    case 9: return msoButtonSetRetryCancel;
    case 10: return msoButtonSetAbortRetryIgnore;
    case 11: return msoButtonSetSearchClose;
    case 12: return msoButtonSetBackNextSnooze;
    case 13: return msoButtonSetTipsOptionsClose;
    case 14: return msoButtonSetYesAllNoCancel;
    default: return new MsoButtonSetType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "msoButtonSetBackNextClose";
    case 10: return "msoButtonSetAbortRetryIgnore";
    case 0: return "msoButtonSetNone";
    case 1: return "msoButtonSetOK";
    case 2: return "msoButtonSetCancel";
    case 3: return "msoButtonSetOkCancel";
    case 4: return "msoButtonSetYesNo";
    case 5: return "msoButtonSetYesNoCancel";
    case 6: return "msoButtonSetBackClose";
    case 7: return "msoButtonSetNextClose";
    case 9: return "msoButtonSetRetryCancel";
    case 11: return "msoButtonSetSearchClose";
    case 12: return "msoButtonSetBackNextSnooze";
    case 13: return "msoButtonSetTipsOptionsClose";
    case 14: return "msoButtonSetYesAllNoCancel";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|msoButtonSetBackNextClose");
      if ((value & 10) != 0) sbuf.append("|msoButtonSetAbortRetryIgnore");
      if ((value & 0) != 0) sbuf.append("|msoButtonSetNone");
      if ((value & 1) != 0) sbuf.append("|msoButtonSetOK");
      if ((value & 2) != 0) sbuf.append("|msoButtonSetCancel");
      if ((value & 3) != 0) sbuf.append("|msoButtonSetOkCancel");
      if ((value & 4) != 0) sbuf.append("|msoButtonSetYesNo");
      if ((value & 5) != 0) sbuf.append("|msoButtonSetYesNoCancel");
      if ((value & 6) != 0) sbuf.append("|msoButtonSetBackClose");
      if ((value & 7) != 0) sbuf.append("|msoButtonSetNextClose");
      if ((value & 9) != 0) sbuf.append("|msoButtonSetRetryCancel");
      if ((value & 11) != 0) sbuf.append("|msoButtonSetSearchClose");
      if ((value & 12) != 0) sbuf.append("|msoButtonSetBackNextSnooze");
      if ((value & 13) != 0) sbuf.append("|msoButtonSetTipsOptionsClose");
      if ((value & 14) != 0) sbuf.append("|msoButtonSetYesAllNoCancel");
      return sbuf.toString();
      }
    }
  }
}
