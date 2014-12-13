/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLineFillType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoLineFillType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoLineFillType msoLineFillMixed = new MsoLineFillType(-2);
  public final static MsoLineFillType msoLineFillNone = new MsoLineFillType(0);
  public final static MsoLineFillType msoLineFillSolid = new MsoLineFillType(1);
  public final static MsoLineFillType msoLineFillPatterned = new MsoLineFillType(2);
  public final static MsoLineFillType msoLineFillGradient = new MsoLineFillType(3);
  public final static MsoLineFillType msoLineFillTextured = new MsoLineFillType(4);
  public final static MsoLineFillType msoLineFillBackground = new MsoLineFillType(5);
  public final static MsoLineFillType msoLineFillPicture = new MsoLineFillType(6);

  // Integer constants for bitsets and switch statements
  public final static int _msoLineFillMixed = -2;
  public final static int _msoLineFillNone = 0;
  public final static int _msoLineFillSolid = 1;
  public final static int _msoLineFillPatterned = 2;
  public final static int _msoLineFillGradient = 3;
  public final static int _msoLineFillTextured = 4;
  public final static int _msoLineFillBackground = 5;
  public final static int _msoLineFillPicture = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoLineFillType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoLineFillType valueOf(int value) {
    switch(value) {
    case -2: return msoLineFillMixed;
    case 0: return msoLineFillNone;
    case 1: return msoLineFillSolid;
    case 2: return msoLineFillPatterned;
    case 3: return msoLineFillGradient;
    case 4: return msoLineFillTextured;
    case 5: return msoLineFillBackground;
    case 6: return msoLineFillPicture;
    default: return new MsoLineFillType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoLineFillPatterned";
    case -2: return "msoLineFillMixed";
    case 0: return "msoLineFillNone";
    case 1: return "msoLineFillSolid";
    case 3: return "msoLineFillGradient";
    case 4: return "msoLineFillTextured";
    case 5: return "msoLineFillBackground";
    case 6: return "msoLineFillPicture";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoLineFillPatterned");
      if ((value & -2) != 0) sbuf.append("|msoLineFillMixed");
      if ((value & 0) != 0) sbuf.append("|msoLineFillNone");
      if ((value & 1) != 0) sbuf.append("|msoLineFillSolid");
      if ((value & 3) != 0) sbuf.append("|msoLineFillGradient");
      if ((value & 4) != 0) sbuf.append("|msoLineFillTextured");
      if ((value & 5) != 0) sbuf.append("|msoLineFillBackground");
      if ((value & 6) != 0) sbuf.append("|msoLineFillPicture");
      return sbuf.toString();
      }
    }
  }
}
