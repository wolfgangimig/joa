/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBlogImageType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBlogImageType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBlogImageType msoblogImageTypeJPEG = new MsoBlogImageType(1);
  public final static MsoBlogImageType msoblogImageTypeGIF = new MsoBlogImageType(2);
  public final static MsoBlogImageType msoblogImageTypePNG = new MsoBlogImageType(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoblogImageTypeJPEG = 1;
  public final static int _msoblogImageTypeGIF = 2;
  public final static int _msoblogImageTypePNG = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBlogImageType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBlogImageType valueOf(int value) {
    switch(value) {
    case 1: return msoblogImageTypeJPEG;
    case 2: return msoblogImageTypeGIF;
    case 3: return msoblogImageTypePNG;
    default: return new MsoBlogImageType(value);
    }
  }
}
