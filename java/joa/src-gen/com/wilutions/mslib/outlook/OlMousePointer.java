/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMousePointer.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{1BA5FCB6-05E9-4721-979D-3CE2C9084479}")
public class OlMousePointer {

  // Typed constants
  public final static OlMousePointer olMousePointerDefault = new OlMousePointer(0);
  public final static OlMousePointer olMousePointerArrow = new OlMousePointer(1);
  public final static OlMousePointer olMousePointerCross = new OlMousePointer(2);
  public final static OlMousePointer olMousePointerIBeam = new OlMousePointer(3);
  public final static OlMousePointer olMousePointerSizeNESW = new OlMousePointer(6);
  public final static OlMousePointer olMousePointerSizeNS = new OlMousePointer(7);
  public final static OlMousePointer olMousePointerSizeNWSE = new OlMousePointer(8);
  public final static OlMousePointer olMousePointerSizeWE = new OlMousePointer(9);
  public final static OlMousePointer olMousePointerUpArrow = new OlMousePointer(10);
  public final static OlMousePointer olMousePointerHourGlass = new OlMousePointer(11);
  public final static OlMousePointer olMousePointerNoDrop = new OlMousePointer(12);
  public final static OlMousePointer olMousePointerAppStarting = new OlMousePointer(13);
  public final static OlMousePointer olMousePointerHelp = new OlMousePointer(14);
  public final static OlMousePointer olMousePointerSizeAll = new OlMousePointer(15);
  public final static OlMousePointer olMousePointerCustom = new OlMousePointer(99);

  // Integer constants for bitsets and switch statements
  public final static int _olMousePointerDefault = 0;
  public final static int _olMousePointerArrow = 1;
  public final static int _olMousePointerCross = 2;
  public final static int _olMousePointerIBeam = 3;
  public final static int _olMousePointerSizeNESW = 6;
  public final static int _olMousePointerSizeNS = 7;
  public final static int _olMousePointerSizeNWSE = 8;
  public final static int _olMousePointerSizeWE = 9;
  public final static int _olMousePointerUpArrow = 10;
  public final static int _olMousePointerHourGlass = 11;
  public final static int _olMousePointerNoDrop = 12;
  public final static int _olMousePointerAppStarting = 13;
  public final static int _olMousePointerHelp = 14;
  public final static int _olMousePointerSizeAll = 15;
  public final static int _olMousePointerCustom = 99;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMousePointer(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlMousePointer(value);
    }
  }
}
