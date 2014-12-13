/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFillType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFillType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFillType msoFillMixed = new MsoFillType(-2);
  public final static MsoFillType msoFillSolid = new MsoFillType(1);
  public final static MsoFillType msoFillPatterned = new MsoFillType(2);
  public final static MsoFillType msoFillGradient = new MsoFillType(3);
  public final static MsoFillType msoFillTextured = new MsoFillType(4);
  public final static MsoFillType msoFillBackground = new MsoFillType(5);
  public final static MsoFillType msoFillPicture = new MsoFillType(6);

  // Integer constants for bitsets and switch statements
  public final static int _msoFillMixed = -2;
  public final static int _msoFillSolid = 1;
  public final static int _msoFillPatterned = 2;
  public final static int _msoFillGradient = 3;
  public final static int _msoFillTextured = 4;
  public final static int _msoFillBackground = 5;
  public final static int _msoFillPicture = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFillType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFillType valueOf(int value) {
    switch(value) {
    case -2: return msoFillMixed;
    case 1: return msoFillSolid;
    case 2: return msoFillPatterned;
    case 3: return msoFillGradient;
    case 4: return msoFillTextured;
    case 5: return msoFillBackground;
    case 6: return msoFillPicture;
    default: return new MsoFillType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoFillPatterned";
    case -2: return "msoFillMixed";
    case 1: return "msoFillSolid";
    case 3: return "msoFillGradient";
    case 4: return "msoFillTextured";
    case 5: return "msoFillBackground";
    case 6: return "msoFillPicture";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoFillPatterned");
      if ((value & -2) != 0) sbuf.append("|msoFillMixed");
      if ((value & 1) != 0) sbuf.append("|msoFillSolid");
      if ((value & 3) != 0) sbuf.append("|msoFillGradient");
      if ((value & 4) != 0) sbuf.append("|msoFillTextured");
      if ((value & 5) != 0) sbuf.append("|msoFillBackground");
      if ((value & 6) != 0) sbuf.append("|msoFillPicture");
      return sbuf.toString();
      }
    }
  }
}
