/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBalloonButtonType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBalloonButtonType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBalloonButtonType msoBalloonButtonYesToAll = new MsoBalloonButtonType(-15);
  public final static MsoBalloonButtonType msoBalloonButtonOptions = new MsoBalloonButtonType(-14);
  public final static MsoBalloonButtonType msoBalloonButtonTips = new MsoBalloonButtonType(-13);
  public final static MsoBalloonButtonType msoBalloonButtonClose = new MsoBalloonButtonType(-12);
  public final static MsoBalloonButtonType msoBalloonButtonSnooze = new MsoBalloonButtonType(-11);
  public final static MsoBalloonButtonType msoBalloonButtonSearch = new MsoBalloonButtonType(-10);
  public final static MsoBalloonButtonType msoBalloonButtonIgnore = new MsoBalloonButtonType(-9);
  public final static MsoBalloonButtonType msoBalloonButtonAbort = new MsoBalloonButtonType(-8);
  public final static MsoBalloonButtonType msoBalloonButtonRetry = new MsoBalloonButtonType(-7);
  public final static MsoBalloonButtonType msoBalloonButtonNext = new MsoBalloonButtonType(-6);
  public final static MsoBalloonButtonType msoBalloonButtonBack = new MsoBalloonButtonType(-5);
  public final static MsoBalloonButtonType msoBalloonButtonNo = new MsoBalloonButtonType(-4);
  public final static MsoBalloonButtonType msoBalloonButtonYes = new MsoBalloonButtonType(-3);
  public final static MsoBalloonButtonType msoBalloonButtonCancel = new MsoBalloonButtonType(-2);
  public final static MsoBalloonButtonType msoBalloonButtonOK = new MsoBalloonButtonType(-1);
  public final static MsoBalloonButtonType msoBalloonButtonNull = new MsoBalloonButtonType(0);

  // Integer constants for bitsets and switch statements
  public final static int _msoBalloonButtonYesToAll = -15;
  public final static int _msoBalloonButtonOptions = -14;
  public final static int _msoBalloonButtonTips = -13;
  public final static int _msoBalloonButtonClose = -12;
  public final static int _msoBalloonButtonSnooze = -11;
  public final static int _msoBalloonButtonSearch = -10;
  public final static int _msoBalloonButtonIgnore = -9;
  public final static int _msoBalloonButtonAbort = -8;
  public final static int _msoBalloonButtonRetry = -7;
  public final static int _msoBalloonButtonNext = -6;
  public final static int _msoBalloonButtonBack = -5;
  public final static int _msoBalloonButtonNo = -4;
  public final static int _msoBalloonButtonYes = -3;
  public final static int _msoBalloonButtonCancel = -2;
  public final static int _msoBalloonButtonOK = -1;
  public final static int _msoBalloonButtonNull = 0;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBalloonButtonType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBalloonButtonType valueOf(int value) {
    switch(value) {
    case -15: return msoBalloonButtonYesToAll;
    case -14: return msoBalloonButtonOptions;
    case -13: return msoBalloonButtonTips;
    case -12: return msoBalloonButtonClose;
    case -11: return msoBalloonButtonSnooze;
    case -10: return msoBalloonButtonSearch;
    case -9: return msoBalloonButtonIgnore;
    case -8: return msoBalloonButtonAbort;
    case -7: return msoBalloonButtonRetry;
    case -6: return msoBalloonButtonNext;
    case -5: return msoBalloonButtonBack;
    case -4: return msoBalloonButtonNo;
    case -3: return msoBalloonButtonYes;
    case -2: return msoBalloonButtonCancel;
    case -1: return msoBalloonButtonOK;
    case 0: return msoBalloonButtonNull;
    default: return new MsoBalloonButtonType(value);
    }
  }

  public String toString() {
    switch(value) {
    case -15: return "msoBalloonButtonYesToAll";
    case -7: return "msoBalloonButtonRetry";
    case -14: return "msoBalloonButtonOptions";
    case -8: return "msoBalloonButtonAbort";
    case -13: return "msoBalloonButtonTips";
    case -9: return "msoBalloonButtonIgnore";
    case -12: return "msoBalloonButtonClose";
    case -11: return "msoBalloonButtonSnooze";
    case -10: return "msoBalloonButtonSearch";
    case -6: return "msoBalloonButtonNext";
    case -5: return "msoBalloonButtonBack";
    case -4: return "msoBalloonButtonNo";
    case -3: return "msoBalloonButtonYes";
    case -2: return "msoBalloonButtonCancel";
    case -1: return "msoBalloonButtonOK";
    case 0: return "msoBalloonButtonNull";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -15) != 0) sbuf.append("|msoBalloonButtonYesToAll");
      if ((value & -7) != 0) sbuf.append("|msoBalloonButtonRetry");
      if ((value & -14) != 0) sbuf.append("|msoBalloonButtonOptions");
      if ((value & -8) != 0) sbuf.append("|msoBalloonButtonAbort");
      if ((value & -13) != 0) sbuf.append("|msoBalloonButtonTips");
      if ((value & -9) != 0) sbuf.append("|msoBalloonButtonIgnore");
      if ((value & -12) != 0) sbuf.append("|msoBalloonButtonClose");
      if ((value & -11) != 0) sbuf.append("|msoBalloonButtonSnooze");
      if ((value & -10) != 0) sbuf.append("|msoBalloonButtonSearch");
      if ((value & -6) != 0) sbuf.append("|msoBalloonButtonNext");
      if ((value & -5) != 0) sbuf.append("|msoBalloonButtonBack");
      if ((value & -4) != 0) sbuf.append("|msoBalloonButtonNo");
      if ((value & -3) != 0) sbuf.append("|msoBalloonButtonYes");
      if ((value & -2) != 0) sbuf.append("|msoBalloonButtonCancel");
      if ((value & -1) != 0) sbuf.append("|msoBalloonButtonOK");
      if ((value & 0) != 0) sbuf.append("|msoBalloonButtonNull");
      return sbuf.toString();
      }
    }
  }
}
