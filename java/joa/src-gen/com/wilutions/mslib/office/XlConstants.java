/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlConstants.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlConstants {
  xlAutomatic(-4105),
  xlCombination(-4111),
  xlCustom(-4114),
  xlBar(2),
  xlColumn(3),
  xl3DBar(-4099),
  xl3DSurface(-4103),
  xlDefaultAutoFormat(-1),
  xlNone(-4142),
  xlAbove(0),
  xlBelow(1),
  xlBoth(1),
  xlBottom(-4107),
  xlCenter(-4108),
  xlChecker(9),
  xlCircle(8),
  xlCorner(2),
  xlCrissCross(16),
  xlCross(4),
  xlDiamond(2),
  xlDistributed(-4117),
  xlFill(5),
  xlFixedValue(1),
  xlGeneral(1),
  xlGray16(17),
  xlGray25(-4124),
  xlGray50(-4125),
  xlGray75(-4126),
  xlGray8(18),
  xlGrid(15),
  xlHigh(-4127),
  xlInside(2),
  xlJustify(-4130),
  xlLeft(-4131),
  xlLightDown(13),
  xlLightHorizontal(11),
  xlLightUp(14),
  xlLightVertical(12),
  xlLow(-4134),
  xlMaximum(2),
  xlMinimum(4),
  xlMinusValues(3),
  xlNextToAxis(4),
  xlOpaque(3),
  xlOutside(3),
  xlPercent(2),
  xlPlus(9),
  xlPlusValues(2),
  xlRight(-4152),
  xlScale(3),
  xlSemiGray75(10),
  xlShowLabel(4),
  xlShowLabelAndPercent(5),
  xlShowPercent(3),
  xlShowValue(2),
  xlSingle(2),
  xlSolid(1),
  xlSquare(1),
  xlStar(5),
  xlStError(4),
  xlTop(-4160),
  xlTransparent(2),
  xlTriangle(3);

  public final int value;
  private XlConstants(int value) { this.value = value; }
  public static  XlConstants valueOf(int value) {
    switch(value) {
    case -4105: return xlAutomatic;
    case -4111: return xlCombination;
    case -4114: return xlCustom;
    case 2: return xlBar;
    case 3: return xlColumn;
    case -4099: return xl3DBar;
    case -4103: return xl3DSurface;
    case -1: return xlDefaultAutoFormat;
    case -4142: return xlNone;
    case 0: return xlAbove;
    case 1: return xlBelow;
    //se 1: return xlBoth; // same as xlBelow
    case -4107: return xlBottom;
    case -4108: return xlCenter;
    case 9: return xlChecker;
    case 8: return xlCircle;
    //se 2: return xlCorner; // same as xlBar
    case 16: return xlCrissCross;
    case 4: return xlCross;
    //se 2: return xlDiamond; // same as xlBar
    case -4117: return xlDistributed;
    case 5: return xlFill;
    //se 1: return xlFixedValue; // same as xlBelow
    //se 1: return xlGeneral; // same as xlBelow
    case 17: return xlGray16;
    case -4124: return xlGray25;
    case -4125: return xlGray50;
    case -4126: return xlGray75;
    case 18: return xlGray8;
    case 15: return xlGrid;
    case -4127: return xlHigh;
    //se 2: return xlInside; // same as xlBar
    case -4130: return xlJustify;
    case -4131: return xlLeft;
    case 13: return xlLightDown;
    case 11: return xlLightHorizontal;
    case 14: return xlLightUp;
    case 12: return xlLightVertical;
    case -4134: return xlLow;
    //se 2: return xlMaximum; // same as xlBar
    //se 4: return xlMinimum; // same as xlCross
    //se 3: return xlMinusValues; // same as xlColumn
    //se 4: return xlNextToAxis; // same as xlCross
    //se 3: return xlOpaque; // same as xlColumn
    //se 3: return xlOutside; // same as xlColumn
    //se 2: return xlPercent; // same as xlBar
    //se 9: return xlPlus; // same as xlChecker
    //se 2: return xlPlusValues; // same as xlBar
    case -4152: return xlRight;
    //se 3: return xlScale; // same as xlColumn
    case 10: return xlSemiGray75;
    //se 4: return xlShowLabel; // same as xlCross
    //se 5: return xlShowLabelAndPercent; // same as xlFill
    //se 3: return xlShowPercent; // same as xlColumn
    //se 2: return xlShowValue; // same as xlBar
    //se 2: return xlSingle; // same as xlBar
    //se 1: return xlSolid; // same as xlBelow
    //se 1: return xlSquare; // same as xlBelow
    //se 5: return xlStar; // same as xlFill
    //se 4: return xlStError; // same as xlCross
    case -4160: return xlTop;
    //se 2: return xlTransparent; // same as xlBar
    //se 3: return xlTriangle; // same as xlColumn
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlConstants.class);
    }
  }
}
