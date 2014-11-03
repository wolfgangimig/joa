/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoParagraphAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoParagraphAlignment {
  msoAlignMixed(-2),
  msoAlignLeft(1),
  msoAlignCenter(2),
  msoAlignRight(3),
  msoAlignJustify(4),
  msoAlignDistribute(5),
  msoAlignThaiDistribute(6),
  msoAlignJustifyLow(7);

  public final int value;
  private MsoParagraphAlignment(int value) { this.value = value; }
  public static  MsoParagraphAlignment valueOf(int value) {
    switch(value) {
    case -2: return msoAlignMixed;
    case 1: return msoAlignLeft;
    case 2: return msoAlignCenter;
    case 3: return msoAlignRight;
    case 4: return msoAlignJustify;
    case 5: return msoAlignDistribute;
    case 6: return msoAlignThaiDistribute;
    case 7: return msoAlignJustifyLow;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoParagraphAlignment.class);
    }
  }
}
