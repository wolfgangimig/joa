/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCTPDockPositionRestrict.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCTPDockPositionRestrict implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoCTPDockPositionRestrict msoCTPDockPositionRestrictNone = new MsoCTPDockPositionRestrict(0);
  public final static MsoCTPDockPositionRestrict msoCTPDockPositionRestrictNoChange = new MsoCTPDockPositionRestrict(1);
  public final static MsoCTPDockPositionRestrict msoCTPDockPositionRestrictNoHorizontal = new MsoCTPDockPositionRestrict(2);
  public final static MsoCTPDockPositionRestrict msoCTPDockPositionRestrictNoVertical = new MsoCTPDockPositionRestrict(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoCTPDockPositionRestrictNone = 0;
  public final static int _msoCTPDockPositionRestrictNoChange = 1;
  public final static int _msoCTPDockPositionRestrictNoHorizontal = 2;
  public final static int _msoCTPDockPositionRestrictNoVertical = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoCTPDockPositionRestrict(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoCTPDockPositionRestrict valueOf(int value) {
    switch(value) {
    case 0: return msoCTPDockPositionRestrictNone;
    case 1: return msoCTPDockPositionRestrictNoChange;
    case 2: return msoCTPDockPositionRestrictNoHorizontal;
    case 3: return msoCTPDockPositionRestrictNoVertical;
    default: return new MsoCTPDockPositionRestrict(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoCTPDockPositionRestrictNone";
    case 1: return "msoCTPDockPositionRestrictNoChange";
    case 2: return "msoCTPDockPositionRestrictNoHorizontal";
    case 3: return "msoCTPDockPositionRestrictNoVertical";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoCTPDockPositionRestrictNone");
      if ((value & 1) != 0) sbuf.append("|msoCTPDockPositionRestrictNoChange");
      if ((value & 2) != 0) sbuf.append("|msoCTPDockPositionRestrictNoHorizontal");
      if ((value & 3) != 0) sbuf.append("|msoCTPDockPositionRestrictNoVertical");
      return sbuf.toString();
      }
    }
  }
}
