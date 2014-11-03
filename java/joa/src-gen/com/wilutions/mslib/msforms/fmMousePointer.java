/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmMousePointer.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{593104F8-16BA-101B-989C-00006B82871A}")
public enum fmMousePointer {
  fmMousePointerDefault(0),
  fmMousePointerArrow(1),
  fmMousePointerCross(2),
  fmMousePointerIBeam(3),
  fmMousePointerSizeNESW(6),
  fmMousePointerSizeNS(7),
  fmMousePointerSizeNWSE(8),
  fmMousePointerSizeWE(9),
  fmMousePointerUpArrow(10),
  fmMousePointerHourGlass(11),
  fmMousePointerNoDrop(12),
  fmMousePointerAppStarting(13),
  fmMousePointerHelp(14),
  fmMousePointerSizeAll(15),
  fmMousePointerCustom(99);

  public final int value;
  private fmMousePointer(int value) { this.value = value; }
  public static  fmMousePointer valueOf(int value) {
    switch(value) {
    case 0: return fmMousePointerDefault;
    case 1: return fmMousePointerArrow;
    case 2: return fmMousePointerCross;
    case 3: return fmMousePointerIBeam;
    case 6: return fmMousePointerSizeNESW;
    case 7: return fmMousePointerSizeNS;
    case 8: return fmMousePointerSizeNWSE;
    case 9: return fmMousePointerSizeWE;
    case 10: return fmMousePointerUpArrow;
    case 11: return fmMousePointerHourGlass;
    case 12: return fmMousePointerNoDrop;
    case 13: return fmMousePointerAppStarting;
    case 14: return fmMousePointerHelp;
    case 15: return fmMousePointerSizeAll;
    case 99: return fmMousePointerCustom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmMousePointer.class);
    }
  }
}
