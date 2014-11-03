/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBevelType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBevelType {
  msoBevelTypeMixed(-2),
  msoBevelNone(1),
  msoBevelRelaxedInset(2),
  msoBevelCircle(3),
  msoBevelSlope(4),
  msoBevelCross(5),
  msoBevelAngle(6),
  msoBevelSoftRound(7),
  msoBevelConvex(8),
  msoBevelCoolSlant(9),
  msoBevelDivot(10),
  msoBevelRiblet(11),
  msoBevelHardEdge(12),
  msoBevelArtDeco(13);

  public final int value;
  private MsoBevelType(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBevelType.class);
    }
  }
}
