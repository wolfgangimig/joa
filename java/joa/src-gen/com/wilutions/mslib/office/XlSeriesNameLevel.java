/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlSeriesNameLevel.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{76D9466C-84C2-4355-81FE-CB1B9CB03C19}")
public enum XlSeriesNameLevel {
  xlSeriesNameLevelNone(-3),
  xlSeriesNameLevelCustom(-2),
  xlSeriesNameLevelAll(-1);

  public final int value;
  private XlSeriesNameLevel(int value) { this.value = value; }
  public static  XlSeriesNameLevel valueOf(int value) {
    switch(value) {
    case -3: return xlSeriesNameLevelNone;
    case -2: return xlSeriesNameLevelCustom;
    case -1: return xlSeriesNameLevelAll;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlSeriesNameLevel.class);
    }
  }
}
