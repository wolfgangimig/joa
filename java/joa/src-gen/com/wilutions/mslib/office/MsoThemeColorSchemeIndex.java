/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoThemeColorSchemeIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoThemeColorSchemeIndex {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoThemeColorSchemeIndex msoThemeDark1 = new MsoThemeColorSchemeIndex(1);
  public final static MsoThemeColorSchemeIndex msoThemeLight1 = new MsoThemeColorSchemeIndex(2);
  public final static MsoThemeColorSchemeIndex msoThemeDark2 = new MsoThemeColorSchemeIndex(3);
  public final static MsoThemeColorSchemeIndex msoThemeLight2 = new MsoThemeColorSchemeIndex(4);
  public final static MsoThemeColorSchemeIndex msoThemeAccent1 = new MsoThemeColorSchemeIndex(5);
  public final static MsoThemeColorSchemeIndex msoThemeAccent2 = new MsoThemeColorSchemeIndex(6);
  public final static MsoThemeColorSchemeIndex msoThemeAccent3 = new MsoThemeColorSchemeIndex(7);
  public final static MsoThemeColorSchemeIndex msoThemeAccent4 = new MsoThemeColorSchemeIndex(8);
  public final static MsoThemeColorSchemeIndex msoThemeAccent5 = new MsoThemeColorSchemeIndex(9);
  public final static MsoThemeColorSchemeIndex msoThemeAccent6 = new MsoThemeColorSchemeIndex(10);
  public final static MsoThemeColorSchemeIndex msoThemeHyperlink = new MsoThemeColorSchemeIndex(11);
  public final static MsoThemeColorSchemeIndex msoThemeFollowedHyperlink = new MsoThemeColorSchemeIndex(12);

  // Integer constants for bitsets and switch statements
  public final static int _msoThemeDark1 = 1;
  public final static int _msoThemeLight1 = 2;
  public final static int _msoThemeDark2 = 3;
  public final static int _msoThemeLight2 = 4;
  public final static int _msoThemeAccent1 = 5;
  public final static int _msoThemeAccent2 = 6;
  public final static int _msoThemeAccent3 = 7;
  public final static int _msoThemeAccent4 = 8;
  public final static int _msoThemeAccent5 = 9;
  public final static int _msoThemeAccent6 = 10;
  public final static int _msoThemeHyperlink = 11;
  public final static int _msoThemeFollowedHyperlink = 12;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoThemeColorSchemeIndex(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoThemeColorSchemeIndex valueOf(int value) {
    switch(value) {
    case 1: return msoThemeDark1;
    case 2: return msoThemeLight1;
    case 3: return msoThemeDark2;
    case 4: return msoThemeLight2;
    case 5: return msoThemeAccent1;
    case 6: return msoThemeAccent2;
    case 7: return msoThemeAccent3;
    case 8: return msoThemeAccent4;
    case 9: return msoThemeAccent5;
    case 10: return msoThemeAccent6;
    case 11: return msoThemeHyperlink;
    case 12: return msoThemeFollowedHyperlink;
    default: return new MsoThemeColorSchemeIndex(value);
    }
  }
}
