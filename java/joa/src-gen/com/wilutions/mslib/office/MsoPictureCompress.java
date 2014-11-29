/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPictureCompress.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPictureCompress {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoPictureCompress msoPictureCompressDocDefault = new MsoPictureCompress(-1);
  public final static MsoPictureCompress msoPictureCompressFalse = new MsoPictureCompress(0);
  public final static MsoPictureCompress msoPictureCompressTrue = new MsoPictureCompress(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoPictureCompressDocDefault = -1;
  public final static int _msoPictureCompressFalse = 0;
  public final static int _msoPictureCompressTrue = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPictureCompress(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPictureCompress valueOf(int value) {
    switch(value) {
    case -1: return msoPictureCompressDocDefault;
    case 0: return msoPictureCompressFalse;
    case 1: return msoPictureCompressTrue;
    default: return new MsoPictureCompress(value);
    }
  }
}
