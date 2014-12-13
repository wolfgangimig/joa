/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBevelType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBevelType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBevelType msoBevelTypeMixed = new MsoBevelType(-2);
  public final static MsoBevelType msoBevelNone = new MsoBevelType(1);
  public final static MsoBevelType msoBevelRelaxedInset = new MsoBevelType(2);
  public final static MsoBevelType msoBevelCircle = new MsoBevelType(3);
  public final static MsoBevelType msoBevelSlope = new MsoBevelType(4);
  public final static MsoBevelType msoBevelCross = new MsoBevelType(5);
  public final static MsoBevelType msoBevelAngle = new MsoBevelType(6);
  public final static MsoBevelType msoBevelSoftRound = new MsoBevelType(7);
  public final static MsoBevelType msoBevelConvex = new MsoBevelType(8);
  public final static MsoBevelType msoBevelCoolSlant = new MsoBevelType(9);
  public final static MsoBevelType msoBevelDivot = new MsoBevelType(10);
  public final static MsoBevelType msoBevelRiblet = new MsoBevelType(11);
  public final static MsoBevelType msoBevelHardEdge = new MsoBevelType(12);
  public final static MsoBevelType msoBevelArtDeco = new MsoBevelType(13);

  // Integer constants for bitsets and switch statements
  public final static int _msoBevelTypeMixed = -2;
  public final static int _msoBevelNone = 1;
  public final static int _msoBevelRelaxedInset = 2;
  public final static int _msoBevelCircle = 3;
  public final static int _msoBevelSlope = 4;
  public final static int _msoBevelCross = 5;
  public final static int _msoBevelAngle = 6;
  public final static int _msoBevelSoftRound = 7;
  public final static int _msoBevelConvex = 8;
  public final static int _msoBevelCoolSlant = 9;
  public final static int _msoBevelDivot = 10;
  public final static int _msoBevelRiblet = 11;
  public final static int _msoBevelHardEdge = 12;
  public final static int _msoBevelArtDeco = 13;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBevelType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBevelType valueOf(int value) {
    switch(value) {
    case -2: return msoBevelTypeMixed;
    case 1: return msoBevelNone;
    case 2: return msoBevelRelaxedInset;
    case 3: return msoBevelCircle;
    case 4: return msoBevelSlope;
    case 5: return msoBevelCross;
    case 6: return msoBevelAngle;
    case 7: return msoBevelSoftRound;
    case 8: return msoBevelConvex;
    case 9: return msoBevelCoolSlant;
    case 10: return msoBevelDivot;
    case 11: return msoBevelRiblet;
    case 12: return msoBevelHardEdge;
    case 13: return msoBevelArtDeco;
    default: return new MsoBevelType(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoBevelTypeMixed";
    case 2: return "msoBevelRelaxedInset";
    case 1: return "msoBevelNone";
    case 3: return "msoBevelCircle";
    case 4: return "msoBevelSlope";
    case 5: return "msoBevelCross";
    case 6: return "msoBevelAngle";
    case 7: return "msoBevelSoftRound";
    case 8: return "msoBevelConvex";
    case 9: return "msoBevelCoolSlant";
    case 10: return "msoBevelDivot";
    case 11: return "msoBevelRiblet";
    case 12: return "msoBevelHardEdge";
    case 13: return "msoBevelArtDeco";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoBevelTypeMixed");
      if ((value & 2) != 0) sbuf.append("|msoBevelRelaxedInset");
      if ((value & 1) != 0) sbuf.append("|msoBevelNone");
      if ((value & 3) != 0) sbuf.append("|msoBevelCircle");
      if ((value & 4) != 0) sbuf.append("|msoBevelSlope");
      if ((value & 5) != 0) sbuf.append("|msoBevelCross");
      if ((value & 6) != 0) sbuf.append("|msoBevelAngle");
      if ((value & 7) != 0) sbuf.append("|msoBevelSoftRound");
      if ((value & 8) != 0) sbuf.append("|msoBevelConvex");
      if ((value & 9) != 0) sbuf.append("|msoBevelCoolSlant");
      if ((value & 10) != 0) sbuf.append("|msoBevelDivot");
      if ((value & 11) != 0) sbuf.append("|msoBevelRiblet");
      if ((value & 12) != 0) sbuf.append("|msoBevelHardEdge");
      if ((value & 13) != 0) sbuf.append("|msoBevelArtDeco");
      return sbuf.toString();
      }
    }
  }
}
