/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCTPDockPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCTPDockPosition implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoCTPDockPosition msoCTPDockPositionLeft = new MsoCTPDockPosition(0);
  public final static MsoCTPDockPosition msoCTPDockPositionTop = new MsoCTPDockPosition(1);
  public final static MsoCTPDockPosition msoCTPDockPositionRight = new MsoCTPDockPosition(2);
  public final static MsoCTPDockPosition msoCTPDockPositionBottom = new MsoCTPDockPosition(3);
  public final static MsoCTPDockPosition msoCTPDockPositionFloating = new MsoCTPDockPosition(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoCTPDockPositionLeft = 0;
  public final static int _msoCTPDockPositionTop = 1;
  public final static int _msoCTPDockPositionRight = 2;
  public final static int _msoCTPDockPositionBottom = 3;
  public final static int _msoCTPDockPositionFloating = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoCTPDockPosition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoCTPDockPosition valueOf(int value) {
    switch(value) {
    case 0: return msoCTPDockPositionLeft;
    case 1: return msoCTPDockPositionTop;
    case 2: return msoCTPDockPositionRight;
    case 3: return msoCTPDockPositionBottom;
    case 4: return msoCTPDockPositionFloating;
    default: return new MsoCTPDockPosition(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoCTPDockPositionLeft";
    case 1: return "msoCTPDockPositionTop";
    case 2: return "msoCTPDockPositionRight";
    case 3: return "msoCTPDockPositionBottom";
    case 4: return "msoCTPDockPositionFloating";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoCTPDockPositionLeft");
      if ((value & 1) != 0) sbuf.append("|msoCTPDockPositionTop");
      if ((value & 2) != 0) sbuf.append("|msoCTPDockPositionRight");
      if ((value & 3) != 0) sbuf.append("|msoCTPDockPositionBottom");
      if ((value & 4) != 0) sbuf.append("|msoCTPDockPositionFloating");
      return sbuf.toString();
      }
    }
  }
}
