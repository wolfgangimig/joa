/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetThreeDFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPresetThreeDFormat implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoPresetThreeDFormat msoPresetThreeDFormatMixed = new MsoPresetThreeDFormat(-2);
  public final static MsoPresetThreeDFormat msoThreeD1 = new MsoPresetThreeDFormat(1);
  public final static MsoPresetThreeDFormat msoThreeD2 = new MsoPresetThreeDFormat(2);
  public final static MsoPresetThreeDFormat msoThreeD3 = new MsoPresetThreeDFormat(3);
  public final static MsoPresetThreeDFormat msoThreeD4 = new MsoPresetThreeDFormat(4);
  public final static MsoPresetThreeDFormat msoThreeD5 = new MsoPresetThreeDFormat(5);
  public final static MsoPresetThreeDFormat msoThreeD6 = new MsoPresetThreeDFormat(6);
  public final static MsoPresetThreeDFormat msoThreeD7 = new MsoPresetThreeDFormat(7);
  public final static MsoPresetThreeDFormat msoThreeD8 = new MsoPresetThreeDFormat(8);
  public final static MsoPresetThreeDFormat msoThreeD9 = new MsoPresetThreeDFormat(9);
  public final static MsoPresetThreeDFormat msoThreeD10 = new MsoPresetThreeDFormat(10);
  public final static MsoPresetThreeDFormat msoThreeD11 = new MsoPresetThreeDFormat(11);
  public final static MsoPresetThreeDFormat msoThreeD12 = new MsoPresetThreeDFormat(12);
  public final static MsoPresetThreeDFormat msoThreeD13 = new MsoPresetThreeDFormat(13);
  public final static MsoPresetThreeDFormat msoThreeD14 = new MsoPresetThreeDFormat(14);
  public final static MsoPresetThreeDFormat msoThreeD15 = new MsoPresetThreeDFormat(15);
  public final static MsoPresetThreeDFormat msoThreeD16 = new MsoPresetThreeDFormat(16);
  public final static MsoPresetThreeDFormat msoThreeD17 = new MsoPresetThreeDFormat(17);
  public final static MsoPresetThreeDFormat msoThreeD18 = new MsoPresetThreeDFormat(18);
  public final static MsoPresetThreeDFormat msoThreeD19 = new MsoPresetThreeDFormat(19);
  public final static MsoPresetThreeDFormat msoThreeD20 = new MsoPresetThreeDFormat(20);

  // Integer constants for bitsets and switch statements
  public final static int _msoPresetThreeDFormatMixed = -2;
  public final static int _msoThreeD1 = 1;
  public final static int _msoThreeD2 = 2;
  public final static int _msoThreeD3 = 3;
  public final static int _msoThreeD4 = 4;
  public final static int _msoThreeD5 = 5;
  public final static int _msoThreeD6 = 6;
  public final static int _msoThreeD7 = 7;
  public final static int _msoThreeD8 = 8;
  public final static int _msoThreeD9 = 9;
  public final static int _msoThreeD10 = 10;
  public final static int _msoThreeD11 = 11;
  public final static int _msoThreeD12 = 12;
  public final static int _msoThreeD13 = 13;
  public final static int _msoThreeD14 = 14;
  public final static int _msoThreeD15 = 15;
  public final static int _msoThreeD16 = 16;
  public final static int _msoThreeD17 = 17;
  public final static int _msoThreeD18 = 18;
  public final static int _msoThreeD19 = 19;
  public final static int _msoThreeD20 = 20;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPresetThreeDFormat(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPresetThreeDFormat valueOf(int value) {
    switch(value) {
    case -2: return msoPresetThreeDFormatMixed;
    case 1: return msoThreeD1;
    case 2: return msoThreeD2;
    case 3: return msoThreeD3;
    case 4: return msoThreeD4;
    case 5: return msoThreeD5;
    case 6: return msoThreeD6;
    case 7: return msoThreeD7;
    case 8: return msoThreeD8;
    case 9: return msoThreeD9;
    case 10: return msoThreeD10;
    case 11: return msoThreeD11;
    case 12: return msoThreeD12;
    case 13: return msoThreeD13;
    case 14: return msoThreeD14;
    case 15: return msoThreeD15;
    case 16: return msoThreeD16;
    case 17: return msoThreeD17;
    case 18: return msoThreeD18;
    case 19: return msoThreeD19;
    case 20: return msoThreeD20;
    default: return new MsoPresetThreeDFormat(value);
    }
  }

  public String toString() {
    switch(value) {
    case 7: return "msoThreeD7";
    case -2: return "msoPresetThreeDFormatMixed";
    case 1: return "msoThreeD1";
    case 2: return "msoThreeD2";
    case 3: return "msoThreeD3";
    case 4: return "msoThreeD4";
    case 5: return "msoThreeD5";
    case 6: return "msoThreeD6";
    case 8: return "msoThreeD8";
    case 9: return "msoThreeD9";
    case 10: return "msoThreeD10";
    case 11: return "msoThreeD11";
    case 12: return "msoThreeD12";
    case 13: return "msoThreeD13";
    case 14: return "msoThreeD14";
    case 15: return "msoThreeD15";
    case 16: return "msoThreeD16";
    case 17: return "msoThreeD17";
    case 18: return "msoThreeD18";
    case 20: return "msoThreeD20";
    case 19: return "msoThreeD19";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 7) != 0) sbuf.append("|msoThreeD7");
      if ((value & -2) != 0) sbuf.append("|msoPresetThreeDFormatMixed");
      if ((value & 1) != 0) sbuf.append("|msoThreeD1");
      if ((value & 2) != 0) sbuf.append("|msoThreeD2");
      if ((value & 3) != 0) sbuf.append("|msoThreeD3");
      if ((value & 4) != 0) sbuf.append("|msoThreeD4");
      if ((value & 5) != 0) sbuf.append("|msoThreeD5");
      if ((value & 6) != 0) sbuf.append("|msoThreeD6");
      if ((value & 8) != 0) sbuf.append("|msoThreeD8");
      if ((value & 9) != 0) sbuf.append("|msoThreeD9");
      if ((value & 10) != 0) sbuf.append("|msoThreeD10");
      if ((value & 11) != 0) sbuf.append("|msoThreeD11");
      if ((value & 12) != 0) sbuf.append("|msoThreeD12");
      if ((value & 13) != 0) sbuf.append("|msoThreeD13");
      if ((value & 14) != 0) sbuf.append("|msoThreeD14");
      if ((value & 15) != 0) sbuf.append("|msoThreeD15");
      if ((value & 16) != 0) sbuf.append("|msoThreeD16");
      if ((value & 17) != 0) sbuf.append("|msoThreeD17");
      if ((value & 18) != 0) sbuf.append("|msoThreeD18");
      if ((value & 20) != 0) sbuf.append("|msoThreeD20");
      if ((value & 19) != 0) sbuf.append("|msoThreeD19");
      return sbuf.toString();
      }
    }
  }
}
