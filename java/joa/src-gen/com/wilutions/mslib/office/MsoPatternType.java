/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPatternType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPatternType {
  msoPatternMixed(-2),
  msoPattern5Percent(1),
  msoPattern10Percent(2),
  msoPattern20Percent(3),
  msoPattern25Percent(4),
  msoPattern30Percent(5),
  msoPattern40Percent(6),
  msoPattern50Percent(7),
  msoPattern60Percent(8),
  msoPattern70Percent(9),
  msoPattern75Percent(10),
  msoPattern80Percent(11),
  msoPattern90Percent(12),
  msoPatternDarkHorizontal(13),
  msoPatternDarkVertical(14),
  msoPatternDarkDownwardDiagonal(15),
  msoPatternDarkUpwardDiagonal(16),
  msoPatternSmallCheckerBoard(17),
  msoPatternTrellis(18),
  msoPatternLightHorizontal(19),
  msoPatternLightVertical(20),
  msoPatternLightDownwardDiagonal(21),
  msoPatternLightUpwardDiagonal(22),
  msoPatternSmallGrid(23),
  msoPatternDottedDiamond(24),
  msoPatternWideDownwardDiagonal(25),
  msoPatternWideUpwardDiagonal(26),
  msoPatternDashedUpwardDiagonal(27),
  msoPatternDashedDownwardDiagonal(28),
  msoPatternNarrowVertical(29),
  msoPatternNarrowHorizontal(30),
  msoPatternDashedVertical(31),
  msoPatternDashedHorizontal(32),
  msoPatternLargeConfetti(33),
  msoPatternLargeGrid(34),
  msoPatternHorizontalBrick(35),
  msoPatternLargeCheckerBoard(36),
  msoPatternSmallConfetti(37),
  msoPatternZigZag(38),
  msoPatternSolidDiamond(39),
  msoPatternDiagonalBrick(40),
  msoPatternOutlinedDiamond(41),
  msoPatternPlaid(42),
  msoPatternSphere(43),
  msoPatternWeave(44),
  msoPatternDottedGrid(45),
  msoPatternDivot(46),
  msoPatternShingle(47),
  msoPatternWave(48),
  msoPatternHorizontal(49),
  msoPatternVertical(50),
  msoPatternCross(51),
  msoPatternDownwardDiagonal(52),
  msoPatternUpwardDiagonal(53),
  msoPatternDiagonalCross(54);

  public final int value;
  private MsoPatternType(int value) { this.value = value; }
  public static  MsoPatternType valueOf(int value) {
    switch(value) {
    case -2: return msoPatternMixed;
    case 1: return msoPattern5Percent;
    case 2: return msoPattern10Percent;
    case 3: return msoPattern20Percent;
    case 4: return msoPattern25Percent;
    case 5: return msoPattern30Percent;
    case 6: return msoPattern40Percent;
    case 7: return msoPattern50Percent;
    case 8: return msoPattern60Percent;
    case 9: return msoPattern70Percent;
    case 10: return msoPattern75Percent;
    case 11: return msoPattern80Percent;
    case 12: return msoPattern90Percent;
    case 13: return msoPatternDarkHorizontal;
    case 14: return msoPatternDarkVertical;
    case 15: return msoPatternDarkDownwardDiagonal;
    case 16: return msoPatternDarkUpwardDiagonal;
    case 17: return msoPatternSmallCheckerBoard;
    case 18: return msoPatternTrellis;
    case 19: return msoPatternLightHorizontal;
    case 20: return msoPatternLightVertical;
    case 21: return msoPatternLightDownwardDiagonal;
    case 22: return msoPatternLightUpwardDiagonal;
    case 23: return msoPatternSmallGrid;
    case 24: return msoPatternDottedDiamond;
    case 25: return msoPatternWideDownwardDiagonal;
    case 26: return msoPatternWideUpwardDiagonal;
    case 27: return msoPatternDashedUpwardDiagonal;
    case 28: return msoPatternDashedDownwardDiagonal;
    case 29: return msoPatternNarrowVertical;
    case 30: return msoPatternNarrowHorizontal;
    case 31: return msoPatternDashedVertical;
    case 32: return msoPatternDashedHorizontal;
    case 33: return msoPatternLargeConfetti;
    case 34: return msoPatternLargeGrid;
    case 35: return msoPatternHorizontalBrick;
    case 36: return msoPatternLargeCheckerBoard;
    case 37: return msoPatternSmallConfetti;
    case 38: return msoPatternZigZag;
    case 39: return msoPatternSolidDiamond;
    case 40: return msoPatternDiagonalBrick;
    case 41: return msoPatternOutlinedDiamond;
    case 42: return msoPatternPlaid;
    case 43: return msoPatternSphere;
    case 44: return msoPatternWeave;
    case 45: return msoPatternDottedGrid;
    case 46: return msoPatternDivot;
    case 47: return msoPatternShingle;
    case 48: return msoPatternWave;
    case 49: return msoPatternHorizontal;
    case 50: return msoPatternVertical;
    case 51: return msoPatternCross;
    case 52: return msoPatternDownwardDiagonal;
    case 53: return msoPatternUpwardDiagonal;
    case 54: return msoPatternDiagonalCross;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPatternType.class);
    }
  }
}
