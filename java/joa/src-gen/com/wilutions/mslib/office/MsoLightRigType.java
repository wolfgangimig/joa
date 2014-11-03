/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLightRigType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoLightRigType {
  msoLightRigMixed(-2),
  msoLightRigLegacyFlat1(1),
  msoLightRigLegacyFlat2(2),
  msoLightRigLegacyFlat3(3),
  msoLightRigLegacyFlat4(4),
  msoLightRigLegacyNormal1(5),
  msoLightRigLegacyNormal2(6),
  msoLightRigLegacyNormal3(7),
  msoLightRigLegacyNormal4(8),
  msoLightRigLegacyHarsh1(9),
  msoLightRigLegacyHarsh2(10),
  msoLightRigLegacyHarsh3(11),
  msoLightRigLegacyHarsh4(12),
  msoLightRigThreePoint(13),
  msoLightRigBalanced(14),
  msoLightRigSoft(15),
  msoLightRigHarsh(16),
  msoLightRigFlood(17),
  msoLightRigContrasting(18),
  msoLightRigMorning(19),
  msoLightRigSunrise(20),
  msoLightRigSunset(21),
  msoLightRigChilly(22),
  msoLightRigFreezing(23),
  msoLightRigFlat(24),
  msoLightRigTwoPoint(25),
  msoLightRigGlow(26),
  msoLightRigBrightRoom(27);

  public final int value;
  private MsoLightRigType(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoLightRigType.class);
    }
  }
}
