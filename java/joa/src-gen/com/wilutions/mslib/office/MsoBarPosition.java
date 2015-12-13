/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBarPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBarPosition implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBarPosition msoBarLeft = new MsoBarPosition(0);
  public final static MsoBarPosition msoBarTop = new MsoBarPosition(1);
  public final static MsoBarPosition msoBarRight = new MsoBarPosition(2);
  public final static MsoBarPosition msoBarBottom = new MsoBarPosition(3);
  public final static MsoBarPosition msoBarFloating = new MsoBarPosition(4);
  public final static MsoBarPosition msoBarPopup = new MsoBarPosition(5);
  public final static MsoBarPosition msoBarMenuBar = new MsoBarPosition(6);

  // Integer constants for bitsets and switch statements
  public final static int _msoBarLeft = 0;
  public final static int _msoBarTop = 1;
  public final static int _msoBarRight = 2;
  public final static int _msoBarBottom = 3;
  public final static int _msoBarFloating = 4;
  public final static int _msoBarPopup = 5;
  public final static int _msoBarMenuBar = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBarPosition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBarPosition valueOf(int value) {
    switch(value) {
    case 0: return msoBarLeft;
    case 1: return msoBarTop;
    case 2: return msoBarRight;
    case 3: return msoBarBottom;
    case 4: return msoBarFloating;
    case 5: return msoBarPopup;
    case 6: return msoBarMenuBar;
    default: return new MsoBarPosition(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoBarLeft";
    case 1: return "msoBarTop";
    case 2: return "msoBarRight";
    case 3: return "msoBarBottom";
    case 4: return "msoBarFloating";
    case 5: return "msoBarPopup";
    case 6: return "msoBarMenuBar";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoBarLeft");
      if ((value & 1) != 0) sbuf.append("|msoBarTop");
      if ((value & 2) != 0) sbuf.append("|msoBarRight");
      if ((value & 3) != 0) sbuf.append("|msoBarBottom");
      if ((value & 4) != 0) sbuf.append("|msoBarFloating");
      if ((value & 5) != 0) sbuf.append("|msoBarPopup");
      if ((value & 6) != 0) sbuf.append("|msoBarMenuBar");
      return sbuf.toString();
      }
    }
  }
}
