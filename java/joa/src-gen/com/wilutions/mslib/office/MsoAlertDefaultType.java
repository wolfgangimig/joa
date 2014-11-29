/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAlertDefaultType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoAlertDefaultType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoAlertDefaultType msoAlertDefaultFirst = new MsoAlertDefaultType(0);
  public final static MsoAlertDefaultType msoAlertDefaultSecond = new MsoAlertDefaultType(1);
  public final static MsoAlertDefaultType msoAlertDefaultThird = new MsoAlertDefaultType(2);
  public final static MsoAlertDefaultType msoAlertDefaultFourth = new MsoAlertDefaultType(3);
  public final static MsoAlertDefaultType msoAlertDefaultFifth = new MsoAlertDefaultType(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoAlertDefaultFirst = 0;
  public final static int _msoAlertDefaultSecond = 1;
  public final static int _msoAlertDefaultThird = 2;
  public final static int _msoAlertDefaultFourth = 3;
  public final static int _msoAlertDefaultFifth = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoAlertDefaultType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoAlertDefaultType valueOf(int value) {
    switch(value) {
    case 0: return msoAlertDefaultFirst;
    case 1: return msoAlertDefaultSecond;
    case 2: return msoAlertDefaultThird;
    case 3: return msoAlertDefaultFourth;
    case 4: return msoAlertDefaultFifth;
    default: return new MsoAlertDefaultType(value);
    }
  }
}
