/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTargetBrowser.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTargetBrowser {

  // Typed constants
  public final static MsoTargetBrowser msoTargetBrowserV3 = new MsoTargetBrowser(0);
  public final static MsoTargetBrowser msoTargetBrowserV4 = new MsoTargetBrowser(1);
  public final static MsoTargetBrowser msoTargetBrowserIE4 = new MsoTargetBrowser(2);
  public final static MsoTargetBrowser msoTargetBrowserIE5 = new MsoTargetBrowser(3);
  public final static MsoTargetBrowser msoTargetBrowserIE6 = new MsoTargetBrowser(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoTargetBrowserV3 = 0;
  public final static int _msoTargetBrowserV4 = 1;
  public final static int _msoTargetBrowserIE4 = 2;
  public final static int _msoTargetBrowserIE5 = 3;
  public final static int _msoTargetBrowserIE6 = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTargetBrowser(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTargetBrowser valueOf(int value) {
    switch(value) {
    case 0: return msoTargetBrowserV3;
    case 1: return msoTargetBrowserV4;
    case 2: return msoTargetBrowserIE4;
    case 3: return msoTargetBrowserIE5;
    case 4: return msoTargetBrowserIE6;
    default: return new MsoTargetBrowser(value);
    }
  }
}
