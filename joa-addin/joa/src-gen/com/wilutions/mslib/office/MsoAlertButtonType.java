/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAlertButtonType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoAlertButtonType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoAlertButtonType msoAlertButtonOK = new MsoAlertButtonType(0);
  public final static MsoAlertButtonType msoAlertButtonOKCancel = new MsoAlertButtonType(1);
  public final static MsoAlertButtonType msoAlertButtonAbortRetryIgnore = new MsoAlertButtonType(2);
  public final static MsoAlertButtonType msoAlertButtonYesNoCancel = new MsoAlertButtonType(3);
  public final static MsoAlertButtonType msoAlertButtonYesNo = new MsoAlertButtonType(4);
  public final static MsoAlertButtonType msoAlertButtonRetryCancel = new MsoAlertButtonType(5);
  public final static MsoAlertButtonType msoAlertButtonYesAllNoCancel = new MsoAlertButtonType(6);

  // Integer constants for bitsets and switch statements
  public final static int _msoAlertButtonOK = 0;
  public final static int _msoAlertButtonOKCancel = 1;
  public final static int _msoAlertButtonAbortRetryIgnore = 2;
  public final static int _msoAlertButtonYesNoCancel = 3;
  public final static int _msoAlertButtonYesNo = 4;
  public final static int _msoAlertButtonRetryCancel = 5;
  public final static int _msoAlertButtonYesAllNoCancel = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoAlertButtonType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoAlertButtonType valueOf(int value) {
    switch(value) {
    case 0: return msoAlertButtonOK;
    case 1: return msoAlertButtonOKCancel;
    case 2: return msoAlertButtonAbortRetryIgnore;
    case 3: return msoAlertButtonYesNoCancel;
    case 4: return msoAlertButtonYesNo;
    case 5: return msoAlertButtonRetryCancel;
    case 6: return msoAlertButtonYesAllNoCancel;
    default: return new MsoAlertButtonType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoAlertButtonOK";
    case 1: return "msoAlertButtonOKCancel";
    case 2: return "msoAlertButtonAbortRetryIgnore";
    case 3: return "msoAlertButtonYesNoCancel";
    case 4: return "msoAlertButtonYesNo";
    case 5: return "msoAlertButtonRetryCancel";
    case 6: return "msoAlertButtonYesAllNoCancel";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoAlertButtonOK");
      if ((value & 1) != 0) sbuf.append("|msoAlertButtonOKCancel");
      if ((value & 2) != 0) sbuf.append("|msoAlertButtonAbortRetryIgnore");
      if ((value & 3) != 0) sbuf.append("|msoAlertButtonYesNoCancel");
      if ((value & 4) != 0) sbuf.append("|msoAlertButtonYesNo");
      if ((value & 5) != 0) sbuf.append("|msoAlertButtonRetryCancel");
      if ((value & 6) != 0) sbuf.append("|msoAlertButtonYesAllNoCancel");
      return sbuf.toString();
      }
    }
  }
}
