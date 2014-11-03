/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCommandBarButtonHyperlinkType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoCommandBarButtonHyperlinkType {
  msoCommandBarButtonHyperlinkNone(0),
  msoCommandBarButtonHyperlinkOpen(1),
  msoCommandBarButtonHyperlinkInsertPicture(2);

  public final int value;
  private MsoCommandBarButtonHyperlinkType(int value) { this.value = value; }
  public static  MsoCommandBarButtonHyperlinkType valueOf(int value) {
    switch(value) {
    case 0: return msoCommandBarButtonHyperlinkNone;
    case 1: return msoCommandBarButtonHyperlinkOpen;
    case 2: return msoCommandBarButtonHyperlinkInsertPicture;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoCommandBarButtonHyperlinkType.class);
    }
  }
}
