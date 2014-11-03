/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmIMEMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{4D067CD0-0D74-11CF-B474-00AA006EB734}")
public enum fmIMEMode {
  fmIMEModeNoControl(0),
  fmIMEModeOn(1),
  fmIMEModeOff(2),
  fmIMEModeDisable(3),
  fmIMEModeHiragana(4),
  fmIMEModeKatakana(5),
  fmIMEModeKatakanaHalf(6),
  fmIMEModeAlphaFull(7),
  fmIMEModeAlpha(8),
  fmIMEModeHangulFull(9),
  fmIMEModeHangul(10),
  fmIMEModeHanziFull(11),
  fmIMEModeHanzi(12);

  public final int value;
  private fmIMEMode(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmIMEMode.class);
    }
  }
}
