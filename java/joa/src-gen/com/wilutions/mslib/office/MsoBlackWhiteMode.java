/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBlackWhiteMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBlackWhiteMode {
  msoBlackWhiteMixed(-2),
  msoBlackWhiteAutomatic(1),
  msoBlackWhiteGrayScale(2),
  msoBlackWhiteLightGrayScale(3),
  msoBlackWhiteInverseGrayScale(4),
  msoBlackWhiteGrayOutline(5),
  msoBlackWhiteBlackTextAndLine(6),
  msoBlackWhiteHighContrast(7),
  msoBlackWhiteBlack(8),
  msoBlackWhiteWhite(9),
  msoBlackWhiteDontShow(10);

  public final int value;
  private MsoBlackWhiteMode(int value) { this.value = value; }
  public static  MsoBlackWhiteMode valueOf(int value) {
    switch(value) {
    case -2: return msoBlackWhiteMixed;
    case 1: return msoBlackWhiteAutomatic;
    case 2: return msoBlackWhiteGrayScale;
    case 3: return msoBlackWhiteLightGrayScale;
    case 4: return msoBlackWhiteInverseGrayScale;
    case 5: return msoBlackWhiteGrayOutline;
    case 6: return msoBlackWhiteBlackTextAndLine;
    case 7: return msoBlackWhiteHighContrast;
    case 8: return msoBlackWhiteBlack;
    case 9: return msoBlackWhiteWhite;
    case 10: return msoBlackWhiteDontShow;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBlackWhiteMode.class);
    }
  }
}
