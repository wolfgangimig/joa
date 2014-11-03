/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPictureEffectType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPictureEffectType {
  msoEffectNone(0),
  msoEffectBackgroundRemoval(1),
  msoEffectBlur(2),
  msoEffectBrightnessContrast(3),
  msoEffectCement(4),
  msoEffectCrisscrossEtching(5),
  msoEffectChalkSketch(6),
  msoEffectColorTemperature(7),
  msoEffectCutout(8),
  msoEffectFilmGrain(9),
  msoEffectGlass(10),
  msoEffectGlowDiffused(11),
  msoEffectGlowEdges(12),
  msoEffectLightScreen(13),
  msoEffectLineDrawing(14),
  msoEffectMarker(15),
  msoEffectMosiaicBubbles(16),
  msoEffectPaintBrush(17),
  msoEffectPaintStrokes(18),
  msoEffectPastelsSmooth(19),
  msoEffectPencilGrayscale(20),
  msoEffectPencilSketch(21),
  msoEffectPhotocopy(22),
  msoEffectPlasticWrap(23),
  msoEffectSaturation(24),
  msoEffectSharpenSoften(25),
  msoEffectTexturizer(26),
  msoEffectWatercolorSponge(27);

  public final int value;
  private MsoPictureEffectType(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPictureEffectType.class);
    }
  }
}
