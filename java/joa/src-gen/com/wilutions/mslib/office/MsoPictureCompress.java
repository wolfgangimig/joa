/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPictureCompress.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPictureCompress {
  msoPictureCompressDocDefault(-1),
  msoPictureCompressFalse(0),
  msoPictureCompressTrue(1);

  public final int value;
  private MsoPictureCompress(int value) { this.value = value; }
  public static  MsoPictureCompress valueOf(int value) {
    switch(value) {
    case -1: return msoPictureCompressDocDefault;
    case 0: return msoPictureCompressFalse;
    case 1: return msoPictureCompressTrue;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPictureCompress.class);
    }
  }
}
