/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAlertCancelType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoAlertCancelType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoAlertCancelType msoAlertCancelDefault = new MsoAlertCancelType(-1);
  public final static MsoAlertCancelType msoAlertCancelFirst = new MsoAlertCancelType(0);
  public final static MsoAlertCancelType msoAlertCancelSecond = new MsoAlertCancelType(1);
  public final static MsoAlertCancelType msoAlertCancelThird = new MsoAlertCancelType(2);
  public final static MsoAlertCancelType msoAlertCancelFourth = new MsoAlertCancelType(3);
  public final static MsoAlertCancelType msoAlertCancelFifth = new MsoAlertCancelType(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoAlertCancelDefault = -1;
  public final static int _msoAlertCancelFirst = 0;
  public final static int _msoAlertCancelSecond = 1;
  public final static int _msoAlertCancelThird = 2;
  public final static int _msoAlertCancelFourth = 3;
  public final static int _msoAlertCancelFifth = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoAlertCancelType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoAlertCancelType valueOf(int value) {
    switch(value) {
    case -1: return msoAlertCancelDefault;
    case 0: return msoAlertCancelFirst;
    case 1: return msoAlertCancelSecond;
    case 2: return msoAlertCancelThird;
    case 3: return msoAlertCancelFourth;
    case 4: return msoAlertCancelFifth;
    default: return new MsoAlertCancelType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 4: return "msoAlertCancelFifth";
    case -1: return "msoAlertCancelDefault";
    case 0: return "msoAlertCancelFirst";
    case 1: return "msoAlertCancelSecond";
    case 2: return "msoAlertCancelThird";
    case 3: return "msoAlertCancelFourth";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 4) != 0) sbuf.append("|msoAlertCancelFifth");
      if ((value & -1) != 0) sbuf.append("|msoAlertCancelDefault");
      if ((value & 0) != 0) sbuf.append("|msoAlertCancelFirst");
      if ((value & 1) != 0) sbuf.append("|msoAlertCancelSecond");
      if ((value & 2) != 0) sbuf.append("|msoAlertCancelThird");
      if ((value & 3) != 0) sbuf.append("|msoAlertCancelFourth");
      return sbuf.toString();
      }
    }
  }
}
