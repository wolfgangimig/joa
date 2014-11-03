/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetTexture.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPresetTexture {
  msoPresetTextureMixed(-2),
  msoTexturePapyrus(1),
  msoTextureCanvas(2),
  msoTextureDenim(3),
  msoTextureWovenMat(4),
  msoTextureWaterDroplets(5),
  msoTexturePaperBag(6),
  msoTextureFishFossil(7),
  msoTextureSand(8),
  msoTextureGreenMarble(9),
  msoTextureWhiteMarble(10),
  msoTextureBrownMarble(11),
  msoTextureGranite(12),
  msoTextureNewsprint(13),
  msoTextureRecycledPaper(14),
  msoTextureParchment(15),
  msoTextureStationery(16),
  msoTextureBlueTissuePaper(17),
  msoTexturePinkTissuePaper(18),
  msoTexturePurpleMesh(19),
  msoTextureBouquet(20),
  msoTextureCork(21),
  msoTextureWalnut(22),
  msoTextureOak(23),
  msoTextureMediumWood(24);

  public final int value;
  private MsoPresetTexture(int value) { this.value = value; }
  public static  MsoPresetTexture valueOf(int value) {
    switch(value) {
    case -2: return msoPresetTextureMixed;
    case 1: return msoTexturePapyrus;
    case 2: return msoTextureCanvas;
    case 3: return msoTextureDenim;
    case 4: return msoTextureWovenMat;
    case 5: return msoTextureWaterDroplets;
    case 6: return msoTexturePaperBag;
    case 7: return msoTextureFishFossil;
    case 8: return msoTextureSand;
    case 9: return msoTextureGreenMarble;
    case 10: return msoTextureWhiteMarble;
    case 11: return msoTextureBrownMarble;
    case 12: return msoTextureGranite;
    case 13: return msoTextureNewsprint;
    case 14: return msoTextureRecycledPaper;
    case 15: return msoTextureParchment;
    case 16: return msoTextureStationery;
    case 17: return msoTextureBlueTissuePaper;
    case 18: return msoTexturePinkTissuePaper;
    case 19: return msoTexturePurpleMesh;
    case 20: return msoTextureBouquet;
    case 21: return msoTextureCork;
    case 22: return msoTextureWalnut;
    case 23: return msoTextureOak;
    case 24: return msoTextureMediumWood;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPresetTexture.class);
    }
  }
}
