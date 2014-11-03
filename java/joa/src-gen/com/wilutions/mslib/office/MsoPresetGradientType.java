/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetGradientType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPresetGradientType {
  msoPresetGradientMixed(-2),
  msoGradientEarlySunset(1),
  msoGradientLateSunset(2),
  msoGradientNightfall(3),
  msoGradientDaybreak(4),
  msoGradientHorizon(5),
  msoGradientDesert(6),
  msoGradientOcean(7),
  msoGradientCalmWater(8),
  msoGradientFire(9),
  msoGradientFog(10),
  msoGradientMoss(11),
  msoGradientPeacock(12),
  msoGradientWheat(13),
  msoGradientParchment(14),
  msoGradientMahogany(15),
  msoGradientRainbow(16),
  msoGradientRainbowII(17),
  msoGradientGold(18),
  msoGradientGoldII(19),
  msoGradientBrass(20),
  msoGradientChrome(21),
  msoGradientChromeII(22),
  msoGradientSilver(23),
  msoGradientSapphire(24);

  public final int value;
  private MsoPresetGradientType(int value) { this.value = value; }
  public static  MsoPresetGradientType valueOf(int value) {
    switch(value) {
    case -2: return msoPresetGradientMixed;
    case 1: return msoGradientEarlySunset;
    case 2: return msoGradientLateSunset;
    case 3: return msoGradientNightfall;
    case 4: return msoGradientDaybreak;
    case 5: return msoGradientHorizon;
    case 6: return msoGradientDesert;
    case 7: return msoGradientOcean;
    case 8: return msoGradientCalmWater;
    case 9: return msoGradientFire;
    case 10: return msoGradientFog;
    case 11: return msoGradientMoss;
    case 12: return msoGradientPeacock;
    case 13: return msoGradientWheat;
    case 14: return msoGradientParchment;
    case 15: return msoGradientMahogany;
    case 16: return msoGradientRainbow;
    case 17: return msoGradientRainbowII;
    case 18: return msoGradientGold;
    case 19: return msoGradientGoldII;
    case 20: return msoGradientBrass;
    case 21: return msoGradientChrome;
    case 22: return msoGradientChromeII;
    case 23: return msoGradientSilver;
    case 24: return msoGradientSapphire;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPresetGradientType.class);
    }
  }
}
