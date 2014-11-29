/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoButtonStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoButtonStyle {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoButtonStyle msoButtonAutomatic = new MsoButtonStyle(0);
  public final static MsoButtonStyle msoButtonIcon = new MsoButtonStyle(1);
  public final static MsoButtonStyle msoButtonCaption = new MsoButtonStyle(2);
  public final static MsoButtonStyle msoButtonIconAndCaption = new MsoButtonStyle(3);
  public final static MsoButtonStyle msoButtonIconAndWrapCaption = new MsoButtonStyle(7);
  public final static MsoButtonStyle msoButtonIconAndCaptionBelow = new MsoButtonStyle(11);
  public final static MsoButtonStyle msoButtonWrapCaption = new MsoButtonStyle(14);
  public final static MsoButtonStyle msoButtonIconAndWrapCaptionBelow = new MsoButtonStyle(15);

  // Integer constants for bitsets and switch statements
  public final static int _msoButtonAutomatic = 0;
  public final static int _msoButtonIcon = 1;
  public final static int _msoButtonCaption = 2;
  public final static int _msoButtonIconAndCaption = 3;
  public final static int _msoButtonIconAndWrapCaption = 7;
  public final static int _msoButtonIconAndCaptionBelow = 11;
  public final static int _msoButtonWrapCaption = 14;
  public final static int _msoButtonIconAndWrapCaptionBelow = 15;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoButtonStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoButtonStyle(value);
    }
  }
}
