/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoHyperlinkType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoHyperlinkType {
  msoHyperlinkRange(0),
  msoHyperlinkShape(1),
  msoHyperlinkInlineShape(2);

  public final int value;
  private MsoHyperlinkType(int value) { this.value = value; }
  public static  MsoHyperlinkType valueOf(int value) {
    switch(value) {
    case 0: return msoHyperlinkRange;
    case 1: return msoHyperlinkShape;
    case 2: return msoHyperlinkInlineShape;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoHyperlinkType.class);
    }
  }
}
