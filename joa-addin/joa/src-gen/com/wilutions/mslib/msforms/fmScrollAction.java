/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmScrollAction.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{E0ABC3C0-D199-11CE-8CCE-00AA0044BB60}")
public class fmScrollAction implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmScrollAction fmScrollActionNoChange = new fmScrollAction(0);
  public final static fmScrollAction fmScrollActionLineUp = new fmScrollAction(1);
  public final static fmScrollAction fmScrollActionLineDown = new fmScrollAction(2);
  public final static fmScrollAction fmScrollActionPageUp = new fmScrollAction(3);
  public final static fmScrollAction fmScrollActionPageDown = new fmScrollAction(4);
  public final static fmScrollAction fmScrollActionBegin = new fmScrollAction(5);
  public final static fmScrollAction fmScrollActionEnd = new fmScrollAction(6);
  public final static fmScrollAction _fmScrollActionAbsoluteChange = new fmScrollAction(7);
  public final static fmScrollAction fmScrollActionPropertyChange = new fmScrollAction(8);
  public final static fmScrollAction fmScrollActionControlRequest = new fmScrollAction(9);
  public final static fmScrollAction fmScrollActionFocusRequest = new fmScrollAction(10);

  // Integer constants for bitsets and switch statements
  public final static int _fmScrollActionNoChange = 0;
  public final static int _fmScrollActionLineUp = 1;
  public final static int _fmScrollActionLineDown = 2;
  public final static int _fmScrollActionPageUp = 3;
  public final static int _fmScrollActionPageDown = 4;
  public final static int _fmScrollActionBegin = 5;
  public final static int _fmScrollActionEnd = 6;
  public final static int __fmScrollActionAbsoluteChange = 7;
  public final static int _fmScrollActionPropertyChange = 8;
  public final static int _fmScrollActionControlRequest = 9;
  public final static int _fmScrollActionFocusRequest = 10;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmScrollAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmScrollAction valueOf(int value) {
    switch(value) {
    case 0: return fmScrollActionNoChange;
    case 1: return fmScrollActionLineUp;
    case 2: return fmScrollActionLineDown;
    case 3: return fmScrollActionPageUp;
    case 4: return fmScrollActionPageDown;
    case 5: return fmScrollActionBegin;
    case 6: return fmScrollActionEnd;
    case 7: return _fmScrollActionAbsoluteChange;
    case 8: return fmScrollActionPropertyChange;
    case 9: return fmScrollActionControlRequest;
    case 10: return fmScrollActionFocusRequest;
    default: return new fmScrollAction(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "fmScrollActionPropertyChange";
    case 0: return "fmScrollActionNoChange";
    case 1: return "fmScrollActionLineUp";
    case 2: return "fmScrollActionLineDown";
    case 3: return "fmScrollActionPageUp";
    case 4: return "fmScrollActionPageDown";
    case 5: return "fmScrollActionBegin";
    case 6: return "fmScrollActionEnd";
    case 7: return "_fmScrollActionAbsoluteChange";
    case 9: return "fmScrollActionControlRequest";
    case 10: return "fmScrollActionFocusRequest";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|fmScrollActionPropertyChange");
      if ((value & 0) != 0) sbuf.append("|fmScrollActionNoChange");
      if ((value & 1) != 0) sbuf.append("|fmScrollActionLineUp");
      if ((value & 2) != 0) sbuf.append("|fmScrollActionLineDown");
      if ((value & 3) != 0) sbuf.append("|fmScrollActionPageUp");
      if ((value & 4) != 0) sbuf.append("|fmScrollActionPageDown");
      if ((value & 5) != 0) sbuf.append("|fmScrollActionBegin");
      if ((value & 6) != 0) sbuf.append("|fmScrollActionEnd");
      if ((value & 7) != 0) sbuf.append("|_fmScrollActionAbsoluteChange");
      if ((value & 9) != 0) sbuf.append("|fmScrollActionControlRequest");
      if ((value & 10) != 0) sbuf.append("|fmScrollActionFocusRequest");
      return sbuf.toString();
      }
    }
  }
}
