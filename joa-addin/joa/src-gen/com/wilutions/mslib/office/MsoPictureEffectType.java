/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPictureEffectType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPictureEffectType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoPictureEffectType msoEffectNone = new MsoPictureEffectType(0);
  public final static MsoPictureEffectType msoEffectBackgroundRemoval = new MsoPictureEffectType(1);
  public final static MsoPictureEffectType msoEffectBlur = new MsoPictureEffectType(2);
  public final static MsoPictureEffectType msoEffectBrightnessContrast = new MsoPictureEffectType(3);
  public final static MsoPictureEffectType msoEffectCement = new MsoPictureEffectType(4);
  public final static MsoPictureEffectType msoEffectCrisscrossEtching = new MsoPictureEffectType(5);
  public final static MsoPictureEffectType msoEffectChalkSketch = new MsoPictureEffectType(6);
  public final static MsoPictureEffectType msoEffectColorTemperature = new MsoPictureEffectType(7);
  public final static MsoPictureEffectType msoEffectCutout = new MsoPictureEffectType(8);
  public final static MsoPictureEffectType msoEffectFilmGrain = new MsoPictureEffectType(9);
  public final static MsoPictureEffectType msoEffectGlass = new MsoPictureEffectType(10);
  public final static MsoPictureEffectType msoEffectGlowDiffused = new MsoPictureEffectType(11);
  public final static MsoPictureEffectType msoEffectGlowEdges = new MsoPictureEffectType(12);
  public final static MsoPictureEffectType msoEffectLightScreen = new MsoPictureEffectType(13);
  public final static MsoPictureEffectType msoEffectLineDrawing = new MsoPictureEffectType(14);
  public final static MsoPictureEffectType msoEffectMarker = new MsoPictureEffectType(15);
  public final static MsoPictureEffectType msoEffectMosiaicBubbles = new MsoPictureEffectType(16);
  public final static MsoPictureEffectType msoEffectPaintBrush = new MsoPictureEffectType(17);
  public final static MsoPictureEffectType msoEffectPaintStrokes = new MsoPictureEffectType(18);
  public final static MsoPictureEffectType msoEffectPastelsSmooth = new MsoPictureEffectType(19);
  public final static MsoPictureEffectType msoEffectPencilGrayscale = new MsoPictureEffectType(20);
  public final static MsoPictureEffectType msoEffectPencilSketch = new MsoPictureEffectType(21);
  public final static MsoPictureEffectType msoEffectPhotocopy = new MsoPictureEffectType(22);
  public final static MsoPictureEffectType msoEffectPlasticWrap = new MsoPictureEffectType(23);
  public final static MsoPictureEffectType msoEffectSaturation = new MsoPictureEffectType(24);
  public final static MsoPictureEffectType msoEffectSharpenSoften = new MsoPictureEffectType(25);
  public final static MsoPictureEffectType msoEffectTexturizer = new MsoPictureEffectType(26);
  public final static MsoPictureEffectType msoEffectWatercolorSponge = new MsoPictureEffectType(27);

  // Integer constants for bitsets and switch statements
  public final static int _msoEffectNone = 0;
  public final static int _msoEffectBackgroundRemoval = 1;
  public final static int _msoEffectBlur = 2;
  public final static int _msoEffectBrightnessContrast = 3;
  public final static int _msoEffectCement = 4;
  public final static int _msoEffectCrisscrossEtching = 5;
  public final static int _msoEffectChalkSketch = 6;
  public final static int _msoEffectColorTemperature = 7;
  public final static int _msoEffectCutout = 8;
  public final static int _msoEffectFilmGrain = 9;
  public final static int _msoEffectGlass = 10;
  public final static int _msoEffectGlowDiffused = 11;
  public final static int _msoEffectGlowEdges = 12;
  public final static int _msoEffectLightScreen = 13;
  public final static int _msoEffectLineDrawing = 14;
  public final static int _msoEffectMarker = 15;
  public final static int _msoEffectMosiaicBubbles = 16;
  public final static int _msoEffectPaintBrush = 17;
  public final static int _msoEffectPaintStrokes = 18;
  public final static int _msoEffectPastelsSmooth = 19;
  public final static int _msoEffectPencilGrayscale = 20;
  public final static int _msoEffectPencilSketch = 21;
  public final static int _msoEffectPhotocopy = 22;
  public final static int _msoEffectPlasticWrap = 23;
  public final static int _msoEffectSaturation = 24;
  public final static int _msoEffectSharpenSoften = 25;
  public final static int _msoEffectTexturizer = 26;
  public final static int _msoEffectWatercolorSponge = 27;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPictureEffectType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPictureEffectType valueOf(int value) {
    switch(value) {
    case 0: return msoEffectNone;
    case 1: return msoEffectBackgroundRemoval;
    case 2: return msoEffectBlur;
    case 3: return msoEffectBrightnessContrast;
    case 4: return msoEffectCement;
    case 5: return msoEffectCrisscrossEtching;
    case 6: return msoEffectChalkSketch;
    case 7: return msoEffectColorTemperature;
    case 8: return msoEffectCutout;
    case 9: return msoEffectFilmGrain;
    case 10: return msoEffectGlass;
    case 11: return msoEffectGlowDiffused;
    case 12: return msoEffectGlowEdges;
    case 13: return msoEffectLightScreen;
    case 14: return msoEffectLineDrawing;
    case 15: return msoEffectMarker;
    case 16: return msoEffectMosiaicBubbles;
    case 17: return msoEffectPaintBrush;
    case 18: return msoEffectPaintStrokes;
    case 19: return msoEffectPastelsSmooth;
    case 20: return msoEffectPencilGrayscale;
    case 21: return msoEffectPencilSketch;
    case 22: return msoEffectPhotocopy;
    case 23: return msoEffectPlasticWrap;
    case 24: return msoEffectSaturation;
    case 25: return msoEffectSharpenSoften;
    case 26: return msoEffectTexturizer;
    case 27: return msoEffectWatercolorSponge;
    default: return new MsoPictureEffectType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "msoEffectCutout";
    case 0: return "msoEffectNone";
    case 1: return "msoEffectBackgroundRemoval";
    case 2: return "msoEffectBlur";
    case 3: return "msoEffectBrightnessContrast";
    case 4: return "msoEffectCement";
    case 5: return "msoEffectCrisscrossEtching";
    case 6: return "msoEffectChalkSketch";
    case 7: return "msoEffectColorTemperature";
    case 9: return "msoEffectFilmGrain";
    case 10: return "msoEffectGlass";
    case 11: return "msoEffectGlowDiffused";
    case 12: return "msoEffectGlowEdges";
    case 13: return "msoEffectLightScreen";
    case 14: return "msoEffectLineDrawing";
    case 15: return "msoEffectMarker";
    case 16: return "msoEffectMosiaicBubbles";
    case 17: return "msoEffectPaintBrush";
    case 21: return "msoEffectPencilSketch";
    case 18: return "msoEffectPaintStrokes";
    case 20: return "msoEffectPencilGrayscale";
    case 19: return "msoEffectPastelsSmooth";
    case 22: return "msoEffectPhotocopy";
    case 23: return "msoEffectPlasticWrap";
    case 24: return "msoEffectSaturation";
    case 25: return "msoEffectSharpenSoften";
    case 26: return "msoEffectTexturizer";
    case 27: return "msoEffectWatercolorSponge";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|msoEffectCutout");
      if ((value & 0) != 0) sbuf.append("|msoEffectNone");
      if ((value & 1) != 0) sbuf.append("|msoEffectBackgroundRemoval");
      if ((value & 2) != 0) sbuf.append("|msoEffectBlur");
      if ((value & 3) != 0) sbuf.append("|msoEffectBrightnessContrast");
      if ((value & 4) != 0) sbuf.append("|msoEffectCement");
      if ((value & 5) != 0) sbuf.append("|msoEffectCrisscrossEtching");
      if ((value & 6) != 0) sbuf.append("|msoEffectChalkSketch");
      if ((value & 7) != 0) sbuf.append("|msoEffectColorTemperature");
      if ((value & 9) != 0) sbuf.append("|msoEffectFilmGrain");
      if ((value & 10) != 0) sbuf.append("|msoEffectGlass");
      if ((value & 11) != 0) sbuf.append("|msoEffectGlowDiffused");
      if ((value & 12) != 0) sbuf.append("|msoEffectGlowEdges");
      if ((value & 13) != 0) sbuf.append("|msoEffectLightScreen");
      if ((value & 14) != 0) sbuf.append("|msoEffectLineDrawing");
      if ((value & 15) != 0) sbuf.append("|msoEffectMarker");
      if ((value & 16) != 0) sbuf.append("|msoEffectMosiaicBubbles");
      if ((value & 17) != 0) sbuf.append("|msoEffectPaintBrush");
      if ((value & 21) != 0) sbuf.append("|msoEffectPencilSketch");
      if ((value & 18) != 0) sbuf.append("|msoEffectPaintStrokes");
      if ((value & 20) != 0) sbuf.append("|msoEffectPencilGrayscale");
      if ((value & 19) != 0) sbuf.append("|msoEffectPastelsSmooth");
      if ((value & 22) != 0) sbuf.append("|msoEffectPhotocopy");
      if ((value & 23) != 0) sbuf.append("|msoEffectPlasticWrap");
      if ((value & 24) != 0) sbuf.append("|msoEffectSaturation");
      if ((value & 25) != 0) sbuf.append("|msoEffectSharpenSoften");
      if ((value & 26) != 0) sbuf.append("|msoEffectTexturizer");
      if ((value & 27) != 0) sbuf.append("|msoEffectWatercolorSponge");
      return sbuf.toString();
      }
    }
  }
}
