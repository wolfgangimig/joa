/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoScreenSize.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoScreenSize {
  msoScreenSize544x376(0),
  msoScreenSize640x480(1),
  msoScreenSize720x512(2),
  msoScreenSize800x600(3),
  msoScreenSize1024x768(4),
  msoScreenSize1152x882(5),
  msoScreenSize1152x900(6),
  msoScreenSize1280x1024(7),
  msoScreenSize1600x1200(8),
  msoScreenSize1800x1440(9),
  msoScreenSize1920x1200(10);

  public final int value;
  private MsoScreenSize(int value) { this.value = value; }
  public static  MsoScreenSize valueOf(int value) {
    switch(value) {
    case 0: return msoScreenSize544x376;
    case 1: return msoScreenSize640x480;
    case 2: return msoScreenSize720x512;
    case 3: return msoScreenSize800x600;
    case 4: return msoScreenSize1024x768;
    case 5: return msoScreenSize1152x882;
    case 6: return msoScreenSize1152x900;
    case 7: return msoScreenSize1280x1024;
    case 8: return msoScreenSize1600x1200;
    case 9: return msoScreenSize1800x1440;
    case 10: return msoScreenSize1920x1200;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoScreenSize.class);
    }
  }
}
