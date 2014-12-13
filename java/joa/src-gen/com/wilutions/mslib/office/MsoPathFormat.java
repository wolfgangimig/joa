/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPathFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPathFormat implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoPathFormat msoPathTypeMixed = new MsoPathFormat(-2);
  public final static MsoPathFormat msoPathTypeNone = new MsoPathFormat(0);
  public final static MsoPathFormat msoPathType1 = new MsoPathFormat(1);
  public final static MsoPathFormat msoPathType2 = new MsoPathFormat(2);
  public final static MsoPathFormat msoPathType3 = new MsoPathFormat(3);
  public final static MsoPathFormat msoPathType4 = new MsoPathFormat(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoPathTypeMixed = -2;
  public final static int _msoPathTypeNone = 0;
  public final static int _msoPathType1 = 1;
  public final static int _msoPathType2 = 2;
  public final static int _msoPathType3 = 3;
  public final static int _msoPathType4 = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPathFormat(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPathFormat valueOf(int value) {
    switch(value) {
    case -2: return msoPathTypeMixed;
    case 0: return msoPathTypeNone;
    case 1: return msoPathType1;
    case 2: return msoPathType2;
    case 3: return msoPathType3;
    case 4: return msoPathType4;
    default: return new MsoPathFormat(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoPathType2";
    case -2: return "msoPathTypeMixed";
    case 0: return "msoPathTypeNone";
    case 1: return "msoPathType1";
    case 3: return "msoPathType3";
    case 4: return "msoPathType4";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoPathType2");
      if ((value & -2) != 0) sbuf.append("|msoPathTypeMixed");
      if ((value & 0) != 0) sbuf.append("|msoPathTypeNone");
      if ((value & 1) != 0) sbuf.append("|msoPathType1");
      if ((value & 3) != 0) sbuf.append("|msoPathType3");
      if ((value & 4) != 0) sbuf.append("|msoPathType4");
      return sbuf.toString();
      }
    }
  }
}
