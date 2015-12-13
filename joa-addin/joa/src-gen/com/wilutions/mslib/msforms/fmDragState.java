/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmDragState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{82074C80-EA51-11CE-8043-00AA006009FA}")
public class fmDragState implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmDragState fmDragStateEnter = new fmDragState(0);
  public final static fmDragState fmDragStateLeave = new fmDragState(1);
  public final static fmDragState fmDragStateOver = new fmDragState(2);

  // Integer constants for bitsets and switch statements
  public final static int _fmDragStateEnter = 0;
  public final static int _fmDragStateLeave = 1;
  public final static int _fmDragStateOver = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmDragState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmDragState valueOf(int value) {
    switch(value) {
    case 0: return fmDragStateEnter;
    case 1: return fmDragStateLeave;
    case 2: return fmDragStateOver;
    default: return new fmDragState(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "fmDragStateEnter";
    case 1: return "fmDragStateLeave";
    case 2: return "fmDragStateOver";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|fmDragStateEnter");
      if ((value & 1) != 0) sbuf.append("|fmDragStateLeave");
      if ((value & 2) != 0) sbuf.append("|fmDragStateOver");
      return sbuf.toString();
      }
    }
  }
}
