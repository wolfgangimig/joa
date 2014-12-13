/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoColorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoColorType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoColorType msoColorTypeMixed = new MsoColorType(-2);
  public final static MsoColorType msoColorTypeRGB = new MsoColorType(1);
  public final static MsoColorType msoColorTypeScheme = new MsoColorType(2);
  public final static MsoColorType msoColorTypeCMYK = new MsoColorType(3);
  public final static MsoColorType msoColorTypeCMS = new MsoColorType(4);
  public final static MsoColorType msoColorTypeInk = new MsoColorType(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoColorTypeMixed = -2;
  public final static int _msoColorTypeRGB = 1;
  public final static int _msoColorTypeScheme = 2;
  public final static int _msoColorTypeCMYK = 3;
  public final static int _msoColorTypeCMS = 4;
  public final static int _msoColorTypeInk = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoColorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoColorType valueOf(int value) {
    switch(value) {
    case -2: return msoColorTypeMixed;
    case 1: return msoColorTypeRGB;
    case 2: return msoColorTypeScheme;
    case 3: return msoColorTypeCMYK;
    case 4: return msoColorTypeCMS;
    case 5: return msoColorTypeInk;
    default: return new MsoColorType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoColorTypeScheme";
    case -2: return "msoColorTypeMixed";
    case 1: return "msoColorTypeRGB";
    case 3: return "msoColorTypeCMYK";
    case 4: return "msoColorTypeCMS";
    case 5: return "msoColorTypeInk";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoColorTypeScheme");
      if ((value & -2) != 0) sbuf.append("|msoColorTypeMixed");
      if ((value & 1) != 0) sbuf.append("|msoColorTypeRGB");
      if ((value & 3) != 0) sbuf.append("|msoColorTypeCMYK");
      if ((value & 4) != 0) sbuf.append("|msoColorTypeCMS");
      if ((value & 5) != 0) sbuf.append("|msoColorTypeInk");
      return sbuf.toString();
      }
    }
  }
}
