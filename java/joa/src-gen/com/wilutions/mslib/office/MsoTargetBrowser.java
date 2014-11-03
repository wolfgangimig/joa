/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTargetBrowser.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTargetBrowser {
  msoTargetBrowserV3(0),
  msoTargetBrowserV4(1),
  msoTargetBrowserIE4(2),
  msoTargetBrowserIE5(3),
  msoTargetBrowserIE6(4);

  public final int value;
  private MsoTargetBrowser(int value) { this.value = value; }
  public static  MsoTargetBrowser valueOf(int value) {
    switch(value) {
    case 0: return msoTargetBrowserV3;
    case 1: return msoTargetBrowserV4;
    case 2: return msoTargetBrowserIE4;
    case 3: return msoTargetBrowserIE5;
    case 4: return msoTargetBrowserIE6;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTargetBrowser.class);
    }
  }
}
