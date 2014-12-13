/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmIMEMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{4D067CD0-0D74-11CF-B474-00AA006EB734}")
public class fmIMEMode implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmIMEMode fmIMEModeNoControl = new fmIMEMode(0);
  public final static fmIMEMode fmIMEModeOn = new fmIMEMode(1);
  public final static fmIMEMode fmIMEModeOff = new fmIMEMode(2);
  public final static fmIMEMode fmIMEModeDisable = new fmIMEMode(3);
  public final static fmIMEMode fmIMEModeHiragana = new fmIMEMode(4);
  public final static fmIMEMode fmIMEModeKatakana = new fmIMEMode(5);
  public final static fmIMEMode fmIMEModeKatakanaHalf = new fmIMEMode(6);
  public final static fmIMEMode fmIMEModeAlphaFull = new fmIMEMode(7);
  public final static fmIMEMode fmIMEModeAlpha = new fmIMEMode(8);
  public final static fmIMEMode fmIMEModeHangulFull = new fmIMEMode(9);
  public final static fmIMEMode fmIMEModeHangul = new fmIMEMode(10);
  public final static fmIMEMode fmIMEModeHanziFull = new fmIMEMode(11);
  public final static fmIMEMode fmIMEModeHanzi = new fmIMEMode(12);

  // Integer constants for bitsets and switch statements
  public final static int _fmIMEModeNoControl = 0;
  public final static int _fmIMEModeOn = 1;
  public final static int _fmIMEModeOff = 2;
  public final static int _fmIMEModeDisable = 3;
  public final static int _fmIMEModeHiragana = 4;
  public final static int _fmIMEModeKatakana = 5;
  public final static int _fmIMEModeKatakanaHalf = 6;
  public final static int _fmIMEModeAlphaFull = 7;
  public final static int _fmIMEModeAlpha = 8;
  public final static int _fmIMEModeHangulFull = 9;
  public final static int _fmIMEModeHangul = 10;
  public final static int _fmIMEModeHanziFull = 11;
  public final static int _fmIMEModeHanzi = 12;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmIMEMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmIMEMode valueOf(int value) {
    switch(value) {
    case 0: return fmIMEModeNoControl;
    case 1: return fmIMEModeOn;
    case 2: return fmIMEModeOff;
    case 3: return fmIMEModeDisable;
    case 4: return fmIMEModeHiragana;
    case 5: return fmIMEModeKatakana;
    case 6: return fmIMEModeKatakanaHalf;
    case 7: return fmIMEModeAlphaFull;
    case 8: return fmIMEModeAlpha;
    case 9: return fmIMEModeHangulFull;
    case 10: return fmIMEModeHangul;
    case 11: return fmIMEModeHanziFull;
    case 12: return fmIMEModeHanzi;
    default: return new fmIMEMode(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "fmIMEModeAlpha";
    case 10: return "fmIMEModeHangul";
    case 0: return "fmIMEModeNoControl";
    case 1: return "fmIMEModeOn";
    case 2: return "fmIMEModeOff";
    case 3: return "fmIMEModeDisable";
    case 4: return "fmIMEModeHiragana";
    case 5: return "fmIMEModeKatakana";
    case 6: return "fmIMEModeKatakanaHalf";
    case 7: return "fmIMEModeAlphaFull";
    case 9: return "fmIMEModeHangulFull";
    case 11: return "fmIMEModeHanziFull";
    case 12: return "fmIMEModeHanzi";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|fmIMEModeAlpha");
      if ((value & 10) != 0) sbuf.append("|fmIMEModeHangul");
      if ((value & 0) != 0) sbuf.append("|fmIMEModeNoControl");
      if ((value & 1) != 0) sbuf.append("|fmIMEModeOn");
      if ((value & 2) != 0) sbuf.append("|fmIMEModeOff");
      if ((value & 3) != 0) sbuf.append("|fmIMEModeDisable");
      if ((value & 4) != 0) sbuf.append("|fmIMEModeHiragana");
      if ((value & 5) != 0) sbuf.append("|fmIMEModeKatakana");
      if ((value & 6) != 0) sbuf.append("|fmIMEModeKatakanaHalf");
      if ((value & 7) != 0) sbuf.append("|fmIMEModeAlphaFull");
      if ((value & 9) != 0) sbuf.append("|fmIMEModeHangulFull");
      if ((value & 11) != 0) sbuf.append("|fmIMEModeHanziFull");
      if ((value & 12) != 0) sbuf.append("|fmIMEModeHanzi");
      return sbuf.toString();
      }
    }
  }
}
