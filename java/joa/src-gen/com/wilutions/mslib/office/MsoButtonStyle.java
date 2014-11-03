/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoButtonStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoButtonStyle {
  msoButtonAutomatic(0),
  msoButtonIcon(1),
  msoButtonCaption(2),
  msoButtonIconAndCaption(3),
  msoButtonIconAndWrapCaption(7),
  msoButtonIconAndCaptionBelow(11),
  msoButtonWrapCaption(14),
  msoButtonIconAndWrapCaptionBelow(15);

  public final int value;
  private MsoButtonStyle(int value) { this.value = value; }
  public static  MsoButtonStyle valueOf(int value) {
    switch(value) {
    case 0: return msoButtonAutomatic;
    case 1: return msoButtonIcon;
    case 2: return msoButtonCaption;
    case 3: return msoButtonIconAndCaption;
    case 7: return msoButtonIconAndWrapCaption;
    case 11: return msoButtonIconAndCaptionBelow;
    case 14: return msoButtonWrapCaption;
    case 15: return msoButtonIconAndWrapCaptionBelow;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoButtonStyle.class);
    }
  }
}
