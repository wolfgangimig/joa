/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoWarpFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoWarpFormat implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoWarpFormat msoWarpFormatMixed = new MsoWarpFormat(-2);
  public final static MsoWarpFormat msoWarpFormat1 = new MsoWarpFormat(0);
  public final static MsoWarpFormat msoWarpFormat2 = new MsoWarpFormat(1);
  public final static MsoWarpFormat msoWarpFormat3 = new MsoWarpFormat(2);
  public final static MsoWarpFormat msoWarpFormat4 = new MsoWarpFormat(3);
  public final static MsoWarpFormat msoWarpFormat5 = new MsoWarpFormat(4);
  public final static MsoWarpFormat msoWarpFormat6 = new MsoWarpFormat(5);
  public final static MsoWarpFormat msoWarpFormat7 = new MsoWarpFormat(6);
  public final static MsoWarpFormat msoWarpFormat8 = new MsoWarpFormat(7);
  public final static MsoWarpFormat msoWarpFormat9 = new MsoWarpFormat(8);
  public final static MsoWarpFormat msoWarpFormat10 = new MsoWarpFormat(9);
  public final static MsoWarpFormat msoWarpFormat11 = new MsoWarpFormat(10);
  public final static MsoWarpFormat msoWarpFormat12 = new MsoWarpFormat(11);
  public final static MsoWarpFormat msoWarpFormat13 = new MsoWarpFormat(12);
  public final static MsoWarpFormat msoWarpFormat14 = new MsoWarpFormat(13);
  public final static MsoWarpFormat msoWarpFormat15 = new MsoWarpFormat(14);
  public final static MsoWarpFormat msoWarpFormat16 = new MsoWarpFormat(15);
  public final static MsoWarpFormat msoWarpFormat17 = new MsoWarpFormat(16);
  public final static MsoWarpFormat msoWarpFormat18 = new MsoWarpFormat(17);
  public final static MsoWarpFormat msoWarpFormat19 = new MsoWarpFormat(18);
  public final static MsoWarpFormat msoWarpFormat20 = new MsoWarpFormat(19);
  public final static MsoWarpFormat msoWarpFormat21 = new MsoWarpFormat(20);
  public final static MsoWarpFormat msoWarpFormat22 = new MsoWarpFormat(21);
  public final static MsoWarpFormat msoWarpFormat23 = new MsoWarpFormat(22);
  public final static MsoWarpFormat msoWarpFormat24 = new MsoWarpFormat(23);
  public final static MsoWarpFormat msoWarpFormat25 = new MsoWarpFormat(24);
  public final static MsoWarpFormat msoWarpFormat26 = new MsoWarpFormat(25);
  public final static MsoWarpFormat msoWarpFormat27 = new MsoWarpFormat(26);
  public final static MsoWarpFormat msoWarpFormat28 = new MsoWarpFormat(27);
  public final static MsoWarpFormat msoWarpFormat29 = new MsoWarpFormat(28);
  public final static MsoWarpFormat msoWarpFormat30 = new MsoWarpFormat(29);
  public final static MsoWarpFormat msoWarpFormat31 = new MsoWarpFormat(30);
  public final static MsoWarpFormat msoWarpFormat32 = new MsoWarpFormat(31);
  public final static MsoWarpFormat msoWarpFormat33 = new MsoWarpFormat(32);
  public final static MsoWarpFormat msoWarpFormat34 = new MsoWarpFormat(33);
  public final static MsoWarpFormat msoWarpFormat35 = new MsoWarpFormat(34);
  public final static MsoWarpFormat msoWarpFormat36 = new MsoWarpFormat(35);
  public final static MsoWarpFormat msoWarpFormat37 = new MsoWarpFormat(36);

  // Integer constants for bitsets and switch statements
  public final static int _msoWarpFormatMixed = -2;
  public final static int _msoWarpFormat1 = 0;
  public final static int _msoWarpFormat2 = 1;
  public final static int _msoWarpFormat3 = 2;
  public final static int _msoWarpFormat4 = 3;
  public final static int _msoWarpFormat5 = 4;
  public final static int _msoWarpFormat6 = 5;
  public final static int _msoWarpFormat7 = 6;
  public final static int _msoWarpFormat8 = 7;
  public final static int _msoWarpFormat9 = 8;
  public final static int _msoWarpFormat10 = 9;
  public final static int _msoWarpFormat11 = 10;
  public final static int _msoWarpFormat12 = 11;
  public final static int _msoWarpFormat13 = 12;
  public final static int _msoWarpFormat14 = 13;
  public final static int _msoWarpFormat15 = 14;
  public final static int _msoWarpFormat16 = 15;
  public final static int _msoWarpFormat17 = 16;
  public final static int _msoWarpFormat18 = 17;
  public final static int _msoWarpFormat19 = 18;
  public final static int _msoWarpFormat20 = 19;
  public final static int _msoWarpFormat21 = 20;
  public final static int _msoWarpFormat22 = 21;
  public final static int _msoWarpFormat23 = 22;
  public final static int _msoWarpFormat24 = 23;
  public final static int _msoWarpFormat25 = 24;
  public final static int _msoWarpFormat26 = 25;
  public final static int _msoWarpFormat27 = 26;
  public final static int _msoWarpFormat28 = 27;
  public final static int _msoWarpFormat29 = 28;
  public final static int _msoWarpFormat30 = 29;
  public final static int _msoWarpFormat31 = 30;
  public final static int _msoWarpFormat32 = 31;
  public final static int _msoWarpFormat33 = 32;
  public final static int _msoWarpFormat34 = 33;
  public final static int _msoWarpFormat35 = 34;
  public final static int _msoWarpFormat36 = 35;
  public final static int _msoWarpFormat37 = 36;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoWarpFormat(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoWarpFormat valueOf(int value) {
    switch(value) {
    case -2: return msoWarpFormatMixed;
    case 0: return msoWarpFormat1;
    case 1: return msoWarpFormat2;
    case 2: return msoWarpFormat3;
    case 3: return msoWarpFormat4;
    case 4: return msoWarpFormat5;
    case 5: return msoWarpFormat6;
    case 6: return msoWarpFormat7;
    case 7: return msoWarpFormat8;
    case 8: return msoWarpFormat9;
    case 9: return msoWarpFormat10;
    case 10: return msoWarpFormat11;
    case 11: return msoWarpFormat12;
    case 12: return msoWarpFormat13;
    case 13: return msoWarpFormat14;
    case 14: return msoWarpFormat15;
    case 15: return msoWarpFormat16;
    case 16: return msoWarpFormat17;
    case 17: return msoWarpFormat18;
    case 18: return msoWarpFormat19;
    case 19: return msoWarpFormat20;
    case 20: return msoWarpFormat21;
    case 21: return msoWarpFormat22;
    case 22: return msoWarpFormat23;
    case 23: return msoWarpFormat24;
    case 24: return msoWarpFormat25;
    case 25: return msoWarpFormat26;
    case 26: return msoWarpFormat27;
    case 27: return msoWarpFormat28;
    case 28: return msoWarpFormat29;
    case 29: return msoWarpFormat30;
    case 30: return msoWarpFormat31;
    case 31: return msoWarpFormat32;
    case 32: return msoWarpFormat33;
    case 33: return msoWarpFormat34;
    case 34: return msoWarpFormat35;
    case 35: return msoWarpFormat36;
    case 36: return msoWarpFormat37;
    default: return new MsoWarpFormat(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoWarpFormatMixed";
    case 2: return "msoWarpFormat3";
    case 10: return "msoWarpFormat11";
    case 0: return "msoWarpFormat1";
    case 28: return "msoWarpFormat29";
    case 1: return "msoWarpFormat2";
    case 3: return "msoWarpFormat4";
    case 4: return "msoWarpFormat5";
    case 5: return "msoWarpFormat6";
    case 6: return "msoWarpFormat7";
    case 7: return "msoWarpFormat8";
    case 18: return "msoWarpFormat19";
    case 8: return "msoWarpFormat9";
    case 20: return "msoWarpFormat21";
    case 9: return "msoWarpFormat10";
    case 11: return "msoWarpFormat12";
    case 12: return "msoWarpFormat13";
    case 13: return "msoWarpFormat14";
    case 14: return "msoWarpFormat15";
    case 15: return "msoWarpFormat16";
    case 16: return "msoWarpFormat17";
    case 17: return "msoWarpFormat18";
    case 19: return "msoWarpFormat20";
    case 21: return "msoWarpFormat22";
    case 22: return "msoWarpFormat23";
    case 23: return "msoWarpFormat24";
    case 24: return "msoWarpFormat25";
    case 25: return "msoWarpFormat26";
    case 26: return "msoWarpFormat27";
    case 27: return "msoWarpFormat28";
    case 29: return "msoWarpFormat30";
    case 30: return "msoWarpFormat31";
    case 31: return "msoWarpFormat32";
    case 32: return "msoWarpFormat33";
    case 33: return "msoWarpFormat34";
    case 34: return "msoWarpFormat35";
    case 35: return "msoWarpFormat36";
    case 36: return "msoWarpFormat37";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoWarpFormatMixed");
      if ((value & 2) != 0) sbuf.append("|msoWarpFormat3");
      if ((value & 10) != 0) sbuf.append("|msoWarpFormat11");
      if ((value & 0) != 0) sbuf.append("|msoWarpFormat1");
      if ((value & 28) != 0) sbuf.append("|msoWarpFormat29");
      if ((value & 1) != 0) sbuf.append("|msoWarpFormat2");
      if ((value & 3) != 0) sbuf.append("|msoWarpFormat4");
      if ((value & 4) != 0) sbuf.append("|msoWarpFormat5");
      if ((value & 5) != 0) sbuf.append("|msoWarpFormat6");
      if ((value & 6) != 0) sbuf.append("|msoWarpFormat7");
      if ((value & 7) != 0) sbuf.append("|msoWarpFormat8");
      if ((value & 18) != 0) sbuf.append("|msoWarpFormat19");
      if ((value & 8) != 0) sbuf.append("|msoWarpFormat9");
      if ((value & 20) != 0) sbuf.append("|msoWarpFormat21");
      if ((value & 9) != 0) sbuf.append("|msoWarpFormat10");
      if ((value & 11) != 0) sbuf.append("|msoWarpFormat12");
      if ((value & 12) != 0) sbuf.append("|msoWarpFormat13");
      if ((value & 13) != 0) sbuf.append("|msoWarpFormat14");
      if ((value & 14) != 0) sbuf.append("|msoWarpFormat15");
      if ((value & 15) != 0) sbuf.append("|msoWarpFormat16");
      if ((value & 16) != 0) sbuf.append("|msoWarpFormat17");
      if ((value & 17) != 0) sbuf.append("|msoWarpFormat18");
      if ((value & 19) != 0) sbuf.append("|msoWarpFormat20");
      if ((value & 21) != 0) sbuf.append("|msoWarpFormat22");
      if ((value & 22) != 0) sbuf.append("|msoWarpFormat23");
      if ((value & 23) != 0) sbuf.append("|msoWarpFormat24");
      if ((value & 24) != 0) sbuf.append("|msoWarpFormat25");
      if ((value & 25) != 0) sbuf.append("|msoWarpFormat26");
      if ((value & 26) != 0) sbuf.append("|msoWarpFormat27");
      if ((value & 27) != 0) sbuf.append("|msoWarpFormat28");
      if ((value & 29) != 0) sbuf.append("|msoWarpFormat30");
      if ((value & 30) != 0) sbuf.append("|msoWarpFormat31");
      if ((value & 31) != 0) sbuf.append("|msoWarpFormat32");
      if ((value & 32) != 0) sbuf.append("|msoWarpFormat33");
      if ((value & 33) != 0) sbuf.append("|msoWarpFormat34");
      if ((value & 34) != 0) sbuf.append("|msoWarpFormat35");
      if ((value & 35) != 0) sbuf.append("|msoWarpFormat36");
      if ((value & 36) != 0) sbuf.append("|msoWarpFormat37");
      return sbuf.toString();
      }
    }
  }
}
