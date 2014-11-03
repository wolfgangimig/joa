/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlHAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlHAlign {
  xlHAlignCenter(-4108),
  xlHAlignCenterAcrossSelection(7),
  xlHAlignDistributed(-4117),
  xlHAlignFill(5),
  xlHAlignGeneral(1),
  xlHAlignJustify(-4130),
  xlHAlignLeft(-4131),
  xlHAlignRight(-4152);

  public final int value;
  private XlHAlign(int value) { this.value = value; }
  public static  XlHAlign valueOf(int value) {
    switch(value) {
    case -4108: return xlHAlignCenter;
    case 7: return xlHAlignCenterAcrossSelection;
    case -4117: return xlHAlignDistributed;
    case 5: return xlHAlignFill;
    case 1: return xlHAlignGeneral;
    case -4130: return xlHAlignJustify;
    case -4131: return xlHAlignLeft;
    case -4152: return xlHAlignRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlHAlign.class);
    }
  }
}
