/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoScreenSize.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoScreenSize implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoScreenSize msoScreenSize544x376 = new MsoScreenSize(0);
  public final static MsoScreenSize msoScreenSize640x480 = new MsoScreenSize(1);
  public final static MsoScreenSize msoScreenSize720x512 = new MsoScreenSize(2);
  public final static MsoScreenSize msoScreenSize800x600 = new MsoScreenSize(3);
  public final static MsoScreenSize msoScreenSize1024x768 = new MsoScreenSize(4);
  public final static MsoScreenSize msoScreenSize1152x882 = new MsoScreenSize(5);
  public final static MsoScreenSize msoScreenSize1152x900 = new MsoScreenSize(6);
  public final static MsoScreenSize msoScreenSize1280x1024 = new MsoScreenSize(7);
  public final static MsoScreenSize msoScreenSize1600x1200 = new MsoScreenSize(8);
  public final static MsoScreenSize msoScreenSize1800x1440 = new MsoScreenSize(9);
  public final static MsoScreenSize msoScreenSize1920x1200 = new MsoScreenSize(10);

  // Integer constants for bitsets and switch statements
  public final static int _msoScreenSize544x376 = 0;
  public final static int _msoScreenSize640x480 = 1;
  public final static int _msoScreenSize720x512 = 2;
  public final static int _msoScreenSize800x600 = 3;
  public final static int _msoScreenSize1024x768 = 4;
  public final static int _msoScreenSize1152x882 = 5;
  public final static int _msoScreenSize1152x900 = 6;
  public final static int _msoScreenSize1280x1024 = 7;
  public final static int _msoScreenSize1600x1200 = 8;
  public final static int _msoScreenSize1800x1440 = 9;
  public final static int _msoScreenSize1920x1200 = 10;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoScreenSize(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoScreenSize(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "msoScreenSize1600x1200";
    case 10: return "msoScreenSize1920x1200";
    case 0: return "msoScreenSize544x376";
    case 1: return "msoScreenSize640x480";
    case 2: return "msoScreenSize720x512";
    case 3: return "msoScreenSize800x600";
    case 4: return "msoScreenSize1024x768";
    case 5: return "msoScreenSize1152x882";
    case 6: return "msoScreenSize1152x900";
    case 7: return "msoScreenSize1280x1024";
    case 9: return "msoScreenSize1800x1440";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|msoScreenSize1600x1200");
      if ((value & 10) != 0) sbuf.append("|msoScreenSize1920x1200");
      if ((value & 0) != 0) sbuf.append("|msoScreenSize544x376");
      if ((value & 1) != 0) sbuf.append("|msoScreenSize640x480");
      if ((value & 2) != 0) sbuf.append("|msoScreenSize720x512");
      if ((value & 3) != 0) sbuf.append("|msoScreenSize800x600");
      if ((value & 4) != 0) sbuf.append("|msoScreenSize1024x768");
      if ((value & 5) != 0) sbuf.append("|msoScreenSize1152x882");
      if ((value & 6) != 0) sbuf.append("|msoScreenSize1152x900");
      if ((value & 7) != 0) sbuf.append("|msoScreenSize1280x1024");
      if ((value & 9) != 0) sbuf.append("|msoScreenSize1800x1440");
      return sbuf.toString();
      }
    }
  }
}
