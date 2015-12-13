/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetGradientType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPresetGradientType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoPresetGradientType msoPresetGradientMixed = new MsoPresetGradientType(-2);
  public final static MsoPresetGradientType msoGradientEarlySunset = new MsoPresetGradientType(1);
  public final static MsoPresetGradientType msoGradientLateSunset = new MsoPresetGradientType(2);
  public final static MsoPresetGradientType msoGradientNightfall = new MsoPresetGradientType(3);
  public final static MsoPresetGradientType msoGradientDaybreak = new MsoPresetGradientType(4);
  public final static MsoPresetGradientType msoGradientHorizon = new MsoPresetGradientType(5);
  public final static MsoPresetGradientType msoGradientDesert = new MsoPresetGradientType(6);
  public final static MsoPresetGradientType msoGradientOcean = new MsoPresetGradientType(7);
  public final static MsoPresetGradientType msoGradientCalmWater = new MsoPresetGradientType(8);
  public final static MsoPresetGradientType msoGradientFire = new MsoPresetGradientType(9);
  public final static MsoPresetGradientType msoGradientFog = new MsoPresetGradientType(10);
  public final static MsoPresetGradientType msoGradientMoss = new MsoPresetGradientType(11);
  public final static MsoPresetGradientType msoGradientPeacock = new MsoPresetGradientType(12);
  public final static MsoPresetGradientType msoGradientWheat = new MsoPresetGradientType(13);
  public final static MsoPresetGradientType msoGradientParchment = new MsoPresetGradientType(14);
  public final static MsoPresetGradientType msoGradientMahogany = new MsoPresetGradientType(15);
  public final static MsoPresetGradientType msoGradientRainbow = new MsoPresetGradientType(16);
  public final static MsoPresetGradientType msoGradientRainbowII = new MsoPresetGradientType(17);
  public final static MsoPresetGradientType msoGradientGold = new MsoPresetGradientType(18);
  public final static MsoPresetGradientType msoGradientGoldII = new MsoPresetGradientType(19);
  public final static MsoPresetGradientType msoGradientBrass = new MsoPresetGradientType(20);
  public final static MsoPresetGradientType msoGradientChrome = new MsoPresetGradientType(21);
  public final static MsoPresetGradientType msoGradientChromeII = new MsoPresetGradientType(22);
  public final static MsoPresetGradientType msoGradientSilver = new MsoPresetGradientType(23);
  public final static MsoPresetGradientType msoGradientSapphire = new MsoPresetGradientType(24);

  // Integer constants for bitsets and switch statements
  public final static int _msoPresetGradientMixed = -2;
  public final static int _msoGradientEarlySunset = 1;
  public final static int _msoGradientLateSunset = 2;
  public final static int _msoGradientNightfall = 3;
  public final static int _msoGradientDaybreak = 4;
  public final static int _msoGradientHorizon = 5;
  public final static int _msoGradientDesert = 6;
  public final static int _msoGradientOcean = 7;
  public final static int _msoGradientCalmWater = 8;
  public final static int _msoGradientFire = 9;
  public final static int _msoGradientFog = 10;
  public final static int _msoGradientMoss = 11;
  public final static int _msoGradientPeacock = 12;
  public final static int _msoGradientWheat = 13;
  public final static int _msoGradientParchment = 14;
  public final static int _msoGradientMahogany = 15;
  public final static int _msoGradientRainbow = 16;
  public final static int _msoGradientRainbowII = 17;
  public final static int _msoGradientGold = 18;
  public final static int _msoGradientGoldII = 19;
  public final static int _msoGradientBrass = 20;
  public final static int _msoGradientChrome = 21;
  public final static int _msoGradientChromeII = 22;
  public final static int _msoGradientSilver = 23;
  public final static int _msoGradientSapphire = 24;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPresetGradientType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoPresetGradientType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 7: return "msoGradientOcean";
    case -2: return "msoPresetGradientMixed";
    case 1: return "msoGradientEarlySunset";
    case 2: return "msoGradientLateSunset";
    case 3: return "msoGradientNightfall";
    case 4: return "msoGradientDaybreak";
    case 5: return "msoGradientHorizon";
    case 6: return "msoGradientDesert";
    case 8: return "msoGradientCalmWater";
    case 9: return "msoGradientFire";
    case 10: return "msoGradientFog";
    case 11: return "msoGradientMoss";
    case 12: return "msoGradientPeacock";
    case 13: return "msoGradientWheat";
    case 14: return "msoGradientParchment";
    case 15: return "msoGradientMahogany";
    case 16: return "msoGradientRainbow";
    case 17: return "msoGradientRainbowII";
    case 21: return "msoGradientChrome";
    case 18: return "msoGradientGold";
    case 20: return "msoGradientBrass";
    case 19: return "msoGradientGoldII";
    case 22: return "msoGradientChromeII";
    case 23: return "msoGradientSilver";
    case 24: return "msoGradientSapphire";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 7) != 0) sbuf.append("|msoGradientOcean");
      if ((value & -2) != 0) sbuf.append("|msoPresetGradientMixed");
      if ((value & 1) != 0) sbuf.append("|msoGradientEarlySunset");
      if ((value & 2) != 0) sbuf.append("|msoGradientLateSunset");
      if ((value & 3) != 0) sbuf.append("|msoGradientNightfall");
      if ((value & 4) != 0) sbuf.append("|msoGradientDaybreak");
      if ((value & 5) != 0) sbuf.append("|msoGradientHorizon");
      if ((value & 6) != 0) sbuf.append("|msoGradientDesert");
      if ((value & 8) != 0) sbuf.append("|msoGradientCalmWater");
      if ((value & 9) != 0) sbuf.append("|msoGradientFire");
      if ((value & 10) != 0) sbuf.append("|msoGradientFog");
      if ((value & 11) != 0) sbuf.append("|msoGradientMoss");
      if ((value & 12) != 0) sbuf.append("|msoGradientPeacock");
      if ((value & 13) != 0) sbuf.append("|msoGradientWheat");
      if ((value & 14) != 0) sbuf.append("|msoGradientParchment");
      if ((value & 15) != 0) sbuf.append("|msoGradientMahogany");
      if ((value & 16) != 0) sbuf.append("|msoGradientRainbow");
      if ((value & 17) != 0) sbuf.append("|msoGradientRainbowII");
      if ((value & 21) != 0) sbuf.append("|msoGradientChrome");
      if ((value & 18) != 0) sbuf.append("|msoGradientGold");
      if ((value & 20) != 0) sbuf.append("|msoGradientBrass");
      if ((value & 19) != 0) sbuf.append("|msoGradientGoldII");
      if ((value & 22) != 0) sbuf.append("|msoGradientChromeII");
      if ((value & 23) != 0) sbuf.append("|msoGradientSilver");
      if ((value & 24) != 0) sbuf.append("|msoGradientSapphire");
      return sbuf.toString();
      }
    }
  }
}
