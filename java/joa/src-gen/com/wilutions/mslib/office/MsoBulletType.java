/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBulletType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBulletType {
  msoBulletMixed(-2),
  msoBulletNone(0),
  msoBulletUnnumbered(1),
  msoBulletNumbered(2),
  msoBulletPicture(3);

  public final int value;
  private MsoBulletType(int value) { this.value = value; }
  public static  MsoBulletType valueOf(int value) {
    switch(value) {
    case -2: return msoBulletMixed;
    case 0: return msoBulletNone;
    case 1: return msoBulletUnnumbered;
    case 2: return msoBulletNumbered;
    case 3: return msoBulletPicture;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBulletType.class);
    }
  }
}
