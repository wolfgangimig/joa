/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLightRigType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoLightRigType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoLightRigType msoLightRigMixed = new MsoLightRigType(-2);
  public final static MsoLightRigType msoLightRigLegacyFlat1 = new MsoLightRigType(1);
  public final static MsoLightRigType msoLightRigLegacyFlat2 = new MsoLightRigType(2);
  public final static MsoLightRigType msoLightRigLegacyFlat3 = new MsoLightRigType(3);
  public final static MsoLightRigType msoLightRigLegacyFlat4 = new MsoLightRigType(4);
  public final static MsoLightRigType msoLightRigLegacyNormal1 = new MsoLightRigType(5);
  public final static MsoLightRigType msoLightRigLegacyNormal2 = new MsoLightRigType(6);
  public final static MsoLightRigType msoLightRigLegacyNormal3 = new MsoLightRigType(7);
  public final static MsoLightRigType msoLightRigLegacyNormal4 = new MsoLightRigType(8);
  public final static MsoLightRigType msoLightRigLegacyHarsh1 = new MsoLightRigType(9);
  public final static MsoLightRigType msoLightRigLegacyHarsh2 = new MsoLightRigType(10);
  public final static MsoLightRigType msoLightRigLegacyHarsh3 = new MsoLightRigType(11);
  public final static MsoLightRigType msoLightRigLegacyHarsh4 = new MsoLightRigType(12);
  public final static MsoLightRigType msoLightRigThreePoint = new MsoLightRigType(13);
  public final static MsoLightRigType msoLightRigBalanced = new MsoLightRigType(14);
  public final static MsoLightRigType msoLightRigSoft = new MsoLightRigType(15);
  public final static MsoLightRigType msoLightRigHarsh = new MsoLightRigType(16);
  public final static MsoLightRigType msoLightRigFlood = new MsoLightRigType(17);
  public final static MsoLightRigType msoLightRigContrasting = new MsoLightRigType(18);
  public final static MsoLightRigType msoLightRigMorning = new MsoLightRigType(19);
  public final static MsoLightRigType msoLightRigSunrise = new MsoLightRigType(20);
  public final static MsoLightRigType msoLightRigSunset = new MsoLightRigType(21);
  public final static MsoLightRigType msoLightRigChilly = new MsoLightRigType(22);
  public final static MsoLightRigType msoLightRigFreezing = new MsoLightRigType(23);
  public final static MsoLightRigType msoLightRigFlat = new MsoLightRigType(24);
  public final static MsoLightRigType msoLightRigTwoPoint = new MsoLightRigType(25);
  public final static MsoLightRigType msoLightRigGlow = new MsoLightRigType(26);
  public final static MsoLightRigType msoLightRigBrightRoom = new MsoLightRigType(27);

  // Integer constants for bitsets and switch statements
  public final static int _msoLightRigMixed = -2;
  public final static int _msoLightRigLegacyFlat1 = 1;
  public final static int _msoLightRigLegacyFlat2 = 2;
  public final static int _msoLightRigLegacyFlat3 = 3;
  public final static int _msoLightRigLegacyFlat4 = 4;
  public final static int _msoLightRigLegacyNormal1 = 5;
  public final static int _msoLightRigLegacyNormal2 = 6;
  public final static int _msoLightRigLegacyNormal3 = 7;
  public final static int _msoLightRigLegacyNormal4 = 8;
  public final static int _msoLightRigLegacyHarsh1 = 9;
  public final static int _msoLightRigLegacyHarsh2 = 10;
  public final static int _msoLightRigLegacyHarsh3 = 11;
  public final static int _msoLightRigLegacyHarsh4 = 12;
  public final static int _msoLightRigThreePoint = 13;
  public final static int _msoLightRigBalanced = 14;
  public final static int _msoLightRigSoft = 15;
  public final static int _msoLightRigHarsh = 16;
  public final static int _msoLightRigFlood = 17;
  public final static int _msoLightRigContrasting = 18;
  public final static int _msoLightRigMorning = 19;
  public final static int _msoLightRigSunrise = 20;
  public final static int _msoLightRigSunset = 21;
  public final static int _msoLightRigChilly = 22;
  public final static int _msoLightRigFreezing = 23;
  public final static int _msoLightRigFlat = 24;
  public final static int _msoLightRigTwoPoint = 25;
  public final static int _msoLightRigGlow = 26;
  public final static int _msoLightRigBrightRoom = 27;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoLightRigType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoLightRigType valueOf(int value) {
    switch(value) {
    case -2: return msoLightRigMixed;
    case 1: return msoLightRigLegacyFlat1;
    case 2: return msoLightRigLegacyFlat2;
    case 3: return msoLightRigLegacyFlat3;
    case 4: return msoLightRigLegacyFlat4;
    case 5: return msoLightRigLegacyNormal1;
    case 6: return msoLightRigLegacyNormal2;
    case 7: return msoLightRigLegacyNormal3;
    case 8: return msoLightRigLegacyNormal4;
    case 9: return msoLightRigLegacyHarsh1;
    case 10: return msoLightRigLegacyHarsh2;
    case 11: return msoLightRigLegacyHarsh3;
    case 12: return msoLightRigLegacyHarsh4;
    case 13: return msoLightRigThreePoint;
    case 14: return msoLightRigBalanced;
    case 15: return msoLightRigSoft;
    case 16: return msoLightRigHarsh;
    case 17: return msoLightRigFlood;
    case 18: return msoLightRigContrasting;
    case 19: return msoLightRigMorning;
    case 20: return msoLightRigSunrise;
    case 21: return msoLightRigSunset;
    case 22: return msoLightRigChilly;
    case 23: return msoLightRigFreezing;
    case 24: return msoLightRigFlat;
    case 25: return msoLightRigTwoPoint;
    case 26: return msoLightRigGlow;
    case 27: return msoLightRigBrightRoom;
    default: return new MsoLightRigType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 7: return "msoLightRigLegacyNormal3";
    case -2: return "msoLightRigMixed";
    case 1: return "msoLightRigLegacyFlat1";
    case 2: return "msoLightRigLegacyFlat2";
    case 3: return "msoLightRigLegacyFlat3";
    case 4: return "msoLightRigLegacyFlat4";
    case 5: return "msoLightRigLegacyNormal1";
    case 6: return "msoLightRigLegacyNormal2";
    case 8: return "msoLightRigLegacyNormal4";
    case 9: return "msoLightRigLegacyHarsh1";
    case 10: return "msoLightRigLegacyHarsh2";
    case 11: return "msoLightRigLegacyHarsh3";
    case 12: return "msoLightRigLegacyHarsh4";
    case 13: return "msoLightRigThreePoint";
    case 14: return "msoLightRigBalanced";
    case 15: return "msoLightRigSoft";
    case 16: return "msoLightRigHarsh";
    case 17: return "msoLightRigFlood";
    case 21: return "msoLightRigSunset";
    case 18: return "msoLightRigContrasting";
    case 20: return "msoLightRigSunrise";
    case 19: return "msoLightRigMorning";
    case 22: return "msoLightRigChilly";
    case 23: return "msoLightRigFreezing";
    case 24: return "msoLightRigFlat";
    case 25: return "msoLightRigTwoPoint";
    case 26: return "msoLightRigGlow";
    case 27: return "msoLightRigBrightRoom";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 7) != 0) sbuf.append("|msoLightRigLegacyNormal3");
      if ((value & -2) != 0) sbuf.append("|msoLightRigMixed");
      if ((value & 1) != 0) sbuf.append("|msoLightRigLegacyFlat1");
      if ((value & 2) != 0) sbuf.append("|msoLightRigLegacyFlat2");
      if ((value & 3) != 0) sbuf.append("|msoLightRigLegacyFlat3");
      if ((value & 4) != 0) sbuf.append("|msoLightRigLegacyFlat4");
      if ((value & 5) != 0) sbuf.append("|msoLightRigLegacyNormal1");
      if ((value & 6) != 0) sbuf.append("|msoLightRigLegacyNormal2");
      if ((value & 8) != 0) sbuf.append("|msoLightRigLegacyNormal4");
      if ((value & 9) != 0) sbuf.append("|msoLightRigLegacyHarsh1");
      if ((value & 10) != 0) sbuf.append("|msoLightRigLegacyHarsh2");
      if ((value & 11) != 0) sbuf.append("|msoLightRigLegacyHarsh3");
      if ((value & 12) != 0) sbuf.append("|msoLightRigLegacyHarsh4");
      if ((value & 13) != 0) sbuf.append("|msoLightRigThreePoint");
      if ((value & 14) != 0) sbuf.append("|msoLightRigBalanced");
      if ((value & 15) != 0) sbuf.append("|msoLightRigSoft");
      if ((value & 16) != 0) sbuf.append("|msoLightRigHarsh");
      if ((value & 17) != 0) sbuf.append("|msoLightRigFlood");
      if ((value & 21) != 0) sbuf.append("|msoLightRigSunset");
      if ((value & 18) != 0) sbuf.append("|msoLightRigContrasting");
      if ((value & 20) != 0) sbuf.append("|msoLightRigSunrise");
      if ((value & 19) != 0) sbuf.append("|msoLightRigMorning");
      if ((value & 22) != 0) sbuf.append("|msoLightRigChilly");
      if ((value & 23) != 0) sbuf.append("|msoLightRigFreezing");
      if ((value & 24) != 0) sbuf.append("|msoLightRigFlat");
      if ((value & 25) != 0) sbuf.append("|msoLightRigTwoPoint");
      if ((value & 26) != 0) sbuf.append("|msoLightRigGlow");
      if ((value & 27) != 0) sbuf.append("|msoLightRigBrightRoom");
      return sbuf.toString();
      }
    }
  }
}
