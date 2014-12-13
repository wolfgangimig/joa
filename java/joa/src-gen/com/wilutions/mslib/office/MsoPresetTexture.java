/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetTexture.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPresetTexture implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoPresetTexture msoPresetTextureMixed = new MsoPresetTexture(-2);
  public final static MsoPresetTexture msoTexturePapyrus = new MsoPresetTexture(1);
  public final static MsoPresetTexture msoTextureCanvas = new MsoPresetTexture(2);
  public final static MsoPresetTexture msoTextureDenim = new MsoPresetTexture(3);
  public final static MsoPresetTexture msoTextureWovenMat = new MsoPresetTexture(4);
  public final static MsoPresetTexture msoTextureWaterDroplets = new MsoPresetTexture(5);
  public final static MsoPresetTexture msoTexturePaperBag = new MsoPresetTexture(6);
  public final static MsoPresetTexture msoTextureFishFossil = new MsoPresetTexture(7);
  public final static MsoPresetTexture msoTextureSand = new MsoPresetTexture(8);
  public final static MsoPresetTexture msoTextureGreenMarble = new MsoPresetTexture(9);
  public final static MsoPresetTexture msoTextureWhiteMarble = new MsoPresetTexture(10);
  public final static MsoPresetTexture msoTextureBrownMarble = new MsoPresetTexture(11);
  public final static MsoPresetTexture msoTextureGranite = new MsoPresetTexture(12);
  public final static MsoPresetTexture msoTextureNewsprint = new MsoPresetTexture(13);
  public final static MsoPresetTexture msoTextureRecycledPaper = new MsoPresetTexture(14);
  public final static MsoPresetTexture msoTextureParchment = new MsoPresetTexture(15);
  public final static MsoPresetTexture msoTextureStationery = new MsoPresetTexture(16);
  public final static MsoPresetTexture msoTextureBlueTissuePaper = new MsoPresetTexture(17);
  public final static MsoPresetTexture msoTexturePinkTissuePaper = new MsoPresetTexture(18);
  public final static MsoPresetTexture msoTexturePurpleMesh = new MsoPresetTexture(19);
  public final static MsoPresetTexture msoTextureBouquet = new MsoPresetTexture(20);
  public final static MsoPresetTexture msoTextureCork = new MsoPresetTexture(21);
  public final static MsoPresetTexture msoTextureWalnut = new MsoPresetTexture(22);
  public final static MsoPresetTexture msoTextureOak = new MsoPresetTexture(23);
  public final static MsoPresetTexture msoTextureMediumWood = new MsoPresetTexture(24);

  // Integer constants for bitsets and switch statements
  public final static int _msoPresetTextureMixed = -2;
  public final static int _msoTexturePapyrus = 1;
  public final static int _msoTextureCanvas = 2;
  public final static int _msoTextureDenim = 3;
  public final static int _msoTextureWovenMat = 4;
  public final static int _msoTextureWaterDroplets = 5;
  public final static int _msoTexturePaperBag = 6;
  public final static int _msoTextureFishFossil = 7;
  public final static int _msoTextureSand = 8;
  public final static int _msoTextureGreenMarble = 9;
  public final static int _msoTextureWhiteMarble = 10;
  public final static int _msoTextureBrownMarble = 11;
  public final static int _msoTextureGranite = 12;
  public final static int _msoTextureNewsprint = 13;
  public final static int _msoTextureRecycledPaper = 14;
  public final static int _msoTextureParchment = 15;
  public final static int _msoTextureStationery = 16;
  public final static int _msoTextureBlueTissuePaper = 17;
  public final static int _msoTexturePinkTissuePaper = 18;
  public final static int _msoTexturePurpleMesh = 19;
  public final static int _msoTextureBouquet = 20;
  public final static int _msoTextureCork = 21;
  public final static int _msoTextureWalnut = 22;
  public final static int _msoTextureOak = 23;
  public final static int _msoTextureMediumWood = 24;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPresetTexture(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoPresetTexture(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoPresetTextureMixed";
    case 2: return "msoTextureCanvas";
    case 1: return "msoTexturePapyrus";
    case 3: return "msoTextureDenim";
    case 4: return "msoTextureWovenMat";
    case 5: return "msoTextureWaterDroplets";
    case 6: return "msoTexturePaperBag";
    case 7: return "msoTextureFishFossil";
    case 18: return "msoTexturePinkTissuePaper";
    case 8: return "msoTextureSand";
    case 20: return "msoTextureBouquet";
    case 9: return "msoTextureGreenMarble";
    case 10: return "msoTextureWhiteMarble";
    case 11: return "msoTextureBrownMarble";
    case 12: return "msoTextureGranite";
    case 13: return "msoTextureNewsprint";
    case 14: return "msoTextureRecycledPaper";
    case 15: return "msoTextureParchment";
    case 16: return "msoTextureStationery";
    case 17: return "msoTextureBlueTissuePaper";
    case 19: return "msoTexturePurpleMesh";
    case 21: return "msoTextureCork";
    case 22: return "msoTextureWalnut";
    case 23: return "msoTextureOak";
    case 24: return "msoTextureMediumWood";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoPresetTextureMixed");
      if ((value & 2) != 0) sbuf.append("|msoTextureCanvas");
      if ((value & 1) != 0) sbuf.append("|msoTexturePapyrus");
      if ((value & 3) != 0) sbuf.append("|msoTextureDenim");
      if ((value & 4) != 0) sbuf.append("|msoTextureWovenMat");
      if ((value & 5) != 0) sbuf.append("|msoTextureWaterDroplets");
      if ((value & 6) != 0) sbuf.append("|msoTexturePaperBag");
      if ((value & 7) != 0) sbuf.append("|msoTextureFishFossil");
      if ((value & 18) != 0) sbuf.append("|msoTexturePinkTissuePaper");
      if ((value & 8) != 0) sbuf.append("|msoTextureSand");
      if ((value & 20) != 0) sbuf.append("|msoTextureBouquet");
      if ((value & 9) != 0) sbuf.append("|msoTextureGreenMarble");
      if ((value & 10) != 0) sbuf.append("|msoTextureWhiteMarble");
      if ((value & 11) != 0) sbuf.append("|msoTextureBrownMarble");
      if ((value & 12) != 0) sbuf.append("|msoTextureGranite");
      if ((value & 13) != 0) sbuf.append("|msoTextureNewsprint");
      if ((value & 14) != 0) sbuf.append("|msoTextureRecycledPaper");
      if ((value & 15) != 0) sbuf.append("|msoTextureParchment");
      if ((value & 16) != 0) sbuf.append("|msoTextureStationery");
      if ((value & 17) != 0) sbuf.append("|msoTextureBlueTissuePaper");
      if ((value & 19) != 0) sbuf.append("|msoTexturePurpleMesh");
      if ((value & 21) != 0) sbuf.append("|msoTextureCork");
      if ((value & 22) != 0) sbuf.append("|msoTextureWalnut");
      if ((value & 23) != 0) sbuf.append("|msoTextureOak");
      if ((value & 24) != 0) sbuf.append("|msoTextureMediumWood");
      return sbuf.toString();
      }
    }
  }
}
