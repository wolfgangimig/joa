/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMousePointer.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{1BA5FCB6-05E9-4721-979D-3CE2C9084479}")
public enum OlMousePointer {
  olMousePointerDefault(0),
  olMousePointerArrow(1),
  olMousePointerCross(2),
  olMousePointerIBeam(3),
  olMousePointerSizeNESW(6),
  olMousePointerSizeNS(7),
  olMousePointerSizeNWSE(8),
  olMousePointerSizeWE(9),
  olMousePointerUpArrow(10),
  olMousePointerHourGlass(11),
  olMousePointerNoDrop(12),
  olMousePointerAppStarting(13),
  olMousePointerHelp(14),
  olMousePointerSizeAll(15),
  olMousePointerCustom(99);

  public final int value;
  private OlMousePointer(int value) { this.value = value; }
  public static  OlMousePointer valueOf(int value) {
    switch(value) {
    case 0: return olMousePointerDefault;
    case 1: return olMousePointerArrow;
    case 2: return olMousePointerCross;
    case 3: return olMousePointerIBeam;
    case 6: return olMousePointerSizeNESW;
    case 7: return olMousePointerSizeNS;
    case 8: return olMousePointerSizeNWSE;
    case 9: return olMousePointerSizeWE;
    case 10: return olMousePointerUpArrow;
    case 11: return olMousePointerHourGlass;
    case 12: return olMousePointerNoDrop;
    case 13: return olMousePointerAppStarting;
    case 14: return olMousePointerHelp;
    case 15: return olMousePointerSizeAll;
    case 99: return olMousePointerCustom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMousePointer.class);
    }
  }
}
